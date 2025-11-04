package com.luv2code.designpatterns.structural.facade;

import java.util.UUID;

/**
 * Role: Subsystem service
 * Processes payments for the overall trip.
 * Invoked by TripPlannerFacade ... not used directly by clients
 */
public class PaymentService {

    /**
     * Charges the customer for the trip
     */
    public String charge(TripRequest tripRequest) {

        // Extract details from the trip request
        String last4 = tripRequest.cardLast4();
        String origin = tripRequest.origin();
        String destination = tripRequest.destination();

        // Simulate payment processing
        System.out.println("- [Payment] Charging card **** + " + last4
                + " | Trip: " + origin + " -> " + destination);

        // Return payment reference
        return "PM-" + UUID.randomUUID();
    }
}














