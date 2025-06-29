package HackerRankSolutions;

import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale us = Locale.US;
        Locale india = new Locale("en", "IN");
        Locale china = Locale.CHINA;
        Locale france = Locale.FRANCE;

        NumberFormat usFmt = NumberFormat.getCurrencyInstance(us);
        NumberFormat inFmt = NumberFormat.getCurrencyInstance(india);
        NumberFormat chFmt = NumberFormat.getCurrencyInstance(china);
        NumberFormat frFmt = NumberFormat.getCurrencyInstance(france);

        String usStr = usFmt.format(payment);
        String inStr = inFmt.format(payment).replace("\u20B9", "Rs.");
        String chStr = chFmt.format(payment).replace('\u00A5', '\uFFE5');

        String frStr = frFmt.format(payment);

        frStr = frStr.replace('\u202F', '\u00A0');

        frStr = frStr.replace("\u00A0\u20AC", " \u20AC");

        System.out.println("US: " + usStr);
        System.out.println("India: " + inStr);
        System.out.println("China: " + chStr);
        System.out.println("France: " + frStr);
    }
}