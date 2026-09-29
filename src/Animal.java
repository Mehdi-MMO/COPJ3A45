public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
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