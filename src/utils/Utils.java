package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Utils {

    public static <T> T extraire(List<T> liste) {
        if (!liste.isEmpty()) {
            int index = (int) (Math.random() * liste.size());
            return liste.remove(index);
        } else {
            throw new IllegalArgumentException("La liste est vide.");
        }
    }

    public static <T> T extraireWithListIterator(List<T> liste) {
        if (!liste.isEmpty()) {
            ListIterator<T> listIterator = liste.listIterator();
            int index = (int) (Math.random() * liste.size());
            while (index > 0) {
                listIterator.next();
                index--;
            }
            T element = listIterator.next();
            listIterator.remove();
            return element;
        } else {
            throw new IllegalArgumentException("La liste est vide.");
        }
    }

    public static <T> List<T> melanger(List<T> liste) {
        Collections.shuffle(liste);
        return liste;
    }

    public static <T> boolean verifierMelange(List<T> liste1, List<T> liste2) {
        return liste1.size() == liste2.size() &&
               liste1.containsAll(liste2) &&
               liste2.containsAll(liste1);
    }

    public static <T> List<T> rassembler(List<T> liste) {
        List<T> result = new ArrayList<>();

        for (int i = 0; i < liste.size(); i++) {
            T current = liste.get(i);
            result.add(current);

            while (i + 1 < liste.size() && current.equals(liste.get(i + 1))) {
                i++;
            }
        }

        return result;
    }

    public static <T> boolean verifierRassemblement(List<T> liste) {
        ListIterator<T> iterator1 = liste.listIterator();
        ListIterator<T> iterator2 = liste.listIterator(liste.size());

        while (iterator1.hasNext() && iterator2.hasPrevious()) {
            T element1 = iterator1.next();
            T element2 = iterator2.previous();

            if (!element1.equals(element2)) {
                return false;
            }
        }

        return true;
    }
}