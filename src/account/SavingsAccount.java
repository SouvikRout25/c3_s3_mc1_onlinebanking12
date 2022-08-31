package account;

public class SavingsAccount {
    private String accountHolderName;
    private long accountNumber;
    private String accountOpeningDate;
    private String accountStatus;
    private double availableBalance;
    private double totalBalance;
    private boolean internetAndMobileBankingEnabled;
    private double interestRate;
    private String modeOfOperation;

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
    public void setInternetAndMobileBankingEnabled(boolean internetAndMobileBankingEnabled) {
        this.internetAndMobileBankingEnabled = internetAndMobileBankingEnabled;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }
    public String getAccountStatus() {
        return accountStatus;
    }
    public double getAvailableBalance() {
        return availableBalance;
    }
    public double getTotalBalance() {
        return totalBalance;
    }
    public boolean getInternetAndMobileBankingEnabled() {
        return internetAndMobileBankingEnabled;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public double retrieveBalance(){
        return getAvailableBalance();
    }
    public double creditCash(double amount){
        availableBalance = availableBalance + amount;
        return availableBalance;
    }
    public double debitCash(double amount){
        return availableBalance - amount;
    }
}
