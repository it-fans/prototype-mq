package net.itfans.prototype.mq;


import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(activationConfig = {@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")})
public class HopeMessageReceiverBean implements MessageListener {
    
    public void onMessage(Message message) {
        System.out.println("Received Message:" + message.toString());
    }

}

