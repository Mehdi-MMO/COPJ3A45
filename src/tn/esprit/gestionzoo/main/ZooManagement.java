package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {
        // I10
        Zoo myZoo = new Zoo("El Zoo", "Tunis");
        Animal lion = new Animal("Felins", "Lion", 5, true);
        Animal elephant = new Animal("elephants", "elephant", 10, true);
        
        System.out.println("Ajout de Lion: " + myZoo.addAnimal(lion));
        System.out.println("Ajout de elephant: " + myZoo.addAnimal(elephant));
        
        // I11
        System.out.println("\n--- Animaux dans le zoo ---");
        myZoo.displayAnimals();
        
        System.out.println("Recherche du Lion (indice): " + myZoo.searchAnimal(lion));
        
        Animal lionIdentique = new Animal("Felins", "Lion", 6, true);
        System.out.println("Recherche d'un autre Lion (même nom): " + myZoo.searchAnimal(lionIdentique));
        
        // I12
        System.out.println("Ajout d'un autre Lion (unicite): " + myZoo.addAnimal(lionIdentique)); // Doit retourner false
        
        System.out.println("\n--- Remplissage du zoo ---");
        for (int i = 0; i < 25; i++) {
            Animal a = new Animal("Espece" + i, "Animal" + i, i, true);
            boolean added = myZoo.addAnimal(a);
            if (!added) {
                // shows once if the zoo is full wala lanimal existi deja
            }
        }
        
        Animal extraAnimal = new Animal("Extra", "Extra", 1, true);
        System.out.println("Ajout dans un zoo plein: " + myZoo.addAnimal(extraAnimal)); // Doit retourner false

        // I13
        System.out.println("\n--- Suppression dun animal ---");
        System.out.println("Suppression de l'elephant: " + myZoo.removeAnimal(elephant));
        System.out.println("Recherche de l'elephant apres suppression: " + myZoo.searchAnimal(elephant));
        
        // I15
        System.out.println("\n--- Methodes de verification et comparaison ---");
        System.out.println("Le zoo est-il plein apres suppression? " + myZoo.isZooFull()); // false
        System.out.println("Ajout d'un animal pour le remplir: " + myZoo.addAnimal(extraAnimal)); // true
        System.out.println("Le zoo est-il plein maintenant? " + myZoo.isZooFull()); // true
        
        Zoo myZoo2 = new Zoo("Petit Zoo", "Sousse");
        myZoo2.addAnimal(new Animal("Oiseaux", "Perroquet", 2, false));
        
        Zoo biggerZoo = Zoo.comparerZoo(myZoo, myZoo2);
        System.out.println("Le zoo contenant le plus d'animaux est: " + biggerZoo.getName());
    }
}
