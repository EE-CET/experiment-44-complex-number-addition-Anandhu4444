import java.util.Scanner;

class Complex {
    double real;
    double imag;

    // Constructor
    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        double sumReal = this.real + c.real;
        double sumImag = this.imag + c.imag;
        return new Complex(sumReal, sumImag);
    }

    // Method to display in a + ib format
    void display() {
        if (imag >= 0)
            System.out.println(real + " + i" + imag);
        else
            System.out.println(real + " - i" + (-imag));
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first complex number
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();

        // Input second complex number
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex result = c1.add(c2);

        result.display();

        sc.close();
    }

