public class Main {

    public static void main(String[] args) {
        SamsungPhone s = new SamsungPhone("+7-524-422-54-90", "S055", 0.234);
        s.getInfo();
        s.receiveCall("Alex");

        XiaomiPhone x = new XiaomiPhone("+7-322-544-57-32", "RedmiNote12", 0.122, "silver");
        x.getInfo();

        Phone phone= new ApplePhone("8-343-456-75-32","15ProMax",0.188,"apple");
        phone.getInfo();
    }
}
