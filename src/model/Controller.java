package model;

public class Controller {

    private Device[][] deviceMatrix;
    private int floors = 12;
    private int devicesPerFloor = 4;

    public Controller() {
        this.deviceMatrix = new Device[floors][devicesPerFloor]; // Assuming a maximum of 10 floors and 10 devices per floor
    }

    /**
     * Adds a new device to the matrix.
     *
     * @param serial The serial number of the device.
     * @param consumption The consumption value of the device.
     * @param description The description of the device.
     * @param floor The floor where the device is located.
     */
    public void addDevice(String serial, double consumption, String description, int floor) {

        for (int i = 0; i < devicesPerFloor; i++) {
            if (deviceMatrix[floor][i] != null && deviceMatrix[floor][i].getSerial().equals(serial)) {
                System.out.println("Device with serial " + serial + " already exists.");
            } else if (deviceMatrix[floor][i] == null) {
                deviceMatrix[floor][i] = new Device(serial, consumption, description);

            } else {
                System.out.println("Failed to add device with serial " + serial);
            }

        }

    }

/**
 * Registers an event for a device with the specified serial number.
 *
 * @param serial The serial number of the device.
 * @param date The date of the event.
 * @param hours The hours associated with the event.
 */
    public void registerEventForDevice(String serial, java.time.LocalDate date, double hours) {
        Event event = new Event(date, hours);
        for (int f = 0; f < floors; f++) {
            for (int d = 0; d < devicesPerFloor; d++) {
                if (deviceMatrix[f][d] != null && deviceMatrix[f][d].getSerial().equals(serial)) {
                    deviceMatrix[f][d].registerEvent(event);
                    return;
                }
            }
        }
        System.out.println("Device with serial " + serial + " not found.");
    }

/**
 * Updates the consumption unit for a device with the specified serial number.
 *
 * @param serial The serial number of the device.
 * @param newConsumption The new consumption value for the device.
 */
    public void updateDeviceConsumptionUnit(String serial, double newConsumption) {
        for (int f = 0; f < floors; f++) {
            for (int d = 0; d < devicesPerFloor; d++) {
                if (deviceMatrix[f][d] != null && deviceMatrix[f][d].getSerial().equals(serial)) {
                    deviceMatrix[f][d].updateDeviceConsumptionUnit(newConsumption);
                    return;
                }
            }
        }
        System.out.println("Device with serial " + serial + " not found.");         
    }

/**
 * Displays the consumption information for a device with the specified serial number.
 *
 * @param serial The serial number of the device.
 */
    public void showDeviceConsumption(String serial) {
        for (int f = 0; f < floors; f++) {
            for (int d = 0; d < devicesPerFloor; d++) {
                if (deviceMatrix[f][d] != null && deviceMatrix[f][d].getSerial().equals(serial)) {
                    deviceMatrix[f][d].showDeviceConsumption();
                    return;
                }
            }
        }
        System.out.println("Device with serial " + serial + " not found.");
    }
}
