package _02.booleanbutton;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class BooleanButtonBean {
	private boolean windows;
	private boolean linux;
	public boolean isWindows() {
		return windows;
	}
	public void setWindows(boolean windows) {
		this.windows = windows;
	}
	public boolean isLinux() {
		return linux;
	}
	public void setLinux(boolean linux) {
		this.linux = linux;
	}
	 public void addMessage() {
	        String summary = linux ? "Yes marked" : "No marked";
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
	    }
	 
	    public String windowsDialogMessage()
	    {
	        if (windows)
	            return "You are using Windows";
	        else
	            return "You are not using Windows";
	    }
	    public String linuxDialogMessage()
	    {
	        if (linux)
	            return "You are using Linux";
	        else
	            return "You are using Linux";
	    }
}
