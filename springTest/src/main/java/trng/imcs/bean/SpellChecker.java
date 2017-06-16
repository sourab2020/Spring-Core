package trng.imcs.bean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class SpellChecker implements ISpellChecker {

	public boolean checkSpelling(String text) {
		return text.equalsIgnoreCase("hi") || text.equalsIgnoreCase("hello");
	}

}
