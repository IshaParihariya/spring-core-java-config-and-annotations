package main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//Go to service1 package and find all classes with @Component
@ComponentScan("service1")
public class AppConfig
{

}
