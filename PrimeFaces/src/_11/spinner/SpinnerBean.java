package _11.spinner;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class SpinnerBean {
	int simpleSpinner;
	double stepSpinner;
	int minmaxSpinner;
	int prefixSpinner;
	int ajaxSpinner;

	public int getSimpleSpinner() {
		return simpleSpinner;
	}

	public void setSimpleSpinner(int simpleSpinner) {
		this.simpleSpinner = simpleSpinner;
	}

	public double getStepSpinner() {
		return stepSpinner;
	}

	public void setStepSpinner(double stepSpinner) {
		this.stepSpinner = stepSpinner;
	}

	public int getMinmaxSpinner() {
		return minmaxSpinner;
	}

	public void setMinmaxSpinner(int minmaxSpinner) {
		this.minmaxSpinner = minmaxSpinner;
	}

	public int getPrefixSpinner() {
		return prefixSpinner;
	}

	public void setPrefixSpinner(int prefixSpinner) {
		this.prefixSpinner = prefixSpinner;
	}

	public int getAjaxSpinner() {
		return ajaxSpinner;
	}

	public void setAjaxSpinner(int ajaxSpinner) {
		this.ajaxSpinner = ajaxSpinner;
	}

}