package bliznyukjava_task1;

import java.util.Scanner;

public class BliznyukJava_Task1 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = s.nextInt();
        if(a>7) 
        {
            System.out.println("Привет!");      
        }
        else 
        {
            System.out.println("Нет такого имени!");
        }
    }
    
}
