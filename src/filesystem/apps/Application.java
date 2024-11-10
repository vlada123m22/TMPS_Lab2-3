package filesystem.apps;

import filesystem.Computer;
import filesystem.os.OperationSystemFactory;
import filesystem.os.OperationalSystem;
import filesystem.strategy.IBehaviour;

public abstract class Application {
    protected OperationalSystem operationalSystem;
    protected final IBehaviour behaviour;

    public Application(String os, IBehaviour behaviour) throws Exception {
        if(os.equals(Computer.getOS().getName()))
            operationalSystem = OperationSystemFactory.getOperationalSystem(os);
        else throw new Exception("The app was built for another os and cannot be installed on that computer");
        this.behaviour = behaviour;
        behaviour.action();
    }

    public abstract void run() ;

    public OperationalSystem getOperationalSystem() {
        return this.operationalSystem;
    }

    public IBehaviour getBehaviour() {
        return behaviour;
    }
}
