package com.company;


public class Two {
    Text t = new Text();
    int i = 0;

    void Two() {
        for (String w : t.Text().split(" ")) {
            if (w.matches("[a-z]*\\.$")) {
                i++;
            } else if (w.matches("[a-z]*\\?$")) {
                i++;
            } else if (w.matches("[a-z]*\\!$")) {
                i++;
            }
        }
        System.out.println("Кількість речень = " + i);
    }
}