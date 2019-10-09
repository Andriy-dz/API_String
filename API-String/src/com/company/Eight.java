package com.company;

public class Eight {
    void Eight(){
        int j = 0;
        int i = 0;
        Text t = new Text();
        String[]C = new String[20];
        String[] A = t.Text().split("\\.");
        System.out.print(" Речення у первісному вигляді:");
        for(String temp : A) {
            j++;
            if(j == 17){
                System.out.println("\n" + temp);
                for(String temp1 : temp.split(" ")) {
                    C[i] = temp1;
                    i++;
                }
                break;
            }
        }

        System.out.print(" Речення після змін:\n");
        for( int n = i - 1; n >= 0 ; n--){
            System.out.print(" " + C[n]);
        }
    }
}