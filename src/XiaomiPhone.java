public class XiaomiPhone <T>extends Phone implements Callable<T>,Informable{
    private T color;

    public XiaomiPhone(T number,T model,T weight,T color) {
        super(number, model, weight);
        this.color=color;
    }
    public void getInfo(){
        System.out.printf("number %s ,model Xiaomi %s, weight %f ,color %s \n",getNumber(),getModel(),getWeight(),color);
    }

    @Override
    public void receiveCall(String name) {
        System.out.printf("%s is ringing\n",name);
    }

    public T getColor() {
        return color;
    }

    public void setColor(T color) {
        this.color = color;
    }
}
