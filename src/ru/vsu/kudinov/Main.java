package ru.vsu.kudinov;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        if(checkInput())
        {
            ArabicConverter();
        }
        else
        {
            RomanConverter();
        }
    }

    private static boolean checkInput()
    {
        System.out.println("Please, choose what do you want:");
        System.out.println("for converting to Roman numeral from Arabic numeral --> INPUT (1)");
        System.out.println("for converting to Arabic numeral from Roman numeral --> INPUT (2)");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        return choice == 1;
    }

    private static void RomanConverter()
    {
        System.out.println("Enter a Roman number");
        Scanner scanner = new Scanner(System.in);
        String romanNumeral = scanner.next();

        RomanNumber romanNumber = new RomanNumber(romanNumeral);
        int arabicNumeral = romanNumber.convertToArabicNumber();
        System.out.println("numeral " + romanNumeral + " convert to " + arabicNumeral);


    }

    private static void ArabicConverter()
    {
        System.out.println("Enter an Arabic number");
        Scanner scanner = new Scanner(System.in);
        int arabicNumeral = scanner.nextInt();

        ArabicNumber arabicNumber = new ArabicNumber(arabicNumeral);
        String romanNumeral = arabicNumber.convertToRomanNumber();
        System.out.println("numeral " + arabicNumeral + " convert to " + romanNumeral);

    }
}
