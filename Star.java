public class Star extends OrnDecorator {

  private boolean hasStar(Trees tree) { 
    while (tree instanceof OrnDecorator) {// while the tree is an ornament
        if (tree instanceof Star) { // if the tree (ornament) is a star
            return true; // we found a star
        }
        tree = ((OrnDecorator) tree).trees; //if its not star we have to look deeper just in case; current tree (ornament) = to the ornament (thats also a tree) thats one level deeper accessed by .trees
    }
    return tree instanceof Star; // check the base tree
}
    public Star(Trees trees) {
        // Check if the tree already has a star
        if (hasStar(trees)) {
            System.err.println("\nYou cannot add more than one star, please choose another ornament!\n");
            this.trees = trees;
        } else {
            this.trees = trees;
        }
    }

    public String getDescription() {
        if (hasStar(trees)) {
            return trees.getDescription(); // shouldnt add extra star in description
        }
        return trees.getDescription() + ", Star";
    }

    public int cost() {
        // Only charge if this is the first star
        if (hasStar(trees)) {
            return trees.cost(); // shouldnt add extra cost
        }
        return 4 + trees.cost();
    }


}
