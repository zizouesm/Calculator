package ir.maktab;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Division division = new Division();
        String num1;
        String num2;
        while (true) {
            System.out.println("Enter Number1: ");
            num1 = scanner.nextLine();
            if (Validation.checkValidation(num1)) {
                break;
            }
        }
        while (true) {
            System.out.println("Enter Number2: ");
            num2 = scanner.nextLine();
            if (Validation.checkValidation(num2)) {
                break;
            }
        }
        division.setNum1(Integer.parseInt(num1));
        division.setNum2(Integer.parseInt(num2));
        try {
            System.out.println(division.division());
        } catch (InvalidInputException e) {
            // System.out.println(e.getMessage());
            System.err.println(e.getMessage());
        }


//        boolean flag = true;
//        while (flag) {
//            String number1 = scanner.next();
//            String number2 = scanner.next();
//            Validation validation = new Validation();
//            if (validation.checkValidation(number1) && validation.checkValidation(number2)) {
//                flag = false;
//                System.out.println("Input Valid");
//                Division division = new Division();
//                division.setNum1(Integer.parseInt(number1));
//                division.setNum2(Integer.parseInt(number2));
//                try {
//                    System.out.println(division.division());
//                } catch (InvalidInputException e) {
//                    e.getMessage();
//                }
//            } else {
//                System.out.println("Input Invalid");
//                System.out.println("Enter Valid Number:");
//            }
//        }
    }
}
