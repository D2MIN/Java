import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program is working");
        
        System.out.println("Введите количество фигур");
        int n = input.nextInt();
        Figure []figure = new Figure[n];
        
        int vers;
        for (int i = 0; i < figure.length; i++) {
            System.out.println("Какую фигуру создать");
            System.out.println("Четырёхугольник - 1");
            System.out.println("Круг - 2");
            System.out.println("Трапецию - 3");
            vers = input.nextInt();
            if(vers == 1){
                System.out.println("Введите стороны a,b,c,d");
                double a = input.nextDouble();
                double b = input.nextDouble();
                double c = input.nextDouble();
                double d = input.nextDouble();
                Rectangle rec = new Rectangle(a, b, c, d);
                figure[i] = rec;
            }
            if(vers == 2){
                System.out.println("Введите радиус R");
                double r = input.nextDouble();
                Circle circle = new Circle(r);
                figure[i] = circle;
            }
            if(vers == 3){
                System.out.println("Введите стороны a,b,c,d и высоту h");
                double a = input.nextDouble();
                double b = input.nextDouble();
                double c = input.nextDouble();
                double d = input.nextDouble();
                double h = input.nextDouble();
                Trapezium trap = new Trapezium(a, b, c, d, h);
                figure[i] = trap;
            }
        }

        for (int i = 0; i < figure.length; i++) {
            System.out.println();
            figure[i].name();
            System.out.println("P= " + figure[i].P() + "\n" + " S= " + figure[i].S());
        }

    }
}