package com.luv2code.designpatterns.structural.facade;

import java.time.LocalDate;

/**
 * Value object representing a trip booking request.
 * Aggregates input details such as:
 * origin, destination, dates, guests and payment info
 */
public record TripRequest(
        String origin,
        String destination,
        LocalDate departDate,
        LocalDate returnDate,
        int guests,
        String cardLast4
) {}
