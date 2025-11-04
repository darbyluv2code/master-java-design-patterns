package com.luv2code.designpatterns.structural.facade;

import java.util.UUID;

/**
 * Role: Subsystem service
 * Handles flight reservations as part of the trip.
 * Invoked by TripPlannerFacade ... not directly used by clients.
 */
public class FlightBookingService {

    /**
     * Book a flight for the given trip request
     */
    public String bookFlight(TripRequest tripRequest) {

        // Extract details from the trip request
        String origin = tripRequest.origin();
        String destination = tripRequest.destination();
        String departDate = tripRequest.departDate().toString();
        String returnDate = tripRequest.returnDate().toString();
        int guests = tripRequest.guests();

        // Simulate flight booking
        System.out.println("- [Flight] Booking "
                    + origin + " -> " + destination
                    + " | Depart: " + departDate
                    + " | Return: " + returnDate
                    + " | Guests: " + guests);

        // Return booking reference
        return "FL-" + UUID.randomUUID();
    }
}












