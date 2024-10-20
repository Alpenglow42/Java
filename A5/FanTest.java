


public class FanTest {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.turnON();

        fan2.setSpeed(Fan.FAST);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.turnOff();
        System.out.println("Fan 1 toString: " + fan1.toString());
        System.out.println("Fan 2 toString: " + fan2.toString());
    }
}
