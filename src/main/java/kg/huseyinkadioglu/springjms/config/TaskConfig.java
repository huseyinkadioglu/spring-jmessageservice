package kg.huseyinkadioglu.springjms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Hüseyin Kadıoğlu on 22.07.2020
 */
@EnableScheduling
@EnableAsync
@Configuration
public class TaskConfig {

    /*
        enable the task schedular.
        this two implementation mean , go ahead and perform tasks out of a task pool so which is exactly what we want to do.
     */

    @Bean
    TaskExecutor taskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
}
