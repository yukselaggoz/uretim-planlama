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
public class ClientPersonel {
    public String kullaniciAdi;
    public String sifre;
    public  ArrayBlockingQueue<String> myInputMessages;
    public  ArrayBlockingQueue<String> myOutputMessages;
    private Socket clientPersonel;
    private FrameBehaviorPersonel myFrame;
    private HandlerRecieverPersonel handleInput;
    private HandlerSender handleOutput;

    public ClientPersonel(Socket clientPersonel, FrameBehaviorPersonel myFrame) {
        this.clientPersonel = clientPersonel;
        this.myFrame = myFrame;
        myInputMessages = new ArrayBlockingQueue(100);
        myOutputMessages = new ArrayBlockingQueue(100);
        if(clientPersonel != null){
            handleInput = new HandlerRecieverPersonel(clientPersonel, myInputMessages, myFrame, this);
            handleOutput = new HandlerSender(clientPersonel, myOutputMessages);
            handleInput.start();
            handleOutput.start();
        }
    }
    
}
