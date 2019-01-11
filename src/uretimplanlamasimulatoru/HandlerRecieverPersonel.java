/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uretimplanlamasimulatoru;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yukselaggoz
 */
public class HandlerRecieverPersonel extends Thread{
    private Socket client;
    private Scanner input;
    private ArrayBlockingQueue<String> myMessages;
    private FrameBehaviorPersonel myFrame;
    private ClientPersonel me;

    public HandlerRecieverPersonel(Socket client, ArrayBlockingQueue<String> myMessages, FrameBehaviorPersonel myFrame, ClientPersonel me) {
        this.client = client;
        this.myMessages = myMessages;
        this.myFrame = myFrame;
        this.me = me;
        try {
            input = new Scanner(client.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(HandlerRecieverPersonel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        String received;
        do
        {
            received = input.nextLine();     
           if(received != null && received != ""){
            myFrame.makeAction(received, me);
           }
           received = "";

        }while (!received.equals("QUIT"));

        try
        {
            if (client!=null)
            {
                System.out.println("Closing down connection...");
                client.close();
            }
        }
        catch(IOException ioEx)
        {
                System.out.println("Unable to disconnect!");
        }
    }
    
}
