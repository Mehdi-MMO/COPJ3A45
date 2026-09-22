import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        Animal monkey = new Animal("primates", "singe", 3, true);
        Animal snake = new Animal("serpents", "python", 4, false);
        
        Zoo myZoo = new Zoo("el zoo", "tunis", 20);
        
        myZoo.animals[0] = monkey;
        myZoo.animals[1] = snake;
        
        monkey.displayAnimal();
        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
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