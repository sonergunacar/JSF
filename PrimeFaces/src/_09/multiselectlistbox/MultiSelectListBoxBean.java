package _09.multiselectlistbox;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@ManagedBean
@RequestScoped

public class MultiSelectListBoxBean {
	private String destination;
	private List<SelectItem> districts;

	public String getDestination() {
		if (destination == null)
			return "Not choosed";
		else
			return "Chosed Line:" + destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<SelectItem> getdistricts() {
		return districts;
	}

	@PostConstruct
	public void init() {
		districts = new ArrayList<SelectItem>();
		SelectItemGroup street13 = new SelectItemGroup("STREET13");
		SelectItemGroup street25 = new SelectItemGroup("STREET25");
		SelectItemGroup street1400 = new SelectItemGroup("STREET1400");

		SelectItem Y39 = new SelectItem("39Y-street7-street13", "39Y-street7-street13");
		SelectItem D39 = new SelectItem("39D-street39-street13", "39D-street49-street13");
		SelectItem Z49 = new SelectItem("49Z-street49-street13", "49Z-street99-street13");
		SelectItem Z99 = new SelectItem("99Z-street99-street13", "99Z-street99-street13");
		
		street13.setSelectItems(new SelectItem[] { Y39, D39, Z49,Z99 });

		SelectItem B38 = new SelectItem("38B-street7-street25", "38B-street7-street25");
		SelectItem A88 = new SelectItem("88A-street49-street25", "88A-street49-street25");
		SelectItem G49 = new SelectItem("49G-street2-street25", "49G-street2-street25");

		street25.setSelectItems(new SelectItem[] { B38, A88, G49 });

		SelectItem Y37 = new SelectItem("37Y-street7-street1400", "37Y-street7-street1400");
		SelectItem E37 = new SelectItem("37E-street94-street1400", "37E-street94-street1400");
		SelectItem A37 = new SelectItem("37A-street111-street1400", "37A-street111-street1400");

		street1400.setSelectItems(new SelectItem[] { Y37, E37, A37 });

		districts.add(street13);
		districts.add(street25);
		districts.add(street1400);
	}
}
