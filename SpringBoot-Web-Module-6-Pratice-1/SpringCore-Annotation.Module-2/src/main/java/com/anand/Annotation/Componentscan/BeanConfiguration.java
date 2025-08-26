package com.anand.Annotation.Componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.anand.Annotation.Componentscan")  /*componentscan is the annotation which is used to scan
the subpackage for the class which is mark as the @Component @Repository @Service class mean this class
register as the bean class its bean (object) will be created by Spring Container*/
/*we can create the bean in 2 ways ->
1. way is using @Bean method, 2. way is using @component Annotation at class level*/
public class BeanConfiguration {


}
