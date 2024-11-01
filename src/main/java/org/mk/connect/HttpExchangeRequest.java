package org.mk.connect;

import java.net.URI;

/**
 * @author Moonykun
 */
public interface HttpExchangeRequest {
    String getRequestMethod();
    URI getRequestUri();
}
