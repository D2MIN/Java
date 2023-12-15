import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    AddressList addressList = new AddressList();
    JLabel l1,l2,l3,l4,l5;
    JTextField f1,f2,f3,f4,f5,f6;
    JTextArea a1;
    JButton b1,b2,b3,b4;

    Panel(){
        l1 = new JLabel("Номер"); l2 = new JLabel("Страна");
        l3 = new JLabel("Город"); l4 = new JLabel("Улица");
        l5 = new JLabel("Описание");

        l1.setForeground(Color.white); l2.setForeground(Color.white);
        l3.setForeground(Color.white); l4.setForeground(Color.white);
        l5.setForeground(Color.white);

        f1 = new JTextField(13); f2 = new JTextField(13);
        f3 = new JTextField(13); f4 = new JTextField(13);
        f5 = new JTextField(20);

        a1 = new JTextArea();

        add(l1); add(f1); add(l2); add(f2); add(l3);
        add(f3); add(l4); add(f4); add(l5); add(f5);

        b1 = new JButton("Добавить");
        add(b1);
        b1.setBackground(Color.GREEN);
        MyListener listener = new MyListener();
        b1.addActionListener(listener);

        b2 = new JButton("Удалить номер");
        add(b2);
        DeleteListener deleteListener = new DeleteListener();
        b2.addActionListener(deleteListener);
        f6 = new JTextField(10);
        add(f6);
        b2.setBackground(Color.RED);

        b3 = new JButton("Отсортировать по номеру");
        add(b3);
        SortByNumber numSort = new SortByNumber();
        b3.addActionListener(numSort);

        b4 = new JButton("Отсортировать по городу");
        add(b4);
        SortByCity citySort = new SortByCity();
        b4.addActionListener(citySort);


        add(a1);
        a1.setColumns(38);
        a1.setRows(0);
        a1.setForeground(Color.WHITE);
        a1.setBackground(Color.BLACK);
        Font f = new Font("Calibri",Font.BOLD,20);
        a1.setFont(f);
        }

        class SortByNumber implements ActionListener{
            public void actionPerformed(ActionEvent e){
                addressList.sortByNum();
                a1.setText(addressList.getAddressList());
            }
        }
        class SortByCity implements ActionListener{
            public void actionPerformed(ActionEvent e){
                addressList.sortByCity();
                a1.setText(addressList.getAddressList());
            }
        }
        class DeleteListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(f6.getText());
                addressList.deleteAddressForNumber(number);
                a1.setText(addressList.getAddressList());
            }
        }
        class MyListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                int s1 = Integer.parseInt(f1.getText());
                String s2 = f2.getText();
                String s3 = f3.getText();
                String s4 = f4.getText();
                String s5 = f5.getText();
                Adress adress = new Adress(s1,s2,s3,s4,s5);
                addressList.addAddress(adress);
                a1.setText(addressList.getAddressList());
            }
        }
}
