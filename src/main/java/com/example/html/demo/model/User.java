package com.example.html.demo.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String fname;
    private String lastName;

    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
