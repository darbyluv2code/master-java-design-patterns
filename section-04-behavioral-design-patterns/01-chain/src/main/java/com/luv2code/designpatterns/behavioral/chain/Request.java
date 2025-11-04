package com.luv2code.designpatterns.behavioral.chain;

/**
 * Represents a simple request object used in the Chain of Responsibility pattern
 *
 * Each filter can read or modify its state
 * (authentication, logging, compression, ...)
 */
public class Request {

    // The actual request data being processed
    private String payload;

    // Indicates whether the request has passed authentication
    private boolean authenticated;

    // Indicates where the request has been logged
    private boolean logged;

    // Indicates whether the request payload has been compressed
    private boolean compressed;

    public Request(String payload) {
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public boolean isCompressed() {
        return compressed;
    }

    public void setCompressed(boolean compressed) {
        this.compressed = compressed;
    }

    @Override
    public String toString() {
        return "Request{" +
                "payload='" + payload + '\'' +
                ", authenticated=" + authenticated +
                ", logged=" + logged +
                ", compressed=" + compressed +
                '}';
    }
}











