import enums.ApplicationStatus;
import enums.LoanType;
import enums.SectorType;
import enums.VehicleStatusType;
import factory.ConcreteLoanFactory;
import factory.CreditCardFactory;
import factory.LoanFactory;
import model.*;
import service.UserServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        User user1 = new User("Ipek", "Cil", "ipek@gmail.com", "ppp1", "5397868622", true);

        User user2 = new User("Onur", "Cil", "onur@gmail.com", "ppp2", "5397868623", true);

        User user3 = new User("Cem", "Dırman", "cemdrman@gmail.com", "ppp3", "5397868624", true);

        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);

        System.out.println("------------------------------------------------------------------------------------------------------------");

        BankManager bankManager = BankManager.getInstance();
        Bank finansBank = bankManager.getBank("FinansBank");
        Bank garantiBank = bankManager.getBank("GarantiBank");
        Bank halkBank = bankManager.getBank("HalkBank");

        LoanFactory loanFactory = new ConcreteLoanFactory();
        CreditCardFactory creditCardFactory = new CreditCardFactory();

        Product consumerLoan1 = loanFactory.createLoan(LoanType.CONSUMER_LOAN, "Maaş Müşterilerimize Özel", new BigDecimal("25000"), 24, 4.89, null);
        consumerLoan1.setBank(finansBank);
        Product consumerLoan2 = loanFactory.createLoan(LoanType.CONSUMER_LOAN, "Maaş Müşterilerimize Özel", new BigDecimal("25000"), 24, 4.77, null);
        consumerLoan2.setBank(garantiBank);
        Product consumerLoan3 = loanFactory.createLoan(LoanType.CONSUMER_LOAN, "Maaş Müşterilerimize Özel", new BigDecimal("25000"), 24, 4.81, null);
        consumerLoan3.setBank(halkBank);

        Product houseLoan1 = loanFactory.createLoan(LoanType.HOUSE_LOAN, "İlk Evim Kredisi", new BigDecimal("1250000"), 180, 3.34, null);
        houseLoan1.setBank(finansBank);
        Product houseLoan2 = loanFactory.createLoan(LoanType.HOUSE_LOAN, "İlk Evim Kredisi", new BigDecimal("1250000"), 180, 3.61, null);
        houseLoan2.setBank(garantiBank);
        Product houseLoan3 = loanFactory.createLoan(LoanType.HOUSE_LOAN, "İlk Evim Kredisi", new BigDecimal("1250000"), 180, 3.16, null);
        houseLoan3.setBank(halkBank);

        Product vehicleLoan1 = loanFactory.createLoan(LoanType.VEHICLE_LOAN, "Taşıt Kredisi", new BigDecimal("400000"), 12, 4.01, VehicleStatusType.NEW);
        vehicleLoan1.setBank(finansBank);
        Product vehicleLoan2 = loanFactory.createLoan(LoanType.VEHICLE_LOAN, "Taşıt Kredisi", new BigDecimal("400000"), 12, 3.99, VehicleStatusType.NEW);
        vehicleLoan2.setBank(garantiBank);
        Product vehicleLoan3 = loanFactory.createLoan(LoanType.VEHICLE_LOAN, "Taşıt Kredisi", new BigDecimal("400000"), 12, 4.02, VehicleStatusType.NEW);
        vehicleLoan3.setBank(halkBank);

        Product creditCard1 = creditCardFactory.createCreditCard("Basic Credit Card", new BigDecimal("100000"), new BigDecimal("100000"));
        Product creditCard2 = creditCardFactory.createCreditCard("Medium Credit Card", new BigDecimal("100000"), new BigDecimal("140000"));
        Product creditCard3 = creditCardFactory.createCreditCard("Premium Credit Card", new BigDecimal("100000"), new BigDecimal("180000"));

        Campaign campaign1 = new Campaign("Bonus BigCampaign", "+5 installments possible", LocalDate.of(2024, 8, 30), SectorType.MARKET);
        Campaign campaign2 = new Campaign("BonusTeen BigCampaign", "+5 installments possible and fee-free", LocalDate.of(2024, 8, 30), SectorType.MARKET);
        Campaign campaign3 = new Campaign("CardFinans Campaign", "+3 installments possible for hotel reservations", LocalDate.of(2024, 6, 15), SectorType.TRAVELS);
        Campaign campaign4 = new Campaign("CardFinans BigCampaign for Trendyol ", "Up to +5 installments without interest", LocalDate.of(2024, 5, 30), SectorType.OTHERS);
        Campaign campaign5 = new Campaign("CardFinance Campaign", "Fee-free and cash advance opportunity", LocalDate.of(2024, 8, 30), SectorType.MARKET);
        Campaign campaign6 = new Campaign("Paraf Campaign for Retirees", "Interest-free cash advance", LocalDate.of(2024, 12, 30), SectorType.MARKET);
        Campaign campaign7 = new Campaign("Paraf Card Campaign", "Fee-free cash advance", LocalDate.of(2024, 12, 30), SectorType.OTHERS);
        Campaign campaign8 = new Campaign("Bonus Card Campaign", "15% discount on cinema tickets", LocalDate.of(2024, 11, 30), SectorType.OTHERS);

        campaign1.setCreditCards(List.of(creditCard3));
        campaign2.setCreditCards(List.of(creditCard3));
        campaign3.setCreditCards(List.of(creditCard1));
        campaign4.setCreditCards(List.of(creditCard1, creditCard2));
        campaign5.setCreditCards(List.of(creditCard2, creditCard3));
        campaign6.setCreditCards(List.of(creditCard1, creditCard3));
        campaign7.setCreditCards(List.of(creditCard1, creditCard2, creditCard3));


        List<Campaign> allCampaigns = List.of(campaign1, campaign2, campaign3, campaign4, campaign5, campaign6, campaign7, campaign8);

        creditCard1.setBank(finansBank);
        creditCard2.setBank(halkBank);
        creditCard3.setBank(garantiBank);

        Application application1 = new Application(user1, LocalDateTime.of(2023, 12, 20, 13, 40), ApplicationStatus.INITIAL, creditCard3);
        Application application2 = new Application(user1, LocalDateTime.of(2024, 2, 25, 16, 45), ApplicationStatus.INITIAL, houseLoan2);
        Application application3 = new Application(user2, LocalDateTime.of(2024, 2, 15, 17, 55), ApplicationStatus.INITIAL, consumerLoan2);
        Application application4 = new Application(user3, LocalDateTime.of(2024, 3, 1, 22, 34), ApplicationStatus.INITIAL, houseLoan3);
        Application application5 = new Application(user3, LocalDateTime.of(2024, 3, 9, 21, 21), ApplicationStatus.INITIAL, houseLoan1);
        Application application6 = new Application(user2, LocalDateTime.of(2023, 12, 13, 13, 14), ApplicationStatus.INITIAL, vehicleLoan1);
        Application application7 = new Application(user2, LocalDateTime.of(2024, 1, 3, 12, 30), ApplicationStatus.INITIAL, creditCard1);

        List<Application> userApplications = List.of(application1, application2, application3, application4, application5, application6, application7);
        User mostApplicantUser = getMostApplicationUser(userApplications);

        System.out.println("Name of the user who has most application count: " + mostApplicantUser.getName());
        System.out.println("------------------------------------------------------------------------------------------------------------");

        Map<User, BigDecimal> usersAndLoanApplicationsMap = getUsersAndLoanApplications(userApplications);
        Map<User, BigDecimal> maxLoanApplicationAndUserMap = getUserWithMaxLoanApplication(usersAndLoanApplicationsMap);
        maxLoanApplicationAndUserMap.forEach((key, value) -> System.out.println("Name of the user has max amount loan application is : " + key.getName() + " , and loan application amount is: " + value));
        System.out.println("------------------------------------------------------------------------------------------------------------");

        List<Application> lastMonthApplications = getLastMonthApplications(userApplications);
        System.out.println("Applications within the last 1 month");

        for (Application application : lastMonthApplications) {
            System.out.println("User: " + application.getUser().getName() +
                    ", Date: " + application.getLocalDateTime() +
                    ", Status: " + application.getApplicationStatus() +
                    ", Product: " + application.getProduct().getLoanType() +
                    ", Bank:" + application.getProduct().getBank().getName());
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");

        List<String> sortedCreditCards = sortCreditCardsByCampaignCount(allCampaigns);
        System.out.println("Credit Cards and Campaign counts:");
        for (String creditCard : sortedCreditCards) {
            System.out.println(creditCard);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Applications of the user who has given email");

        List<Application> applicationOfGivenUser = getApplicationsOfUserByEmail("cemdrman@gmail.com", userApplications);
        for (Application application : applicationOfGivenUser) {
            if (!application.getProduct().getLoanType().equals(LoanType.CREDIT_CARD)) {
                System.out.println("Date: " + application.getLocalDateTime() +
                        ", Status: " + application.getApplicationStatus() +
                        ", Product: " + application.getProduct().getLoanType());
            } else {
                System.out.println("Date: " + application.getLocalDateTime() +
                        ", Status: " + application.getApplicationStatus() +
                        ", Product: " + application.getProduct().getName());
            }

        }
    }

    //  Question 3: Method to find user who has most application count
    private static User getMostApplicationUser(List<Application> allApplications) {
        Map<User, Integer> applicationCountMap = new HashMap<>();

        for (Application application : allApplications) {
            User user = application.getUser();
            applicationCountMap.put(user, applicationCountMap.getOrDefault(user, 0) + 1);
        }

        User mostApplicationUser = null;
        int maxApplications = 0;

        for (Map.Entry<User, Integer> entry : applicationCountMap.entrySet()) {
            if (entry.getValue() > maxApplications) {
                maxApplications = entry.getValue();
                mostApplicationUser = entry.getKey();
            }
        }

        return mostApplicationUser;

    }

    //Question4
    private static Map<User, BigDecimal> getUsersAndLoanApplications(List<Application> allApplications) {
        Map<User, BigDecimal> loanAmountAndUserMap = new HashMap<>();
        List<Application> filteredList = allApplications.stream().filter(f -> !f.getProduct().getLoanType().equals(LoanType.CREDIT_CARD)).toList();
        for (Application application : filteredList) {
            User user = application.getUser();
            Product product = application.getProduct();
            loanAmountAndUserMap.put(user, product.getAmount());
        }
        return loanAmountAndUserMap;
    }

    private static Map<User, BigDecimal> getUserWithMaxLoanApplication(Map<User, BigDecimal> usersAndLoans) {
        User userWithMaxAmountLoanDemand = null;
        BigDecimal highestLoanAmount = BigDecimal.ZERO;
        Map<User, BigDecimal> userWithMaxAmountLoanDemandMap = new HashMap<>();
        for (Map.Entry<User, BigDecimal> entry : usersAndLoans.entrySet()) {
            if (entry.getValue().compareTo(highestLoanAmount) > 0) {
                highestLoanAmount = entry.getValue();
                userWithMaxAmountLoanDemand = entry.getKey();
            }
        }
        userWithMaxAmountLoanDemandMap.put(userWithMaxAmountLoanDemand, highestLoanAmount);
        return userWithMaxAmountLoanDemandMap;

    }

    //Question5
    private static List<Application> getLastMonthApplications(List<Application> allApplications) {
        LocalDateTime oneMonthAgo = LocalDateTime.now().minusMonths(1);
        List<Application> lastMonthApplications = new ArrayList<>();

        for (Application application : allApplications) {
            if (application.getLocalDateTime().isAfter(oneMonthAgo)) {
                lastMonthApplications.add(application);
            }
        }

        return lastMonthApplications;
    }

    //Question6
    private static List<String> sortCreditCardsByCampaignCount(List<Campaign> allCampaigns) {

        Map<String, Long> creditCardCampaignCount = allCampaigns.stream()
                .filter(campaign -> campaign.getCreditCards() != null)
                .flatMap(campaign -> campaign.getCreditCards().stream().map(creditCard -> Map.entry(creditCard.getName(), campaign)))
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.counting()));

        return creditCardCampaignCount.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .map(entry -> entry.getKey() + " - Campaign count " + entry.getValue())
                .collect(Collectors.toList());
    }

    //Question7
    private static List<Application> getApplicationsOfUserByEmail(String email, List<Application> allApplications) {
        List<Application> applicationsOfUserList = new ArrayList<>();
        for (Application application : allApplications) {
            if (email.equals(application.getUser().getEmail())) {
                applicationsOfUserList.add(application);
            }
        }
        return applicationsOfUserList;
    }
}






