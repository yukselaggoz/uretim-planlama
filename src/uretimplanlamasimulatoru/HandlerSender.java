/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uretimplanlamasimulatoru;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yukselaggoz
 */
public class HandlerSender extends Thread{
    
    private Socket client;
    private PrintWriter output;
    private ArrayBlockingQueue<String> myMessages;

    public HandlerSender(Socket client, ArrayBlockingQueue<String> myMessages) {
        this.client = client;
        this.myMessages = myMessages;
        try
        {
            output = new PrintWriter(client.getOutputStream(),true);
        }
        catch(IOException ioEx)
        {
        }
    }

    @Override
    public void run() {
        String message;
       
        
        try {
            do{
                message =  myMessages.take();
                output.println(message);
            } while(message !=  "QUIT");
        } catch (InterruptedException ex) {
            Logger.getLogger(HandlerSender.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            if (client!=null) {
                System.out.println("Closing down connection...");
                client.close();
            }
        } catch(IOException ioEx) {
            System.out.println("Unable to disconnect!");
        }
    }
}
