package kapitel3Java4U;

public class Rechteck {
    public double seiteA;
    public double seiteB;

    public void setSeiteA(double seiteA) {
        if(seiteA > 0){
            this.seiteA = seiteA;
        }
        else {
            this.seiteA = 0;
        }
    }

    public void setSeiteA(String seiteA){
        this.setSeiteA(Double.parseDouble(seiteA));
    }

    public void setSeiteB(double seiteB) {
        if(seiteB > 0){
            this.seiteB = seiteB;
        }
        else {
            this.seiteB = 0;
        }
    }

    public void setSeiteB(String seiteB){
        this.setSeiteB(Double.parseDouble(seiteB));
    }

    public void setSeiteAB(double seiteA, double seiteB){
        this.setSeiteA(seiteA);
        this.setSeiteB(seiteB);
    }

    public void showFlaeche(){
        System.out.println("Die Fläche beträgt: "+((this.setSeiteA/100)*(this.setSeiteB/100))+" m*m");
    }
}
