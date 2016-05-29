package _07.listboxmanybutton;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ListBoxManyButtonBean {

	private List<String> mobileos;
	private String supportmobileos;
	private String socialmedia;
	private List<String> manyButtons;

	public List<String> getMobileos() {
		return mobileos;
	}

	public void setMobileos(List<String> mobileos) {
		this.mobileos = mobileos;
	}

	public String getSupportmobileos() {
		return supportmobileos;
	}

	public void setSupportmobileos(String supportmobileos) {
		this.supportmobileos = supportmobileos;
	}

	public String getSocialmedia() {
		return socialmedia;
	}

	public void setSocialmedia(String socialmedia) {
		this.socialmedia = socialmedia;
	}

	public List<String> getManyButtons() {
		return manyButtons;
	}

	public void setManyButtons(List<String> manyButtons) {
		this.manyButtons = manyButtons;
	}

	@PostConstruct
	public void init() {

		mobileos = new ArrayList<String>();
		mobileos.add("Android");
		mobileos.add("Windows Phone");
		mobileos.add("IOS");
	}
}
