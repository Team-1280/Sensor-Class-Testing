package frc.robot.SensorClasses;
import edu.wpi.first.wpilibj.AnalogInput;

public class UltrasonicAnalogSensor {
    int port;
    double distance;
    double cmPerVolt;
    double voltage;
    AnalogInput sensor;
  
    public void UltrasonicSensor(int port, double cmPerVolt) {
        this.port = port;
        this.cmPerVolt = cmPerVolt;
        sensor = new AnalogInput(port);
    }
    public int getPort() {
        return this.port;
    }
    public void setCmPerVolt(double cmPerVolt) {
        this.cmPerVolt = cmPerVolt;
    }
    public double getCmPerVolt() {
        return this.cmPerVolt;
    }
    public double getDistance() {
        try {
        distance = cmPerVolt * sensor.getVoltage();
        } catch (Exception e) {
            System.out.println("Error with distance calculation! Make sure to check cmPerVolt is set and check if voltage is being input.");
        }
        // Distance is how many inches per volt multiplied by the voltage output by the sensor
        return distance;
    }
}