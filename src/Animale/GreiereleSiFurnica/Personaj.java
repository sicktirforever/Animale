package Animale.GreiereleSiFurnica;

public class Personaj {
    private String name;
    private Camara camara;
    private int lene, harnicie;
    public boolean inViata = true;

    public Personaj(String name, Camara camara){
        this.name = name;
        this.camara = camara;
        this.lene = lene;
        this.harnicie = harnicie;
    }
    public Camara getCamara(){
        return camara;
    }
    public int getHarnicie(){
        return harnicie;
    }
    public int getLene(){
        return lene;
    }
    public boolean inViata(){
        return inViata;
    }
    public int randomHarnicie(int min, int max){
        int range = (max - min) + 1;
        return (int) (Math.random() * range ) + min;
    }
    public int randomLene(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }


}
