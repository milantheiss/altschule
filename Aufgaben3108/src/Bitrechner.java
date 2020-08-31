import java.util.Scanner;

public class Bitrechner {
    public static void main(String[] args) {
        double dezimal=0;
        int zähler=7;
        int[] binary = new int[8]; //Nur möglich für 8 Stellen lange Binärezahl --> Startet höhster (8.) Stelle
        boolean wrongInput = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Gebe deine Binär Zahl in einzelnen Stellen an: ");

        for (int i = 0; i < 8; i++){
            do {
                binary[i] = sc.nextInt();
                wrongInput = false;
                if (binary[i] != 0 && binary[i] != 1){ //Testet ob Eingabe richtig
                    System.out.println("Das binäre Zahlensystem besteht nur aus 0 und 1 wiederhole die Eingabe.");
                    wrongInput = true;
                }
            }while(wrongInput); //Wiederholt Eingabe wenn >wrongInput< true
            if(binary[i] == 1){dezimal = dezimal + Math.pow(2, zähler);} //gibt Zahl einen Wert
            zähler--;
        }
        System.out.println((int)dezimal);

    }
}
