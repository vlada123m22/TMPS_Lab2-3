package filesystem.apps.fileviewer;

import filesystem.Computer;
import filesystem.apps.Application;
import filesystem.strategy.*;
import java.util.List;

public class MediaViewer extends Application {


    public MediaViewer(String os, List<String> supportedExtensions) throws Exception {
        super(os, new Viewer(supportedExtensions));
        this.operationalSystem=super.getOperationalSystem();
    }



    @Override
    public void run() {
        if (this.operationalSystem.getName().equals( Computer.getOS().getName()))
            System.out.println("Microsoft Word started in " + operationalSystem  );
        else System.out.println("The version of the application is not compatible with the OS on your computer");
    }
}
