package AbstractClasses;

public abstract class ScoreCalculator {
    public abstract void calculate();
    public final void gameOver() {
        System.out.println("Game Over.");
    }
}
