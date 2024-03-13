import java.util.Scanner;
/**
 * La clase Suma permite sumar dos números ingresados por el usuario .
 */
    public class Suma {
        public double Sumar() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce dos números para sumar: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            return num1 + num2;
        }
    }

