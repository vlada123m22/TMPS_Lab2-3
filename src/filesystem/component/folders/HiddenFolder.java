package filesystem.component.folders;

import filesystem.component.Folder;

public class HiddenFolder extends Folder {

    HiddenFolder(String name){
        super(name);
    }

    HiddenFolder(){
        super();
    }

    @Override
    public void open() {

    }
}
