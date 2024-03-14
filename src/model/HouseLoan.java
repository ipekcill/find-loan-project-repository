package model;

import enums.LoanType;

import java.math.BigDecimal;

public class HouseLoan extends Loan {
    private String title;

    public HouseLoan(String title, BigDecimal amount, Integer installment, Double interestRate, LoanType loanType) {
        super(amount, installment, interestRate, loanType);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
