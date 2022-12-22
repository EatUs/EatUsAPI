package com.example.eatusapi.reservation.controller;

import com.example.eatusapi.reservation.dto.ResDto;
import com.example.eatusapi.reservation.dto.ResQueryDto;
import com.example.eatusapi.reservation.entity.Reservation;
import com.example.eatusapi.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public Reservation reservation(@RequestBody @Valid ResDto resDto) {
        return reservationService.reserve(resDto);
    }

    @PostMapping("/info")
    public Reservation reservationInfo(@RequestBody ResQueryDto resQueryDto) {
        return reservationService.getResrvation(resQueryDto);
    }

    @PostMapping("/cancel")
    public Reservation cancelReservation(@RequestBody ResDto resDto ) {
        return reservationService.cancel(resDto);
    }
}
