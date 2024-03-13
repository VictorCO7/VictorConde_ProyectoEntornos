import java.util.Scanner;
/**
 * La clase Resta permite restar dos números ingresados por el usuario .
 */
class Resta {
    public double Restar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dos números para restar: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        return num1 - num2;
    }
}
