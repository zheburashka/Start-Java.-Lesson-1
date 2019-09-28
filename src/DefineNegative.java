//created by Zheburashka
//6. Написать метод, которому в качестве параметра передается целое число,
// метод должен вернуть true, если число отрицательное

import java.util.Scanner;

public class DefineNegative {
    public static void main(String[] args) {
        int A;
        A = readIntArgument("Enter integer: ");
        if (A < 0) {
            boolean res = true;
            System.out.println("Entered number negative? -" + res);
        }

    }

    static int readIntArgument(String userText){
        Scanner userInput = new Scanner(System.in);
        System.out.print(userText);
        int argument = userInput.nextInt();
        return argument;
    }
}
