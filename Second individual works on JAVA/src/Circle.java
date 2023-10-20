public class Circle implements Figure{
    double r;
    Circle(double r){
        this.r = r;
    }

    public double P(){
        return 2*r*Math.PI;
    }

    public double S(){
        return r * Math.PI * Math.PI;
    }
    public void name(){
        System.out.println("Круг");
    }
}
