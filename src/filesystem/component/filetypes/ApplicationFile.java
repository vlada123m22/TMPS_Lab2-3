package filesystem.component.filetypes;

import filesystem.component.File;

public class ApplicationFile extends File {


    public ApplicationFile(String extension) {
        super(extension);
    }

    public ApplicationFile(String name, String extension) {
        super(name, extension);
    }

    @Override
    public void open() {

    }
}
