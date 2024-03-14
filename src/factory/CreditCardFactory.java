package factory;

import model.Campaign;
import model.CreditCard;
import model.Product;

import java.math.BigDecimal;
import java.util.List;

public class CreditCardFactory {
    public Product createCreditCard(String name, BigDecimal fee, BigDecimal limit) {
        return new CreditCard(name, fee, limit);
    }
}
