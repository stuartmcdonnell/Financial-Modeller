package financialmodeller;

public abstract class Account{
    
    public Account(){};
    
    public abstract boolean accountCredit(Double amount);
    
    public abstract boolean accountDebit(Double amount);
    
    public abstract Double getMinBalance();
    
    public abstract void createAccount(Double balance_);
    
    public abstract Double getBalance();
    
    public abstract String getType();
    
    public abstract Double getOverdraft();
}
