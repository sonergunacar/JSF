package _12.slider;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class SliderBean {
	int inputTextSlider;
	int inputHiddenSlider;
	int incrementalSlider;
	int verticalSlider;
	int lowerRange = 30;
	int topRange = 80;

	public int getInputTextSlider() {
		return inputTextSlider;
	}

	public void setInputTextSlider(int inputTextSlider) {
		this.inputTextSlider = inputTextSlider;
	}

	public int getInputHiddenSlider() {
		return inputHiddenSlider;
	}

	public void setInputHiddenSlider(int inputHiddenSlider) {
		this.inputHiddenSlider = inputHiddenSlider;
	}

	public int getIncrementalSlider() {
		return incrementalSlider;
	}

	public void setIncrementalSlider(int incrementalSlider) {
		this.incrementalSlider = incrementalSlider;
	}

	public int getVerticalSlider() {
		return verticalSlider;
	}

	public void setVerticalSlider(int verticalSlider) {
		this.verticalSlider = verticalSlider;
	}

	public int getLowerRange() {
		return lowerRange;
	}

	public void setLowerRange(int lowerRange) {
		this.lowerRange = lowerRange;
	}

	public int getTopRange() {
		return topRange;
	}

	public void setTopRange(int topRange) {
		this.topRange = topRange;
	}

}
