package Animale;

public class Leu {
    public String culoare, varsta, localizare;
    public boolean foame;
    public int viteza = 0;
    public int distanta = 0;
    public  int timp = 0;
    public String sunet;

    public Leu (String culoare, String varsta, String localizare){
        this.culoare = culoare;
        this.varsta = varsta;
        this.localizare = localizare;

    }
    public String getCuloare(){
        return culoare;
    }
    public String getVarsta(){
        return varsta;
    }
    public String getLocalizare(){
        return localizare;
    }
    public void infometat(){
        foame = true;
    }
    public void satul(){
        foame = false;
    }
    public void setDistanta (int newDistanta){
        if (foame && distanta > 0 && distanta < 300)
            distanta = newDistanta;
    }
    public void setViteza(int newViteza){
        if (foame && viteza > 0 && viteza < 100)
            viteza = newViteza;
    }
    public void setTimp(int timp){
        this.timp = timp;
    }
    public void vitezaUp(){
        if (foame && viteza < 100)
            viteza += 15;
    }
    public void vitezaDown(){
        if (foame && viteza > 0)
            viteza -= 10;
    }
    public void distantaUp(){
        if (foame && distanta < 300)
            distanta +=30;
    }
    public void distantaDown(){
        if (foame && distanta > 0)
            distanta -= 30;
    }
    public void setSunet(){
        System.out.println("Roar!");
    }
}
