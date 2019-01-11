package frc.robot.SensorClasses;
import edu.wpi.first.wpilibj.AnalogInput;;

public class UltrasonicAnalogSensor {
    int port;
    double distance;
    double scalingFactor;
    double voltage;
    AnalogInput sensor;
  
    public UltrasonicAnalogSensor(int port, double scalingFactor) {
        this.port = port;
        this.scalingFactor = scalingFactor;
        sensor = new AnalogInput(port);
    }
    public int getPort() {
        return this.port;
    }
    public void setscalingFactor(double scalingFactor) {
        this.scalingFactor = scalingFactor;
    }
    public double getscalingFactor() {
        return scalingFactor;
    }
    public double getDistance() {
        try {
        distance = (5 * (sensor.getVoltage()/scalingFactor)) / 25.4;
        } catch (Exception e) {
            System.out.println("Error with distance calculation! Make sure to setVoltInches and check if voltage is being input.");
        }
        // Distance is how many inches per volt multiplied by the voltage output by the sensor
        return distance;
    }
}