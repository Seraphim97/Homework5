public class Phone {
    String model;
    int number;
    double weight;

    public Phone(String model, int number, double weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public Phone(String model, int number) {
        this.model = model;
        this.number = number;
    }
    public void showModel() {
        System.out.println("showModel: " + this.model);
    }
    public void callNumber(int number) {
        System.out.println( "callNumber: " + number);
    }




}
