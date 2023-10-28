public class Phone {
    private String number;
    private String model;
    private double weight;

    void getInfo() {
        System.out.printf("number : %s , model: %s , weight: %f\n", this.getNumber(),this.getModel(),this.getWeight());
    }

    void receiveCall(String name) {
        System.out.printf("%s colling\n", name);
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        System.out.println("Phone is created");
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

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
}

