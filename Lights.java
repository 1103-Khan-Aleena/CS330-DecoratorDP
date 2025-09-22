public class Lights extends OrnDecorator {
    public Lights(Trees trees) {
        this.trees = trees;
    }

    public String getDescription() {
        return trees.getDescription() + ", Lights";
    }

    public int cost() {
        return 5 + trees.cost();
    }
}