package filesystem.os;

import java.util.ArrayList;
import java.util.List;

public abstract class OperationalSystem {
    protected final String name;
    public OperationalSystem(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    };

    public abstract void run();
}
