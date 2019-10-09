package com.company;

public class Five {
    void Five(){
        Text t = new Text();
        int i = 0, j = -2;
        for (String w : t.Text().split(" ")) {
            if(w.matches("[a-z]*\\.$")) {
                i++;
            }
            else if(w.matches( "[a-z]*\\?$")) {
                i++;
            }
            else if(w.matches("[a-z]*\\!$")) {
                i++;
            }
        }
        String[] A = t.Text().split("\\.");
        for(String temp : A){
            if((j == (i - 2)) || (j == (i - 3))){
                System.out.print(temp + ",");
            }
            else
                System.out.print(temp + ".");
            j++;
        }

    }
}