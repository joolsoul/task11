package ru.vsu.kudinov;

import javafx.util.Pair;
import java.util.ArrayList;

public class ArabicNumber
{
    private int arabicNumber;

    public ArabicNumber(int arabicNumber)
    {
        this.arabicNumber = arabicNumber;
    }

    public String convertToRomanNumber()
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

        StringBuilder romanNumber = new StringBuilder();

        for (Pair<Integer, String> digit : numbers)
        {
            while (arabicNumber >= digit.getKey())
            {
                arabicNumber -= digit.getKey();
                romanNumber.append(digit.getValue());
            }
        }
        return romanNumber.toString();
    }
}
