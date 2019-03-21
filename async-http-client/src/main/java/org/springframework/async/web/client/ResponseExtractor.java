/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.async.web.client;

import java.io.IOException;

import org.springframework.async.Promise;
import org.springframework.async.http.client.ClientHttpResponse;


/**
 * @author Jon Brisbin <jon@jbrisbin.com>
 */
public interface ResponseExtractor<T> {

	/**
	 * Extract data from the given {@code ClientHttpResponse} and return it.
	 *
	 * @param response the HTTP response
	 * @return the extracted data
	 * @throws java.io.IOException in case of I/O errors
	 */
	Promise<T> extractData(ClientHttpResponse response) throws IOException;

}
