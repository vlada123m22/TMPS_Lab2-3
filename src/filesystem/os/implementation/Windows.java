package filesystem.os.implementation;

import filesystem.os.OperationalSystem;

public class Windows extends OperationalSystem {
    public Windows(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Windows running");
    }
}
