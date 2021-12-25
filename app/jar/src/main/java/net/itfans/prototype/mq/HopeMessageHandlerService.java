package net.itfans.prototype.mq;

public class HopeMessageHandlerService {

    public void handleMessage(String message) {
        System.out.println(message);
        if ("invalid".equals(message))
            throw new RuntimeException("invalid data");
    }
}
