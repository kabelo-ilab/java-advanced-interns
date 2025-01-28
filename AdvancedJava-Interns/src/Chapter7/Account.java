package Chapter7;
/**
 * Class to hold attributes and functions related to bank account
 */
enum BankAccountType{
    Savings, Cheque, Loan, Credit
}
public class Account {
    private String accountNo, accountHolder,
    branchCode, bankName;
    private double balance;
    private BankAccountType accountType;
    /**
     * Constructor to create a bank account object with initial values
     * @param accountHolder Account holder's name
     * @param accountNum Account Number
     * @param accountType Bank Account Type
     * @param branchCode Account Branch code
     */
    public Account(String accountHolder, String accountNum,
                   BankAccountType accountType, String branchCode){
        this.accountHolder = accountHolder;
        this.accountNo = accountNum;
        this.accountType = accountType;
        this.branchCode = branchCode;
        this.bankName = "ABC Bank";
        setInitialBalance(accountType);
    }

    /**
     * Change the account number
     * @param accountNo New Account Number
     */
    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    /**
     * Get account number
     * @return the current account number
     */
    public String getAccountNo(){return this.accountNo;}

    /**
     * Get Account Holder's name
     * @return Account Holder's name
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Change the Account Holder's name
     * @param accountHolder new account holder's name
     */
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    /**
     * Get branch code
     * @return Current branch code
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Change branch code
     * @param branchCode New branch code
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
    /**
     * Get balance
     * @return Current balance
     */
    public double getBalance() {
        return balance;
    }
    /**
     * Change the balance
     * @param balance New balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * Get Account Type
     * @return The Current Account Type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
    /**
     * Change the account type
     * @param accountType The new account type
     */
    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }
    /**
     * Method to facilitate the withdrawal functionality
     * @param amount Amount to be withdrawn from the account
     */
    public void withdrawal(double amount){
        this.balance -= amount;
    }
    /**
     * Method to facilitate the deposit functionality
     * @param amount Amount to be deposited into the account
     */
    public void deposit(double amount){
        this.balance += amount;
    }
    /**
     * Set initial balance based on the account type
     * @param accountType Bank Account Type
     */
    public void setInitialBalance(BankAccountType accountType){
        if (accountType == BankAccountType.Loan){
            setBalance(25000);
        } else if (accountType == BankAccountType.Cheque) {
            setBalance(0);
        } else if (accountType == BankAccountType.Savings) {
            setBalance(0);
        } else if (accountType == BankAccountType.Credit) {
           setBalance(7500);
        }
    }

    /**
     * Method to facilitate the transfer functionality between bank accounts
     * @param account Target bank account
     * @param amount Amount to be withdrawn from the current bank
     *              account and deposited into the target bank account
     */
    public void transfer(Account account, double amount){
        this.withdrawal(amount);
        account.deposit(amount);
    }
    /**
     * Display Bank Account Information
     */
    public void display(){
        System.out.println("===== " + this.bankName + " =====");
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Number: " + this.accountNo);
        System.out.println("Account Type: " + this.accountType.name());
        System.out.println("Balance: " + this.balance);
        System.out.println("Branch Code: " + this.branchCode);
    }


}
