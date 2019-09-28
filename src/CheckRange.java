//created by Zheburashka
//4. Написать метод, принимающий на вход два числа, и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false

import java.util.Scanner;

public class CheckRange {
    public static void main(String[] args) {
        double A, B;
        A = readDoubleArgument("Enter A: ");
        B = readDoubleArgument("Enter B: ");
        boolean res = check(A, B);
        System.out.println("10 < (A + B) <= 20: " + res);

    }

    static boolean check(double A, double B){
        boolean result = false;
        if ((A + B) <= 20 && (A + B) > 10){
            result = true;
        }
        return result;

    }


    static double readDoubleArgument(String userText){
        Scanner userInput = new Scanner(System.in);
        System.out.print(userText);
        double argument = userInput.nextDouble();
        return argument;
    }
}
