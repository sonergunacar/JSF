package _04.selectcheckboxmenu;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CheckBoxMenuBean {

	private String[]choosedLanguages;
	private List<String> languages;
	
	@PostConstruct
	public void init(){
		languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C");
		languages.add("C++");
		languages.add("Ruby");
		languages.add("C#");
		languages.add("Fortran");
		languages.add("Lisp");
		languages.add("Visual Basic");
	}

	public List<String> getLanguages() {
		return languages;
	}

	public String[] getChoosedLanguages() {
		return choosedLanguages;
	}

	public void setChoosedLanguages(String[] choosedLanguages) {
		this.choosedLanguages = choosedLanguages;
	}
}
