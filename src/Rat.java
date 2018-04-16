public class Rat {
    private String name;
    private int weight;
    private int speed;

    public Rat() {

    }

    public Rat(String name, int weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        if (speed > 0) {
            return speed;
        } else {
            return -1;
        }
    }

    public int getWeight() {
        if (weight > 0) {
            return weight;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Rat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }

    public void run() {
        System.out.println("Rat is running with speed: " + getSpeed());
    }
}
