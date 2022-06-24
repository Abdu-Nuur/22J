package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            a.add(random.nextInt(1, 100));
            System.out.print(" " + a.get(i));
        }
        for (int i = 0; i < a.size(); i++) {
          if (a.get(i)%2==0){
           b.add(a.get(i));
          }else {
              c.add(a.get(i));
          }
        }
        System.out.println();
        System.out.println("Жуп сан"+b);
        System.out.println("Так сан"+c);
    }
}
