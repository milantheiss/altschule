package kapitel3Java4U;

public class Haupt {
    public static void main(String args[]){
        Rechteck r1;
        r1 = new Rechteck();
        r1.setSeiteA(4.0);
        r1.setSeiteB(-4.2);
        System.out.println("Objekt r1(Seite A): "+r1.seiteA);
        System.out.println("Objekt r1(Seite B): "+r1.seiteB);
        r1.showFlaeche();
        System.out.println("Programmende");

    }
}
