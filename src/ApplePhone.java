public class ApplePhone extends Phone{

    private final String icon;

    public ApplePhone(String number, String model, double weight,String icon) {
        super(number, model, weight);
        this.icon=icon;
    }
    public void getInfo(){
        System.out.printf("number %s ,model Apple %s, weight %f ,icon %s \n",getNumber(),getModel(),getWeight(),icon);
    }
}
