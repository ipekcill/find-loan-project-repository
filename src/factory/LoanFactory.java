package factory;

import enums.LoanType;
import enums.VehicleStatusType;
import model.Product;

import java.math.BigDecimal;

public interface LoanFactory {
    Product createLoan(LoanType type, String title, BigDecimal amount, Integer installment, Double interestRate, VehicleStatusType vehicleStatusType);
}
