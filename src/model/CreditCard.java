package model;

import enums.LoanType;

import java.math.BigDecimal;
import java.util.List;

public class CreditCard implements Product {
    private String name;
    private BigDecimal fee;
    private BigDecimal limit;
    private Bank bank;
    private List<Campaign> campaigns;
    private final LoanType loanType;


    public CreditCard(String name, BigDecimal fee, BigDecimal limit) {
        this.name = name;
        this.fee = fee;
        this.limit = limit;
        this.loanType = LoanType.CREDIT_CARD;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    @Override
    public Bank getBank() {
        return bank;
    }

    @Override
    public BigDecimal getAmount() {
        return limit;
    }

    @Override
    public LoanType getLoanType() {
        return this.loanType;
    }

    @Override
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "fee=" + fee +
                ", bank=" + bank +
                ", campaigns=" + campaigns +
                '}';
    }
}
