package com.Ronit;
import java.text.DecimalFormat;
public class Person {
    String name;
    int amount_paid;
    DecimalFormat df2 = new DecimalFormat("#.##");

    public Person(String name, int amount_paid) {
        this.name = name;
        this.amount_paid = amount_paid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(int amount_paid) {
        this.amount_paid = amount_paid;
    }

    public void split(double split, int amount_paid){
        double per_person_remaining = amount_paid - split;
        System.out.println("Amount paid: Rs "+df2.format(amount_paid)+" by "+getName());
        if(per_person_remaining<0){
            System.out.println(getName()+" Amount to pay: Rs "+df2.format((-(per_person_remaining)))+"\n");
        }else{
            System.out.println(getName()+" Amount to get : Rs "+df2.format(per_person_remaining)+"\n");
        }
    }
}


