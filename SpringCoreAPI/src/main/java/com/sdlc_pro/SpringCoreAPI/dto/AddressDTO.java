package com.sdlc_pro.SpringCoreAPI.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class AddressDTO {
    @Positive
    private int houseNumber;
    @Positive
    private int roadNumber;
    @NotBlank
    private String houseName;
}
