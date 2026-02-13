import java.util.Scanner;

class Complex {
    double real;
    double imag;

    // Constructor to initialize values
    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    // Method to display the result in a + ib format
    public void display() {
        String sign = (this.imag >= 0) ? "+" : "-";
        System.out.println(this.real + " " + sign + " i" + Math.abs(this.imag));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first number
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        Complex num1 = new Complex(r1, i1);

        // Input for second number
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();
        Complex num2 = new Complex(r2, i2);

        // Perform addition
        Complex result = num1.add(num2);

        // Output result
        result.display();
        
        sc.close();
    }
}
