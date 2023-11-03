public class SamsungPhone<T> extends Phone implements Callable<T>,Informable{

    public SamsungPhone(T number, T model, T weight) {
        super(number, model, weight);
    }
    public void getInfo() {
        System.out.printf("number : %s , model:Samsung %s , weight: %f\n",getNumber(),getModel(),getWeight());
    }
    public void receiveCall(String name) {
        System.out.printf("%s colling\n", name);
    }


   public void info(){
       System.out.println("Informable SamsungPhone");

    }

}
