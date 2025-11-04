package com.luv2code.designpatterns.structural.facade;

/**
 * Value object representing confirmation details for a booked trip.
 * Aggregates all subsystem confirmations into a single response.
 */
public record TripConfirmation(
        String tripId,
        String flightRef,
        String hotelRef,
        String paymentRef
) {}
