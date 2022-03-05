import java.util.Scanner;

public class Task4 {
    private static final float BMI_MIN_RANGE  = 18.5F;
    private static final float BMI_MAX_RANGE  = 24.9F;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert weight in kg: ");
        float weight = scanner.nextInt();

        System.out.println("Please insert height in cm: ");
        int height = scanner.nextInt();

       float bmi = calulateBMI(weight,height);
       displayBmiResult(bmi);

    }
    private static float calulateBMI(float weight, int height){
        double heightInMeter = height / 100D;
        return weight / (float)Math.pow(heightInMeter,2);
    }


     private static void displayBmiResult(float bmi) {
         if (bmi < BMI_MIN_RANGE || bmi > BMI_MAX_RANGE) {
             System.out.println("BMI incorrect " + bmi);
         } else {
             System.out.println("BMI is correct" + bmi);
         }
    }
}

