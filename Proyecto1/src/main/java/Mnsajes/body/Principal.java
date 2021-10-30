package Mnsajes.body;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Mnsajes.body.Interface;

public class Principal {
    public static String idPlatformOrigin;
    public static String idCoin;
    public static String idPlatformDestiny;
    public static String idProduct;
    public static String Mount;
    public static String Quantity;
    private JFrame frameprincipal;
    private ImageIcon x;
    private JLabel mylabel1;
    private JButton canjear1;

    public Principal(){

        x = new ImageIcon(this.getClass().getResource("/pokemon.jpeg"));
        mylabel1=new JLabel(x);
        mylabel1.setBounds(0,0,450,1180);

        canjear1=new JButton("Pokepuntos");
        canjear1.setBounds(300,30,150,100);
        canjear1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    new Interface();
            }
        });

        frameprincipal=new JFrame("Pokepuntos");
        frameprincipal.add(mylabel1);
        frameprincipal.add(canjear1);
        frameprincipal.setSize(450, 650);
        frameprincipal.setLayout(null);
        frameprincipal.setDefaultCloseOperation(frameprincipal.EXIT_ON_CLOSE);

        frameprincipal.setVisible(true);
    }

    public static void main(String[] args){
        new Principal();
    }

}