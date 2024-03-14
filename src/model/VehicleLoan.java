package model;

import enums.LoanType;
import enums.VehicleStatusType;

import java.math.BigDecimal;

public class VehicleLoan extends Loan {
    private String title;
    private VehicleStatusType vehicleStatusType;

    public VehicleLoan(String title, VehicleStatusType vehicleStatusType, BigDecimal amount, Integer installment, Double interestRate, LoanType loanType) {
        super(amount, installment, interestRate, loanType);
        this.title = title;
        this.vehicleStatusType = vehicleStatusType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public VehicleStatusType getVehicleStatusType() {
        return vehicleStatusType;
    }

    public void setVehicleStatusType(VehicleStatusType vehicleStatusType) {
        this.vehicleStatusType = vehicleStatusType;
    }
}
