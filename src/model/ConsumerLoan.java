package model;

import enums.LoanType;

import java.math.BigDecimal;

public class ConsumerLoan extends Loan {
    private String title;

    public ConsumerLoan(String title, BigDecimal amount, Integer installment, Double interestRate, LoanType loanType) {
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
