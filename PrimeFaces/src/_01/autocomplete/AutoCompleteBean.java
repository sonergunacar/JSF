package _01.autocomplete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="auto")
@RequestScoped
public class AutoCompleteBean {

	private static final String languages = "Java,JavaEE,C,C++,C#,Go,Ruby,Python";
	private static final String[] languageList = languages.split(",");

	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<String> autoComplete(String startLanguageWith) {
		List<String> foundLanguages = new ArrayList<>();
		for (String possibleLanguage : languageList) {
			if (possibleLanguage.toUpperCase().startsWith(startLanguageWith.toUpperCase())) {
				foundLanguages.add(possibleLanguage);
			}
		}
		return foundLanguages;
	}
}
