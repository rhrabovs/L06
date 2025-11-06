package Array;

public class Gift implements Comparable<Gift> {
    private double price;
    private Size size;
    private String title;

    public Gift(double price, Size size, String title) {
        this.price = price;
        this.size = size;
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "price=" + price +
                ", size=" + size +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gift o) {
        if (this.getPrice() >= o.getPrice()){
            return 1;
        } else {
            return -1;
        }
    }
}
