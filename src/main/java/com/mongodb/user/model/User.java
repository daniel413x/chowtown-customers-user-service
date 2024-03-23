package com.mongodb.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    private String id;

    @Indexed(unique = true)
    @Field("auth0Id")
    private String auth0Id;

    @Indexed(unique = true)
    @Field("email")
    private String email;

    @Field("name")
    private String name;

    @Field("addressLineOne")
    private String addressLineOne;

    @Field("city")
    private String city;

    @Field("country")
    private String country;
}
