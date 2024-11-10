package filesystem.apps.decorator;

import filesystem.apps.Application;
import filesystem.strategy.IBehaviour;

public class ScrollBarDecorator extends AbstractDecorator {

    public ScrollBarDecorator(Application application) throws Exception {
        super(application);
    }

    @Override
    public void draw() {
        System.out.println("Added Scroll Bar");
    }
}
