package _10.onebuttononeradio;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class OneButtonOneRadioBean {
	String oneButton;
	String oneRadio;
	public List<String> teams;

	public String getOneButton() {
		return oneButton;
	}

	public void setOneButton(String oneButton) {
		this.oneButton = oneButton;
	}

	public String getOneRadio() {
		return oneRadio;
	}

	public void setOneRadio(String oneRadio) {
		this.oneRadio = oneRadio;
	}

	public List<String> getTeams() {
		return teams;
	}

	public void setTeams(List<String> teams) {
		this.teams = teams;
	}

	@PostConstruct
	public void list() {
		teams = new ArrayList<String>();
		teams.add("Barcelona");
		teams.add("Real Madrid");
		teams.add("Juventus");
	}

}
