package kg.huseyinkadioglu.springjms;

import org.apache.activemq.artemis.core.config.impl.ConfigurationImpl;
import org.apache.activemq.artemis.core.server.ActiveMQServer;
import org.apache.activemq.artemis.core.server.ActiveMQServers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJmsApplication {

    public static void main(String[] args) throws Exception {

        ActiveMQServer mqServer = ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
                .setPersistenceEnabled(false)
                .setJournalDirectory("target/data/journal")
                .setSecurityEnabled(false)
                .addAcceptorConfiguration("invm", "vm://0"));

        mqServer.start();

        /*
        we set up a minimal ActiveMQ Server.

        Most of the time this is gonna be seperate spring boot application but thats ok for now.
         */

        SpringApplication.run(SpringJmsApplication.class, args);
    }

}
