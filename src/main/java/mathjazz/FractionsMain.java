package mathjazz;

import java.util.Scanner;

public class FractionsMain {
    
    public FractionsMain() {
        System.out.println("Witaj w programie do nauki ułamków zwykłych. Powiedz co chcesz zrobić. Wpisz numer.");
        System.out.println("1 - Budowa ułamka zwykłego.");
        System.out.println("2 - Czytanie ułamków.");
        System.out.println("3 - Ułamek jako iloraz.");
        System.out.println("4 - Rodzaje ułamków zwykłych.");
        System.out.println("5 - Zamiana liczby mieszanej na ułamek niewłaściwy.");
        System.out.println("6 - Wyłączanie całości (zamiana ułamka niewłaściwego na liczbę mieszaną).");
        System.out.println("7 - Rozszerzanie ułamków zwykłych.");
        System.out.println("8 - Skracanie ułamków zwykłych.");
        System.out.println("9 - Sprowadzanie do wspólnego mianownika.");
        System.out.println("10 - Porównywanie ułamków zwykłych.");
        System.out.println("11 - Dodawanie ułamków o jednakowych mianownikach.");
        System.out.println("12 - Dodawanie ułamków o różnych mianownikach.");
        System.out.println("13 - Odejmowanie ułamków o jednakowych mianownikach.");
        System.out.println("14 - Odejmowanie ułamków o różnych mianownikach.");
        System.out.println("15 - Odejmowanie ułamków - przypadki specjalne.");
        System.out.println("16 - Mnożenie ułamków przez liczbę naturalną.");
        System.out.println("17 - Mnożenie ułamków.");
        System.out.println("18 - Odwrotność ułamka.");
        System.out.println("19 - Dzielenie ułamków.");
        System.out.println("20 - Obliczanie ułamka liczby.");
        System.out.println("21 - Zamiana ułamka zwykłego na ułamek dziesiętny.");
        System.out.println("0 - Wyjście z programu.");
       
        Scanner scanner = new Scanner(System.in);
        int problem = scanner.nextInt();
        Fractions frac = new Fractions();
        
            switch (problem) {
                case 1:
                frac.buildFrac();
                break;
                case 2:
                frac.readFrac();
                break;
                case 3:
                frac.convertFractionToQuotient();
                break;
                case 4:
                frac.kindFrac();
                break;
                case 5:
                frac.changeToFrac();
                break;
                case 6:
                frac.changeToMixedNumber();
                break;
                case 7:
                frac.extendFrac();
                break;
                case 8:
                frac.shortenFrac();
                break;
                case 9:
                frac.findCommonDenominator();
                break;
                case 10:
                frac.comparFrac();
                break;
                case 11:
                frac.add1Frac();
                break;
                case 12:
                frac.add2Frac();
                break;
                case 13:
                frac.subtract1Frac();
                break;
                case 14:
                frac.subtract2Frac();
                break;
                case 15:
                frac.subtractFracSpecial();
                break;
                case 16:
                frac.multiplyForNumber();
                break;
                case 17:
                frac.multiplyFrac();
                break;
                case 18:
                frac.inverseFrac();
                break;
                case 19:
                frac.divideFrac();
                break;
                case 20:
                frac.calculateFrac();
                break;
                case 21:
                frac.changeToDecimal();
                break;
                case 0:
                break;
                default:
                System.out.println("Podałeś niewłaściwy numer!");
                break;
            }
        
                
    }

    public static void main(String[] args) {
        FractionsMain fm = new FractionsMain();
    }
    
}
