package org.jboss.aerogear.aerodoc.config;

import org.jboss.aerogear.controller.router.rest.JsonConsumer;

public class CustomConsumer extends JsonConsumer {

    @Override
    public String mediaType() {
        return "application/json; charset=utf-8";
    }

}
