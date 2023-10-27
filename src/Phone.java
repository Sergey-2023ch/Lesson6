public class Phone {
   private String number;
    private String model;
    private double weight;
    private String name;

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

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
}

