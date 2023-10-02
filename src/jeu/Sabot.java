package jeu;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.*;

public class Sabot implements Iterator<Carte> {
	private Carte[] cartes;
    private int nbCartes;
    private int modificationCount;

    public Sabot(int capacite) {
        cartes = new Carte[capacite];
        nbCartes = 0;
        modificationCount = 0;
    }
    
    public boolean estVide() {
        return nbCartes == 0;
    }
    
    private void ajouterCarte(Carte carte) {
        if (nbCartes < cartes.length) {
            cartes[nbCartes] = carte;
            nbCartes++;
            modificationCount++;
        } else {
            throw new IllegalStateException("Le sabot est plein.");
        }
    }
    
    public void ajouterFamilleCarte(Carte... cartes) {
        for (Carte carte : cartes) {
            ajouterCarte(carte);
        }
    }
    
    
    public Iterator<Carte> iterator() {
        return new SabotIterator();
    }

    private class SabotIterator implements Iterator<Carte> {
        private int currentIndex = 0;
        private int expectedModificationCount = modificationCount;

        @Override
        public boolean hasNext() {
            checkForConcurrentModification();
            return currentIndex < nbCartes;
        }

        @Override
        public Carte next() {
            checkForConcurrentModification();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return cartes[currentIndex++];
        }

        @Override
        public void remove() {
            checkForConcurrentModification();
            if (currentIndex > 0) {
      
                for (int i = currentIndex - 1; i < nbCartes - 1; i++) {
                    cartes[i] = cartes[i + 1];
                }
                cartes[nbCartes - 1] = null;
                nbCartes--;
                currentIndex--;
                modificationCount++;
                expectedModificationCount++;
            } else {
                throw new IllegalStateException("Vous devez appeler next() avant remove().");
            }
        }

        private void checkForConcurrentModification() {
            if (modificationCount != expectedModificationCount) {
                throw new ConcurrentModificationException("Le sabot a été modifié de manière concurrente.");
            }
        }
        
        
    }
    
    public Carte piocher() {
        Iterator<Carte> it = iterator();
        if (it.hasNext()) {
            Carte cartePiochee = it.next();
            it.remove();
            return cartePiochee;
        } else {
            throw new NoSuchElementException("Le sabot est vide.");
        }
    }

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Carte next() {
		// TODO Auto-generated method stub
		return null;
	}
    
    

}
