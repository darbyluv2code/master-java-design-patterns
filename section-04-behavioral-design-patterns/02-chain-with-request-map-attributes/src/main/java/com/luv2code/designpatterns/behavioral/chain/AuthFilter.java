package com.luv2code.designpatterns.behavioral.chain;

/**
 * Concrete filter that handles authentication logic.
 *
 * If authentication fails, the chain is terminated.
 * Else, control is passed to the next filter in the chain.
 */
public class AuthFilter implements Filter {

    // Reference to the next filter
    private Filter nextFilter;

    @Override
    public void setNext(Filter filter) {
        this.nextFilter = filter;
    }

    @Override
    public void apply(Request request) {
        System.out.println("AuthFilter: checking authentication for " + request.getPayload());

        if (authenticate(request)) {
            request.setAttribute("authenticated", true);
            System.out.println("AuthFilter: authentication successful");
        } else {
            request.setAttribute("authenticated", false);
            System.out.println("AuthFilter: authentication failed - stopping chain");
            return;
        }

        // Continue to next filter if available
        if (nextFilter != null) {
            nextFilter.apply(request);
        }
    }

    // Helper method ... trivial implementation
    private boolean authenticate(Request request) {

        // Check if the request payload contains the string "auth"
        String payload = request.getPayload();

        return payload.contains("auth");
    }
}









