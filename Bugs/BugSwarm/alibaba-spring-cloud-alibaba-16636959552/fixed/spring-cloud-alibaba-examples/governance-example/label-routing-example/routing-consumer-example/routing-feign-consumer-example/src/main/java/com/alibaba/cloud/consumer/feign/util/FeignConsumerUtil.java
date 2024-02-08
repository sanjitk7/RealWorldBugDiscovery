/*
 * Copyright 2013-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.cloud.consumer.feign.util;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;

import feign.Response;

/**
 * @author yuluo
 * @author 1481556636@qq.com
 */

public final class FeignConsumerUtil {

	private FeignConsumerUtil() {
	}

	public static String toString(Response response) {

		Reader reader = null;
		StringBuilder to = new StringBuilder();
		CharBuffer charBuf = CharBuffer.allocate(2048);

		try {
			reader = response.body().asReader(StandardCharsets.UTF_8);
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}

		while (true) {
			try {
				if (reader.read(charBuf) == -1) {
					break;
				}
			}
			catch (IOException e) {
				throw new RuntimeException(e);
			}
			charBuf.flip();
			to.append(charBuf);
			charBuf.clear();
		}

		return to.toString();
	}

}
