package _08.manymenumanycheckbox;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ManyMenuManyCheckBoxBean {
	private List<String> programmingLangs;
	private List<String> knownProgrammingLangs;
	private List<String> technologies;
	private List<String> knownTechnologies;

	@PostConstruct
	public void init() {
		programmingLangs = new ArrayList<String>();
		programmingLangs.add("Java");
		programmingLangs.add("C#");
		programmingLangs.add("Python");

		technologies = new ArrayList<String>();
		technologies.add("Java ME");
		technologies.add("Java Embedded");
		technologies.add("JSP&JSF");
		technologies.add("Hibernate&JPA");
	}

	public List<String> getKnownProgrammingLangs() {
		return knownProgrammingLangs;
	}

	public void setKnownProgrammingLangs(List<String> knownProgrammingLangs) {
		this.knownProgrammingLangs = knownProgrammingLangs;
	}

	public List<String> getKnownTechnologies() {
		return knownTechnologies;
	}

	public void setKnownTechnologies(List<String> knownTechnologies) {
		this.knownTechnologies = knownTechnologies;
	}

	public List<String> getProgrammingLangs() {
		return programmingLangs;
	}

	public List<String> getTechnologies() {
		return technologies;
	}

}
