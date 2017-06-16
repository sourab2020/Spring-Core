package trng.imcs.bean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class AdvancedSpellChecker implements ISpellChecker {

	public boolean checkSpelling(String text) {
		return "How are you?".contains(text);
	}

}
