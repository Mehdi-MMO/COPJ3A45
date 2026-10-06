package tn.esprit.gestionzoo.entities;

public class Zoo {
    private final int nbrCages = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    // el getters
    public int getNbrCages() {
        return nbrCages;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    // el setters
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("le nom du zoo ne doit pas etre vide");
            return;
        }
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("zoo: " + name + ", ville: " + city + ", cages: " + nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        if ( (searchAnimal(animal) != -1) || isZooFull()) {
            return false;
        }
        //if (isZooFull()) {
        //    return false;
        //}
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animaux du zoo " + name + ":");
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName().equals(animals[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean isZooFull() {
        return nbrAnimals == nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z1.nbrAnimals < z2.nbrAnimals) {
            return z2;
        } else {
            return z1;
        }
    }

    @Override
    public String toString() {
        return "Zoo: " + name + " (Ville: " + city + ", Cages: " + nbrCages + ")";
    }
}
