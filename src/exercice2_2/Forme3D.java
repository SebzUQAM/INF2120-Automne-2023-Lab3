package exercice2_2;

/**
 * La classe abstraite Forme3D est une classe de base pour représenter des formes géométriques tridimensionnelles.
 * Elle définit une méthode abstraite pour calculer le volume de la forme.
 */
public abstract class Forme3D extends Forme {
    /**
     * Calcule et retourne le volume de la forme tridimensionnelle.
     *
     * @return Le volume de la forme tridimensionnelle.
     */
    public abstract double volume();

    @Override
    public String toString() {
        return String.format("(Mon beau/Ma belle) %1$s avec un volume de %2$s", getNom(), volume());
    }
}
