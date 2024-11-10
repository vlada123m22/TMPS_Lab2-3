//package filesystem.apps.fileviewer;
//
//
//import filesystem.apps.Application;
//import filesystem.component.File;
//import filesystem.os.OperationalSystem;
//import filesystem.strategy.IBehaviour;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public abstract class AbstractFileViewer extends Application {
//    protected OperationalSystem operationalSystem;
//    protected final List<String> supportedExtensions;
//
//    public AbstractFileViewer(String os, IBehaviour behaviour) throws Exception {
//        super(os, behaviour);
//        this.supportedExtensions = new ArrayList<>();
//    }
//
//    public List<String> getSupportedExtensions() {
//        return supportedExtensions;
//    }
//
//
//
//    public void viewFile(File file){
//            for(String ext : supportedExtensions){
//                if (ext.equals(file.getExtension())) {
//                    file.displayContents();
//                    return;
//                }
//            }
//        System.out.println("Could not open the file because the extension is not supported by the current version of the app");
//    };
//
//}
