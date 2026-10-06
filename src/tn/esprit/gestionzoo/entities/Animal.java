package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    // el getters
    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    // el setters
    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("l'age ne peut pas etre negatif");
            return;
        }
        this.age = age;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    public void displayAnimal() {
        System.out.println("animal: " + name + ", famille: " + family + ", age: " + age + ", mammifere: " + isMammal);
    }

    @Override
    public String toString() {
        return "Animal : " + name + " (Famille: " + family + ", Age: " + age + ", Mammifère: " + isMammal + ")";
    }
}
