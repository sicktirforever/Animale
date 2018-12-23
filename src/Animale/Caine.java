package Animale;

public class Caine {
    public String rasa, culoare, varsta;
    public boolean treaz;
    public int viteza = 0;
    public int distanta = 0;
    public int timp = 0;

    public Caine (String rasa, String culoare, String varsta){
        this.rasa = rasa;
        this.culoare = culoare;
        this.varsta = varsta;
    }
    public String getCuloare(){
        return culoare;
    }
    public String getRasa(){
        return rasa;
    }
    public String getVarsta(){
        return varsta;
    }
    public void esteTreaz(){
        treaz = true;
    }
    public void doarme(){
        treaz = false;
    }

    public void setDistante(int newDistanta) {
        if (treaz && distanta > 0 && distanta < 100)
            distanta = newDistanta;
    }

    public void setViteza(int newViteza) {
        if (treaz && viteza > 0 && viteza < 50)
            viteza= newViteza;
    }
    public void setTimp(int timp){
        this.timp = timp;
    }
    public void vitezaUp(){
        if (treaz && viteza < 50)
            viteza += 5;
    }
    public void vitezaDown(){
        if (treaz && viteza > 0)
            viteza -= 5;
    }
}
