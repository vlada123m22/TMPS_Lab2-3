package filesystem;

import filesystem.component.Component;
import filesystem.os.OperationSystemFactory;
import filesystem.os.OperationalSystem;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private static OperationalSystem operationalSystem;
    private static List<Component> components;

    private Computer() {
    }

    public static void addComponent(Component component){
        if (components == null) components = new ArrayList<Component>();
        components.add(component);
    };

    public static List<Component> getComponents(){
        return  components;
    }

    public static void setOS(String os) throws Exception {
       operationalSystem = OperationSystemFactory.getOperationalSystem(os);
    }

    public static OperationalSystem getOS(){
        return operationalSystem;
    }

}
