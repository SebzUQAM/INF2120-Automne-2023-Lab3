package exercice2_2;

/**
 * La classe Sphere représente une forme géométrique tridimensionnelle, en l'occurrence une sphère.
 */
public class Sphere extends Forme3D{
    private double rayon;

    /**
     * Constructeur de la classe Sphere.
     *
     * @param rayon Le rayon de la sphère.
     */
    public Sphere(double rayon) {
        this.rayon = rayon;
    }

    /**
     * Calcule et retourne le volume de la sphère.
     *
     * @return Le volume de la sphère.
     */
    @Override
    public double volume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(rayon, 3);
        // ou return 4.0 / 3.0 * Math.PI * rayon * rayon * rayon;
    }
}
