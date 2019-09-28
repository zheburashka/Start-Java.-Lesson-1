// created by Zheburashka

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args){
        double a, b, c, d, res;
        a = readDoubleArgument("Enter a: ");
        b = readDoubleArgument("Enter b: ");
        c = readDoubleArgument("Enter c: ");
        d = readDoubleArgument("Enter d: ");
        res = a * (b + (c / d));
        System.out.println("a * (b + (c / d)) = " + res);
    }

    static double readDoubleArgument(String userText){
        Scanner userInput = new Scanner(System.in);
        System.out.print(userText);
        double argument = userInput.nextDouble();
        return argument;
    }
}
