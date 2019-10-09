
package com.company;

public class Three {
    void Three(){
        int j = 0;
        Text t = new Text();
        String[] A = t.Text().split("\\.");
        for(String temp : A){
            if(j%2 == 1) {
                for (String w : temp.split(" ")) {
                    char[] arr = w.toCharArray();
                    int i = 0;
                    while (i < arr.length) {
                        arr[i] = Character.toUpperCase(arr[i]);
                        i++;
                    }
                    String str = new String(arr);
                    System.out.print(str + " ");
                }
            }else
                System.out.print(temp);
            j++;
            System.out.print(".");

        }
    }
}