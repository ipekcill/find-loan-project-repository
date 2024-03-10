package model;

import enums.LoanType;

import java.util.List;
import java.util.Map;

public class Bank {
    private String name;
    private List<Product> bankProducts;
    private List<ConsumerLoan> bankConsumerLoans;
    private List<HouseLoan> bankHouseLoans;
    private List<List<Loan>> bankLoans;
    private List<CreditCard> bankCreditCard;

    public List<CreditCard> getBankCreditCard() {
        return bankCreditCard;
    }

    public void setBankCreditCard(List<CreditCard> bankCreditCard) {
        this.bankCreditCard = bankCreditCard;
    }

    public List<List<Loan>> getBankLoans() {
        return bankLoans;
    }

    public void setBankLoans(List<List<Loan>> bankLoans) {
        this.bankLoans = bankLoans;
    }

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

    public List<ConsumerLoan> getBankConsumerLoans() {
        return bankConsumerLoans;
    }

    public void setBankConsumerLoans(List<ConsumerLoan> bankConsumerLoans) {
        this.bankConsumerLoans = bankConsumerLoans;
    }


}
