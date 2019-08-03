import java.math.BigDecimal;

public interface Discounter {
    BigDecimal applyDiscount(final BigDecimal amount);
}
