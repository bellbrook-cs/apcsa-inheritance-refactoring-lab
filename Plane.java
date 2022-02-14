public class Plane {
  String manufacturer;
  String model;
  String color;
  int numWheels;
  boolean flying;

  public Plane(String manufacturuer, String model, String color, int numWheels) {
    this.manufacturer = manufacturuer;
    this.model = model;
    this.color = color;
    this.numWheels = numWheels;
    flying = false;
  }

  public void move(double distance) {
    System.out.println("moved " + distance + " miles");
  }

  // TODO: PROGRAMMER PROOFING
  // Ensure that the plane can only take off if it is not already flying. Throw an IllegalStateException if there is an attempt to take off while already in the air.
  public void takeOff() {
    System.out.println("Taking off...");
    System.out.println("In the air!");
    flying = true;
  }

  // TODO: PROGRAMMER PROOFING
  // Ensure that the plane can only land if it is flying. Throw an IllegalStateException if there is an attempt to land while already on the ground.
  public void land() {
    System.out.println("Landing...");
    System.out.println("Landed safely!");
    flying = false;
  }

  public String toString() {
    return color + " " + model + ", made by " + manufacturer;
  }

}