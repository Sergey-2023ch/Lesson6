public class Main {



    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setNumber("+7-920-848-32-35");
        p1.setModel("Samsung");
        p1.setWeight(0.240);
        p1.getInfo();

        Phone p2=new Phone("+7-483-384-33-34","Xiaomi");
        p2.getInfo();

        Phone p3 = new Phone("+7-439-938-34-54","Apple",0.340);
        p3.getInfo();

        p1.receiveCall("Misha");
        System.out.println(p1.getNumber());
        p2.receiveCall("Kolya");
        System.out.println(p2.getNumber());
        p3.receiveCall("Pavel");
        System.out.println(p3.getNumber());
    }
}
