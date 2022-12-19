package com.example.eatusapi.reservation.repository;

import com.example.eatusapi.reservation.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Reservation findBypalcename(Long Id, String placename);
}