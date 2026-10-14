import java.util.Scanner;
public class Calculate_BMI {
    public static void main(String[] args) {

        float weight;
        float height;
        float bmi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight in pounds");
        weight = scanner.nextFloat();

        System.out.println("Enter the height in inches");
        height = scanner.nextFloat();

        float WeightKG = weight * 453592;
        float HeightMETERS = height * 0254;

        bmi = WeightKG / (HeightMETERS * HeightMETERS);

        System.out.println("BMI of the person is " + bmi);

        scanner.close();
    }
}

