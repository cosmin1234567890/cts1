public class Wolf implements Runner {
   public static final  int WOLF_SPEED=6;
    @Override
    public int getSpeed() {
        return WOLF_SPEED;
    }
    Wolf(){

    }

    @Override
    public String toString() {
        return "Wolf speed is"+ WOLF_SPEED;
    }
}
