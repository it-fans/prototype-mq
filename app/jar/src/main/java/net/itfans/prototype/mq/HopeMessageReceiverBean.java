package net.itfans.prototype.mq;


import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = {@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")})
public class HopeMessageReceiverBean implements MessageListener {
    
    public void onMessage(Message message) {
        try {
            String text = ((TextMessage)message).getText();
            System.out.println("Received Message:" + text);

            if ("xxx".equals(text)) {
                throw new RuntimeException("data error");
            }
            Thread.sleep(1000);
        } catch (JMSException | InterruptedException e) {
            throw new RuntimeException("Unexpected Exception");
        }

    }

}

