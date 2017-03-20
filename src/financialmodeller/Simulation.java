package financialmodeller;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

public class Simulation {
    
    UpdateBox status;
    Account acc;
    JLabel balanceText;
    Timer timer_ = new Timer();

    
    public Simulation(Account acc_, UpdateBox area_, JLabel balanceText_) {
        status = area_;
        acc = acc_;
        balanceText = balanceText_;

        if (acc.getType() == "CurrentAccount") {
            currentSim();
        } else if (acc.getType() == "SavingsAccount") {
            savingsSim();
        }

    }
    
    private void currentSim() {
        
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        status.update("Current Account Simulation Starting");

        class AccountTimer extends TimerTask {

            @Override
            public void run() {

                
                Random rn = new Random();
                int randomNo = rn.nextInt(2);
                if (randomNo == 0) {
                    int randomValue = rn.nextInt(1901) + 100;
                    status.update("Account Crediting: £" + randomValue);
                    if (randomValue >= 500) {
                        status.update("£10 Bonus Added");
                    }
                    acc.accountCredit(Double.parseDouble(Integer.toString(randomValue)));

                } else {
                    int randomValue = rn.nextInt(1901) + 100;

                    if (randomValue > acc.getBalance() + acc.getOverdraft()) {
                        status.update("Insufficent Funds (Attempted to Debit: £" + randomValue+")");
                    } else {
                        status.update("Account Debiting: £" + randomValue);
                        acc.accountDebit(Double.parseDouble(Integer.toString(randomValue)));
                    }  

                }
                balanceText.setText("£" + df.format(acc.getBalance())); 
            }

        }

        timer_.schedule(new AccountTimer(), 0, 5000);   

    }
    
    private void savingsSim(){
        
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        status.update("Savings Account Simulation Starting");
        
        class AccountTimer extends TimerTask {
            
            int monthCount = 0;
            int withdrawlCount = 0;
            
            @Override
            public void run() { 
                Double interest = acc.getBalance()*0.03;
                
                interest=Double.parseDouble(df.format(interest));
                
                status.update("Crediting 3% Interest: £"+interest);
                acc.accountCredit(interest);
               
                Random rn = new Random();
                int randomNo = rn.nextInt(2);
                
                if(monthCount < 12){
                
                if (randomNo == 0) {
                    int randomValue = rn.nextInt(1901) + 100;
                    status.update("Account Crediting: £" + randomValue);
                    acc.accountCredit(Double.parseDouble(Integer.toString(randomValue)));

                }
                else 
                {
                    int randomValue = rn.nextInt(1901) + 100;
                    
                        if(withdrawlCount < 2){
                            if(randomValue < acc.getBalance() + acc.getOverdraft()){
                                    status.update("Account Debiting: £" + randomValue);
                                    acc.accountDebit(Double.parseDouble(Integer.toString(randomValue)));
                                    withdrawlCount++;
                            
                            }else{
                                    status.update("Insufficent Funds (Attempted to Debit: £" + randomValue+")");                            
                            }
                        }else{
                            status.update("You cannot withdraw again in this 12 month period!");                            
                        }

                    }
                        
                }else{
                        status.update("HAPPY NEW YEAR!");
                        monthCount = 0;
                        withdrawlCount = 0;
                }
            monthCount++;
            System.out.println("Month Count: "+monthCount);
            System.out.println("Withdrawl Count: "+withdrawlCount);
            balanceText.setText("£" + df.format(acc.getBalance())); 
            }
            
        }
        
        timer_.schedule(new AccountTimer(),0, 5000);
        
    }
    
    public void stopSim() {
        timer_.cancel();
        status.update("Simulation Stopped!");
    }
    
}
