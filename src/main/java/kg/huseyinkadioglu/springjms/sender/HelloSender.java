package kg.huseyinkadioglu.springjms.sender;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Hüseyin Kadıoğlu on 22.07.2020
 */
@Component
public class HelloSender {

    @Scheduled(fixedRate = 2000)
    public void sendMessage() {
        System.out.println("I'm sending a message");
    }
}
