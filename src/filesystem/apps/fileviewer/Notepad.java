package filesystem.apps.fileviewer;

import filesystem.Computer;
import filesystem.apps.Application;
import filesystem.strategy.Redactor;

import java.util.List;

public class Notepad extends Application {


    public Notepad(String os, List<String> supportedExtensions) throws Exception {
        super(os, new Redactor(supportedExtensions));
    }

    @Override
    public void run() {
        if (this.operationalSystem.getName().equals( Computer.getOS().getName()))
            System.out.println("Notepad started in " + operationalSystem.getName()  );
        else System.out.println("The version of the application is not compatible with the computer OS");
    }
}
