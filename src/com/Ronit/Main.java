package com.Ronit;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int amount = 0;
        double total = 0, per_person_split=0;

        Person [] person = new Person [100];
        DecimalFormat df2 = new DecimalFormat("#.##");

        System.out.println("Enter members number:");
        int n = sc.nextInt();

        for(int i=1; i<n+1; i++){
            System.out.println("Enter the name of "+ (i)+" person and amount paid: ");
            name = sc.next();
            amount = sc.nextInt();
            person [i] = new Person(name, amount);

        }

        for(int i =1; i<n+1; i++){
            double a = person[i].getAmount_paid();
            total += a;
            per_person_split = total/n;

        }
        System.out.println("Total amount is : Rs "+total);
        System.out.println("Split per person: Rs "+df2.format(per_person_split)+"\n");

        for(int i =1; i<n+1; i++) {
            person[i].split(per_person_split, person[i].getAmount_paid());
        }


    }

}
