package financialmodeller;

import javax.swing.text.DefaultCaret;

public class Display extends javax.swing.JFrame {

    Account MainAccount;
    Account CurrentAccount_ = new CurrentAccount();
    Account SavingsAccount_ = new SavingsAccount();
    
    public Display() {
        initComponents();
        DefaultCaret caret = (DefaultCaret)statusBox.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ControlPanel = new javax.swing.JPanel();
        createAccountBtn = new javax.swing.JButton();
        accountSelection = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        startSimulationBtn = new javax.swing.JButton();
        stopSimulationBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        initialBalance = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        balanceDisplay = new javax.swing.JLabel();
        DrawingPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        statusBox = new financialmodeller.UpdateBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Financial Modeller");
        setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        setLocation(new java.awt.Point(500, 500));
        setResizable(false);

        ControlPanel.setBackground(new java.awt.Color(51, 51, 51));

        createAccountBtn.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        createAccountBtn.setText("Create Account");
        createAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountBtnActionPerformed(evt);
            }
        });

        accountSelection.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        accountSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Current Account", "Savings Account" }));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Account Type");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Initial Balance   (£)");

        startSimulationBtn.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        startSimulationBtn.setText("Start Simuation");
        startSimulationBtn.setEnabled(false);
        startSimulationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startSimulationBtnActionPerformed(evt);
            }
        });

        stopSimulationBtn.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        stopSimulationBtn.setText("Stop Simulation");
        stopSimulationBtn.setEnabled(false);
        stopSimulationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopSimulationBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Control Panel");

        initialBalance.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        initialBalance.setText("0.00");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Balance:");

        balanceDisplay.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        balanceDisplay.setForeground(new java.awt.Color(255, 255, 255));
        balanceDisplay.setText("£0.00");

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(balanceDisplay))
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addComponent(createAccountBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startSimulationBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stopSimulationBtn))
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(accountSelection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(initialBalance))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(initialBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAccountBtn)
                    .addComponent(startSimulationBtn)
                    .addComponent(stopSimulationBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(balanceDisplay))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("Initial Balance  (£)");

        DrawingPanel.setBackground(new java.awt.Color(153, 153, 153));

        statusBox.setBackground(new java.awt.Color(51, 51, 51));
        statusBox.setColumns(20);
        statusBox.setForeground(new java.awt.Color(51, 255, 0));
        statusBox.setRows(5);
        statusBox.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(statusBox);

        javax.swing.GroupLayout DrawingPanelLayout = new javax.swing.GroupLayout(DrawingPanel);
        DrawingPanel.setLayout(DrawingPanelLayout);
        DrawingPanelLayout.setHorizontalGroup(
            DrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        DrawingPanelLayout.setVerticalGroup(
            DrawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrawingPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DrawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DrawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    public void run() {
        new Display().setVisible(true);
    }
    
    private void createAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountBtnActionPerformed

        Double balanceIn = Double.parseDouble(this.initialBalance.getText());
        int selectedIndex = this.accountSelection.getSelectedIndex();
       
        switch(selectedIndex){
            case 0:
                if(CurrentAccount_.getMinBalance() <= balanceIn){
                    
                    MainAccount = new CurrentAccount();
                    
                    createAccountBtn.setEnabled(false);
                    MainAccount.createAccount(balanceIn);
                    balanceDispUpdate(MainAccount.getBalance());
                    update("Current Account Created with a balance of £"+Double.toString(balanceIn));
                    this.startSimulationBtn.setEnabled(true);
                    }else{
                    update("Minimum Balance not Met. Minimum Balance: £"+Double.toString(CurrentAccount_.getMinBalance()));
                }
            break;
            case 1:
                if(SavingsAccount_.getMinBalance() <= balanceIn){
                    
                    MainAccount = new SavingsAccount();
                    
                    createAccountBtn.setEnabled(false);
                    MainAccount.createAccount(balanceIn);
                    balanceDispUpdate(MainAccount.getBalance());
                    update("Savings Account Created with a balance of £"+Double.toString(balanceIn));
                    this.startSimulationBtn.setEnabled(true);
                }else{
                    update("Minimum Balance not Met. Minimum Balance: £"+Double.toString(SavingsAccount_.getMinBalance()));
                }
            break;
        }
    }//GEN-LAST:event_createAccountBtnActionPerformed

    Simulation sim;
    
    private void startSimulationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startSimulationBtnActionPerformed
        sim = new Simulation(MainAccount, this.statusBox, this.balanceDisplay);
        startSimulationBtn.setEnabled(false);
        stopSimulationBtn.setEnabled(true);
    }//GEN-LAST:event_startSimulationBtnActionPerformed

    private void stopSimulationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopSimulationBtnActionPerformed
        sim.stopSim();
        startSimulationBtn.setEnabled(true);
        stopSimulationBtn.setEnabled(false);
    }//GEN-LAST:event_stopSimulationBtnActionPerformed

    public void update(String message){
        statusBox.append("\n..."+message);
    }
    
    private void balanceDispUpdate(Double balance){
        balanceDisplay.setText("£"+Double.toString(MainAccount.getBalance()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JPanel DrawingPanel;
    private javax.swing.JComboBox accountSelection;
    private javax.swing.JLabel balanceDisplay;
    private javax.swing.JButton createAccountBtn;
    private javax.swing.JFormattedTextField initialBalance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton startSimulationBtn;
    private financialmodeller.UpdateBox statusBox;
    private javax.swing.JButton stopSimulationBtn;
    // End of variables declaration//GEN-END:variables
}
