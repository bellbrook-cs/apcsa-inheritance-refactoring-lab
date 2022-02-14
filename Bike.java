public class Bike {
  String manufacturer;
  String model;
  String color;
  boolean hasBasket;
  int numGears;
  int currentGear;
  int numWheels;

  public Bike(String manufacturer, String model, String color, boolean hasBasket, int numGears) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.color = color;
    this.hasBasket = hasBasket;
    this.numGears = numGears;
    this.currentGear = 1;
    this.numWheels = 2;
  }

  public String toString() {
    return color + " " + model + ", made by " + manufacturer;
  }

  public void move(double distance) {
    System.out.println("moved " + distance + " miles");
  }

  // TODO: PROGRAMMER PROOFING
  // the currentGear should increase by 1 during this method, if at any point (before or after calling this method) currentGear is less than 1 or greater than numGears, the method should throw an IllegalGearException
  public void shiftUp() {
    currentGear++;
    System.out.println("Shifted to gear " + currentGear);
  }

  // TODO: PROGRAMMER PROOFING
  // the currentGear should decrease by 1 during this method, if at any point (before or after calling this method) currentGear is less than 1 or greater than numGears, the method should throw an IllegalGearException
  public void shiftDown() {
    currentGear--;
    System.out.println("Shifted to gear " + currentGear);
  }

  public void resetGears() {
    currentGear = 1;
  }

  public class IllegalGearException extends RuntimeException {
    IllegalGearException() {}
    IllegalGearException(String message) {
      super(message);
    }
  }
}