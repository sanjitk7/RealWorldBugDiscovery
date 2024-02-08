package org.springframework.security.oauth2.provider.token.store.redis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.company.oauth2.CustomOAuth2AccessToken;
import org.company.oauth2.CustomOAuth2Authentication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.serializer.support.SerializationFailedException;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2Request;
import org.springframework.security.oauth2.provider.RequestTokenFactory;
import org.springframework.util.ClassUtils;
import redis.clients.jedis.JedisShardInfo;

/**
 * @author Artem Smotrakov
 */
public class RedisTokenStoreCustomTokenTests {

	private static final String CLIENT_ID = "customClient";

	private static final List<String> ALLOWED_CLASSES = new ArrayList<String>();
	static {
		ALLOWED_CLASSES.add("java.util.");
		ALLOWED_CLASSES.add("org.springframework.security.");
		ALLOWED_CLASSES.add("org.company.oauth2.CustomOAuth2AccessToken");
		ALLOWED_CLASSES.add("org.company.oauth2.CustomOAuth2Authentication");
	}

	private RedisTokenStore tokenStore;

	@Before
	public void setup() {
		boolean springDataRedis_2_0 = ClassUtils.isPresent(
				"org.springframework.data.redis.connection.RedisStandaloneConfiguration",
				this.getClass().getClassLoader());

		JedisConnectionFactory connectionFactory;
		if (springDataRedis_2_0) {
			connectionFactory = new JedisConnectionFactory();
		} else {
			JedisShardInfo shardInfo = new JedisShardInfo("localhost");
			connectionFactory = new JedisConnectionFactory(shardInfo);
		}

		tokenStore = new RedisTokenStore(connectionFactory);
	}

	@Test(expected = SerializationFailedException.class)
	public void testNotAllowedCustomToken() {
		OAuth2Request request = RequestTokenFactory.createOAuth2Request(CLIENT_ID, false);
		TestingAuthenticationToken authentication = new TestingAuthenticationToken("user", "password");

		String token = "access-token-" + UUID.randomUUID();
		OAuth2AccessToken oauth2AccessToken = new CustomOAuth2AccessToken(token);
		OAuth2Authentication oauth2Authentication = new OAuth2Authentication(request, authentication);

		tokenStore.setSerializationStrategy(new JdkSerializationStrategy());
		tokenStore.storeAccessToken(oauth2AccessToken, oauth2Authentication);
		tokenStore.findTokensByClientId(request.getClientId());
	}

	@Test
	public void testAllowedCustomToken() {
		OAuth2Request request = RequestTokenFactory.createOAuth2Request(CLIENT_ID, false);
		TestingAuthenticationToken authentication = new TestingAuthenticationToken("user", "password");

		OAuth2AccessToken oauth2AccessToken = new CustomOAuth2AccessToken("access-token-" + UUID.randomUUID());
		OAuth2Authentication oauth2Authentication = new CustomOAuth2Authentication(request, authentication);

		JdkSerializationStrategy strategy = new JdkSerializationStrategy(ALLOWED_CLASSES);
		tokenStore.setSerializationStrategy(strategy);
		tokenStore.storeAccessToken(oauth2AccessToken, oauth2Authentication);

		OAuth2AccessToken token = tokenStore.getAccessToken(oauth2Authentication);
		assertNotNull(token);
		assertEquals(oauth2AccessToken, token);
	}

	@After
	public void cleanUp() {
		JdkSerializationStrategy strategy = new JdkSerializationStrategy(ALLOWED_CLASSES);
		tokenStore.setSerializationStrategy(strategy);
		for (OAuth2AccessToken token : tokenStore.findTokensByClientId(CLIENT_ID)) {
			tokenStore.removeAccessToken(token);
		}
	}

}