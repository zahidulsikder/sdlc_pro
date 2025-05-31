package com.sdlc_pro.SpringCoreAPI.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UserDTO {
    @NotBlank(message = "User name can not be blank.")
    @Length(min = 5, max = 15)
    private String name;
    @Email(regexp = "[a-zA-Z_\\.]+@\\w{3,10}\\.\\w{3,10}")
    @NotBlank
    private String email;
    @Pattern(regexp = "(\\+88|88)?01[3-9]\\d{8}", message = "Invalid phone number.")
    private String phone;
    @Valid
    private AddressDTO address;
}
