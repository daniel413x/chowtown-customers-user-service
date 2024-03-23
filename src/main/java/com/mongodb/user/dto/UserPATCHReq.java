package com.mongodb.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserPATCHReq extends UserDto {

    @NotBlank(message = "Name must not be empty")
    private String name;

    @NotBlank(message = "Address must not be empty")
    private String addressLineOne;

    @NotBlank(message = "Country must not be empty")
    private String country;

    @NotBlank(message = "City must not be empty")
    private String city;
};