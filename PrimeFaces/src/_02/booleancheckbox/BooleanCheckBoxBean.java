package _02.booleancheckbox;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
@ManagedBean
@RequestScoped
public class BooleanCheckBoxBean {
private boolean java;
private boolean dotnet;
 
    public boolean isJava() {
        return java;
    }
 
    public void setJava(boolean java) {
        this.java = java;
    }
 
    public boolean isDotnet() {
        return dotnet;
    }
 
    public void setDotnet(boolean dotnet) {
        this.dotnet = dotnet;
    }
 
    public void sendMessage()
    {
        String bilgi=dotnet?"You developed a program with .NET":"You didnt develope a program with .NET";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(bilgi));
    }
    public String dotnetMessage()
    {
        if(dotnet)
            return "You developed a program with .NET";
        else
            return "You didnt develope a program with .NET";
    }
    public String javaMessage()
    {
        if(java)
            return "You developed a program with java";
        else
            return "You didnt develope a program with java";
    }
}