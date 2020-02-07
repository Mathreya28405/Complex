package com.company;

public class Complex {
    private double r;
    private double i;

    public Complex(double a) {
        r = a;
        i = 0.0;
    }

    public Complex(double a, double b) {
        r = a;
        i = b;
    }

    public double abs() {
        double x = Math.pow(r, 2) + Math.pow(i, 2);
        x = Math.sqrt(x);
        return x;
    }

    public Complex add(Complex other) {
        Complex original = new Complex(r, i);
        double x = r + other.r;
        double y= i + other.i;
        Complex newOne= new Complex(x, y);
        return newOne;

    }

    public Complex add2(double g) {
        double x = i + g;
        Complex newOne = new Complex(r, x);
        return newOne;
    }

    public Complex multiply(Complex other){
        Complex original = new Complex(r, i);
        double x = (r*other.r) - (i*other.i);
        double y = (r*other.i) + (i*other.r);
        Complex z = new Complex(x, y);
        return z;
    }

    public Complex multiply2(double g) {
        double x = r*g;
        double y = i*g;
        Complex newOne = new Complex(x, y);
        return newOne;
    }


    public String toString() {
        return r + "+" + i + "i";
    }

    public static void main(String[] args) {
	Complex d = new Complex(3, 5);
	Complex e = new Complex(12, 17);

	System.out.println(d.multiply2(9));

	//System.out.println(e.add2(8));

	//System.out.println(d.multiply(e));

	//System.out.println(d.abs());
	//System.out.println(d.add(e));
	//System.out.println(d);

    }
}
/*
Output for initial tests:
5.830951894845301
15.0+22.0i
3.0+5.0i

Output for multiply method:
-49.0+111.0i

Output for add2:
12.0+25.0i

Output for multiply2:
27.0+45.0i
 */
