package bikeproject;

public class Bike implements BikeParts {

	private String handleBars, frame, tyres, seatType;
	private int NumGears;

	public Bike(){
	}//end constructor

	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
	}//end constructor

	// ===== Методы интерфейса BikeParts =====
	@Override
	public String getHandleBars() {
		return handleBars;
	}//end method getHandleBars

	@Override
	public void setHandleBars(String newValue) {
		this.handleBars = newValue;
	}//end method setHandleBars

	@Override
	public String getFrame() {
		return frame;
	}//end method getFrame

	@Override
	public void setFrame(String newValue) {
		this.frame = newValue;
	}//end method setFrame

	@Override
	public String getTyres() {
		return tyres;
	}//end method getTyres

	@Override
	public void setTyres(String newValue) {
		this.tyres = newValue;
	}//end method setTyres

	@Override
	public String getSeatType() {
		return seatType;
	}//end method getSeatType

	@Override
	public void setSeatType(String newValue) {
		this.seatType = newValue;
	}//end method setSeatType

	@Override
	public int getNumGears() {
		return NumGears;
	}//end method getNumGears

	@Override
	public void setNumGears(int newValue) {
		this.NumGears = newValue;
	}//end method setNumGears

	protected void printDescription()
	{
		// MAKE берётся из интерфейса BikeParts
		System.out.println("\n" + MAKE + "\n"
				+ "This bike has " + this.handleBars + " handlebars on a "
				+ this.frame + " frame with " + this.NumGears + " gears."
				+ "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription

}//end class Bike