public abstract class Phone<T> {
    private T number;
    private T model;
    private T weight;

    public Phone(T number, T model,T weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public abstract void getInfo() ;


    public T getNumber() {
        return number;
    }

    public T getModel() {
        return model;
    }

    public T getWeight() {
        return weight;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }
}

