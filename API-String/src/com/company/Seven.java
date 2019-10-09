package com.company;

public class Seven {
    void Seven(){
        int i = 0;
        Text t = new Text();
        for (String w : t.Text().split(" ")) {
            if(w.matches("[0-9]*")){
                int f = Integer.parseInt(w);
                i = i + f;
            }

        }
        System.out.println("Cума всіх чисел = " + i);
    }
}