//Прямоугольник
public class Rectangle implements Figure{
    double a,b,c,d;

    public Rectangle(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public double P(){
        if(a != b){
            return (a+b)*2;
        }else{
            return (a+c)*2;
        }
    }
    public double S(){
        if(a != b){
            return (a*b);
        }else{
            return (a*c);
        }
    }

    public void name(){
        System.out.println("Прямоугольник");
    }
}
