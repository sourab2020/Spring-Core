package trng.imcs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import trng.imcs.beans.CustomerBo;

@Configuration
public class CustomerConfig {
	@Bean(name="customer")
	public CustomerBo customerBo(){
		return new CustomerBo();
	
}

}
