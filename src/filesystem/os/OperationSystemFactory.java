package filesystem.os;

import filesystem.os.implementation.Linux;
import filesystem.os.implementation.Windows;

public class OperationSystemFactory {
    public static OperationalSystem getOperationalSystem(String name) throws Exception {
        return switch (name) {
            case "Windows" -> new Windows(name);
            case "Linux" -> new Linux(name);
            default -> throw new Exception("Indicated OS doesn't exist");
        };
    }
}
