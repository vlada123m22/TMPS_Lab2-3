package filesystem.component;

public abstract class Folder extends Component {
    Component component;

    public Folder(String name) {
        this.name = name;
    }

    public Folder() {
        this.name = "new";
    }
    //TODO Implement the folllowing methods
    //public abstract void remove(Component component);
    //public abstract void add(Component component);
    //public abstract void getChild(int number);
}
