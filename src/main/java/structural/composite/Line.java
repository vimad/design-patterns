package structural.composite;

public class Line implements Shape {
    private int currentPose;
    Line(int currentPos) {
        this.currentPose = currentPos;
    }

    @Override
    public void moveRight(int amount) {
        currentPose += amount;
    }
}
