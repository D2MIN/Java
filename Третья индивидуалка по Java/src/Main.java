import java.util.*;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputS = new Scanner(System.in);

        System.out.println("Koll adresses");
        int coll = input.nextInt();

        ArrayList<Adress> alAdress = new ArrayList<>();
        for (int i = 0; i != coll; i++) {
            System.out.println("Введите ваши данные: " +
                    "Номер || Страну || Город || Улицу || Описание");
            Adress adress = new Adress(
                    input.nextInt(),
                    inputS.nextLine(),
                    inputS.nextLine(),
                    inputS.nextLine(),
                    inputS.nextLine()
            );
            alAdress.add(adress);
        }

        alAdress.sort(alAdress.get(0));
        for (Adress adres : alAdress) {
            adres.toPrint();
        }

        alAdress.sort(Adress.sortByCity);
        for (Adress adres : alAdress) {
            adres.toPrint();
        }
        
        alAdress.get(0).setCity("Петербург");
        alAdress.get(0).setDescribe("");

        for (Adress adres : alAdress){
            adres.toPrint();
        }
    }
}
