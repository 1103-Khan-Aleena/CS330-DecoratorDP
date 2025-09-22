public class Ribbons extends OrnDecorator {
    public Ribbons(Trees trees) {
        this.trees = trees;
    }

    public String getDescription() {
        return trees.getDescription() + ", Ribbons";
    }

    public int cost() {
        return 2 + trees.cost();
    }
}