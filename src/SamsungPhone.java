public class SamsungPhone extends Phone{

    public SamsungPhone(String number, String model, double weight) {
        super(number, model, weight);
    }
    public void getInfo() {
        System.out.printf("number : %s , model:Samsung %s , weight: %f\n",getNumber(),getModel(),getWeight());
    }
    public void receiveCall(String name) {
        System.out.printf("%s colling\n", name);
    }


}
