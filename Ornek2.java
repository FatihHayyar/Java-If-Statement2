package day05IfStatement;


import java.util.Scanner;

public class Ornek2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk isci isi kac gunde bitirir?");
        double a = scan.nextDouble();
        System.out.println("ikinci isci isi kac gunde bitirir?");
        double b = scan.nextDouble();

        double sonuc = 1 / ((1 / a) + (1 / b));

        int value = (int) sonuc + 1;
        System.out.println("sonuc= " + value);


    }


}
