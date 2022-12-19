package com.example.eatusapi.reservation.entity;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@javax.persistence.Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String placename;
    Date date;
    String food;
    int currentmember;
    String memberone;
    String membertwo;
    String memberthree;
    String memberfour;
    String memberfive;

    public String getpalcename(){
        return this.placename;
    }
}
