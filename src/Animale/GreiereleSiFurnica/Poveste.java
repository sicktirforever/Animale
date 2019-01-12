package Animale.GreiereleSiFurnica;

public class Poveste {
    public static void main(String[] args) {

        Personaj greiere = new Personaj("Gigi",new Camara());
        Personaj furnica = new Personaj("John", new Camara());

        Timp timp = new Timp();
        for (int i=0; i<5;i++){
            timp.vara(furnica);
            timp.vara(greiere);

        }
        System.out.println("Numarul de graunte adunate de furnica este: " + furnica.getCamara().graunta);
        System.out.println("Numarul de graunte adunate de greiere este: " + greiere.getCamara().graunta);

        timp.iarna(furnica);

        timp.iarna(greiere);

    }
}
