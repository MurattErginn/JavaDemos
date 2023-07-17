package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        ScoreCalculator[] scoreCalculators = new ScoreCalculator[] {new ManScoreCalculator(), new WomanScoreCalculator(), new KidScoreCalculator(), new OlderScoreCalculator()};
        for (ScoreCalculator scoreCalculator:scoreCalculators) {
            scoreCalculator.calculate();
        }

        ScoreCalculator scoreCalculator = new WomanScoreCalculator();
    }
}
