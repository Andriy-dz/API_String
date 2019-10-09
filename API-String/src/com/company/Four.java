package com.company;

public class Four {
    void Four(){
        int j = 1;
        Text t = new Text();
        String[] A = t.Text().split("\\.");
        for(String temp : A){
            temp = temp + ".";
            if(j%3 == 0) {
                String g = new String(temp.replace('a', 'b'));
                g = (g.replace('e', 'c'));
                g = (g.replace('y', 'd'));
                g = (g.replace('u', 'f'));
                g = (g.replace('i', 'g'));
                g = (g.replace('o', 'h'));
                g = (g.replace('A', 'B'));
                g = (g.replace('E', 'C'));
                g = (g.replace('Y', 'D'));
                g = (g.replace('U', 'F'));
                g = (g.replace('I', 'G'));
                g = (g.replace('O', 'H'));
                for(int i = 1;i<13;i++){
                    if(12 == i) {
                        System.out.print(g);
                    }
                }
            }else System.out.print(temp);
            j++;
        }

    }
}