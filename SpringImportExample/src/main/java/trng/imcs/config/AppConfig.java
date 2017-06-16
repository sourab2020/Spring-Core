package trng.imcs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import trng.imcs.beans.CustomerBo;
import trng.imcs.beans.SchedulerBo;

@Configuration
@Import({CustomerBo.class,SchedulerBo.class})
public class AppConfig {

}
