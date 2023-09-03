package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animelist = List.of("Naruto", "Bleach", "One Piece", "Dragon Ball", "Gintama", "Hunter × Huntre");

        animelist.forEach(System.out::println);
    }
}