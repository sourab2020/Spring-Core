package trng.imcs.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import trng.imcs.beans.CustomerBo;
import trng.imcs.beans.SchedulerBo;
import trng.imcs.config.AppConfig;

public class App {
		public static void main(String[] args) {

			ApplicationContext context = new AnnotationConfigApplicationContext(
					AppConfig.class);

			CustomerBo customer = (CustomerBo) context.getBean(CustomerBo.class);
			customer.printMsg("Hello Customer");

			SchedulerBo scheduler = (SchedulerBo) context.getBean(SchedulerBo.class);
			scheduler.printMsg("Hello Scheduler");

		}
	}

