package frc.robot.SensorClasses;
import edu.wpi.first.wpilibj.AnalogInput;;

public class UltrasonicAnalogSensor {
    int port;
    double distance;
    double inchesPerVolt;
    double voltage;
    AnalogInput sensor;
  
    public UltrasonicAnalogSensor(int port, double inchesPerVolt) {
        this.port = port;
        this.inchesPerVolt = inchesPerVolt;
        sensor = new AnalogInput(port);
    }
    public int getPort() {
        return this.port;
    }
    public void setInchesPerVolt(double inchesPerVolt) {
        this.inchesPerVolt = inchesPerVolt;
    }
    public double getInchesPerVolt() {
        return inchesPerVolt;
    }
    public double getDistance() {
        try {
        distance = inchesPerVolt * sensor.getVoltage();
        } catch (Exception e) {
            System.out.println("Error with distance calculation! Make sure to setVoltInches and check if voltage is being input.");
        }
        // Distance is how many inches per volt multiplied by the voltage output by the sensor
        return distance;
    }
}