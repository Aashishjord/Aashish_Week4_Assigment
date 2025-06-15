
class Vehicle {
    private String plateNumber;
    protected double baseRate;

    Vehicle(String plateNumber, double baseRate) {
        this.plateNumber = plateNumber;
        this.baseRate = baseRate;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public double calculateRental(int days) {
        return baseRate * days;
    }
}

class Car extends Vehicle {
    Car(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }

    @Override
    public double calculateRental(int days) {
        return baseRate * days;
    }
}

class Truck extends Vehicle {
    private double loadFee;

    Truck(String plateNumber, double baseRate, double loadFee) {
        super(plateNumber, baseRate);
        this.loadFee = loadFee;
    }

    @Override
    public double calculateRental(int days) {
        return (baseRate * days) + loadFee;
    }
}

class Bike extends Vehicle {
    private final double fixedRate = 100;  //This is random fixed rate.
    Bike(String plateNumber) {
        super(plateNumber, 0); 
    }

    @Override
    public double calculateRental(int days) {
        return fixedRate;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
            new Car("BA-5550", 10),//Bagmati
            new Truck("GA-4440", 20, 100),//Gandaki
            new Bike("KO-7890")//Koshi
        };

        int rentalDays = 5; //I am assuming rental days to be 5

      for (int i = 0; i < vehicles.length; i++) {
            Vehicle v = vehicles[i];
            System.out.println(
                v.getClass().getSimpleName() + " (" + v.getPlateNumber() + 
                ") Rental Cost for " + rentalDays + " days: $" + v.calculateRental(rentalDays)
            );
      }
    }
}
