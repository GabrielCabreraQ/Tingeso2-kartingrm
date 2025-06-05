package com.kartingrm.Booking_service.Model;


import com.kartingrm.Booking_service.Entity.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BdayPricingRequest {
    private List<Client> birthdayClients;
    private int numberLap;
    private int groupSize;
    private int birthdayLimit;
    private LocalDate bookingDate;
    private Pricing pricing;
}