public class Phone {
    String number;
    String model;
    double weight;
    String name;

    void getInfo() {
        System.out.printf("number : %s , model: %s , weight: %f\n", number, model, weight);
    }

    void receiveCall() {
        System.out.printf("%s colling\n", name);
    }

    String getNumber() {
        return number;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.540;
    }

    public Phone() {
    }
}

