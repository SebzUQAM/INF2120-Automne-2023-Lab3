package exercice2_2;

/**
 * La classe Rectangle représente une forme géométrique bidimensionnelle, en l'occurrence un rectangle.
 */
public class Rectangle extends Forme2D {
    private double hauteur;
    private double largeur;

    /**
     * Constructeur de la classe Rectangle.
     *
     * @param hauteur La hauteur du rectangle.
     * @param largeur La largeur du rectangle.
     */
    public Rectangle(double hauteur, double largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    /**
     * Calcule et retourne l'aire du rectangle.
     *
     * @return L'aire du rectangle.
     */
    @Override
    public double aire() {
        return largeur * hauteur;
    }
}
