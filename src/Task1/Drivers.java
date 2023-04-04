package Task1;

import java.util.Scanner;

public class Drivers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        Stack stack = new Stack(inputString.length());

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(String.valueOf(inputString.charAt(i)));
        }

        String reversedString = "";

        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }

        System.out.println("Reversed string: " + reversedString);
    }
}

