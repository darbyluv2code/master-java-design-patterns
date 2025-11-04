package com.luv2code.designpatterns.behavioral.chain;

/**
 * Concrete filter that logs the request.
 * Delegates to the next filter
 */
public class LogFilter implements Filter {

    // Reference to the next filter
    private Filter nextFilter;

    @Override
    public void setNext(Filter filter) {
        nextFilter = filter;
    }

    @Override
    public void apply(Request request) {
        System.out.println("LogFilter: logging request " + request.getPayload());

        request.setLogged(true);

        // Continue to next filter if available
        if (nextFilter != null) {
            nextFilter.apply(request);
        }
    }
}








