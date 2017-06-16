package trng.imcs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import trng.imcs.bean.Employee;


@Configuration
@ComponentScan(basePackages = {"trng.imcs.bean"} 
//, excludeFilters={@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, value=Foo.class)}
)
public class SpringConfig {

	@Bean
	public Employee createEmployee() {
		return new Employee();
	}
}
