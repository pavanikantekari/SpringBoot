package com.ticket.booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.booking.domain.Ticket;

public interface TicketBookingDao extends JpaRepository<Ticket, Integer> {

}