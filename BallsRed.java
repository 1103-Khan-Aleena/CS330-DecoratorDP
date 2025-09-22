public class BallsRed extends OrnDecorator {
    public BallsRed(Trees trees) {
        this.trees = trees;
    }

    public String getDescription() {
        return trees.getDescription() + ", Red Balls";
    }

    public int cost() {
        return 1 + trees.cost();
    }
}