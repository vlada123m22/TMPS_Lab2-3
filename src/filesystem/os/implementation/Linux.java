package filesystem.os.implementation;

import filesystem.os.OperationalSystem;

public class Linux extends OperationalSystem {
    public Linux(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Linus running");
    }
}
