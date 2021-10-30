package Mnsajes.body;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Mnsajes.queue.ProducerThread;


public class Interface {
    public static String idPlatformOrigin;
    public static String idCoin;
    public static String idPlatformDestiny;
    public static String idProduct;
    public static String Mount;
    public static String Quantity;
    private JFrame framepokepuntos;
    private ImageIcon x, y;
    private JLabel mylabel1, mylabel2,mylabel3;
    private JButton canjear1,canjear2;
    private JButton consultar;

    public Interface(){

        x = new ImageIcon(this.getClass().getResource("/burguer.jpg"));
        mylabel1=new JLabel(x);
        mylabel1.setBounds(5,15,180,180);

        y = new ImageIcon(this.getClass().getResource("/mcflurry.jpg"));
        mylabel2=new JLabel(y);
        mylabel2.setBounds(200,15,180,180);

        canjear1=new JButton("Canjear");
        canjear1.setBounds(40,200,100,50);
        canjear1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ProducerThread hilo1 = new ProducerThread();
                ProducerThread hilo2 = new ProducerThread();
                ProducerThread hilo3 = new ProducerThread();
                ProducerThread hilo4 = new ProducerThread();
                ProducerThread hilo5 = new ProducerThread();

                hilo1.start();
                hilo2.start();
                hilo3.start();
                hilo4.start();
                hilo5.start();
                    idPlatformOrigin="1";
                    idCoin="2";
                    idPlatformDestiny="1";
                    idProduct="1";
                    Mount="450";
                    Quantity="1";
            }
        });

        canjear2=new JButton("Canjear");
        canjear2.setBounds(250,200,100,50);
        canjear2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ProducerThread hilo1 = new ProducerThread();
                ProducerThread hilo2 = new ProducerThread();
                ProducerThread hilo3 = new ProducerThread();
                ProducerThread hilo4 = new ProducerThread();
                ProducerThread hilo5 = new ProducerThread();

                hilo1.start();
                hilo2.start();
                hilo3.start();
                hilo4.start();
                hilo5.start();
                idPlatformOrigin="1";
                idCoin="2";
                idPlatformDestiny="1";
                idProduct="2";
                Mount="250";
                Quantity="1";
            }
        });

        mylabel3=new JLabel("aca van los puntos");
        mylabel3.setBounds(142,400,180,180);

        consultar=new JButton("Mis pokepuntos");
        consultar.setBounds(135,500,150,50);
        consultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        framepokepuntos =new JFrame("Pokepuntos");
        framepokepuntos.add(mylabel1);
        framepokepuntos.add(mylabel2);
        framepokepuntos.add(mylabel3);
        framepokepuntos.add(canjear1);
        framepokepuntos.add(canjear2);
        framepokepuntos.add(consultar);
        framepokepuntos.setSize(450, 650);
        framepokepuntos.setLayout(null);
        framepokepuntos.setDefaultCloseOperation(framepokepuntos.EXIT_ON_CLOSE);

        framepokepuntos.setVisible(true);
    }

    public static void main(String[] args){
        new Interface();
    }

}