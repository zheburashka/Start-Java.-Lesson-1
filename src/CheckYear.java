//created by Zheburashka
//8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        int year;
        year = readIntArgument("Enter year: ");
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
            System.out.println(year + " is leap year");
        }
        else
            System.out.println(year + " is regular year");

    }

    static int readIntArgument(String userText){
        Scanner userInput = new Scanner(System.in);
        System.out.print(userText);
        int argument = userInput.nextInt();
        return argument;
    }
}