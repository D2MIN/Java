import java.util.ArrayList;
import java.util.Comparator;

public class AddressList {
    ArrayList<Adress> addressList;

    AddressList(){
        addressList = new ArrayList<>();
    }

    public void addAddress(Adress address){
        addressList.add(address);
    }

    public void sortByNum(){
        addressList.sort(addressList.get(0));
    }
    public void sortByCity(){
        addressList.sort(Adress.sortByCity);
    }

    public String getAddressList(){
        String str = "";
        for (int i = 0; i < addressList.size(); i++) {
            str += addressList.get(i).getAddress();
            str += "\n";
        }
        return str;
    }

    public void deleteAddressForNumber(int number){
        for (int i = 0; i < addressList.size(); i++) {
            if(addressList.get(i).getNumber() == number){
                addressList.remove(i);
                i--;
            }
        }
    }
}
