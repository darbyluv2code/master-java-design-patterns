package com.luv2code.designpatterns.structural.facade;

import java.time.LocalDate;

public class MainApp {

    public static void main(String[] args) {

        // Create the facade (provides a simple interface to multiple subsystems)
        TripPlannerFacade tripPlannerFacade = new TripPlannerFacade();

        // Define trip dates: 6 months from now, 4-day duration
        LocalDate departDate = LocalDate.now().plusMonths(6);
        LocalDate returnDate = departDate.plusDays(4);

        // Create a trip request object (input date for the facade)
        TripRequest tripRequest = new TripRequest(
                "PHL",
                "SFO",
                departDate,
                returnDate,
                2,
                "1111"
        );

        // Use the facade to book a complete trip
        TripConfirmation tripConfirmation = tripPlannerFacade.bookCompleteTrip(tripRequest);

        System.out.println();

        // Display confirmation details (output of the facade)
        // pretty print
        System.out.println("=== Trip Confirmation ===");
        System.out.println("Trip ID   : " + tripConfirmation.tripId());
        System.out.println("Flight    : " + tripConfirmation.flightRef());
        System.out.println("Hotel     : " + tripConfirmation.hotelRef());
        System.out.println("Payment   : " + tripConfirmation.paymentRef());
    }
}








