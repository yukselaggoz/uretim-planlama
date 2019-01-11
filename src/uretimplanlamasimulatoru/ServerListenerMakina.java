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
public class ServerListenerMakina extends Thread{
    private int portNumber;
    private int clientMakinaCount;
    private FrameBehaviorMakina myFrm;
    private ServerSocket serverSocket;

    public ServerListenerMakina(String portNumber, FrameBehaviorMakina myFrm) {
        this.portNumber = Integer.parseInt( portNumber);
        this.myFrm = myFrm;
        serverSocket = null;
        clientMakinaCount = 1;
        ClientMakina g1 = new ClientMakina(null, myFrm);
        InfoMakinalar.clientmakinalar = new ArrayList<ClientMakina>();
        InfoMakinalar.clientmakinalar.add(g1);
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
                ClientMakina newMakina = new ClientMakina(client, myFrm);
                InfoMakinalar.clientmakinalar.add(newMakina);
                clientMakinaCount++;
            } catch (IOException ex) {
                Logger.getLogger(ServerListenerMakina.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }while(clientMakinaCount <= 5);
    }
    
}
