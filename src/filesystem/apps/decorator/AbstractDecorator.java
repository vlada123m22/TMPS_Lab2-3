package filesystem.apps.decorator;


import filesystem.apps.Application;


public abstract class AbstractDecorator extends Application {
     protected Application application;

    public AbstractDecorator(Application  application) throws Exception {
        super(application.getOperationalSystem().getName(), application.getBehaviour());
        this.application = application;
        draw();
    }

    public Application getApplication() {
        return application;
    }

    public abstract void draw();

    @Override
    public void run() {
        application.run();
    }

}
