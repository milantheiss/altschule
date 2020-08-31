/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 31.08.2020
 * @author 
 */
import java.util.*;

public class Rechteck {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(flaeche(a, b));
  } // end of main
  
  static int umfang(int ua, int ub){
    int u = ua*2 + ub*2;
    return u;
  }
  
  static double diagonale(int da, int db){
    double x = (double) da;
    double y = (double) db;
    double ergebnis = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    return ergebnis;
  }
  
  static int flaeche(int aa, int bb){
    int flaeche = aa*bb;
    return flaeche;
  }
} // end of class Rechteck

