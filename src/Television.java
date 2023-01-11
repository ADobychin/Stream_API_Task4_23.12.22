public class Television {

    private  String model;
    private int internationalYears;
    private double price;
    private  double size;
    private String manufacturs;

    public int getYear() {
        return year;
    }

    private int year;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getInternationalYears() {
        return internationalYears;
    }

    public void setInternationalYears(int internationalYears) {
        this.internationalYears = internationalYears;
    }

    public double  getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getManufacturs() {
        return manufacturs;
    }

    public void setManufacturs(String manufacturs) {
        this.manufacturs = manufacturs;
    }


    public Television(String model, int internationalYears, double price, double size, String manufacturs) {
        this.model = model;
        this.internationalYears = internationalYears;
        this.price = price;
        this.size = size;
        this.manufacturs = manufacturs;

    }

    @Override
    public String toString() {
        return "Television{" +
                "model='" + model + '\'' +
                ", internationalYears=" + internationalYears +
                ", price=" + price +
                ", size=" + size +
                ", manufacturs='" + manufacturs + '\'' +

                '}';
    }
}
