import java.util.Scanner;

class Complex {
    int real, imag;

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imag + c2.imag);
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        Complex sum = Complex.add(c1, c2);

        System.out.println(sum.real + " + " + sum.imag + "i");
        sc.close();
    }
}
