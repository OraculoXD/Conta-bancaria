
public class Main {
    public static void main(String[] args) {
        BankAccount conta1 = new BankAccount();
        BankAccount conta2 = new BankAccount();
        BankAccount conta3 = new BankAccount();
        
        System.out.println(conta1.getBanlance());
        conta1.withdraw(1_000);
        System.out.println(conta1.getBalance());
    }
}