package financialmodeller;

/**
 *
 * @author Stuart
 */
public class SavingsAccount extends Account{
    
    private Double balance;
    public final Double minBalance = 100.00;
    private final Double overdraft = -100.00;
    private final Double interest = 3.0;
    private int monthCount;
    private int withdrawCount;


    @Override
    public boolean accountCredit(Double amount) {
        this.balance += amount;
        if(amount >= 500){
            this.balance +=10;
        }
        return true;
    }

    @Override
    public boolean accountDebit(Double amount) {
        if(amount <= balance+overdraft){
            this.balance -= amount;
            return true;
        }else{
            return false;
        }

    }

    @Override
    public Double getMinBalance() {
        return this.minBalance;
    }

    @Override
    public void createAccount(Double balance_) {
            this.balance = balance_;  
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }

    @Override
    public String getType() {
        return "SavingsAccount";
    }

    @Override
    public Double getOverdraft() {
        return this.overdraft;
    }
    
    
}//END
