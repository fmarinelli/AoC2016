package learning.aoc.day1.model;

import java.util.ArrayList;
import java.util.List;

public class Walker {

    private Position position = new Position();
    private Direction direction = Direction.NORTH;

    public List<Position> right(int steps) {
        this.direction = direction.right();
        return move(steps);
    }

    public List<Position> left(int steps) {
        this.direction = direction.left();
        return move(steps);
    }

    public int getBlocksAway() {
        return position.getBlocksAway();
    }

    private List<Position> move(int steps) {
        List<Position> positions = new ArrayList<>();
        for(int i = 0; i < steps; i++) {
            this.position = this.position.moveBy(direction.moveByX(1), direction.moveByY(1));
            positions.add(position);
        }
        return positions;
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }
}
