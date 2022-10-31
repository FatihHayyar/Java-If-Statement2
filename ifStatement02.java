package day05IfStatement;

import java.util.Scanner;

public class ifStatement02 {
    public static void main(String[] args) {
        Scanner unit = new Scanner(System.in);
        System.out.println("gun kodunu girin");
        int b = unit.nextByte();
        int a=b%7;
        if (a==1){
            System.out.println("pazar");
        }
        else if (a==2){
            System.out.println("pazartesi");
        }
       else if (a==3){
            System.out.println("sali");
        }
       else if (a==4){
            System.out.println("carsamba");
        }
       else if (a==5){
            System.out.println("persembe");
        }else  if (a==6){
            System.out.println("cuma");
        }
        else {
            System.out.println("c.tesi");
        }


    }





}
