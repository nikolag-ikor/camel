/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.converter.jaxp;

import java.io.InputStream;
import java.io.Reader;

import javax.xml.transform.stream.StreamSource;

import org.apache.camel.Converter;

/**
 * A converter from {@link StreamSource} objects
 */
@Converter(loader = true)
public final class StreamSourceConverter {

    /**
     * Utility classes should not have a public constructor.
     */
    private StreamSourceConverter() {
    }

    @Converter
    public static InputStream toInputStream(StreamSource source) {
        return source.getInputStream();
    }

    @Converter
    public static Reader toReader(StreamSource source) {
        return source.getReader();
    }
}