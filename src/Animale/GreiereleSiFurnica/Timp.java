package Animale.GreiereleSiFurnica;

public class Timp {

    public void vara(Personaj personaj){
        int vaAduna = personaj.randomHarnicie(1,5) - personaj.randomLene(1,5);
        if (vaAduna < 0){
            vaAduna = 0;
        }
            personaj.getCamara().graunta += vaAduna;

    }
    public void iarna(Personaj personaj){
        if (personaj.getCamara().graunta < mancareConsumataIarna(4,7)){
            personaj.inViata = false;
            System.out.println("Moare");
            if (personaj.getCamara().graunta > 5 && personaj.inViata == false){
                System.out.println("A fost o iarna incredibil de grea!!!");
            }
        }
        else{
            System.out.println("Traieste");
        }
    }
    public int mancareConsumataIarna(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

}
