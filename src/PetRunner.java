// In this code, We will declare and initialize 3 variables
// We will display the pet's information
import java.util.Scanner;

class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First Pet object using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        // Second Pet object using custom constructor
        Pet pet2 = new Pet("Dog", "Buster", 11, "Dog food", "Happy", "Barking");
        System.out.println(pet2.toString());

        // Third Pet object using user input
        System.out.print("Enter animal type: ");
        String type = scanner.nextLine();
        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();
        System.out.print("Enter animal age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter animal Sound: ");
        String Sound = scanner.nextLine();
        System.out.print("Enter animal Personality: ");
        String Personality = scanner. nextLine();
        System.out.print("Enter animal Food: ");
        String Food = scanner.nextLine();

        // Create a third Pet object and set its properties
        Pet pet3 = new Pet();
        pet3.setType(type);
        pet3.setName(name);
        pet3.setAge(age);
        pet3.setPetSound(Sound);
        pet3.setpetPersonality(Personality);
        pet3.setpetFood(Food);
        System.out.println();
        System.out.println(pet3.toString());

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}