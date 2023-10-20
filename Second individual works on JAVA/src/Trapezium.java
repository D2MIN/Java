public class Trapezium implements Figure{
    double a,b,c,d,h;

    public Trapezium(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }
    
    public double P(){
        return a+b+c+d;
    }
    public double S(){
        return h*(a+b)/2;
    }
    public void name(){
        System.out.println("Трапеция");
    }
}
