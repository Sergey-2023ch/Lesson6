public interface Informable {
   default void info(){
       System.out.println("There is no information about this phone");
   }
}
