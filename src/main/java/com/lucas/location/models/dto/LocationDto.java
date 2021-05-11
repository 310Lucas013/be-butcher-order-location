package com.lucas.location.models.dto;

import lombok.Data;

@Data
public class LocationDto {
    String streetName;
    int streetNumber;
    String streetNumberAddition;
    String postalCode;
    String city;
    String country;

    public LocationDto() {
    }
}
