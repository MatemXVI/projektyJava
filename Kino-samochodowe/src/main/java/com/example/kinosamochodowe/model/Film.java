package com.example.kinosamochodowe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Film {
    private String tytul;
    private String rezyseria;
    private String obsada;
    private String scenariusz;
    private String gatunek;
    private int czas_trwania;
    private String kraj;
    private int rok_produkcji;
    private String opis;
    private String nazwa_plakatu;
}
