package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(calc(s));
    }

    public static String calc(String input) throws Exception {
        String[] values = input.split(" ");
        if (values.length == 3) {
            if ((values[0].compareTo("0") == 0 || values[0].compareTo("1") == 0 || values[0].compareTo("2") == 0
                    || values[0].compareTo("3") == 0 || values[0].compareTo("4") == 0 || values[0].compareTo("5") == 0
                    || values[0].compareTo("6") == 0 || values[0].compareTo("7") == 0 || values[0].compareTo("8") == 0
                    || values[0].compareTo("9") == 0 || values[0].compareTo("10") == 0)
                    && (values[2].compareTo("0") == 0 || values[2].compareTo("1") == 0 || values[2].compareTo("2") == 0
                    || values[2].compareTo("3") == 0 || values[2].compareTo("4") == 0 || values[2].compareTo("5") == 0
                    || values[2].compareTo("6") == 0 || values[2].compareTo("7") == 0 || values[2].compareTo("8") == 0
                    || values[2].compareTo("9") == 0 || values[2].compareTo("10") == 0)) {

                switch (values[1]) {
                    case "+":
                        return Integer.toString(Integer.parseInt(values[0]) + Integer.parseInt(values[2]));
                    case "-":
                        return Integer.toString(Integer.parseInt(values[0]) - Integer.parseInt(values[2]));
                    case "*":
                        return Integer.toString(Integer.parseInt(values[0]) * Integer.parseInt(values[2]));
                    case "/":
                        return Integer.toString(Integer.parseInt(values[0]) / Integer.parseInt(values[2]));
                }
            } else if ((values[0].compareTo("I") == 0 || values[0].compareTo("II") == 0 || values[0].compareTo("III") == 0
                    || values[0].compareTo("IV") == 0 || values[0].compareTo("V") == 0 || values[0].compareTo("VI") == 0
                    || values[0].compareTo("VII") == 0 || values[0].compareTo("VIII") == 0 || values[0].compareTo("IX") == 0
                    || values[0].compareTo("X") == 0) && (values[2].compareTo("I") == 0 || values[2].compareTo("II") == 0
                    || values[2].compareTo("III") == 0 || values[2].compareTo("IV") == 0 || values[2].compareTo("V") == 0
                    || values[2].compareTo("VI") == 0 || values[2].compareTo("VII") == 0 || values[2].compareTo("VIII") == 0
                    || values[2].compareTo("IX") == 0 || values[2].compareTo("X") == 0)) {

                int result;
                switch (values[1]) {
                    case "+":
                        result = Roman.valueOf(values[0]).toInt() + Roman.valueOf(values[2]).toInt();
                        break;
                    case "-":
                        result = Roman.valueOf(values[0]).toInt() - Roman.valueOf(values[2]).toInt();
                        break;
                    case "*":
                        result = Roman.valueOf(values[0]).toInt() * Roman.valueOf(values[2]).toInt();
                        break;
                    case "/":
                        result = Roman.valueOf(values[0]).toInt() / Roman.valueOf(values[2]).toInt();
                        break;
                    default:
                        result = 0;
                        break;
                }
                if (result > 0){
                    return inArabic(result);
                } else {
                    throw new Exception();
                }
            } else {
                throw new Exception();
            }
        } else {
            throw new Exception();
        }
        return null;
    }

    public static String inArabic(int roman) {
        String arabicStr = new String("");

        switch (roman / 10) {
            case 1 -> arabicStr = arabicStr + "X";
            case 2 -> arabicStr = arabicStr + "XX";
            case 3 -> arabicStr = arabicStr + "XXX";
            case 4 -> arabicStr = arabicStr + "XL";
            case 5 -> arabicStr = arabicStr + "L";
            case 6 -> arabicStr = arabicStr + "LX";
            case 7 -> arabicStr = arabicStr + "LXX";
            case 8 -> arabicStr = arabicStr + "LXXX";
            case 9 -> arabicStr = arabicStr + "XC";
            case 10 -> arabicStr = arabicStr + "C";
        }

        switch (roman % 10) {
            case 1 -> arabicStr = arabicStr + "I";
            case 2 -> arabicStr = arabicStr + "II";
            case 3 -> arabicStr = arabicStr + "III";
            case 4 -> arabicStr = arabicStr + "IV";
            case 5 -> arabicStr = arabicStr + "V";
            case 6 -> arabicStr = arabicStr + "VI";
            case 7 -> arabicStr = arabicStr + "VII";
            case 8 -> arabicStr = arabicStr + "VIII";
            case 9 -> arabicStr = arabicStr + "IX";
        }
        return arabicStr;
    }
}

