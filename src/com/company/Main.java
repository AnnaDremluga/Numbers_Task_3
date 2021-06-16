package com.company;

import java.util.Scanner;

public class Main {
    //for check

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        if (number.charAt(0) == '0') {
            System.out.println("Not Duck number");
        } else if (number.contains("0")) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not Duck number");
        }
    }
}
