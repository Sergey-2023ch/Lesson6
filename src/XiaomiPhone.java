public class XiaomiPhone extends Phone implements Callable,Informable{
    private String color;

    public XiaomiPhone(String number, String model, double weight,String color) {
        super(number, model, weight);
        this.color=color;
    }
    public void getInfo(){
        System.out.printf("number %s ,model Xiaomi %s, weight %f ,color %s \n",getNumber(),getModel(),getWeight(),color);
    }

    @Override
    public void receiveCall() {
        System.out.println("The XiaomiPhone is ringing");
    }
}
