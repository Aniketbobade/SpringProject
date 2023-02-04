package in.hacktech.spring.service;

public class Details {

	private int upperCaseCount;
	private int lowerCaseCount;
	private int digitCount;
	private int specialCount;
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Details(int upperCaseCount, int lowerCaseCount, int digitCount, int specialCount) {
		super();
		this.upperCaseCount = upperCaseCount;
		this.lowerCaseCount = lowerCaseCount;
		this.digitCount = digitCount;
		this.specialCount = specialCount;
	}
	public int getUpperCaseCount() {
		return upperCaseCount;
	}
	public void setUpperCaseCount(int upperCaseCount) {
		this.upperCaseCount = upperCaseCount;
	}
	public int getLowerCaseCount() {
		return lowerCaseCount;
	}
	public void setLowerCaseCount(int lowerCaseCount) {
		this.lowerCaseCount = lowerCaseCount;
	}
	public int getDigitCount() {
		return digitCount;
	}
	public void setDigitCount(int digitCount) {
		this.digitCount = digitCount;
	}
	public int getSpecialCount() {
		return specialCount;
	}
	public void setSpecialCount(int specialCount) {
		this.specialCount = specialCount;
	}
	@Override
	public String toString() {
		return "Details [upperCaseCount=" + upperCaseCount + ", lowerCaseCount=" + lowerCaseCount + ", digitCount="
				+ digitCount + ", specialCount=" + specialCount + "]";
	}
	
	
}
