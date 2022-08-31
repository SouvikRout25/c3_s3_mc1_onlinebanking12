package account;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountHolderName("Daniel Powell");
        savingsAccount.setAccountNumber(254789654778L);
        savingsAccount.setAccountOpeningDate("16/08/2022");
        savingsAccount.setAccountStatus("Active");
        savingsAccount.setAvailableBalance(3000);
        savingsAccount.setTotalBalance(3000);
        savingsAccount.setInternetAndMobileBankingEnabled(true);
        savingsAccount.setInterestRate(5.25);
        savingsAccount.setModeOfOperation("Self-Operated");

        System.out.println("Account Holder Name is :" + savingsAccount.getAccountHolderName());
        System.out.println("Account number is :" + savingsAccount.getAccountNumber());
        System.out.println("Account Opening Date is :"+ savingsAccount.getAccountOpeningDate());
        System.out.println("Account Status is :"+ savingsAccount.getAccountStatus());
        System.out.println("Available balance in the account is : $"+ savingsAccount.getAvailableBalance());
        System.out.println("Total balance in the account is : $"+ savingsAccount.getTotalBalance());
        System.out.println("Is Internet and Mobile Banking Enabled :"+ savingsAccount.getInternetAndMobileBankingEnabled());
        System.out.println("Interest Rate is :" + savingsAccount.getInterestRate() +"%");
        System.out.println("Mode of Operation is :" + savingsAccount.getModeOfOperation());

        System.out.println("Account Balance on retrieving is : $"+savingsAccount.retrieveBalance());

        System.out.println("Account balance after credit cash is : $"+savingsAccount.creditCash(500));

        System.out.println("Account balance after debit cash is : $"+savingsAccount.debitCash(300));
    }
}
