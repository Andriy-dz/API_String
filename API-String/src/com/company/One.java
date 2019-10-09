package com.company;

public class One {
    void One(){
        ABC();
        Text t = new Text();
        int l, th = 0, f = 0, s = 0;
        for (String w : t.Text().split(" ")) {
            l = w.length();
            if(l == 3){
                th++;
            }else if(l == 5){
                f++;
            }else if(l == 7){
                s++;
            }
        }
        System.out.println("Кількість слів довжиною \"3\":" + th + "\nКількість слів довжиною \"5\":" + f + "\nКількість слів довжиною \"7\":");
    }
    private void ABC(){}
}
