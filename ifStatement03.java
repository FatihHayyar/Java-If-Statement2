package day05IfStatement;

import java.util.Scanner;

public class ifStatement03 {
    public static void main(String[] args) {
        Scanner unit=new Scanner(System.in);
        System.out.println("bugün günlerden ne");
        String gun= unit.nextLine();
        if (gun.equalsIgnoreCase("cumartesi")||gun.equalsIgnoreCase("pazar")){
            System.out.println("haftasonundasin");
        }
        else {
            System.out.println("hafta icindesin");

        }







    }





}
