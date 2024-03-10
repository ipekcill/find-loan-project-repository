package model;

import java.math.BigDecimal;
import java.util.List;

public abstract class Loan implements Product{
    private BigDecimal amount;
    private Integer installment;
    private Double interestRate;
    private List<Campaign> campaignListLoan;
    private Bank bank;
    public Loan(){

    }

    public Loan(BigDecimal amount, Integer installment, Double interestRate) {
        this.amount = amount;
        this.installment = installment;
        this.interestRate = interestRate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getInstallment() {
        return installment;
    }

    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public List<Campaign> getCampaignListLoan() {
        return campaignListLoan;
    }

    public void setCampaignListLoan(List<Campaign> campaignListLoan) {
        this.campaignListLoan = campaignListLoan;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }


}
