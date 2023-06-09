package Lesson2.Seminar;

import java.awt.*;
import java.util.Random;

public class Food extends Cell {
    private Random random;
    private Snake snake;

    public Food(Snake snake) {
        super(-1, -1, GameSnake.CELL_SIZE, GameSnake.FOOD_COLOR);
        random = new Random();
        this.snake = snake;
    }

    public void appear() {
        int x, y;
        do {
            x = random.nextInt(GameSnake.CANVAS_WIDTH);
            y = random.nextInt(GameSnake.CANVAS_HEIGHT);
        } while (snake.isInSnake(x, y));
        set(x, y);
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public boolean isEaten() {
        return getX() == -1;
    }

    public void eat() {
        set(-1, -1);
    }

    public boolean isFood(int x, int y) {
        return (getX() == x && getY() == y);
    }

}
