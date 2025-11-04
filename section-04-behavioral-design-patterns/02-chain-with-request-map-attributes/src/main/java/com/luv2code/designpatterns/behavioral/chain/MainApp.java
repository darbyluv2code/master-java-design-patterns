package com.luv2code.designpatterns.behavioral.chain;

public class MainApp {

    public static void main(String[] args) {

        // create the filters
        Filter authFilter = new AuthFilter();
        Filter logFilter = new LogFilter();
        Filter compressionFilter = new CompressionFilter();
        Filter trimFilter = new TrimFilter();

        // Build the filter chain: Auth -> Trim -> Log -> Compression
        authFilter.setNext(trimFilter);
        trimFilter.setNext(logFilter);
        logFilter.setNext(compressionFilter);

        // Request #1: passes authentication
        Request request1 = new Request("        auth-user-request-1");

        // Start processing the request
        System.out.println("=== Processing request1 (Authenticated) ===");
        authFilter.apply(request1);

        System.out.println("Final request state: " + request1);

        System.out.println();

        // Request #2: fails authentication
        Request request2 = new Request("                    user-request-2");

        // Start processing the request
        System.out.println("=== Processing request2 (Authentication fails) ===");
        authFilter.apply(request2);

        System.out.println("Final request state: " + request2);

        System.out.println();
        System.out.println("Demo complete - notice how Request 2 stops early!");
    }
}






