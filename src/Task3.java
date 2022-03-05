import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert first digit: ");
        int x = scanner.nextInt();

        System.out.println("Please insert second digit: ");
        int y = scanner.nextInt();

        whichIsGreater(x, y);
        multiplyXIsgreaterThanY(x,y);
        methodC(x,y);
        methodD(x,y);

    }
    private static void whichIsGreater(int x, int y){
        boolean result = x >y;
        System.out.println("If x is grater than y: "+result);
    }
    private static void multiplyXIsgreaterThanY(int x, int y){
        boolean result = 3*x >y;
        System.out.println("If 3x is grater than y: "+result);
    }
    private static void methodC(int x, int y){
        boolean result = (y++ < ++x) && (--x < y++);
        System.out.println("If y blala: " + result);
    }
    private static void methodD(int x, int y){
        boolean result = (x * y) % 2 == 0;
        System.out.println("If x * y is even; " +result);
    }
}
