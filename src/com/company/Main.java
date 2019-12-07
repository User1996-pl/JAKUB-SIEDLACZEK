package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String imie, nazwisko;
        int wiek;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Wporowadź Imie: ");
        imie = scanner.next();

        System.out.println("Wporowadź nazwisko: ");
        nazwisko = scanner.next();

        System.out.println("Wporowadź wiek: ");
        wiek = scanner.nextInt();

        System.out.println("-----Wprowadzone dane-----");




    }
}
