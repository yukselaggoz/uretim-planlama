/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uretimplanlamasimulatoru;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yukselaggoz
 */
public class ServerListenerPersonel extends Thread{
    private int portNumber;
    private int clientPersonelCount;
    private FrameBehaviorPersonel myFrm;
    private ServerSocket serverSocket;

    public ServerListenerPersonel(String portNumber, FrameBehaviorPersonel myFrm) {
        this.portNumber = Integer.parseInt(portNumber);
        this.myFrm = myFrm;
        serverSocket = null;
        clientPersonelCount = 1;
        ClientPersonel g1 = new ClientPersonel(null, myFrm);
        InfoPersoneller.clientpersoneller = new ArrayList<ClientPersonel>();
        InfoPersoneller.clientpersoneller.add(g1);
    }

    @Override
    public void run() {
        try
        {
            serverSocket = new ServerSocket(portNumber);
        }
        catch (IOException ioEx)
        {
                System.exit(1);
        }
        
        do
        {
            try {
                Socket client = serverSocket.accept();
                ClientPersonel newPersonel = new ClientPersonel(client, myFrm);
                InfoPersoneller.clientpersoneller.add(newPersonel);
                clientPersonelCount++;
            } catch (IOException ex) {
                Logger.getLogger(ServerListenerPersonel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }while(clientPersonelCount <= 5);
    }
    
}
