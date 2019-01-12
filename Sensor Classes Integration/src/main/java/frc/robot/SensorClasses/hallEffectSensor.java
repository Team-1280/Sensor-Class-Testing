package frc.robot.SensorClasses;
import edu.wpi.first.wpilibj.DigitalInput;

public class hallEffectSensor{
    int port;
    DigitalInput sensor;
    public hallEffectSensor(int port){
        this.port = port;
        sensor = new DigitalInput(port);
    }
    public int showPort(){
        return this.port;
    }
    public boolean get(){
        return !sensor.get();
    }
}