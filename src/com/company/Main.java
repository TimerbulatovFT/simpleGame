package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double x = Math.floor(Math.random() * 100);
        int y = (int) x;
        int St = 1;
        Scanner str = new Scanner(System.in);
        System.out.println("Загадано число от 0 до 100. Какое число я загадал?");
        int w = str.nextInt();
        while (w != y) {
            if (w > y) {
                System.out.println("Слишком большое число, загаданное число меньше. Попробуй снова.");
                w = str.nextInt();
                St = St + 1;
            }
            if (w < y) {
                System.out.println("Слишком маленькое число, загаданное число больше. Попробуй снова.");
                w = str.nextInt();
                St = St + 1;
            }
        }
        int Sr=St%10;
        String f = "";
        if (Sr==1)
            f = "";
        if (Sr==2 | Sr==3 | Sr==4 )
            f = "а";
        if (Sr==5 | Sr==6 | Sr==7 | Sr==8 | Sr==9 | Sr==0)
            f = "ов";
        System.out.println("Ты выиграл!!!");
        System.out.println("Для этого тебе потребовалось " + St + " ход" + f + "!");
        System.out.println("Поздравляю!!!");
    }
}
