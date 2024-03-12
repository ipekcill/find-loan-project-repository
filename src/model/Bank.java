package model;

import enums.LoanType;

import java.util.List;
import java.util.Map;

public class Bank {
    private String name;
    private List<Product> bankProducts;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getBankProducts() {
        return bankProducts;
    }

    public void setBankProducts(List<Product> bankProducts) {
        this.bankProducts = bankProducts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", bankProducts=" + bankProducts +
                '}';
    }
}
