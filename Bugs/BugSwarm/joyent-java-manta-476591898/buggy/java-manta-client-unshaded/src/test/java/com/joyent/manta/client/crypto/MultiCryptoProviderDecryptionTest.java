/*
 * Copyright (c) 2018, Joyent, Inc. All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.joyent.manta.client.crypto;

import com.joyent.manta.client.MantaClient;
import com.joyent.manta.client.MantaObjectInputStream;
import com.joyent.manta.client.MantaObjectResponse;
import com.joyent.manta.config.*;
import com.joyent.manta.http.MantaHttpHeaders;
import org.apache.commons.collections4.map.CaseInsensitiveMap;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.BoundedInputStream;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.conn.EofSensorInputStream;
import org.bouncycastle.util.encoders.Hex;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.joyent.manta.client.crypto.ExternalSecurityProviderLoader.*;
import static com.joyent.manta.http.MantaHttpHeaders.*;
import static org.apache.http.HttpHeaders.*;

import javax.crypto.SecretKey;
import java.io.*;
import java.net.URL;
import java.security.Provider;
import java.util.*;


@Test(groups={"encryption-provider"})
public class MultiCryptoProviderDecryptionTest {
    private static final Logger LOG = LoggerFactory.getLogger(MultiCryptoProviderDecryptionTest.class);
    private static final byte[] SECRET_KEY = Hex.decode(
                "8b30335ba65d1d0619c6192edb15318763d9a1be3ff916aaf46f4717232a504a");
    private static final List<SupportedCipherDetails> CIPHERS_TO_TEST = Collections.unmodifiableList(Arrays.asList(
                AesGcmCipherDetails.INSTANCE_128_BIT,
                AesGcmCipherDetails.INSTANCE_192_BIT,
                AesGcmCipherDetails.INSTANCE_256_BIT,
                AesCtrCipherDetails.INSTANCE_128_BIT,
                AesCtrCipherDetails.INSTANCE_192_BIT,
                AesCtrCipherDetails.INSTANCE_256_BIT,
                AesCbcCipherDetails.INSTANCE_128_BIT,
                AesCbcCipherDetails.INSTANCE_192_BIT,
                AesCbcCipherDetails.INSTANCE_256_BIT));
    private static URL testURL;
    private static byte[] expectedContent;

    private MantaClient client;

    @BeforeClass()
    @Parameters({"preferredProviders"})
    public void beforeClass(String preferredProviders) throws IOException {
        /* Backup provider list from static context */

        List<Provider> providers = buildRankedPreferredProviders(preferredProviders);
        setRankedPreferredProviders(providers);
        testURL = getClass().getClassLoader().getResource("test-data/chaucer.txt");

        try (InputStream in = testURL.openStream()) {
            expectedContent = IOUtils.toByteArray(in);
        }
    }

    @Test
    private void decryptAES128GCMNoPadding() throws IOException {

        final SupportedCipherDetails cipherDetails = CIPHERS_TO_TEST.get(0);
        validateEncryptedFileWithHeaderValues(cipherDetails);

    }

    @Test
    private void decryptAES192GCMNoPadding() throws IOException {

        final SupportedCipherDetails cipherDetails = CIPHERS_TO_TEST.get(1);
        validateEncryptedFileWithHeaderValues(cipherDetails);

    }

    @Test
    private void decryptAES256GCMNoPadding() throws IOException {

        final SupportedCipherDetails cipherDetails = CIPHERS_TO_TEST.get(2);
        validateEncryptedFileWithHeaderValues(cipherDetails);

    }

    @Test
    private void decryptAES128CTRNoPadding() throws IOException {

        final SupportedCipherDetails cipherDetails = CIPHERS_TO_TEST.get(3);
        validateEncryptedFileWithHeaderValues(cipherDetails);

    }

    @Test
    private void decryptAES192CTRNoPadding() throws IOException {

        final SupportedCipherDetails cipherDetails = CIPHERS_TO_TEST.get(4);
        validateEncryptedFileWithHeaderValues(cipherDetails);

    }

    @Test
    private void decryptAES256GCTRNoPadding() throws IOException {

        final SupportedCipherDetails cipherDetails = CIPHERS_TO_TEST.get(5);
        validateEncryptedFileWithHeaderValues(cipherDetails);

    }

    @Test
    private void decryptAES128CBCPKCS5Padding() throws IOException {

        final SupportedCipherDetails cipherDetails = CIPHERS_TO_TEST.get(6);
        validateEncryptedFileWithHeaderValues(cipherDetails);

    }

    @Test
    private void decryptAES196CBCPKCS5Padding() throws IOException {

        final SupportedCipherDetails cipherDetails = CIPHERS_TO_TEST.get(7);
        validateEncryptedFileWithHeaderValues(cipherDetails);

    }

    @Test
    private void decryptAES256CBCPKCS5Padding() throws IOException {

        final SupportedCipherDetails cipherDetails = CIPHERS_TO_TEST.get(8);
        validateEncryptedFileWithHeaderValues(cipherDetails);

    }

    /* Test Utility methods used in all unit-tests. */

    private void validateEncryptedFileWithHeaderValues(SupportedCipherDetails cipherDetails) throws IOException {

        final String cipherName = cipherDetails.getCipherId().replaceAll("/","-");
        final ConfigContext config = new ChainedConfigContext(
                new DefaultsConfigContext(),
                new EnvVarConfigContext(),
                new SystemSettingsConfigContext())

                /* Encryption settings */
                .setClientEncryptionEnabled(true)
                .setEncryptionAlgorithm(cipherDetails.getCipherId())
                .setEncryptionKeyId("personal-256")
                .setEncryptionPrivateKeyBytes(SECRET_KEY)
                .setEncryptionAuthenticationMode(EncryptionAuthenticationMode.Mandatory);


        client = new MantaClient(config);

        final SecretKey secretKey = generateSecretKey(cipherDetails);
        final EncryptionContext ctx = new EncryptionContext(secretKey, cipherDetails, true);

        final String filePath = "test-data/ciphertext/" + cipherName + ".ciphertext";
        final URL encryptedFileURL = getClass().getClassLoader().getResource(filePath);

        MantaHttpHeaders getResponseHttpHeaders = new MantaHttpHeaders();
        populateHeaderValuesFromResources(getResponseHttpHeaders,cipherDetails);


        final long cipherTextSize = getResponseHttpHeaders.getContentLength();

        try (InputStream encryptedStream = encryptedFileURL.openStream();
             BoundedInputStream bin = new BoundedInputStream(encryptedStream, cipherTextSize)) {

            final byte[] actualBytes = IOUtils.toByteArray(bin);

            try (final MantaEncryptedObjectInputStream decryptingStream = new MantaEncryptedObjectInputStream(
                    new MantaObjectInputStream(
                            new MantaObjectResponse("/path", getResponseHttpHeaders),
                            Mockito.mock(CloseableHttpResponse.class),
                            new EofSensorInputStream(
                                    new ByteArrayInputStream(actualBytes),
                                    null)),
                    cipherDetails,
                    secretKey,
                    true)) {

                ByteArrayOutputStream decrypted = new ByteArrayOutputStream();
                IOUtils.copy(decryptingStream, decrypted);
                decryptingStream.close();
                assertByteArrayEquals(expectedContent, decrypted.toByteArray());
            }
        }
    }

    private Map<String, Object> parseHeaderFileInfoStoreInMap(final URL headerURL) throws  IOException {
        Scanner scanner = null;
        final Map<String, Object> headerMap = new CaseInsensitiveMap<>();

        /* Storing headers in a HashMap temporarily it can be usable
         will consider removing it if its not needed. */

        try (InputStream in = headerURL.openStream()) {
            scanner = new Scanner(in, "UTF-8");
            while(scanner.hasNextLine()) {
                String currLine = scanner.nextLine();
                if(currLine.startsWith("m-encrypt") || currLine.startsWith("content")) {

                    String[] fields = currLine.split(":");
                    if (fields.length == 2) {
                        headerMap.put(fields[0].trim(), fields[1].trim());
                    }
                    else {
                        LOG.error("Header Field Values parsed from the file are invalid!");
                    }
                }
            }
        }

        return headerMap;
    }

    private void populateHeaderValuesFromResources(MantaHttpHeaders getResponseHttpHeaders, SupportedCipherDetails cipherDetails) throws IOException {

        final String cipherName = cipherDetails.getCipherId().replaceAll("/","-");
        final URL headerURL = getClass().getClassLoader().getResource("test-data/ciphertext"+
                MantaClient.SEPARATOR + cipherName + ".headers");
        final Map<String, Object> headerMap = parseHeaderFileInfoStoreInMap(headerURL);

        /* Populate header values */

        if (!cipherDetails.isAEADCipher()) {
            getResponseHttpHeaders.put(ENCRYPTION_HMAC_TYPE,
                    headerMap.get(ENCRYPTION_HMAC_TYPE));

            getResponseHttpHeaders.put(ENCRYPTION_METADATA_HMAC,
                    headerMap.get(ENCRYPTION_HMAC_TYPE));
        }
        else {
            getResponseHttpHeaders.put(ENCRYPTION_METADATA_AEAD_TAG_LENGTH,
                    headerMap.get(ENCRYPTION_METADATA_AEAD_TAG_LENGTH));
        }


        final long contentLength = Long.parseLong(headerMap.get(CONTENT_LENGTH).toString());
        getResponseHttpHeaders.setContentLength(contentLength);

        getResponseHttpHeaders.put(ENCRYPTION_IV,
                headerMap.get(ENCRYPTION_IV));

        getResponseHttpHeaders.put(ENCRYPTION_METADATA_IV,
                headerMap.get(ENCRYPTION_METADATA_IV));

        getResponseHttpHeaders.put(ENCRYPTION_KEY_ID,
                headerMap.get(ENCRYPTION_KEY_ID));

        getResponseHttpHeaders.put(ENCRYPTION_CIPHER,
                headerMap.get(ENCRYPTION_CIPHER));

        getResponseHttpHeaders.put(ENCRYPTION_PLAINTEXT_CONTENT_LENGTH,
                headerMap.get(ENCRYPTION_PLAINTEXT_CONTENT_LENGTH));

        getResponseHttpHeaders.put(ENCRYPTION_AEAD_TAG_LENGTH,
                headerMap.get(ENCRYPTION_AEAD_TAG_LENGTH));


        getResponseHttpHeaders.put(COMPUTED_MD5,
                headerMap.get(ENCRYPTION_METADATA_AEAD_TAG_LENGTH));

        getResponseHttpHeaders.put(ENCRYPTION_METADATA_AEAD_TAG_LENGTH,
                headerMap.get(ENCRYPTION_METADATA_AEAD_TAG_LENGTH));

        getResponseHttpHeaders.put(ENCRYPTION_TYPE,
                headerMap.get(ENCRYPTION_TYPE));

        getResponseHttpHeaders.setContentMD5(headerMap.get(CONTENT_MD5).toString());
        getResponseHttpHeaders.setContentType(headerMap.get(CONTENT_TYPE).toString());

    }

    private static SecretKey generateSecretKey(final SupportedCipherDetails cipherDetails) {
        int keySizeInBytes = cipherDetails.getKeyLengthBits() >> 3; // convert bits to bytes
        byte[] secret = Arrays.copyOfRange(SECRET_KEY, 0, keySizeInBytes);
        return SecretKeyUtils.loadKey(secret, cipherDetails);
    }

    private static void assertByteArrayEquals(final byte[] actual, final byte[] expected) {
        if (!Arrays.equals(actual, expected)) {
            String msg = String.format("Array values are not equal\n"
                            + "Expected length: %d Actual length: %d\n"
                            + "Expected: %s\n"
                            + "Actual:   %s",
                    expected.length, actual.length,
                    Hex.toHexString(expected),
                    Hex.toHexString(actual));

            Assert.fail(msg);
        }
    }

    @AfterClass
    public void afterClass() {
        client.closeWithWarning();
    }
}