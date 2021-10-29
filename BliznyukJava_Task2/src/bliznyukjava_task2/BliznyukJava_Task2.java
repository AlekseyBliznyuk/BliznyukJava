/*результат программы будет отображён в виде двух строк: 
первая - результат сравнения str и str2,
вторая - результат сравнения str1 и str2
*/
package bliznyukjava_task2;

public class BliznyukJava_Task2 {
    public static void main(String[] args) {
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
