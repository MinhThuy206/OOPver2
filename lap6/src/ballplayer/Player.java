package ballplayer;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player() {
        z = 0.0f;
    }

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp){
        x += xDisp;
        y += yDisp;
    }

    public void jump(float zDisp){
        z += zDisp;
    }

    public boolean near(Ball ball){
       return true;
    }
}
