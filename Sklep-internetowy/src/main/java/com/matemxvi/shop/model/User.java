package com.matemxvi.shop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private String imie;
    private String nazwisko;
    private String login;
    private String haslo;
    private String email;
    private int wiek;
    private int telefon;

}
