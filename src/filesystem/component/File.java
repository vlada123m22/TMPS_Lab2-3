package filesystem.component;

import filesystem.apps.Application;

public abstract class File extends Component {
    Application fileViewer;
    protected final String extension;

    public String getExtension() {
        return extension;
    }

    public Application getFileViewer() {
        return fileViewer;
    }

    public void setFileViewer(Application fileViewer) {
        this.fileViewer = fileViewer;
    }

    public File(String extension){
        this.extension = extension;
        this.name = "new" + extension;
    }

    public File(String name, String extension) {
        this.extension = extension;
        this.name = name+ extension;
    }


    public void displayContents(){
        System.out.println("Displaying the contents of file " + this.name);
    }

    @Override
    public void open(){
        fileViewer.run();
        System.out.println("Opening the file " + this.name);
    }
}
