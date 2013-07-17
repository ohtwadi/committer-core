/* Copyright 2010-2013 Norconex Inc.
 * 
 * This file is part of Norconex HTTP Collector.
 * 
 * Norconex HTTP Collector is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Norconex HTTP Collector is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Norconex HTTP Collector. If not, 
 * see <http://www.gnu.org/licenses/>.
 */
package com.norconex.collector.http.handler.impl;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.norconex.commons.lang.map.Properties;

/**
 * @deprecated use 
 *      {@link com.norconex.collector.http.fetch.impl.SimpleHttpHeadersFetcher}
 */
@Deprecated
public class SimpleHttpHeadersFetcher 
       extends com.norconex.collector.http.fetch.impl.SimpleHttpHeadersFetcher {

    private static final long serialVersionUID = -7220498893637777861L;

    private static final Logger LOG = LogManager.getLogger(
			SimpleHttpHeadersFetcher.class);

    @Override
    public Properties fetchHTTPHeaders(
            DefaultHttpClient httpClient, String url) {
        LOG.warn("DEPRECATED: use "
         + "com.norconex.collector.http.fetch.impl.SimpleHttpHeadersFetcher "
         + "instead of "
         + "com.norconex.collector.http.handler.impl.SimpleHttpHeadersFetcher");
        return super.fetchHTTPHeaders(httpClient, url);
    }
}
