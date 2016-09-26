package stepic.exercises;

/**
 * Created by Alex on 26.09.2016.
 */
public class Robot {
    private int x = 0;
    private int y = 0;
    private Direction direction = Direction.DOWN;

    // конструктор
    public Robot(Direction direction, int x, int y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    // текущее направление взгляда
    public Direction getDirection() {
        return direction;
    }

    // текущая координата X
    public int getX() {
        return x;
    }

    // текущая координата Y
    public int getY() {
        return y;
    }
}
