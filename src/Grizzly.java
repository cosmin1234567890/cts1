public class Grizzly extends Bear {
   static final int GRIZZLY_SPEED = 3;
    @Override
    public int getSpeed() {
        return GRIZZLY_SPEED;
    }
    Grizzly(){

    }

    @Override
    public String toString() {
        return "Grizzly speed is "+ GRIZZLY_SPEED;
    }
}
