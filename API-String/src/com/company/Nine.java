package com.company;

public class Nine {
    public void Nine() {
        int j = 0, i = 0;
        Text t = new Text();
        String[] A = t.Text().split(" ");
        // Масив для визначення довжини масива з словами довжина яких >=4
        for (String temp : A) {
            if (temp.matches("[a-z]{4,}")) {
                i++;
            }
        }
        // В масив "B" скаладаю всі слова довжина яких >=4
        String[] B = new String[i];
        for (String temp : A) {
            if (temp.matches("[a-z]{4,}")) {
                B[j] = temp;
                j++;
            }
        }
        // Два масива для сля самого слова і частоти вживання
        int[] top = new int[]{1, 1, 1, 1, 1};
        String[] TOP = new String[]{"null", "null", "null", "null", "null"};
        for(int w = 0;w < i; w++){
            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int k = 0; k < 4; k++) {
                    if(top[k] < top[k+1]){
                        isSorted = false;
                        buf = top[k];
                        top[k] = top[k+1];
                        top[k+1] = buf;
                    }
                }
            }
            j = 0;
            for(int p = 0;p < i; p++) {
                if(B[w].equals(B[p])){
                    j++;
                }
            }
            for(int h = 0;h < 5;h++){
                if(j >= top[h]){
                        top[h] = j;
                        TOP[h] = B[w];
                    break;
                }
            }
        }
        System.out.println("\nТоп 1 слово:" + TOP[0] + "\nКількість вживань = " + top[0]);
        System.out.println("\nТоп 2 слово:" + TOP[1] + "\nКількість вживань = " + top[1]);
        System.out.println("\nТоп 3 слово:" + TOP[2] + "\nКількість вживань = " + top[2]);
        System.out.println("\nТоп 4 слово:" + TOP[3] + "\nКількість вживань = " + top[3]);
        System.out.println("\nТоп 5 слово:" + TOP[4] + "\nКількість вживань = " + top[4]);
    }

}