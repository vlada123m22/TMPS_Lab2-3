package filesystem.component;

public abstract class Component {
   protected String name;

   public String getName(){
      return this.name;
   }

   public void rename(String newName){this.name = newName;};
   public abstract void open();

}
