package financialmodeller;

/**
 *
 * @author Stuart
 */
public class FinancialModeller {

    Display display_ = new Display();
    
    public static void main(String[] args) {
        FinancialModeller fModel = new FinancialModeller();
        fModel.start();    
    }
    
    private void start(){
        display_.run();
    }
}
