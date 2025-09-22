public class BallsBlue extends OrnDecorator {
    public BallsBlue(Trees trees) {
        this.trees = trees;
    }

    public String getDescription() {
        return trees.getDescription() + ", Blue Balls";
    }

    public int cost() {
        return 2 + trees.cost();
    }
}