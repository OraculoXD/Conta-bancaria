
/**
 * Escreva uma descrição da classe BankAccount aqui.
 * 
 * @author Gabriel Almeida
 * @version 2022-06-17
 */
public class BankAccount
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double balance;

    /**
     * Constroi uma conta bancaria com saldo zero.
     */
    public BankAccount()
    {
        this.balance = 0.0;
    }
    
    /**
    * Constroi  
    
    public BankAccount(double amount) {
        
    }
    /**
     * Obtem o saldo atual na conta bancaria.
     * @return o saldo atual da conta bancaria
     */
    public void deposit(double amount) {
        if (amount <= 0.0 ) {
            throw new IllegalArgumentException("O valor a depositar deve ser maior do que R$ 00.0");
        }
        this.balance = this.balance + amount;
    }
    
    /**
     * Retira um valor na conta bancaria.
     * @param amount o valor a  retirar
     */
    public void withdraw(double amount) {
        if (amount <= 0.0 ) {
            throw new IllegalArgumentException("O valor a depositar deve ser maior do que R$ 00.0");
        }
        if (this.balance < amount) {
            throw new IllegalArgumentException("SALDO INSUFICIENTE! (withdraw)");
        }
        this.balance = this.balance + amount;
    }
    
    public void withdraw(BankAccount toAccount,double amount) {
        if (toAccount == null) {
            throw new IllegalArgumentException("O valor");
        }
        if (amount <= 0.0 ) {
            throw new IllegalArgumentException("O valor a retirar deve ser maior do que R$ 00.0");
        }
        if (this.balance < amount) {
            throw new IllegalArgumentException("SALDO INSUFICIENTE! (transferto)"); 
        }
        this.withdraw(amount);
        toAccount.deposit(amount);
        
}