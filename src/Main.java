import filesystem.Computer;
import filesystem.apps.Application;
import filesystem.apps.decorator.MenuBarDecorator;
import filesystem.apps.fileviewer.Notepad;
import filesystem.component.Component;
import filesystem.component.File;
import filesystem.component.folders.VisibleFolder;
import filesystem.component.filetypes.TextFile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Computer.setOS("Windows");
        Component rootDirectoryFolder = new VisibleFolder("Root");
        Computer.addComponent(rootDirectoryFolder);

        File file1 = new TextFile("file1",".txt");

        List<String> notepadextenstions = new ArrayList<>();
        notepadextenstions.add(".txt");
        notepadextenstions.add((".docx"));
        notepadextenstions.add(".sql");

        Notepad notepad = new Notepad("Windows", notepadextenstions);
        MenuBarDecorator notepadWithMenuBar = new MenuBarDecorator(notepad);
        file1.setFileViewer(notepadWithMenuBar);
        file1.open();

    }
}