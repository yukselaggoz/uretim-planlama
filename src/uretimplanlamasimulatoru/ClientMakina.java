/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uretimplanlamasimulatoru;

import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author yukselaggoz
 */
public class ClientMakina {
    public String makinaAdi;
    public String makinaTuru;
    public int makinaID;
    public  ArrayBlockingQueue<String> myInputMessages;
    public  ArrayBlockingQueue<String> myOutputMessages;
    private Socket clientMakina;
    private FrameBehaviorMakina myFrame;
    private HandlerRecieverMakina handleInput;
    private HandlerSender handleOutput;

    public ClientMakina(Socket clientMakina, FrameBehaviorMakina myFrame) {
        this.clientMakina = clientMakina;
        this.myFrame = myFrame;
        myInputMessages = new ArrayBlockingQueue(100);
        myOutputMessages = new ArrayBlockingQueue(100);
        if(clientMakina != null){
            handleInput = new HandlerRecieverMakina(clientMakina, myInputMessages, myFrame, this);
            handleOutput = new HandlerSender(clientMakina, myOutputMessages);
            handleInput.start();
            handleOutput.start();
        }
    }
    
}
