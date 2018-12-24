package Animale;

import java.util.Scanner;

public class TestLeu {
    public static void main(String[] args) {

        Leu leu = new Leu("Alb", "4 ani", "Africa de Sud");
        leu.infometat();
        leu.setDistanta(0);
        leu.setViteza(0);
        leu.setTimp(0);

        System.out.println("Distanta la care este prada este: ");
        Scanner sc = new Scanner(System.in);
        int distantaPrada = sc.nextInt();
        int viteza =0 ;
        int distanta = 0;
        if (distantaPrada < 300) {
            while (distanta < distantaPrada) {
                leu.vitezaUp();
                leu.distantaUp();
                viteza += leu.viteza;
                distanta += leu.distanta;
            }

            System.out.println("Leul a ajuns la viteza de: " + viteza);
        }
        else{
            System.out.println("Leul are rezistenta prea scazuta pentru asemenea distanta");
        }
    }

}
