//created by Zheburashka
//5. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль положительное число передали или отрицательное
// (Замечание: ноль считаем положительным числом.)

import java.util.Scanner;

public class DefineSign {
    public static void main(String[] args) {
        int A;
        A = readIntArgument("Enter integer: ");
        if (A < 0) {
            System.out.println(A + " is negative number");
        }
        else
            System.out.println(A + " is positive number");

    }

        static int readIntArgument(String userText){
        Scanner userInput = new Scanner(System.in);
        System.out.print(userText);
        int argument = userInput.nextInt();
        return argument;
    }
}
