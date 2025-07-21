import java.io.Serializable;
import java.time.LocalDateTime;

public class transactions implements Serializable  {
    private String type;
    private double amount;
    private LocalDateTime dateTime;

    public transactions(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    public String toString() {
        return dateTime + " | " + type + ": $" + amount;
    }
}
