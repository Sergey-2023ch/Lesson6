public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setNumber("+7-920-848-32-35");
        p1.setModel("Samsung");
        p1.setWeight(0.240);
        p1.getInfo();

        Phone p2 = new Phone();
        p2.setNumber("+7-483-384-33-34");
        p2.setModel("Xiaomi");
        p2.setWeight(0.310);
        p2.getInfo();

        Phone p3 = new Phone();
        p3.setNumber("+7-439-938-34-54");
        p3.setModel("Apple");
        p3.setWeight(0.340);
        p3.getInfo();

        p1.setName("Misha");
        p2.setName("Kolya");
        p3.setName("Sergey");


        p1.receiveCall();
        System.out.println(p1.getNumber());
        p2.receiveCall();
        System.out.println(p2.getNumber());
        p3.receiveCall();
        System.out.println(p3.getNumber());

        Phone p4 = new Phone("8-903-439-39-49", "Huawei", 0.269);
        p4.getInfo();

        Phone p5 = new Phone("8-343-544-54-45", "Nokia");
        p5.getInfo();

    }
}
