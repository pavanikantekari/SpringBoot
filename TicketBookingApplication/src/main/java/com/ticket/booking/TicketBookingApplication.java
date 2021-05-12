
package com.ticket.booking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ticket.booking.service.TicketService;

@SpringBootApplication
public class TicketBookingApplication {
	@Autowired
	private TicketService service;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
	}
}