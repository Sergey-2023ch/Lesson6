import java.util.concurrent.Callable;

public class Main {
    //  Д/з создать в проекте с Phone интерфейсы: Callable с методом receiveCall() \n
    //  и Informable c default методом info() с default реализацией, применить интерфейсы \n
    //  к абстрактному классу Phone и классам-наследникам.
    public static void main(String[] args) {


        SamsungPhone<String> s = new SamsungPhone("+7-524-422-54-90", "S055", 0.234);
        s.getInfo();
        s.receiveCall("Alex");
        s.info();
        s.getNumber();
        System.out.println();

        SamsungPhone<Integer> s2 = new SamsungPhone(3843943, 055, 0.234);
        s2.getInfo();
        System.out.println();

        XiaomiPhone<String> x = new XiaomiPhone("+7-322-544-57-32", "RedmiNote12", 0.122, "silver");
        x.getInfo();
        x.receiveCall("Slava");
        System.out.println(x.getColor());
        System.out.println();

        XiaomiPhone<Integer> x2 = new XiaomiPhone(2137903, 888, 0.122,880);
        x2.getInfo();
        System.out.println();

        ApplePhone<String> ap = new ApplePhone("8-343-456-75-32", "15ProMax", 0.188, "apple");
        ap.getInfo();
        ap.receiveCall("Sergey");
        ap.info();

    }
}
