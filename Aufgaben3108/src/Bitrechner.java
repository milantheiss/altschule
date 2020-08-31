import java.util.Scanner;

public class Bitrechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zahl0, zahl1, zahl2, zahl3, zahl4, zahl5, zahl7;
        double dezimal=0;
        int zähler=7;
        int[] binary = new int[8]; //Nur möglich für 8 Stellen lange Binärezahl --> Startet bei 8. Stelle
        for (int i = 0; i < 8; i++){
            do {
                binary[i] = sc.nextInt();
            }while (binary[i] != 0 && binary[i] != 1); //Testet ob Eingabe richtig
            if(binary[i] == 1)
                dezimal = dezimal + Math.pow(2, zähler); //gibt Zahl einen Wert

            zähler--;
            //System.out.println(binary[i] + "  "+ dezimal+ "  " + zähler);
        }
        System.out.println((int)dezimal);

    }
}
