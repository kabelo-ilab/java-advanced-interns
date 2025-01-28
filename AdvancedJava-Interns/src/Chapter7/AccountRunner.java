package Chapter7;

public class AccountRunner {
    public static void main(String[] args) {
        Account objAccount = new Account("David","100123456",
                BankAccountType.Credit,"005200");

        Account objAccount1 = new Account("David","2296123456",
                BankAccountType.Savings,"005200");

        objAccount.transfer(objAccount1,500);
        objAccount.display();
        System.out.println("====================");
        objAccount1.display();
    }
}
