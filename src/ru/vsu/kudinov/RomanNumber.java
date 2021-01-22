package ru.vsu.kudinov;


import javafx.util.Pair;

import java.util.ArrayList;

public class RomanNumber
{
    private String romanNumber;

    public RomanNumber(String romanNumber)
    {
        this.romanNumber = romanNumber;
    }

    public int convertToArabicNumber()
    {
        ArrayList<Pair<Integer, String>> numbers = new ArrayList<>();
        numbers.add(new Pair<>(1000, "M"));
        numbers.add(new Pair<>(900, "CM"));
        numbers.add(new Pair<>(500, "D"));
        numbers.add(new Pair<>(400, "CD"));
        numbers.add(new Pair<>(100, "C"));
        numbers.add(new Pair<>(90, "XC"));
        numbers.add(new Pair<>(50, "L"));
        numbers.add(new Pair<>(40, "XL"));
        numbers.add(new Pair<>(10, "X"));
        numbers.add(new Pair<>(9, "IX"));
        numbers.add(new Pair<>(5, "V"));
        numbers.add(new Pair<>(4, "IV"));
        numbers.add(new Pair<>(1, "I"));

        int arabicNumber = 0;

        for (Pair<Integer, String> digit : numbers)
        {
            int i = 0;

            while ((romanNumber.length() > 0) && (i < numbers.size()))
            {
                if (romanNumber.startsWith(digit.getValue()))
                {
                    arabicNumber += digit.getKey();
                    romanNumber = romanNumber.substring(digit.getValue().length());
                }
                else
                {
                    i++;
                }
            }
        }
        return arabicNumber;
    }
}
