package model;

import java.util.HashMap;
import java.util.Map;

public class BankManager {
    private static BankManager instance;
    private Map<String, Bank> banks;

    private BankManager() {
        this.banks = new HashMap<>();
    }

    public static BankManager getInstance() {
        if (instance == null) {
            instance = new BankManager();
        }
        return instance;
    }

    public Bank getBank(String bankName) {
        return banks.computeIfAbsent(bankName, Bank::new);
    }
}
