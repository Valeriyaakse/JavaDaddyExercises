package mentorship.roadmap.Java_Core.step4_OOP.topic6_BankAccount;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("testPerson", 10000.0);
        bankAccount.withdraw(3000.0);
        bankAccount.deposit(5000.0);
        System.out.println(bankAccount.getBalance());


    }
}
