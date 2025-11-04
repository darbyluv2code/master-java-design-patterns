package com.luv2code.designpatterns.behavioral.chain;

/**
 * Concrete filter that simulates payload compression.
 * Marks the request as compressed before delegating to
 * the next filter.
 */
public class CompressionFilter implements Filter {

    // Reference to the next filter
    private Filter nextFilter;

    @Override
    public void setNext(Filter filter) {
        nextFilter = filter;
    }

    @Override
    public void apply(Request request) {
        System.out.println("CompressionFilter: compressing payload " + request.getPayload());

        // just an academic example ... we could simulate this
        request.setAttribute("compressed", true);

        // Continue to next filter if available
        if (nextFilter != null) {
            nextFilter.apply(request);
        }
    }
}






