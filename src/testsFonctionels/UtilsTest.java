package testsFonctionels;

import cartes.Carte;
import cartes.JeuCartes;
import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilsTest {

    public static void main(String[] args) {
        JeuCartes jeuDeCartes = new JeuCartes();
        List<Carte> jeuCartes = jeuDeCartes.getListeCartes();

        testVerifierMelange(jeuCartes);

        testRassembler();
    }

    public static void testVerifierMelange(List<Carte> listeCartes) {
        List<Carte> listeMelangee = new ArrayList<>(listeCartes);

        Utils.mélanger(listeMelangee);

        if (Utils.verifierMelange(listeCartes, listeMelangee)) {
            System.out.println("Le mélange a préservé le nombre d'occurrences pour chaque élément.");
        } else {
            System.out.println("Erreur : Le mélange n'a pas préservé le nombre d'occurrences pour chaque élément.");
        }
    }

    public static void testRassembler() {
        List<Integer> liste1 = new ArrayList<>(Arrays.asList(1, 1, 2, 1, 3));
        List<Integer> liste2 = new ArrayList<>(Arrays.asList(1, 4, 3, 2));
        List<Integer> liste3 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 1));

        Utils.rassembler(liste1);
        Utils.rassembler(liste2);
        Utils.rassembler(liste3);

        System.out.println("Liste 1 après rassemblement : " + liste1);
        System.out.println("Liste 2 après rassemblement : " + liste2);
        System.out.println("Liste 3 après rassemblement : " + liste3);

        System.out.println("Test de verifierRassemblement sur liste 1 : " + Utils.verifierRassemblement(liste1));
        System.out.println("Test de verifierRassemblement sur liste 2 : " + Utils.verifierRassemblement(liste2));
        System.out.println("Test de verifierRassemblement sur liste 3 : " + Utils.verifierRassemblement(liste3));
    }
}