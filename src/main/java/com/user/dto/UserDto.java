package com.user.dto;

import com.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    public UserDto(User user) {
        this.setId(user.getId());
        this.setEmail(user.getEmail());
        this.setName(user.getName());
        this.setCity(user.getCity());
        this.setCountry(user.getCountry());
        this.setAddressLineOne(user.getAddressLineOne());
        this.setAuth0Id(user.getAuth0Id());
    }

    private String id;

    private String auth0Id;

    private String email;

    private String name;

    private String addressLineOne;

    private String city;

    private String country;
}
