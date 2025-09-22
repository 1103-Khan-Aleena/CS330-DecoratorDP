public class LEDS extends OrnDecorator {
    public LEDS(Trees trees) {
        this.trees = trees;
    }

    public String getDescription() {
        return trees.getDescription() + ", L.E.D's";
    }

    public int cost() {
        return 10 + trees.cost();
    }
}