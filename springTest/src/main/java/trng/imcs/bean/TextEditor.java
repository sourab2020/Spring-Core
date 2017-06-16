package trng.imcs.bean;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {

//	@Autowired
	@Resource
//	@Qualifier("advancedSpellChecker")
	private List<ISpellChecker> spellCheckers;
	private String text;
	
/*	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("TextEditor::constructor called");
		this.spellChecker = spellChecker;
	}*/
	
	
	public boolean checkSpelling() {
		return getSpellChecker().checkSpelling(text);
	}

	private ISpellChecker getSpellChecker() {
		int index = text.equals("Hi") ? 0 : 1;
		return spellCheckers.get(index);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@PostConstruct
	public void postConstructOperation() {
		//post construct logic
		System.out.println("TextEditor::postConstructOperation called" + spellCheckers);
	}
	
	@PreDestroy
	public void preDestroyOperation() {
		//post construct logic
		System.out.println("TextEditor::preDestroyOperation called");
	}
	
	
/*	@Autowired
	public void setSpellChecker(ISpellChecker spellChecker) {
		System.out.println("setSpellChecker called");
		this.spellChecker = spellChecker;
	}*/
	
	
}
