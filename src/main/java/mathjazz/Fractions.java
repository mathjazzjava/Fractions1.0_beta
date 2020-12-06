package mathjazz;

import java.util.Scanner;

public class Fractions {
    Scanner scanner = new Scanner(System.in);
    static int numerator, numerator2, numerator3, denominator, denominator2, denominator3, wholeNumber, nww, nwd, i, n, m;
    static String choice;
    
    public void Fractions() {
        
    }
    
    public void buildFrac() {
        System.out.println("Ułamek to część całości. Np. pół jabłka, ćwiartka pizzy itp.");
        System.out.println("Ułamek zwykły składa się z licznika i mianownika "
                + "oraz oddzielającej je kreski ułamkowej.");
        System.out.println("Np. w ułamku  3/4 licznik to 3 a mianownik 4");
        System.out.println("Licznik oznacza ile części zamalowano, zjedzono, "
                + "zaznaczono itp. a mianownik - ile jest wszystkich części.");
        System.out.println("W tym wypadku 3/4 oznacza, że np. ktoś podzielił baton na 4 części i zjadł 3 z nich."
                + "Można zatem powiedzieć, że zjadł 3/4 batonu.\n");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Rysunek podzielono na " +denominator +" części i zamalowano " +numerator +" z nich.\n");
            //At soon appears drawing
            
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }  
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        if (choice.equals("t")) {
        FractionsMain fm = new FractionsMain();
        }
        else {}
    
    }
    
    public void readFrac() {
        System.out.println("Ważne jest, aby prawidłowo czytać ułamki.\n"
                + "Np.\n 1/10 czytamy jedna dziesiąta (jedna część, jaka/która dziesiąta)\n"
                + "ale\n 2/10 to dwie dziesiąte (dwie części, jakie dziesiąte)\n"
                + "3/10 to trzy dziesiąte (trzy części, jakie dziesiąte)\n"
                + "4/10 to cztery dziesiąte (cztery części, jakie dziesiąte)\n"
                + "ale\n 5/10 to już pięć dziesiątych (pięć części, jakich dziesiątych)\n"
                + "6/10 to sześć dziesiątych (sześć części, jakich dziesiątych) itd.\n");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            
            if ((numerator<21)&&(denominator<21)) {
                String[] readNumerator = {"zero", "jedna", "dwie", "trzy", "cztery", "pięć", "sześć", "siedem", 
                "osiem", "dziewięć", "dziesięć", "jedenaście", "dwanaście", "trzynaście", "czternaście", "piętnaście",
                "szesnaście", "siedemnaście", "osiemnaście", "dziewiętnaście", "dwadzieścia"};
                String[] readDenominator1 = {"pierwsza", "druga", "trzecia", "czwarta", "piąta", "szósta", "siódma",
                "ósma", "dziewiąta", "dziesiąta", "jedenasta", "dwunasta", "trzynasta", "czternasta", "piętnasta",
                "szesnasta", "siedemnasta", "osiemnasta", "dziewiętnasta", "dwudziesta"};
                String[] readDenominator234 = {"pierwsze", "drugie", "trzecie", "czwarte", "piąte", "szóste", "siódme",
                "ósme", "dziewiąte", "dziesiąte", "jedenaste", "dwunaste", "trzynaste", "czternaste", "piętnaste",
                "szesnaste", "siedemnaste", "osiemnaste", "dziewiętnaste", "dwudzieste"};
                String[] readDenominatorAll = {"pierwszych", "drugich", "trzecich", "czwartych", "piątych", "szóstych",
                "siódmych", "ósmych", "dziewiątych", "dziesiątych", "jedenastych", "dwunastych", "trzynastych", "czternastych",
                "piętnastych", "szesnastych", "siedemnastych", "osiemnastych", "dziewiętnastych", "dwudziestych"};
            
                if (numerator==1) {
                    System.out.println(numerator +"/" +denominator +" czytamy: " +readNumerator[numerator] +" " 
                            +readDenominator1[denominator-1]);
                    System.out.println();
                }
                else {
                    if (numerator==2||numerator==3||numerator==4) {
                        System.out.println(numerator +"/" +denominator +" czytamy: " +readNumerator[numerator] +" " 
                            +readDenominator234[denominator-1]);
                        System.out.println();
                    }
                    else
                        System.out.println(numerator +"/" +denominator +" czytamy: " +readNumerator[numerator] +" "  
                            +readDenominatorAll[denominator-1] +"\n");
                }
            }
            else
                System.out.println("Niestety, na razie możesz ćwiczyć tylko w zakresie do 20.");
        
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }  
        
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        if (choice.equals("t")) {
        FractionsMain fm = new FractionsMain();
        }
        else {}
                
    }
    
    public void convertFractionToQuotient() {
        System.out.println("Ułamek to przede wszystkim część całości.");
        System.out.println("Okazuje się jednak, że możemy go zamienić na iloraz. "
                + "Czyli kreska ułamkowa zastępuje dzielenie.");
        System.out.println("Np.  3/5 = 3:5");
        System.out.println("Podobnie w drugą stronę: 6:7 = 6/7");
        System.out.println("\nWażne: Skoro nie dzielimy przez zero, to i mianownik nie może być zerem!!!\n");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            System.out.println(numerator +"/" +denominator +" = " +numerator +":" +denominator +"\n");
            
            System.out.println("Podaj liczbę: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj liczbę: ");
            denominator = scanner.nextInt();
            System.out.println(numerator +":" +denominator +" = " +numerator +"/" +denominator +"\n");
            
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}
        
    }
    
    public void kindFrac() {
        System.out.println("Wyróżniamy ułamki: ");
        System.out.println("-właściwe (licznik mniejszy od mianownika np. 1/3, 4/15, 9/100 itp.)");
        System.out.println("-niewłaściwe (licznik większy od mianownika lub równy mianownikowi np. 2/1, 4/3, 19/10, 7/7 itp.)");
        System.out.println("-liczby mieszane (liczba naturalna oraz ułamek np. 2 3/5 czytamy: dwa i trzy piąte "
                + "lub dwie całe i trzy piąte, 6 2/11, 23 1/2 itp.)");
        System.out.println("\nWażne: ułamki właściwe są mniejsze od 1.\n");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            
            if (numerator<denominator)
                System.out.println("Ułamek " +numerator +"/" +denominator +" jest właściwy.\n");
            else
                System.out.println("Ułamek " +numerator +"/" +denominator +" jest niewłaściwy.\n");
                        
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}
        
    }
   
    public void changeToFrac() { 
        System.out.println("Liczby mieszane można zamienić na ułamek niewłaściwy.");
        System.out.println("Np. 2 3/5 to 13/5 (5*2+3 = 13, a mianownik przepisujemy).");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj całości (liczbę naturalną): ");
            wholeNumber = scanner.nextInt();
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            System.out.println(wholeNumber +" " +numerator +"/" +denominator +" = " 
                    +(denominator*wholeNumber+numerator) +"/" +denominator +"\n");
            
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}
    
    }
    
    public void changeToMixedNumber() {
        System.out.println("Ułamki niewłaściwe można zamienić na liczby mieszane. "
                + "Tę operację nazywamy wyłączaniem całości z ułamka.");
        System.out.println("Np. 23/10 = 2 3/10  (dzielimy licznik przez mianownik - "
                + "iloraz to całości, a reszta to licznik, mianownik przepisujemy).");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            
            if (numerator==denominator) {
                System.out.println("Ułamek:  " +numerator +"/" +denominator +" po wyłączeniu całości "
                        + "przybiera postać liczby mieszanej:  " +numerator/denominator);
            }
            else {
                if (numerator>denominator) {
                    System.out.println("Ułamek:  " +numerator +"/" +denominator +" po wyłączeniu całości "
                        + "przybiera postać liczby mieszanej:  " +numerator/denominator +" " +numerator%denominator +"/" +denominator);
                }
                else 
                    System.out.println("Nie podałeś ułamka niewłaściwego. Licznik powinien być większy od mianownika.\n");
            }
                        
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}
    
    }
    
    public void extendFrac() {
        System.out.println("Ułamek zwykły może przybierać różne postaci, a zachować tę samą wartość.\n"
                + "Np. połowa to przecież jedna część z dwóch (czyli 1/2), ale także trzy części z sześciu (3/6),\n"
                + "czy choćby pięć z dziesięciu (5/10).\nZatem wszystkie te ułamki są równe.\n");
        System.out.println("W bardzo prosty sposób można zmienić postać ułamka, zachowując jego wartość.\n"
                + "Wystarczy pomnożyć licznik i mianownik przez tę samą liczbę naturalną.\n"
                + "Np. dla 1/2 może to być: 1/2 = 1*7/2*7 = 7/14");
        System.out.println("Taką operację nazywamy rozszerzaniem ułamka.\n");
        
        //Excercise1
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Podaj liczbę przez którą chcesz rozszerzyć ułamek:");
            n = scanner.nextInt();
            
            System.out.println("Ułamek:  " +numerator +"/" +denominator +"  po rozszerzeniu przez " +n
            +" przybiera postać:  " +numerator*n +"/" +denominator*n);
            
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }
        
        System.out.println("\nW matematyce najczęściej napotkamy na sytuacje w których znamy już np. mianownik,\n"
                + "do którego chcemy rozszerzyć ułamek i wtedy musimy niejako dokończyć rozszerzanie.\n"
                + "Jak to zrobić? Wystarczy odgadnąć jak zmienił się np. mianownik (przez co pomnożono)\n"
                + "i tak samo zmienić (pomnożyć) licznik.\n");
        System.out.println("Np.  mamy rozszerzyć 3/5 do mianownika 10.\n"
                + "Widzimy, że 5 należy pomnożyć przez 2, aby otrzymać 10. "
                + "W takim razie rozszerzamy przez 2, więc licznik też mnożymy przez 2.\n"
                + "Otrzymujemy: 3*2/5*2 = 6/10.\nCzyli  3/5 = 6/10.\n");
        
        //Excercise2
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Podaj nowy mianownik ułamka: ");
            denominator2 = scanner.nextInt();
            
            if (denominator2%denominator==0) {
                System.out.println("Ułamek:  " +numerator +"/" +denominator +"  po rozszerzeniu do ułamka "
                    + "o mianowniku " +denominator2 +" przybiera postać:  " +numerator*(denominator2/denominator) 
                    +"/" +denominator2);
                System.out.println("\nDlaczego? " +denominator2 +":" +denominator +" = " +denominator2/denominator 
                        +" więc rozszerzamy przez " +denominator2/denominator);
                System.out.println("Stąd: " +numerator +"/" +denominator +" = " +numerator +"*"
                        +denominator2/denominator +"/" +denominator +"*" +denominator2/denominator +" = "
                        +numerator*(denominator2/denominator) +"/" +denominator*(denominator2/denominator) +"\n");
            }
            else
                System.out.println("Z " +denominator +" nie da się otrzymać" +denominator2 +"przez mnożenie przez liczbę"
                        + "naturalną, zatem nie da się tak rozszerzyć. Podaj inny mianownik.");
            
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        } 
        
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}
    
    }
    
    public int Nwd(int a, int b) {
              while (a != b) {
                if (a > b)
                a -= b;
                else
                b -= a;
                }
        return a;
    }
    
    public void shortenFrac() {
        System.out.println("Do skracania bardzo przydaje się znajomość pojęcia rozszerzania ułamków.\n"
                +"Jeśli chcesz wrócić do rozszerzania naciśnij \"t\", "
                + "jeśli chcesz kontynuować skracanie wybierz dowolny klawisz.\n");
        choice = scanner.next();
        if (choice.equals("t"))
            extendFrac();
        else {
            System.out.println("Skracanie ułamków zwykłych to operacja odwrotna do rozszerzania.\n"
                + "Tutaj dzielimy licznik i mianownik przez tę samą liczbę naturalną.\n"
                + "Nie zawsze da się jednak to wykonać. Wtedy mówimy, że dany ułamek jest nieskracalny.\n"
                + "Ważne: zawsze staramy się skracać do momentu uzyskania ułamka nieskracalnego.\n"
                + "Ułamek skrócony jest równy ułamkowi pierwotnemu.\n");
            System.out.println("Np. ułamek  15/35  możemy skrócić przez 5,\n"
                    + "ponieważ zarówno licznik jak i mianownik dzielą się przez 5\n"
                    + "Po skróceniu uzyskamy ułamek 3/7  zgodnie ze schematem:\n"
                    + "15/35 = 15:5/35:5 = 3/7\n");
            System.out.println("Możemy skracać \"na raty\", aż do uzyskania ułamka nieskracalnego:\n"
                    + "np.  36/48 = 36:2/48:2 = 18/24 = 18:6/24:6 = 3/4\n");
        }
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            
            if (Nwd(numerator, denominator)>1)
                System.out.println("Należy zauważyć, że: " +numerator +" i " +denominator 
                +" dzielą się przez " +Nwd(numerator, denominator) +" a więc mamy:\n"
                +numerator +"/" +denominator +" = " +numerator +":" +Nwd(numerator, denominator)
                +"/" +denominator +":" +Nwd(numerator, denominator) +" = "
                +numerator/Nwd(numerator, denominator) +"/" +denominator/Nwd(numerator, denominator));
            else 
                System.out.println("Ułamek " +numerator +"/" +denominator  +"jest nieskracalny.\n");
                
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }
        
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}

    }
    
    public void findCommonDenominator() {
        System.out.println("W matematyce bardzo często będziemy chcieli przedstawić dwa ułamki (lub więcej)\n"
                + "do takiej postaci, żeby miały taki sam mianownik.\n"
                + "Tę operację nazywamy sprowadzaniem do wspólnego mianownika.\n");
        System.out.println("Np. ułamki 5/6 i 4/9 po sprowadzeniu do wspólnego mianownika przybiorą postać:\n"
                + "15/18 oraz 8/18\n");
        System.out.println("Jak to obliczyć?\n"
                + "Krok 1\n"
                + "Znajdujemy wielokrotności pierwszego mianownika - 6, 12, 18, 24, 30...\n"
                + "i drugiego mianownika - 9, 18, 27, 36, 45...\n"
                + "Krok 2\n"
                + "Znajdujemy wspólną wielokrotność - dla 6 i 9 jest to jak widać 18 (najlepiej wybrać najmniejszą)\n"
                + "Krok 3\n"
                + "Rozszerzamy oba ułamki do mianownika 18.\n"
                + "5/6 = 5*3/6*3 = 15/18  oraz  4/9 = 4*2/9*2 = 8/18\n"
                + "Gotowe!\n");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik pierwszego ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik pierwszego ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Podaj licznik drugiego ułamka: ");
            numerator2 = scanner.nextInt();
            System.out.println("Podaj mianownik drugiego ułamka: ");
            denominator2 = scanner.nextInt();
            
            nww = (denominator*denominator2)/Nwd(denominator, denominator2);
            
            System.out.println("Po wykonaniu kroku 1 zauważamy, że wspólnym mianownikiem "
                    + "dla " +denominator +" i " +denominator2 + " będzie " +nww);
            System.out.println("Otrzymujemy więc: \n" +numerator +"/" +denominator
                    +" = " +numerator +"*" +nww/denominator +"/" +denominator +"*" +nww/denominator +" = "
                    +numerator*(nww/denominator) +"/" +denominator*(nww/denominator));
            System.out.println("Oraz\n" +numerator2 +"/" +denominator2
                    +" = " +numerator2 +"*" +nww/denominator2 +"/" +denominator2 +"*" +nww/denominator2 +" = "
                    +numerator2*(nww/denominator2) +"/" +denominator2*(nww/denominator2) +"\nGotowe!");
                        
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        } 
        
        System.out.println("Szczególne przypadki:\nWarto czasem zauważyć coś ciekawego "
                + "i uprościć znajdowanie wspólnego mianownika!\n");
        System.out.println("Przypadek 1\n"
                + "Jeśli jeden mianownik jest wielokrotnością drugiego, to wystarczy rozszerzyć jeden ułamek\n"
                + "(o mniejszym mianowniku) np. dla 7/10 i 3/5\n"
                + "wystarczy rozszerzyć 3/5 = 3*2/5*2 = 6/10\n");
        System.out.println("Przypadek 2\n"
                + "Jeśli oba ułamki mają mianowniki względnie pierwsze,\n"
                + "wystarczy je pomnożyć by znaleźć wsólny mianownik\n"
                + "np. dla  4/5 i 2/3  wspólnym mianownikiem będzie 5*3 = 15\n"
                + "Rozszerzamy:\n4/5 = 4*3/5*3 12/15\noraz\n"
                + "2/3 = 2*5/3*5 = 6/15\n");
        
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}
        
    }
    
    public void comparFrac() {
        System.out.println("Najłatwiej porównać ułamki zwykłe o jednakowych licznikach lub mianownikach.\n"
                + "Np. 2/9 < 5/9  (pięć części to więcej niż 2 części - części są równe(dziewiąte).)\n"
                + "1/3 > 1/10  (lepiej mieć jedną część przy podziale na3, niż na 10)\n"
                + "Podumowując:\n"
                + "z dwóch ułamków o jednakowych mianownikach większy jest ten, który ma większy licznik.\n"
                + "Z dwóch ułamków o jednakowych licznikach większy jest ten, który ma mniejszy mianownik.");
        System.out.println("Jeśli ułamki nie mają jednakowych liczników lub mianowników,\n"
                + "najlepiej sprowadzić je do wspólnego licznika lub mianownika i wtedy porównać wg zasad powyżej.\n"
                + "Ważne: często można porównać ułamki skrajnie różne lub mając punkt odniesienia.\n"
                + "Np.  9/10 > 1/500  ponieważ 9/10 to prawie całość, a 1/500 to bardzo malutki kawałek\n"
                + "Np.  3/7 < 11/20 ponieważ 3/7 to mniej niż pół, a 11/20 to więcej niż pół.");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik pierwszego ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik pierwszego ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Podaj licznik drugiego ułamka: ");
            numerator2 = scanner.nextInt();
            System.out.println("Podaj mianownik drugiego ułamka: ");
            denominator2 = scanner.nextInt();
            
            if (((numerator==numerator2)&&(denominator>denominator2))|| ((denominator==denominator2)&&(numerator<numerator2))) {
                System.out.println(numerator +"/" +denominator +" < " +numerator2 +"/" +denominator2);
            }
            else {
                if (((numerator==numerator2)&&(denominator<denominator2))||((denominator==denominator2)&&(numerator>numerator2)) ){
                    System.out.println(numerator +"/" +denominator +" > " +numerator2 +"/" +denominator2);
                }
                else {
                    nww = (denominator*denominator2)/Nwd(denominator, denominator2);

                    System.out.println(numerator +"/" +denominator
                            +" = " +numerator*(nww/denominator) +"/" +denominator*(nww/denominator));
                    System.out.println(numerator2 +"/" +denominator2
                            +" = " +numerator2*(nww/denominator2) +"/" +denominator2*(nww/denominator2));
                    System.out.println("A zatem mamy:\n");
                    
                    if (((double)(numerator/denominator))>((double)(numerator2/denominator2)))
                        System.out.println(numerator +"/" +denominator +" > " +numerator2 +"/" +denominator2);
                    else {
                        if (((double)(numerator/denominator))<((double)(numerator2/denominator2)))
                            System.out.println(numerator +"/" +denominator +" < " +numerator2 +"/" +denominator2);
                        else
                            System.out.println("Ułamki są równe.\n");
                    }        
                }
            }
            
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}

    } 
    
    public void add1Frac() {
        System.out.println("Dodawanie ułamków o jednakowych mianownikach jest bardzo proste.\n"
                + "wystarczy dodać do siebie liczniki, a mianownik przepisać.\n"
                + "Np. 3/5 + 1/5 = 4/5");
        System.out.println("Ważne: wynik działania powinien być nieskracalny i z wyłączonymi całościami!");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik pierwszego ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik pierwszego ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Podaj licznik drugiego ułamka: ");
            numerator2 = scanner.nextInt();
            System.out.println("Mianownik drugiego ułamka również musi być równy: " +denominator);
                        
            System.out.print(numerator +"/" +denominator +" + " +numerator2 +"/" +denominator +" = ");
            numerator3 = numerator + numerator2;
            
            if (numerator3<denominator) {
                System.out.print(numerator3 +"/" +denominator);
                if (Nwd(numerator3, denominator)>1) {
                    System.out.print(numerator3/Nwd(numerator3, denominator) +"/" +denominator/Nwd(numerator3, denominator));
                }
            }
            else {
                if (numerator2==nww)
                    System.out.print(numerator3 +"/" +denominator +" = 1");
                else {
                    System.out.print(numerator3 +"/" +denominator +" = " +(numerator3/denominator) +" " +(numerator3%denominator) 
                            +"/" +denominator);
                    if (Nwd(numerator3, denominator)>1) {
                        System.out.print(" = " +numerator3/denominator +(numerator3%denominator)/Nwd(numerator3, denominator) 
                                +"/" +denominator/Nwd(numerator3, denominator));
                }
                }   
            }
            
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}

    }
        
    public void add2Frac() {
        System.out.println("Aby można było dodać ułamki zwykłe musi być spełniony jeden warunek - \n"
                + "ułamki te muszą mieć jednakowe mianowniki.\n"
                + "Zatem - aby dodać ułamki najpierw trzeba je sprowadzić do wspólnego mianownika.\n"
                + "Potem już tylko dodajemy liczniki, a mianownik przepisujemy.");
        System.out.println("Ważne: pamiętajmy o skróceniu i wyłączeniu całości (o ile się da) w wyniku");
        System.out.println("Np.  4/9 + 1/6 = 8/18 + 3/18 = 11/18");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik pierwszego ułamka: ");
            numerator = scanner.nextInt();  
            System.out.println("Podaj mianownik pierwszego ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Podaj licznik drugiego ułamka: ");
            numerator2 = scanner.nextInt();
            System.out.println("Podaj mianownik drugiego ułamka: ");
            denominator2 = scanner.nextInt();

            System.out.print(numerator +"/" +denominator +" + " +numerator2 +"/" +denominator2 +" = ");

            nww = (denominator*denominator2)/Nwd(denominator, denominator2);

            numerator*=nww/denominator;
            denominator=nww;
            numerator2*=nww/denominator2;
            denominator2=nww;

            System.out.print(numerator +"/" +denominator +" + " +numerator2 +"/" +denominator2 +" = ");

            numerator3 = numerator + numerator2;
            
            if (numerator3<nww) {
                System.out.print(numerator3 +"/" +nww);
                 if (Nwd(numerator3, denominator)>1) {
                    System.out.print(numerator3/Nwd(numerator3, nww) +"/" +denominator/Nwd(numerator3, nww));
                }
            }
            else {
                if (numerator2==nww)
                    System.out.print(numerator3 +"/" +nww +" = 1");
                else 
                    System.out.print(numerator3 +"/" +nww +" = " +(numerator3/nww) +" " +(numerator3%nww) +"/" +nww);
                    if (Nwd(numerator3, denominator)>1) {
                        System.out.print(numerator3/Nwd(numerator3, nww) +"/" +denominator/Nwd(numerator3, nww));
                }
            }
        
            System.out.println("\nCzy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}

    }
    
    public void subtract1Frac() {
        System.out.println("Odejmowanie ułamków o jednakowych mianownikach jest bardzo proste.\n"
                + "Wykonujemy je tak, jak dodawanie, czyli wystarczy odjąć liczniki, a mianownik przepisać.\n"
                + "Np. 4/5 - 1/5 = 3/5");
        System.out.println("Ważne: wynik działania powinien być nieskracalny i z wyłączonymi całościami!");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik pierwszego ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik pierwszego ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Podaj licznik drugiego ułamka: ");
            numerator2 = scanner.nextInt();
            System.out.println("Mianownik drugiego ułamka również musi być równy: " +denominator);
                        
            System.out.print(numerator +"/" +denominator +" - " +numerator2 +"/" +denominator +" = ");
            numerator3 = numerator - numerator2;
            
            if (numerator3<denominator) {
                System.out.print(numerator3 +"/" +denominator);
                if (Nwd(numerator3, denominator)>1) {
                    System.out.print(numerator3/Nwd(numerator3, denominator) +"/" +denominator/Nwd(numerator3, denominator));
                }
            }
            else {
                if (numerator2==nww)
                    System.out.print(numerator3 +"/" +denominator +" = 1");
                else {
                    System.out.print(numerator3 +"/" +denominator +" = " +(numerator3/denominator) +" " +(numerator3%denominator) 
                            +"/" +denominator);
                    if (Nwd(numerator3, denominator)>1) {
                        System.out.print(" = " +numerator3/denominator +(numerator3%denominator)/Nwd(numerator3, denominator) 
                                +"/" +denominator/Nwd(numerator3, denominator));
                }
                }   
            }
            
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}

    }
    
    public void subtract2Frac() {
        System.out.println("Aby można było odjąć ułamki zwykłe musi być spełniony jeden warunek - \n"
                + "ułamki te muszą mieć jednakowe mianowniki.\n"
                + "Zatem - aby odjąć ułamki najpierw trzeba je sprowadzić do wspólnego mianownika.\n"
                + "Potem już tylko odejmujemy liczniki, a mianownik przepisujemy.");
        System.out.println("Ważne: pamiętajmy o skróceniu i wyłączeniu całości (o ile się da) w wyniku");
        System.out.println("Np.  4/9 - 1/6 = 8/18 - 3/18 = 5/18");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik pierwszego ułamka: ");
            numerator = scanner.nextInt();  
            System.out.println("Podaj mianownik pierwszego ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Podaj licznik drugiego ułamka: ");
            numerator2 = scanner.nextInt();
            System.out.println("Podaj mianownik drugiego ułamka: ");
            denominator2 = scanner.nextInt();

            System.out.print(numerator +"/" +denominator +" - " +numerator2 +"/" +denominator2 +" = ");

            nww = (denominator*denominator2)/Nwd(denominator, denominator2);
            
            numerator*=nww/denominator;
            denominator=nww;
            numerator2*=nww/denominator2;
            denominator2=nww;

            System.out.print(numerator +"/" +denominator +" - " +numerator2 +"/" +denominator2 +" = ");

            numerator3 = numerator - numerator2;
            nwd = Nwd(numerator3, nww);
            
            System.out.print(numerator3 +"/" +nww);
            
            if (nwd>1) {
                numerator3/=nwd;
                nww/=nwd;
                System.out.print(" = " +numerator3 +"/" +nww);
            }
            if (numerator3==nww)
                System.out.print(" = 1");
            else {
                if (numerator3>nww)
                    System.out.print(" = " +(numerator3/nww) +" " +numerator3%nww +"/" +nww);
            }
                
            System.out.println("\nCzy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}

    }

    public void subtractFracSpecial() {
        System.out.println("Czasami musimy odjąć ułamek od liczby naturalnej lub odjąć liczby mieszane,\n"
                + "w których pierwszy ułamek jest mniejszy od drugiego.\n"
                + "Jak to zrobić?\n");
        System.out.println("Aby odjąć ułamek od 1 należy zamienić całość na \"odpowiedni\" ułamek i odjąć np.\n"
                + "1 - 3/5 = 5/5 - 3/5 = 2/5\n"
                + "Jak widać \"odpowiedni\" oznacza taki, który ma licznik i mianownik równy mianownikowi ułamka odejmowanego.\n");
        System.out.println("Jeżeli chcecmy odjąć ułamek od większej liczby naturalnej robimy dokładnie to samo,\n"
                + "tzn. zamieniamy 1 na ułamek, a resztę całości zostawiamy.\n"
                + "17 - 3/5 = 16 5/5 - 3/5 = 16 2/5\n");
        System.out.println("Ostatni przypadek jest najtrudniejszy.Weźmy:\n" 
                + "15 1/7 - 5 3/7 = ?\n"
                + "Jak widać problematyczne może być odjęcie od 1/7 ułamka 3/7 (od mniejszego większy).\n"
                + "W tej sytuacji najlepiej \"pożyczyć\" z całości 1 i zamienić ją na ułamek tak jak wcześniej, czyli:\n"
                + "15 1/7 = 14 + 1 + 1/7 = 14 + 7/7 + 1/7 = 14 8/7\n"
                + "A więc mamy:\n15 1/7 - 5 3/7 = 14 8/7 - 5 3/7 = 9 5/7");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Odejmowanie od całości - naciśij 1");
            System.out.println("Odejmowanie liczb mieszanych z pożyczaniem - naciśij 2");
            choice = scanner.next();
            
            if (choice.equals("1")) {
                System.out.println("Podaj liczbę naturalną:");
                n = scanner.nextInt();  
                System.out.println("Podaj licznik ułamka:");
                numerator = scanner.nextInt();
                System.out.println("Podaj mianownik ułamka:");
                denominator = scanner.nextInt();
                
                System.out.print(n +" - " +numerator +"/" +denominator +" = ");

                if (n==1) {
                    System.out.print(denominator +"/" +denominator +" - " +numerator +"/" +denominator +" = ");
                    System.out.print((denominator-numerator) +"/" +denominator +"\n");
                }
                else {
                    System.out.print((n-1) +denominator +"/" +denominator +" - " +numerator +"/" +denominator +" = ");
                    System.out.print((n-1)+(denominator-numerator) +"/" +denominator +"\n");
                }
            }
            else {
                if (choice.equals("2")) {
                    System.out.println("Podaj całości pierwszego ułamka:");
                    n = scanner.nextInt();  
                    System.out.println("Podaj licznik pierwszego ułamka:");
                    numerator = scanner.nextInt();
                    System.out.println("Podaj mianownik pierwszego ułamka:");
                    denominator = scanner.nextInt();
                    
                    System.out.println("Podaj całości drugigo ułamka:");
                    m = scanner.nextInt();  
                    System.out.println("Podaj licznik drugiego ułamka:");
                    numerator2 = scanner.nextInt();
                    System.out.println("Zakładamy, że mianownik drugiego ułamka jest równy " +denominator);
                    
                    System.out.println(n +" " +numerator +"/" +denominator +" - " +m +" " +numerator2 +"/" +denominator +" = ");
                    System.out.print((n-1) +" " +(denominator+numerator) +"/" +denominator +" - " +m +" " +numerator2 +"/" +denominator +" = ");
                    System.out.print((n-1-m) +" " +(denominator+numerator-numerator2) +"/" +denominator +"\n");
                
                }
                else 
                    System.out.println("Podałeś złe liczby.");
            }
        
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}

    }
    
    
    public void multiplyForNumber() {
        System.out.println("Rozważmy przykład:\n"
                + "3 * 2/7 = 2/7 + 2/7 + 2/7 = 6/7\n"
                + "Jak łatwo się domyślić, aby pomnożyć ułamek przez liczbę\n"
                + "wystarczy pomnożyć licznik przez tę liczbę, a mianownik przepisać:\n"
                + "3 * 2/7 = 3*2/7 = 6/7\n"
                + "Jeżli da się przy tym wykonać skracanie, to robimy to:\n"
                + "6 * 7/9 = 6*7/9 = 2*7/3 = 14/3 = 4 2/3\n"
                + "W tym przykładzie skrócono 6 i 9 (podzielono przez 3)");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Podaj liczbę, przez którą chcesz pomnożyć: ");
            n = scanner.nextInt();
            
            System.out.print(numerator +"/" +denominator +" * " +n +" = ");
            
            int nwd1 = Nwd(numerator, denominator);
            if (nwd1>1) {
                System.out.println("\n" +numerator +" i " +denominator +" dzielą się przez " +nwd1
                        + ", więc możemy je skrócić:\n" );
                numerator /= nwd1;
                denominator /= nwd1;
                System.out.print(numerator +"/" +denominator +" * " +n +" = ");
            }
            int nwd2 = Nwd(n, denominator);
            if (nwd2>1) {
                System.out.print("\n" +n +" i " +denominator +" dzielą się przez " +nwd2
                        + ", więc możemy je skrócić:\n" );
                n /= nwd2;
                denominator /= nwd2;
                System.out.print(numerator +"/" +denominator +" * " +n +" = ");
            }
            numerator *=n;
            System.out.print(" = " +numerator +"/" +denominator);
            
            if (numerator>denominator)
                System.out.print(" = " +numerator/denominator +" " +(numerator%denominator) +"/" +denominator);
            else {
                if (numerator==denominator)
                    System.out.print(" = 1");
            }
                
            
            System.out.println("\nCzy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}
    
    }

    public void multiplyFrac() {
        System.out.println("Mnożenie ułamków jest generalnie dużo łatwiejsze niż dodawanie.\n"
                + "Jedyną trudność może sprawić skracanie, które wykonuje się podczas tego działania.\n"
                + "Zobaczmy:\n"
                + "1/3 * 2/5 = (1*2)/(3*5) = 2/15\n"
                + "Jak widać wystarczy pomnożyć licznik razy licznik oraz mianownik razy mianownik.");
        System.out.println("Co jednak w przypadku:\n"
                + "2/7 * 7/9 = (2*7)/(7*9) = 14/63 = 2/9\n"
                + "Jak widać najpierw mnożymy przez 7, a za chwilę dzielimy przez siedem przy skracaniu.\n"
                + "W tej sytuacji lepiej skrócić w trakcie mnożenia:\n"
                + "2/7 * 7/9 = (2*7)/(7*9) = 2/9\n");
        System.out.println("Czasem można skracać wielokrotnie:\n"
                + "10/14 * 7/15 = (10*7)/(14*15) = (10*1)/(2*15) = (2*1)/(2*3) = 1/3\n"
                + "czyli skracaliśmy \"górę\" i \"dół\" przez 7, potem przez 5 i na końcu przez 2.\n");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik pierwszego ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik pierwszego ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Podaj licznik drugiego ułamka: ");
            numerator2 = scanner.nextInt();
            System.out.println("Podaj mianownik drugiego ułamka: ");
            denominator2 = scanner.nextInt();
            
            System.out.print(numerator +"/" +denominator +" * " +numerator2 +"/" +denominator2 +" =\n");
            
                int nwd11 = Nwd(numerator, denominator);
                if (nwd11!=1) {
                    System.out.println("Skracamy " +numerator +" i " +denominator +" przez " +nwd11);
                    numerator /= nwd11;
                    denominator /= nwd11;
                    System.out.println(numerator +"/" +denominator +" * " +numerator2 +"/" +denominator2 +" = ");
                }
                int nwd12 = Nwd(numerator, denominator2);
                if (nwd12!=1) {
                    System.out.println("Skracamy " +numerator +" i " +denominator2 +" przez " +nwd12);
                    numerator /= nwd12;
                    denominator2 /= nwd12;
                    System.out.println(numerator +"/" +denominator +" * " +numerator2 +"/" +denominator2 +" = ");
                }
                int nwd21 = Nwd(numerator2, denominator);
                if (nwd21!=1) {
                    System.out.println("Skracamy " +numerator2 +" i " +denominator +" przez " +nwd21);
                    numerator2 /= nwd21;
                    denominator /= nwd21;
                    System.out.println(numerator +"/" +denominator +" * " +numerator2 +"/" +denominator2 +" = ");
                }
                int nwd22 = Nwd(numerator2, denominator2);
                if (nwd22!=1) {
                    System.out.println("Skracamy " +numerator2 +" i " +denominator2 +" przez " +nwd22);
                    numerator2 /= nwd22;
                    denominator2 /= nwd22;
                    System.out.println(numerator +"/" +denominator +" * " +numerator2 +"/" +denominator2 +" = ");
                }
                System.out.print(" = " +(numerator*numerator2) +"/" +(denominator*denominator2));
            
                    
            System.out.println("\nCzy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}
    
    }
    
    public void inverseFrac() {
        System.out.println("Odwrotność ułamka to ułamek powstały poprzez zamianę miejscami(\"odwrócenie\")\n"
                + "licznika z mianownikiem.\n"
                + "Np. odwrotnością ułamka 3/5 jest ułamek 5/3.\n"
                + "Odwrotnością 13/7 jest 7/13.\n"
                + "Odwrotnością 5 jest 1/5 (ponieważ 5 = 5/1)\n"
                + "Odwrotnością 2 3/5 jest 5/13 (ponieważ 2 3/5 = 13/5.\n");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Odwrotnością ułamka " +numerator +"/" +denominator +" jest ułamek "
                    +denominator +"/" +numerator);
            
            System.out.println("Podaj liczbę: ");
            n = scanner.nextInt();
            System.out.println("Odwrotnością liczby " +n +" jest ułamek " +"1/" +n);
            
            System.out.println("Podaj całości: ");
            wholeNumber = scanner.nextInt();
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Odwrotnością ułamka " +wholeNumber +" " +numerator +"/" +denominator +" jest ułamek "
                    +denominator +"/"+(denominator*wholeNumber+numerator));
            
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}

    }
    
    public void divideFrac() {
        System.out.println("Dzielenie ułamków zwykłych to zdecydowanie najmniej intuicyjne z działań.\n"
                + "Można oczywiście rozpatrywać poszczególne przypadki powołując się na logikę:"
                + "Przykład 1.  6/7 : 2 to 3/7, bo z 6 części zabieramy połowę.\n"
                + "Przykład 2.  1 1/2 : 1/4 = 6 bo 1/4 mieści się 6 razy w 1 1/2 itp.\n"
                + "Jednak z przykładami 2/7 : 5/8  czy 1 2/5 : 13/17  już tak łatwo nie będzie.\n"
                + "Dlatego warto nauczyć się schematu:\n"
                + "Zamiast dzielenia ułamków wykonujemy mnożenie pierwszego ułamka przez odwrotność drugiego.\n"
                + "Np.  2/7 : 5/8 = 2/7 * 8/5 = 2*8/7*5 = 16/35");
                
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik pierwszego ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik pierwszego ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Podaj licznik drugiego ułamka: ");
            denominator2 = scanner.nextInt();
            System.out.println("Podaj mianownik drugiego ułamka: ");
            numerator2 = scanner.nextInt();
            
            System.out.print(numerator +"/" +denominator +" : " +denominator2 +"/" +numerator2 +" =\n");
            System.out.print(numerator +"/" +denominator +" * " +numerator2 +"/" +denominator2 +" =\n");
            
                int nwd11 = Nwd(numerator, denominator);
                if (nwd11!=1) {
                    System.out.println("Skracamy " +numerator +" i " +denominator +" przez " +nwd11);
                    numerator /= nwd11;
                    denominator /= nwd11;
                    System.out.println(numerator +"/" +denominator +" * " +numerator2 +"/" +denominator2 +" = ");
                }
                int nwd12 = Nwd(numerator, denominator2);
                if (nwd12!=1) {
                    System.out.println("Skracamy " +numerator +" i " +denominator2 +" przez " +nwd12);
                    numerator /= nwd12;
                    denominator2 /= nwd12;
                    System.out.println(numerator +"/" +denominator +" * " +numerator2 +"/" +denominator2 +" = ");
                }
                int nwd21 = Nwd(numerator2, denominator);
                if (nwd21!=1) {
                    System.out.println("Skracamy " +numerator2 +" i " +denominator +" przez " +nwd21);
                    numerator2 /= nwd21;
                    denominator /= nwd21;
                    System.out.println(numerator +"/" +denominator +" * " +numerator2 +"/" +denominator2 +" = ");
                }
                int nwd22 = Nwd(numerator2, denominator2);
                if (nwd22!=1) {
                    System.out.println("Skracamy " +numerator2 +" i " +denominator2 +" przez " +nwd22);
                    numerator2 /= nwd22;
                    denominator2 /= nwd22;
                    System.out.println(numerator +"/" +denominator +" * " +numerator2 +"/" +denominator2 +" = ");
                }
                System.out.print(" = " +(numerator*numerator2) +"/" +(denominator*denominator2));
            
            
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}

    }

    public void calculateFrac() {
        System.out.println("Aby obliczyć ułamek danej liczby wystarczy pomnożyć tę liczbę przez dany ułamek.\n"
                + "Np. oblicz  2/5 liczby  30.\n"
                + "Rozwiązanie:  2/5 *30 = 12");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            System.out.println("Podaj liczbę, przez którą chcesz pomnożyć ułamek: ");
            n = scanner.nextInt();
            System.out.println(numerator +"/" +denominator +"*" +n +" = " +(numerator*n/nww) +" " 
                    +(numerator*n%nww) +"/" +nww);
            
            System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}

    }

    public void changeToDecimal() {
        System.out.println("Ułamki zwykłe można zamienić na ułamki dziesiętne.\n"
                + "Najprościej zamienić ułamki o mianowniku 10, 100, 1000 itp. - wtedy zamieniamy od razu np.\n"
                + "3/10 = 0,3\n"
                + "2 7/10 = 2,7\n"
                + "13/100 = 0,13\n"
                + "7/100 = 0,07\n"
                + "4 6/100 = 4,06\n"
                + "148/1000 = 0,148\n"
                + "92/1000 = 0,092\n"
                + "5/1000 = 0,005\n"
                + "16 23/1000 = 16,023 itp.\n");
        System.out.println("Aby zamienić inne ułamki zwykłe na ułamek dziesiętny należy:\n"
                + "rozszerzyć ułamek do mianownika 10, 100, 1000... i zamienić np.\n"
                + "3/5 = 3*2/5*2 = 6/10 = 0,6\n"
                + "7 1/4 = 7 25/100 = 7,25 itp.\n");
        System.out.println("Jeżeli danego ułamka nie da się rozszerzyć do 10, 100, 1000...,\n"
                + "należy podzielić licznik przez mianownik i znaleźć rozwinięcie dziesiętne nieskończone\n"
                + "oraz wskazać okres ułamka\n"
                + "Uwaga: dzielenie licznika przez mianownik można wykorzystać także w sytuacji,\n"
                + "kiedy da się rozszerzyć ułamek do mianownika 10, 100, 1000...");
        
        //Excercise
        System.out.println("Czy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
        choice = scanner.next();
        
        while (choice.equals("t")) {
            System.out.println("Podaj licznik ułamka: ");
            numerator = scanner.nextInt();
            System.out.println("Podaj mianownik ułamka: ");
            denominator = scanner.nextInt();
            
            System.out.print(numerator +"/" +denominator +" = ");
            denominator2=0;
            for (i=10; i<1000000000; i*=10) {
                if (denominator==i) {
                    denominator2=i;
                    break;
                }
            }
            for (i=10; i<1000000000; i*=10) {
                if ((i%denominator==0)&&(denominator2==0)) {
                    numerator2 = numerator*(i/denominator); 
                    System.out.print(numerator2 +"/" +i +" = ");
                    break;
                }
            }
            System.out.print((float)numerator/denominator);
                
            
            System.out.println("\nCzy chcesz poćwiczyć? Wciśnij \"t\" lub \"n\"");
            choice = scanner.next();
        }    
        System.out.println("Czy chcesz kontynuować działanie programu? Wciśnij \"t\" lub \"n\"");        
        choice = scanner.next();
        if (choice.equals("t")) {        
            FractionsMain fm = new FractionsMain();        
        }
        else {}

    }

}