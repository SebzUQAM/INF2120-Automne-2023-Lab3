package exercice2_2;

public abstract class Forme {

    protected final String getNom(){
        String[] nomEnTableau = this.getClass().getName().split("\\.");
        return nomEnTableau[nomEnTableau.length - 1];
    }
}
