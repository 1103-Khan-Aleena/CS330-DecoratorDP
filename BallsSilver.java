public class BallsSilver extends OrnDecorator {
    public BallsSilver(Trees trees) {
        this.trees = trees;
    }

    public String getDescription() {
        return trees.getDescription() + ", Silver Balls";
    }

    public int cost() {
        return 3 + trees.cost();
    }
}