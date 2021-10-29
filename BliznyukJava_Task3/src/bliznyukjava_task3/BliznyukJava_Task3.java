package bliznyukjava_task3;
import java.util.Scanner;

public class BliznyukJava_Task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Размер массива:");
        int size = input.nextInt();
        int[] a = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0;i < size; i++)
        {
            a[i] = input.nextInt();
        }
        System.out.println("Итог");
        for(int i = 0; i < a.length; i++)
        {
            if(a[i]%3==0)
            {               
                System.out.println(a[i]);
            }
        }
    }
}
