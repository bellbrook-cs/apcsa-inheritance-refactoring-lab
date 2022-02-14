public class Car {
  String manufacturer;
  String model;
  String color;
  int numWheels;
  double gasTankSize;
  double gasTankContent;
  double milesPerGallon;
  double odometer;


  public Car(String manufacturer, String model, String color, double gasTankSize, double milesPerGallon) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.color = color;
    this.numWheels = 4;
    this.gasTankSize = gasTankSize;
    this.gasTankContent = 0;
    this.odometer = 0;
    this.milesPerGallon = milesPerGallon;
  }

  public Car(String manufacturer, String model, String color, double gasTankSize, double gasTankContent, double milesPerGallon) {
    this(manufacturer, model, color, gasTankSize, milesPerGallon);
    this.gasTankContent = gasTankContent;
  }

  // TODO: PROGRAMMER PROOFING 
  // this method should be changed ensure it only travels a distance possible with how much gas is left in its tank.
  // If too much gas is used the program should calculate the distance that can actually be moved, and move that distance. The amount of gas left in the tank should be set to 0 (after moving that distance), and an OutOfGasException should be thrown.
  public void move(double distance) {
    System.out.println("moved " + distance + " miles");
    odometer += distance;
    gasTankContent -= distance / milesPerGallon;
  }

  // TODO: PROGRAMMER PROOFING 
  // Ensure that the tank is not overfilled, and throw a TooMuchGasException if the tank is overfilled.
  public void fillTank(double gallons) {
    gasTankContent += gallons;
    System.out.println("the tank is currently " + Math.round(100 * gasTankContent / gasTankSize) + "% full");
  }

  public String toString() {
    return color + " " + model + ", made by " + manufacturer;
  }

  public class GasException extends RuntimeException {
    GasException() {}
    GasException(String message) {
      super(message);
    }
  }

  public class OutOfGasException extends GasException {
    OutOfGasException() {}
    OutOfGasException(String message) {
      super(message);
    }
  }

  public class TooMuchGasException extends GasException {
    TooMuchGasException() {}
    TooMuchGasException(String message) {
      super(message);
    }
  }
}