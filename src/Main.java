import enums.ApplicationStatus;
import enums.LoanType;
import enums.SectorType;
import model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ipek", "Cil", "ipek@gmail.com", "ppp1", "5397868622", true);
        User user2 = new User("Onur", "Cil", "onur@gmail.com", "ppp2", "5397868623", true);
        User user3 = new User("Seher", "Cil", "seher@gmail.com", "ppp3", "5397868624", true);
        User user4 = new User("Arlo", "Cil", "arlo@gmail.com", "ppp4", "5397868625", true);


        Bank bank1 = new Bank();
        bank1.setName("FinansBank");
        Bank bank2 = new Bank();
        bank2.setName("GarantiBank");
        Bank bank3 = new Bank();
        bank3.setName("AkBank");

        ConsumerLoan consumerLoan1 = new ConsumerLoan(new BigDecimal("20000"), 10, 3.21, LoanType.CONSUMER_LOAN);
        consumerLoan1.setBank(bank1);
        ConsumerLoan consumerLoan2 = new ConsumerLoan(new BigDecimal("30000"), 16, 2.89, LoanType.CONSUMER_LOAN);
        consumerLoan2.setBank(bank1);
        ConsumerLoan consumerLoan3 = new ConsumerLoan(new BigDecimal("20000"), 8, 3.05, LoanType.CONSUMER_LOAN);
        consumerLoan3.setBank(bank2);
        ConsumerLoan consumerLoan4 = new ConsumerLoan(new BigDecimal("30000"), 18, 3.21, LoanType.CONSUMER_LOAN);
        consumerLoan4.setBank(bank2);
        ConsumerLoan consumerLoan5 = new ConsumerLoan(new BigDecimal("20000"), 12, 2.89, LoanType.CONSUMER_LOAN);
        consumerLoan5.setBank(bank3);
        ConsumerLoan consumerLoan6 = new ConsumerLoan(new BigDecimal("30000"), 24, 3.05, LoanType.CONSUMER_LOAN);
        consumerLoan6.setBank(bank3);


        HouseLoan houseLoan1 = new HouseLoan(new BigDecimal("800000"), 96, 2.04, LoanType.HOUSE_LOAN);
        houseLoan1.setBank(bank1);
        HouseLoan houseLoan2 = new HouseLoan(new BigDecimal("1000000"), 120, 1.99, LoanType.HOUSE_LOAN);
        houseLoan2.setBank(bank1);
        HouseLoan houseLoan3 = new HouseLoan(new BigDecimal("800000"), 120, 1.99, LoanType.HOUSE_LOAN);
        houseLoan3.setBank(bank2);
        HouseLoan houseLoan4 = new HouseLoan(new BigDecimal("1000000"), 180, 1.76, LoanType.HOUSE_LOAN);
        houseLoan4.setBank(bank2);
        HouseLoan houseLoan5 = new HouseLoan(new BigDecimal("800000"), 120, 2.01, LoanType.HOUSE_LOAN);
        houseLoan5.setBank(bank3);
        HouseLoan houseLoan6 = new HouseLoan(new BigDecimal("1000000"), 180, 1.98, LoanType.HOUSE_LOAN);
        houseLoan6.setBank(bank3);

       /* List<ConsumerLoan> bank1ConsumerLoanList = new ArrayList<>();
        bank1ConsumerLoanList.add(consumerLoan1);
        bank1ConsumerLoanList.add(consumerLoan2);
        List<ConsumerLoan> bank2ConsumerLoanList = List.of(consumerLoan3, consumerLoan4);
        List<ConsumerLoan> bank3ConsumerLoanList = List.of(consumerLoan5, consumerLoan6);

        List<HouseLoan> bank1HouseLoanList = List.of(houseLoan1, houseLoan2);
        List<HouseLoan> bank2HouseLoanList = List.of(houseLoan3, houseLoan4);
        List<HouseLoan> bank3HouseLoanList = List.of(houseLoan5, houseLoan6);

        List<List<Loan>> bank1AllLoans = new ArrayList<>();
        List<List<Loan>> bank2AllLoans = new ArrayList<>();
        List<List<Loan>> bank3AllLoans = new ArrayList<>();*/

        /*bank1AllLoans.add(bank1HouseLoanList);
        bank1AllLoans.add(bank1ConsumerLoanList);
        bank2AllLoans.add(bank2HouseLoanList);
        bank2AllLoans.add(bank2ConsumerLoanList);
        bank3AllLoans.add(bank3HouseLoanList);
        bank3AllLoans.add(bank3ConsumerLoanList);*/

        /*bank1.setBankLoans(bank1AllLoans);
        bank2.setBankLoans(bank2AllLoans);
        bank3.setBankLoans(bank3AllLoans);*/

        CreditCard creditCard1 = new CreditCard("Bonus", new BigDecimal("150"));
        creditCard1.setBank(bank2);
        CreditCard creditCard2 = new CreditCard("Bonus Teen", new BigDecimal("0"));
        creditCard2.setBank(bank2);
        CreditCard creditCard3 = new CreditCard("CardFinans", new BigDecimal("100"));
        creditCard3.setBank(bank1);
        CreditCard creditCard4 = new CreditCard("CardFinans Trendyol", new BigDecimal("0"));
        creditCard4.setBank(bank1);
        CreditCard creditCard5 = new CreditCard("Axess", new BigDecimal("0"));
        creditCard5.setBank(bank3);
        CreditCard creditCard6 = new CreditCard("Axess Retired", new BigDecimal("100"));
        creditCard6.setBank(bank3);

        List<CreditCard> bank1CreditCards = List.of(creditCard3, creditCard4);
        List<CreditCard> bank2CreditCards = List.of(creditCard1, creditCard2);
        List<CreditCard> bank3CreditCards = List.of(creditCard5, creditCard6);

        bank1.setBankCreditCard(bank1CreditCards);
        bank2.setBankCreditCard(bank2CreditCards);
        bank3.setBankCreditCard(bank3CreditCards);

        Campaign campaign1 = new Campaign("Bonus BigCampaign", "+5 installments possible", LocalDate.of(2024, 8, 30), SectorType.MARKET);
        campaign1.setCreditCard(creditCard1);
        Campaign campaign2 = new Campaign("BonusTeen BigCampaign", "+5 installments possible and fee-free", LocalDate.of(2024, 8, 30), SectorType.MARKET);
        campaign2.setCreditCard(creditCard2);
        Campaign campaign3 = new Campaign("CardFinans Campaign", "+3 installments possible for hotel reservations for vacations", LocalDate.of(2024, 6, 15), SectorType.TRAVELS);
        campaign3.setCreditCard(creditCard3);
        Campaign campaign4 = new Campaign("CardFinans BigCampaign for Trendyol ", "Up to +5 installments without interest", LocalDate.of(2024, 5, 30), SectorType.OTHERS);
        campaign4.setCreditCard(creditCard4);
        Campaign campaign5 = new Campaign("Axess Campaign", "Fee-free and cash advance opportunity", LocalDate.of(2024, 8, 30), SectorType.MARKET);
        campaign5.setCreditCard(creditCard5);
        Campaign campaign6 = new Campaign("Axess Campaign for Retirees", "Interest-free cash advance", LocalDate.of(2024, 12, 30), SectorType.MARKET);
        campaign6.setCreditCard(creditCard6);

        /*creditCard1.setCampaign(campaign1);
        creditCard2.setCampaign(campaign2);
        creditCard3.setCampaign(campaign3);
        creditCard4.setCampaign(campaign4);
        creditCard5.setCampaign(campaign5);
        creditCard6.setCampaign(campaign6);*/

        Application application1 = new Application(user1, LocalDateTime.now(), ApplicationStatus.INITIAL, consumerLoan1);
        Application application2 = new Application(user1, LocalDateTime.now(), ApplicationStatus.INITIAL, creditCard4);
        Application application3 = new Application(user2, LocalDateTime.now(), ApplicationStatus.INITIAL, consumerLoan4);
        Application application4 = new Application(user3, LocalDateTime.now(), ApplicationStatus.INITIAL, houseLoan3);
        Application application5 = new Application(user3, LocalDateTime.now(), ApplicationStatus.INITIAL, creditCard6);
        Application application6 = new Application(user2, LocalDateTime.now(), ApplicationStatus.INITIAL, creditCard1);
        Application application7 = new Application(user2, LocalDateTime.now(), ApplicationStatus.INITIAL, creditCard5);

        /*List<Application> user1Applications = List.of(application1, application2);
        List<Application> user2Applications = List.of(application3, application6, application7);
        List<Application> user3Applications = List.of(application4, application5);

        user1.setApplicationList(user1Applications);
        user2.setApplicationList(user2Applications);
        user3.setApplicationList(user3Applications);*/






        /*bankLoanList.forEach(loan -> {
            System.out.println(loan.getBank().getName()+ " -> " + loan.getInterestRate().toString());
        });*/


    }
}

