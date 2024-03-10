package model;

import enums.LoanType;
import enums.VehicleStatuType;

import java.util.List;

public class VehicleLoan extends Loan {
    private LoanType vehicleLoan = LoanType.VEHICLE_LOAN;
    private List<Integer> instalmentOptions;
    private VehicleStatuType vehicleStatuType;

    public List<Integer> getInstalmentOptions() {
        return instalmentOptions;
    }

    public void setInstalmentOptions(List<Integer> instalmentOptions) {
        this.instalmentOptions = instalmentOptions;
    }

    public VehicleStatuType getVehicleStatuType() {
        return vehicleStatuType;
    }

    public void setVehicleStatuType(VehicleStatuType vehicleStatuType) {
        this.vehicleStatuType = vehicleStatuType;
    }

    public LoanType getVehicleLoan() {
        return vehicleLoan;
    }

    public void setVehicleLoan(LoanType vehicleLoan) {
        this.vehicleLoan = vehicleLoan;
    }
}
