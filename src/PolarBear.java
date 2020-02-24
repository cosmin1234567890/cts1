public class PolarBear extends  Bear {
     private static final int POLAR_BEAR_SPEED=4;
    @Override
    public int getSpeed() {
        return POLAR_BEAR_SPEED;
    }
    PolarBear(){

    }

    @Override
    public String toString() {
        return super.toString()+" PolarBear speed is"+ POLAR_BEAR_SPEED;
    }
}
