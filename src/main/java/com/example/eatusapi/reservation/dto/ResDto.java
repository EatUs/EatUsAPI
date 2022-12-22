package com.example.eatusapi.reservation.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import java.sql.Date;


@Component
@Getter
@Setter
public class ResDto {
    String placename;
    Date date;
    String food;
    @NotBlank
    String member;
}
