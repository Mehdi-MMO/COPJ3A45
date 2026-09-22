import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        Animal lion = new Animal("El", "Lion", 5, true);
        Zoo myZoo = new Zoo("el zoo", "Tunis", 20);
        
        myZoo.animals[0] = lion;
        lion.displayAnimal();
        myZoo.displayZoo();

        Scanner scanner = new Scanner(System.in);
        ZooManagement elzoo = new ZooManagement();

        System.out.print("entrez nom zoo: ");
        elzoo.zooName = scanner.nextLine();
        while (elzoo.zooName.trim().isEmpty()) {
            System.out.print("entrez nom du zoo: ");
            elzoo.zooName = scanner.nextLine();
        }

        System.out.print("entrez nombre de cages (>0): ");
        while (!scanner.hasNextInt() || (elzoo.nbrCages = scanner.nextInt()) <= 0) {
            System.out.print("entrez nombre de cages (>0): ");
            scanner.nextLine();
        }

        System.out.println(elzoo.zooName + " comporte " + elzoo.nbrCages + " cages");
        scanner.close();
    }
}