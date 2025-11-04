package com.luv2code.designpatterns.behavioral.chain;

/**
 * Defines the contract for all filters in the chain.
 *
 * Each filter performs a tasks and optionally delegates
 * to the next filter in the filter chain.
 */
public interface Filter {

    void setNext(Filter filter);

    void apply(Request request);

}
