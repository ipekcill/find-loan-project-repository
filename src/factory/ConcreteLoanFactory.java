package factory;

import enums.LoanType;
import enums.VehicleStatusType;
import model.ConsumerLoan;
import model.HouseLoan;
import model.Product;
import model.VehicleLoan;

import java.math.BigDecimal;

public class ConcreteLoanFactory implements LoanFactory {
    @Override
    public Product createLoan(LoanType type, String title, BigDecimal amount, Integer installment, Double interestRate, VehicleStatusType vehicleStatusType) {
        switch (type) {
            case CONSUMER_LOAN:
                return new ConsumerLoan(title, amount, installment, interestRate, type);
            case VEHICLE_LOAN:
                if (vehicleStatusType != null) {
                    return new VehicleLoan(title, vehicleStatusType, amount, installment, interestRate, type);
                } else {
                    throw new IllegalArgumentException("VehicleStatusType cannot be null for VehicleLoan");
                }
            case HOUSE_LOAN:
                return new HouseLoan(title, amount, installment, interestRate, type);
            default:
                throw new IllegalArgumentException("Unknown loan type: " + type.name());
        }
    }
}