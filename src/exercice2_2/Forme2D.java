package exercice2_2;

import java.lang.reflect.Array;

/**
 * La classe abstraite Forme2D est une classe de base pour représenter des formes géométriques bidimensionnelles.
 * Elle définit une méthode abstraite pour calculer l'aire de la forme.
 */
public abstract class Forme2D extends Forme {

    /**
     * Calcule et retourne l'aire de la forme bidimensionnelle.
     *
     * @return L'aire de la forme bidimensionnelle.
     */
    public abstract double aire();

    @Override
    public String toString() {
        return String.format("(Mon beau/Ma belle) %1$s avec un aire de %2$s", getNom(), aire());
    }
}
