package day43encapsulation_constructor;

public class Tesla {
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;

	@Override
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}

	public void setModel(String model) {
		//call isValidModel here then assign if true
		//if false: Invalid model - Camry
		//assign "Unknown" to model
		if (isValidModel(model)) {
			this.model = model;
		} else {
			System.out.println("Invalid model - " + model);
			this.model = "unknown";
		}
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getRange() {
		return range;
	}

	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}

	public double getZeroTo60() {
		return zeroTo60;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSelfDriving() {
		return selfDriving;
	}

	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}

	public boolean isValidModel(String model) {
		model = model.toLowerCase();
		if (model.equals("model s") || model.equals("model 3") || model.contentEquals("model x")
				|| model.contentEquals("model y") || model.contentEquals("roadster")) {
			return true;
		}
		return false;
	}
	public void setTeslaInfo(String model, int range, double zeroTo60, double price, boolean selfDriving) {
		//call setter methods for each parameter
		setModel(model);
		setRange(range);
		setZeroTo60(zeroTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
		
	}
}