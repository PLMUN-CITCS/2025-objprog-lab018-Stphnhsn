import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        int number = getInput();
        checkEvenOdd(number);
    }

   
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }
    }
}
