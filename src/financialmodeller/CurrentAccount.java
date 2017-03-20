package financialmodeller;

/**
 *
 * @author Stuart
 */
public class CurrentAccount extends Account{
    
    private Double balance;
    public final Double minBalance = 1.00;
    public final Double overdraft = 200.00;
    private int accountAge;


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
        return "CurrentAccount";
    }

    @Override
    public Double getOverdraft() {
        return this.overdraft;
    }
    
}//END
