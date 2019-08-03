import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Discounter easterDiscounter = new EasterDiscount();

        BigDecimal discountedValue = easterDiscounter.applyDiscount(BigDecimal.valueOf(100));

        System.out.println(discountedValue);
    }
}
