class Device {
    private String deviceName;

    Device(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void operate() {
        System.out.println("Operating device: " +deviceName);
    }
}

class Light extends Device {
     Light(String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        System.out.println(getDeviceName() + " is now on!.");
    }
}


class Thermostat extends Device {
     Thermostat(String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        System.out.println(getDeviceName() + " is setting temperature to a relax level.");
    }
}

class SecurityCamera extends Device {
     SecurityCamera(String deviceName) {
        super(deviceName);
    }

    @Override
    public void operate() {
        System.out.println(getDeviceName() + " has started recording");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Device[] dev = new Device[] {
            new Light("Living Room Light"),
            new Thermostat("Nest Thermostat"), //I have use chatgpt here cause i dont knwo what thermostat mean
            new SecurityCamera("Front Door Camera")
        };

        for (int i = 0; i < dev.length; i++) {
            dev[i].operate(); 
            System.out.println("---------------"); //TO make it more attractive
        }
    }
}
