
class SmartDevice {
    public String brand;
    public String model;


    SmartDevice(String brand,String model){
        this.brand=brand;
        this.model=model;
    }


    public void turnOn(){
        System.out.println("Turning on the smart device");
    }
    public void turnOff(){
        System.out.println("Turning off the smart device.");
    }

}


class SmartWatch extends SmartDevice {    //It will extends the properties of Parent Class
    SmartWatch(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn(){
        System.out.println("Activating SmartWatch" +brand+"of Model"+ model);
    }

    @Override
    public void turnOff(){
        System.out.println("Turning off SmartWatch"+ brand+"of Model"+ model);
    }
}

    class SmartPhone extends SmartDevice {
    SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn(){
        System.out.println("Activating SmartPhone" +brand+"of Model"+ model);
    }

    @Override
    public void turnOff(){
        System.out.println("Turning off SmartPhone"+ brand+"of Model"+ model);
    }


}

public class SmartDevices {
    public static void main (String[] args){  
       SmartDevice device1=new SmartWatch("Apple","series 7");  //For smartWatch
        SmartDevice device2=new SmartPhone("Apple","Iphone X");  //For SmartPhone
        device1.turnOn();
        device1.turnOff();

        device2.turnOn();
        device2.turnOff();


    }

}