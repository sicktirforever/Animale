package Animale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean arunc = true;
        System.out.println("Distanta de aruncare a obiectului este = ");
        Scanner sc = new Scanner(System.in);
        int distantaAruncare = sc.nextInt();
        Caine caine = new Caine("Lup German", "Negru", "6");
        caine.esteTreaz();
        caine.setDistante(0);
        caine.setViteza(0);
        caine.setTimp(0);
        if (arunc){
            caine.vitezaUp();
            caine.vitezaUp();;
            caine.timp = distantaAruncare / caine.viteza;
        }
        System.out.println("Timpul in care cainele ajunge la obiectul aruncat este = "
        + caine.timp);
    }
}
