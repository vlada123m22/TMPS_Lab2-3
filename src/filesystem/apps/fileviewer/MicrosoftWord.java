package filesystem.apps.fileviewer;

import filesystem.Computer;
import filesystem.apps.Application;
import filesystem.component.File;
import filesystem.strategy.Redactor;

import java.util.List;

public class MicrosoftWord extends Application {
    protected MicrosoftWord(String os, List<String> supportedExtensions) throws Exception {
        super(os, new Redactor(supportedExtensions));
        this.operationalSystem=super.getOperationalSystem();
    }


    @Override
    public void run() {
        if (this.operationalSystem.getName().equals( Computer.getOS().getName()))
            System.out.println("Microsoft Word started in " + operationalSystem  );
        else System.out.println("The version of the application is not compatible with the OS on your computer");
    }
}
