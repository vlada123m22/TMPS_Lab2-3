package filesystem.component.filetypes;

import filesystem.component.File;

public class TextFile extends File {
    public TextFile(String extension) {
        super(extension);
    }

    public TextFile(String name, String extension) {
        super(name, extension);
    }
}
