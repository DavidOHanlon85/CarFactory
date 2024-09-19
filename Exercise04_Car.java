/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise04_Car {
	
	//Instanct Variables
	
	private String make;
	private String model;
	private String colour;
	private int numberOfDoors;
	private double engineSize;
	private int maxSpeed;
	private boolean started;
	
	// Getters and Setters
	
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	/**
	 * @return the numberOfDoors
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	/**
	 * @param numberOfDoors the numberOfDoors to set
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	/**
	 * @return the engineSize
	 */
	public double getEngineSize() {
		return engineSize;
	}
	/**
	 * @param engineSize the engineSize to set
	 */
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}
	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	/**
	 * @return the started
	 */
	public boolean isStarted() {
		return started;
	}
	/**
	 * @param started the started to set
	 */
	public void setStarted(boolean started) {
		this.started = started;
	}
	
	// Methods
	
	/**
	 * This method checks if the car is started and starts the car if needed
	 */
	public void startCar() {
		if (this.started) {
			System.out.println("Car is already started");
		} else {
			System.out.println("Starting car");
			this.started = true;
		}
	}
	
	/**
	 * This method checks if the car is stopped and stops the car if needed
	 */
	public void stopCar() {
		if (!this.started) {
			System.out.println("Car already stopped");
		} else {
			System.out.println("Stopping car");
			this.started = false;
		}
	}
	
	// To String Method 
	
	@Override
	public String toString() {
		return "Exercise04_Car [make=" + make + ", model=" + model + ", colour=" + colour + ", numberOfDoors="
				+ numberOfDoors + ", engineSize=" + engineSize + ", maxSpeed=" + maxSpeed + ", started=" + started
				+ "]";
	}
	
	
	
	
	
	

}
