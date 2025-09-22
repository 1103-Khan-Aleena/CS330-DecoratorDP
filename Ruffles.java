public class Ruffles extends OrnDecorator {
    public Ruffles(Trees trees) {
        this.trees = trees;
    }

    public String getDescription() {
        return trees.getDescription() + ", Ruffles";
    }

    public int cost() {
        return 1 + trees.cost();
    }
}