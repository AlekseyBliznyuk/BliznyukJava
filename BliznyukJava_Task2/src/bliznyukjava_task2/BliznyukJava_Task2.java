package bliznyukjava_task2;

import java.util.Scanner;

public class BliznyukJava_Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str="Вячеслав";
        String str1="вячеслав";
        String str2="Вячеслав";       
        if(str.equals(str2))
        {
            System.out.println("Привет,Вячеслав");//сравнение str и str2
        }
        else
        {
            System.out.println("Нет такого имени");
        }
        if(str1.equals(str2))// сравнение str1 и str2
        {
            System.out.println("Привет,Вячеслав");
        }
        else
        {
            System.out.println("Нет такого имени");
        }
    }  
}
