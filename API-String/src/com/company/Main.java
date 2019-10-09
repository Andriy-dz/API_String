package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        One O = new One();
        Two T = new Two();
        Three Th = new Three();
        Four F = new Four();
        Five f = new Five();
        Six S = new Six();
        Seven Se = new Seven();
        Eight E = new Eight();
        Nine N = new Nine();
        String n;
        Scanner r = new Scanner(System.in);
        System.out.println("1 - Порахувати скільки в тексті є слів з довжиною 3, 5, 7 символів\n"+
                "2 - Порахувати скільки речень є в тесті\n"+
                "3 - Кожне друге речення перевести до верхнього регістру\n"+
                "4 - В кожному третьому реченні заміняти голосні на приголосні\n"+
                "5 - Останні три речення об'єднати в одне використовуючи коми\n"+
                "6 - Знайти скільки в тесті є дат (формати: 1996, 2003-02-01)\n"+
                "7 - Знайти суму всіх чисел в тесті\n"+
                "8 - В 17ому реченні всі слова вивести в зворотному порядку\n"+
                "9 - Знайти топ 5 використованих слів довжиною >=4 літер");
        System.out.print("Введіть ваш вибір:");
        n = r.nextLine();
        switch (n) {
            case "1":
                O.One();
                break;
            case "2":
                T.Two();
                break;
            case "3":
                Th.Three();
                break;
            case "4":
                F.Four();
                break;
            case "5":
                f.Five();
                break;
            case "6":
                S.Six();
                break;
            case "7":
                Se.Seven();
                break;
            case "8":
                E.Eight();
                break;
            case "9":
                N.Nine();
                break;
        }
    }
}