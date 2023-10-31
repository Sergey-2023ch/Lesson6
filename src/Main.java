public class Main {
    //  Д/з создать в проекте с Phone интерфейсы: Callable с методом receiveCall() \n
    //  и Informable c default методом info() с default реализацией, применить интерфейсы \n
    //  к абстрактному классу Phone и классам-наследникам.
    public static void main(String[] args) {
        SamsungPhone s = new SamsungPhone("+7-524-422-54-90", "S055", 0.234);
        s.getInfo();
        s.receiveCall("Alex");
        s.receiveCall();
        s.info();
        System.out.println();

        XiaomiPhone x = new XiaomiPhone("+7-322-544-57-32", "RedmiNote12", 0.122, "silver");
        x.getInfo();
        x.receiveCall();
        x.info();
        System.out.println();

        ApplePhone ap= new ApplePhone("8-343-456-75-32","15ProMax",0.188,"apple");
        ap.getInfo();
        ap.receiveCall();
        ap.info();
    }
}
