//created by Zheburashka
//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
//метод должен вывести в консоль сообщение «Привет, указанное_имя!»

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        String A = readStringArgument("What's your name? ");
        System.out.println("Hello, " + A + "!");
    }

    static String readStringArgument(String userText){
        Scanner userInput = new Scanner(System.in);
        System.out.print(userText);
        String argument = userInput.nextLine();
        return argument;
    }
}

