/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloadingMatematika;

/**
 *
 * @author LEGION
 */
public class Matematika {

    // Overload pertambahan
    public double pertambahan(double a, double b, double c) {
        return a + b + c;
    }

    public int pertambahan(int a, int b, int c) {
        return a + b + c;
    }

    public int pertambahan(int a, int b) {
        return a + b;
    }

    public double pertambahan(double a, double b) {
        return a + b;
    }

    // Overload pengurangan
    public double pengurangan(double a, double b, double c) {
        return a - b - c;
    }

    public int pengurangan(int a, int b, int c) {
        return a - b - c;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public double pengurangan(double a, double b) {
        return a - b;
    }

    // Overload perkalian
    public double perkalian(double a, double b, double c) {
        return a * b * c;
    }

    public int perkalian(int a, int b, int c) {
        return a * b * c;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public double perkalian(double a, double b) {
        return a * b;
    }

    // Overload pembagian
    public double pembagian(double a, double b, double c) {
        return a / b / c;
    }

    public int pembagian(int a, int b, int c) {
        return a / b / c;
    }

    public int pembagian(int a, int b) {
        return a / b;
    }

    public double pembagian(double a, double b) {
        return a / b;
    }
}
