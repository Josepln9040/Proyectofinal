package Mnsajes.queue;
import Mnsajes.body.Principal;

public class ProducerThread extends Thread {
    @Override
    public void run() {

        while (true) {
            String nombreCola = "gatocola";
            String nombreServicio = "EjemploCola";
            String serverLocation = "failover:(tcp://172.17.0.2:61616)?timeout=3000";

            String message = " {"
                    + " \"idPlatFormOrigin\":" + Principal.idPlatformOrigin + ","
                    + " \"idCoin\":\"" + Principal.idCoin + "\","
                    + " \"idPlatformDestiny\":" + Principal.idPlatformDestiny + "\","
                    + " \"idProduct\":" + Principal.idProduct + "\","
                    + " \"Mount\":" + Principal.Mount + "\","
                    + " \"Quantity\":" + Principal.Quantity
                    + "}";
            try {
                QueueUtil.send(nombreCola, true, true, 0, nombreServicio, message, serverLocation);

                System.out.println("Enviando mensaje....");
                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println("Error....");
                e.printStackTrace();
            }
        }
    }
}