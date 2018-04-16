package session4;

public class Animal implements CanFly, CanRun, CanSwim {

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean run() {
        return true;
    }

    @Override
    public boolean swim() {
        return true;
    }
}
