package filesystem.strategy;

import java.util.List;

public class Redactor implements IBehaviour {

    Viewer viewer;

    public Redactor(List<String> supportedExtensions) {
        viewer= new Viewer(supportedExtensions);
    }

    @Override
    public void action() {
        viewer.action();
        System.out.println("It also allows you to edit files");
    }
}
