package trng.imcs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import trng.imcs.beans.SchedulerBo;

@Configuration
public class SchedulerConfig {
	
	@Bean(name ="scheduler")
	public SchedulerBo schedulerBo(){
		return new SchedulerBo();
		
	}

}
