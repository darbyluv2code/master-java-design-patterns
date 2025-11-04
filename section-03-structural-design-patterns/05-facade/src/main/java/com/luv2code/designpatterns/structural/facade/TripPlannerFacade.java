package com.luv2code.designpatterns.structural.facade;

import java.util.UUID;

/**
 * Role: Facade
 * Provides a unified interface to coordinate trip booking subsystems.
 * Simplifies client access by orchestrating flights, hotels and payments.
 */
public class TripPlannerFacade {

    // Subsystem services
    private FlightBookingService flightBookingService;
    private HotelBookingService hotelBookingService;
    private PaymentService paymentService;

    // Initialize subsystems inside the facade
    public TripPlannerFacade() {
        flightBookingService = new FlightBookingService();
        hotelBookingService = new HotelBookingService();
        paymentService = new PaymentService();
    }

    /**
     * Book a complete trip by delegating tasks to the subsystem services
     */
    public TripConfirmation bookCompleteTrip(TripRequest tripRequest) {

        System.out.println("[Facade] Starting trip booking ...");

        // Delegate calls to subsystem services
        String flightRef = flightBookingService.bookFlight(tripRequest);
        String hotelRef = hotelBookingService.bookHotel(tripRequest);
        String paymentRef = paymentService.charge(tripRequest);

        // Create a unified confirmation
        String tripId = "TRIP-" + UUID.randomUUID();
        System.out.println("[Facade] Trip successfully created: " + tripId);

        return new TripConfirmation(tripId, flightRef, hotelRef, paymentRef);
    }
}










