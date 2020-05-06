import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> payments;

    public Wallet(String name) {
        this.name = name;
        this.payments = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.payments.size();
    }

    public void addItem(IScan payment) {
        this.payments.add(payment);
    }

}
