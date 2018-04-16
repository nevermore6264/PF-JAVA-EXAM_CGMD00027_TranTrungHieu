public class Cat {
    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public Cat() {

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

    public void run() {
        System.out.println("Cat is running with speed: " + getSpeed());
    }

    public boolean catchRat(Rat rat) {
        if (getSpeed() == rat.getSpeed()) {
            return true;
        } else {
            return false;
        }
    }

    public void eat(Rat food) {
        if (food.getWeight() < 10) {
            System.out.println("Mum mun, rat is small!");
        } else if (food.getWeight() > 10) {
            System.out.println("Mum mun, rat is fat!");
        } else {
            System.out.println("Mum mun, hungry!");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
