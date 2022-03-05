import java.util.Scanner;

public class Task2 {
    private static final float PI = 3.14F;

    public static void main(String[] args) {
        float radius = getDiameterForUser()/2;
        float circumference = calculateCircumference(radius);
        float area = calclateArea(radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
    private static float getDiameterForUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert diameter: ");
        return scanner.nextFloat();
    }

    private static float calculateCircumference(float radius){
       return 2 * (float)Math.PI * radius;
    }
    private static float calclateArea(float radius){
        return (float)Math.PI * radius * radius;
    }
}
