package filesystem.strategy;

import java.util.List;

public class Viewer implements IBehaviour {
    protected final List<String> supportedExtensions;

    public Viewer(List<String> supportedExtensions) {
        this.supportedExtensions = supportedExtensions;
    }

    @Override
    public void action() {
        System.out.println("This application allows you to view files");
    }
}
