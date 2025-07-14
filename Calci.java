import java.util.*;

public class Calci {
  
    //Addition Mehtod
    public double add(double num1, double num2) {
        System.out.print("Addition: ");
        return num1 + num2;
    }

    //Subtraction Mehtod
    public double sub(double num1, double num2) {
        System.out.print("Subtraction: ");
        return num1 - num2;
    }

    //Multiplication Mehtod
    public double mul(double num1, double num2) {
        System.out.print("Multiplication: ");
        return num1 * num2;
    }

    //Division Mehtod
    public double div(double num1, double num2) {
        System.out.print("Division: ");
        if(num2 != 0) {
        return num1 / num2;
        } else {
            System.out.println("Denominator cannot be zero");
            return Double.NaN; 
        }
    }

    //Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Your Second Number: ");
        int num2 = sc.nextInt();

        Calci cal = new Calci();

        System.out.println(cal.add(num1, num2));
        System.out.println(cal.sub(num1, num2));
        System.out.println(cal.mul(num1, num2));
        System.out.println(cal.div(num1, num2));

    }
}
