public class Zoo {
    final int nbrCages = 25;
    Animal[] animals;
    String name;
    String city;
    int nbrAnimals;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    public void displayZoo() {
        System.out.println("zoo: " + name + ", ville: " + city + ", cages: " + nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            return false;
        }
        if (isZooFull()) {
            return false;
        }
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
            if (animal.name.equals(animals[i].name)) {
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
