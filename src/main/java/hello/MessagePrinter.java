package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    final private MessageService service;
    final private abc abc;

    @Autowired
    public MessagePrinter(MessageService service, abc abc) {
        this.service = service;
        this.abc = abc;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}