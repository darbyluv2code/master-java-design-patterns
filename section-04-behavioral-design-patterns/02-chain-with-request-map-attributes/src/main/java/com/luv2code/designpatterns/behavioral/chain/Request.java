package com.luv2code.designpatterns.behavioral.chain;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Represents a simple request object used in the Chain of Responsibility pattern
 *
 * Each filter can read or modify its state
 * (authentication, logging, compression, ...)
 */
public class Request {

    // The actual request data being processed
    private String payload;

    // Reference to the attributes
    Map<String, Object> attributes = new LinkedHashMap<>();

    public Request(String payload) {
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public void setAttribute(String key, Object value) {
        attributes.put(key, value);
    }

    @Override
    public String toString() {
        return "Request{" +
                "payload='" + payload + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}











