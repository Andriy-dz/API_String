package com.company;

public class Six {
    void Six(){
        Text t = new Text();
        int i = 0;
        System.out.print("У тексті є такі дати: ");
        for (String w : t.Text().split(" ")) {
            if(w.matches("[1]?[0]{1}[0-9]{2}")){
                System.out.print(w + ", ");
                i++;
            }
            else if(w.matches("2?0{1}[0-1]{1}[0-9]{1}(-{1}[0-1]{1}[0-9]{1}-{1}[0-3]{1}[0-9]{1})?")){
                System.out.print(w + ", ");
                i++;
            }
            else if(w.matches("1?[0-9]{3}(-{1}[0-1]{1}[0-9]{1}-{1}[0-3]{1}[0-9]{1})?")){
                System.out.print(w + ", ");
                i++;
            }

        }
        System.out.println("\nКількість дат у тексті = " + i);
    }
}