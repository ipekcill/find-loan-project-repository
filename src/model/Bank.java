package model;

public class Bank {   //Singleton design pattern
    private static Bank instance;
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public static Bank getInstance(String bankName) {
        if (instance == null) {
            instance = new Bank(bankName);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }
}
