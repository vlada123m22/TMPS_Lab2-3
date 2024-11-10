package filesystem.apps.decorator;

import filesystem.apps.Application;
import filesystem.strategy.IBehaviour;

public class PlayBarDecorator extends AbstractDecorator {
    public PlayBarDecorator(Application application) throws Exception {
        super(application);
    }

    @Override
    public void draw() {
        System.out.println("Added Play Bar");
    }
}
