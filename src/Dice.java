public class Dice {
    public int roll(int numberOfDice, int sides) {
        return numberOfDice * (int) (Math.random() * sides + 1);
    }
}
