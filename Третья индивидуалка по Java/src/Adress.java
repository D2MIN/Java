import java.util.Comparator;
import java.util.Objects;

public class Adress implements Comparator<Adress> {
    int number;
    String country;
    String city;
    String street;
    String describe;

    public Adress(int number, String country, String city, String street, String describe) {
        this.number = number;
        this.country = country;
        this.city = city;
        this.street = street;
        this.describe = describe;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void toPrint() {
        System.out.println( "Adress{" +
                "number= " + number +
                ", country= '" + country + '\'' +
                ", city= '" + city + '\'' +
                ", street= '" + street + '\'' +
                ", describe= '" + describe + '\'' +
                '}');
    }

    public int compare (Adress a1, Adress a2){
        return a1.getNumber() - a2.getNumber();
    }

    public static Comparator<Adress> sortByCity = new Comparator<Adress>() {
        @Override
        public int compare(Adress o1, Adress o2) {
            return o1.getCity().compareTo(o2.getCity());
        }
    };
}
