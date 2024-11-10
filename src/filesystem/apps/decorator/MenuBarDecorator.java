package filesystem.apps.decorator;

import filesystem.apps.Application;
import filesystem.strategy.IBehaviour;

public class MenuBarDecorator extends AbstractDecorator {

    public MenuBarDecorator(Application application) throws Exception {
        super(application);
    }

    @Override
    public void draw() {

        System.out.println("Added Menu Bar");
    }
}
