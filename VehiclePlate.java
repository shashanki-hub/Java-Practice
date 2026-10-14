import java.util.Random;

public class VehiclePlate {
    public static void main(String[] args) {

        String[] fruits = {
            "Apple", "Banana", "Mango", "Orange",
            "Grapes", "Papaya", "Guava", "Kiwi",
            "Cherry", "Peach"
        };

        Random random = new Random();

        // Generate 3 random fruit initials
        String plate = "";

        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(fruits.length);
            plate += fruits[index].charAt(0);
        }

        // Generate 4 random numbers
        for (int i = 0; i < 4; i++) {
            plate += random.nextInt(10);
        }

        System.out.println("Generated Vehicle Number Plate: " + plate);
    }
}