public class SamsungPhone extends Phone implements Callable,Informable{

    public SamsungPhone(String number, String model, double weight) {
        super(number, model, weight);
    }
    public void getInfo() {
        System.out.printf("number : %s , model:Samsung %s , weight: %f\n",getNumber(),getModel(),getWeight());
    }
    public void receiveCall(String name) {
        System.out.printf("%s colling\n", name);
    }


    @Override
    public void receiveCall() {
        System.out.println("The SamsungPhone is ringing");
    }
   public void info(){
       System.out.println("Informable SamsungPhone");

    }
}
