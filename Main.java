public class Main {
  public static void main(String[] args) {

    // Creates new vehicles, no need to modify the lines below.
    System.out.println("\nCreating new vehicles...\n");

    Plane plane = new Plane("Boeing", "747", "White", 18);
    Bike bike = new Bike("Schwinn", "Brookline Cruiser", "Black", false, 7);
    Car car1 = new Car("Honda", "Fit", "White", 10.6, 33);
    Car car2 = new Car("Kia", "Soul", "Red", 14.3, 6.2, 28);

    

    // TODO: Create an array list of type ArrayList<Vehicle> that holds all of these vehicles and prints them with a loop.

    System.out.println("\nPrinting vehicles...\n");

    System.out.println(plane);
    System.out.println(bike);
    System.out.println(car1);
    System.out.println(car2);

    // TODO: Try to move each vehicle using a loop. Catch any exceptions that occur, and print a reasonable output. Make sure every vehicle gets a chance to move regardless of any exceptions.

    System.out.println("\nAttempting to move each vehicle 10 miles...\n");

    bike.move(10);

    // TODO: Catch any exceptions that might occur in the following lines of code

    System.out.println("\nTesting bike gear shift...\n");

    for (int i = 0; i < 10; i++) {
      if (Math.random() > 0.5) {
        bike.shiftUp();
      } else {
        bike.shiftDown();
      }
    }

    System.out.println("\nTesting car gas tank...\n");

    car1.fillTank(Math.random() * car1.gasTankSize);
    car2.fillTank(Math.random() * car2.gasTankSize);

    System.out.println("\nTesting plane take off / landing protocol...\n");

    for (int i = 0; i < 10; i++) {
      if (Math.random() > 0.5) {
        plane.takeOff();
      } else {
        plane.land();
      }
    }

    // Check type of each vehicle. No need to modify the lines below.

    System.out.println("\nTesting type inheritence...\n");

    Object temp = plane;
    System.out.println(temp + " is a Vehicle: " + (temp instanceof Vehicle));
    System.out.println(temp + " is a Plane: " + (temp instanceof Plane));
    temp = bike;
    System.out.println(temp + " is a Vehicle: " + (temp instanceof Vehicle));
    System.out.println(temp + " is a Bike: " + (temp instanceof Bike));
    temp = car1;
    System.out.println(temp + " is a Vehicle: " + (temp instanceof Vehicle));
    System.out.println(temp + " is a Car: " + (temp instanceof Car));
    temp = car2;
    System.out.println(temp + " is a Vehicle: " + (temp instanceof Vehicle));
    System.out.println(temp + " is a Car: " + (temp instanceof Car));
  }
}
