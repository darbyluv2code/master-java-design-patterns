package com.luv2code.designpatterns.structural.facade;

import java.util.UUID;

/**
 * Role: Subsystem service
 * Handles hotel reservations as part of the trip.
 * Invoked by the TripPlannerFacade ... not used directly by clients.
 */
public class HotelBookingService {

    /**
     * Books a hotel for the given trip request
     */
    public String bookHotel(TripRequest tripRequest) {

        // Extract details from the trip request
        String destination = tripRequest.destination();
        String checkIn = tripRequest.departDate().toString();
        String checkOut = tripRequest.returnDate().toString();
        int guests = tripRequest.guests();

        // Simulate hotel booking
        System.out.println("- [Hotel] Booking at " + destination
                + " | Check-in: " + checkIn
                + " | Check-out: " + checkOut
                + " | Guests: " + guests);

        // Return booking reference
        return "HT-" + UUID.randomUUID();
    }
}













