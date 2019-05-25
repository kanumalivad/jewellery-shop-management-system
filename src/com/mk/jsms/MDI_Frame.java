package com.mk.jsms;
import java.awt.event.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
public class MDI_Frame extends javax.swing.JFrame implements MouseListener
{  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblhome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblstock = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lblbill = new javax.swing.JLabel();
        lblcash = new javax.swing.JLabel();
        lblcustomer = new javax.swing.JLabel();
        lblorder = new javax.swing.JLabel();
        lblsearch = new javax.swing.JLabel();
        lbllabel = new javax.swing.JLabel();
        lblhelp = new javax.swing.JLabel();
        stock = new javax.swing.JLabel();
        bill = new javax.swing.JLabel();
        cash = new javax.swing.JLabel();
        customer = new javax.swing.JLabel();
        order = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        txtdate1 = new com.michaelbaranov.microba.calendar.DatePicker();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home_Off.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_icon_small.png"))); // NOI18N

        lblstock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Stock_Off.png"))); // NOI18N

        home.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        home.setText("Home");

        lbldate.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lbldate.setForeground(new java.awt.Color(254, 137, 0));
        lbldate.setText("8 Sep,2016");

        lblbill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bill_Off.png"))); // NOI18N

        lblcash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Account_Off.png"))); // NOI18N

        lblcustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer_Off.png"))); // NOI18N

        lblorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orders_Off.png"))); // NOI18N

        lblsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search_Off.png"))); // NOI18N

        lbllabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Label_Off.png"))); // NOI18N

        lblhelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Help_Off.png"))); // NOI18N

        stock.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        stock.setText("Stock");

        bill.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        bill.setText("Bill");

        cash.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        cash.setText("Accounts");

        customer.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        customer.setText("Customer");

        order.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        order.setText("Orders");

        search.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        search.setText("Search");

        label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        label.setText("Label");

        help.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        help.setText("Help");

        txtdate1.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(186, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblhome))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstock)
                            .addComponent(stock))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblbill)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(bill)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cash, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblcash)
                                .addGap(10, 10, 10)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblcustomer))
                            .addComponent(customer))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblorder)
                            .addComponent(order))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search)
                            .addComponent(lblsearch))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbllabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(label)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblhelp)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(help)))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(lbldate)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbldate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblcustomer)
                    .addComponent(lblhelp)
                    .addComponent(lblsearch)
                    .addComponent(lbllabel)
                    .addComponent(lblorder)
                    .addComponent(lblhome)
                    .addComponent(lblstock)
                    .addComponent(lblbill)
                    .addComponent(lblcash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(home)
                    .addComponent(stock)
                    .addComponent(bill)
                    .addComponent(cash)
                    .addComponent(customer)
                    .addComponent(order)
                    .addComponent(search)
                    .addComponent(label)
                    .addComponent(help))
                .addContainerGap())
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 1090, 180);

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel14.setText("Stock");
        desktopPane.add(jLabel14);
        jLabel14.setBounds(0, 0, 42, 19);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bill;
    private javax.swing.JLabel cash;
    private javax.swing.JLabel customer;
    public javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel help;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lblbill;
    private javax.swing.JLabel lblcash;
    private javax.swing.JLabel lblcustomer;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblhelp;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lbllabel;
    private javax.swing.JLabel lblorder;
    private javax.swing.JLabel lblsearch;
    private javax.swing.JLabel lblstock;
    private javax.swing.JLabel order;
    private javax.swing.JLabel search;
    private javax.swing.JLabel stock;
    private com.michaelbaranov.microba.calendar.DatePicker txtdate1;
    // End of variables declaration//GEN-END:variables
   
    // all of following are JPanel which was used in this project, here i defines the objects
    Home_Pane homepen;
    Stock_Pane stockpen;
    Account_Pane accountpen;
    Customer_Pane customerpen;
    Order_Pane orderpen;
    Search_Pane searchpen;
    Help_Pane helppen;
    Label_Pane lblpen;
    
    
    Change_Password_Pane chppen;
    Display_Product_Pane dsppen;
    Add_Product_Pane adppen;
    Edit_Product_Pane edtppen;
    Add_Bill_Pane addbillpen;
    Display_Account_Pane dspaccpen;
    Display_Customers_Pane dspcustpen;
    Add_Customers_Pane addcustpen;
    Display_Order_Pane dspopen;
    Add_Order_Pane adopen;
    Display_Incomplete_Order_Pane dspicomopen;
    Search_Customers_Pane srhcustpen;
    Search_Products_Pane srhproductpen;
    Search_Order_Pane srhorderpen;
    Display_Label_Pane dsplblpen;
    Add_Label_Pane addlblpen;
    About_Pane abtpen;
    ContactMe_Pane contactpen;
    
    public MDI_Frame() 
    {
        //set the MDI_Frame
        initComponents();
        setTitle("Dwarkesh Jewellers"); 
        this.setResizable(false);
        this.setLocation(150,50);
        this.setVisible(false);
        
        //Adding the mouselistener 
        lblhome.addMouseListener(this);
        lblstock.addMouseListener(this);
        lblbill.addMouseListener(this);
        lblcash.addMouseListener(this);        
        lblcustomer.addMouseListener(this);
        lblorder.addMouseListener(this);
        lblsearch.addMouseListener(this);
        lbllabel.addMouseListener(this);
        lblhelp.addMouseListener(this);
        home.addMouseListener(this);
        stock.addMouseListener(this);
        bill.addMouseListener(this);
        cash.addMouseListener(this);
        customer.addMouseListener(this);
        order.addMouseListener(this);
        search.addMouseListener(this);
        label.addMouseListener(this);
        help.addMouseListener(this);
      
        
        // intiliazing the following objects of the JPanel which was declared above
        homepen=new Home_Pane(this);
        stockpen=new Stock_Pane(this);
        accountpen=new Account_Pane(this);
        customerpen=new Customer_Pane(this);
        orderpen=new Order_Pane(this);
        searchpen=new Search_Pane(this);
        helppen=new Help_Pane(this);
        lblpen=new Label_Pane(this);
        
        chppen=new Change_Password_Pane(this); 
        dsppen=new Display_Product_Pane(this);
        adppen=new Add_Product_Pane(this);
        edtppen=new Edit_Product_Pane(this);
        dspaccpen=new Display_Account_Pane(this);
        dspcustpen =new Display_Customers_Pane(this);
        addbillpen=new Add_Bill_Pane(this);
        addcustpen=new Add_Customers_Pane(this);
        dspopen=new Display_Order_Pane(this);
        adopen=new Add_Order_Pane(this);
        dspicomopen=new Display_Incomplete_Order_Pane(this);
        srhcustpen=new Search_Customers_Pane(this);
        srhproductpen=new Search_Products_Pane(this);
        srhorderpen=new Search_Order_Pane(this);
        dsplblpen=new Display_Label_Pane(this);        
        addlblpen=new Add_Label_Pane(this);
        abtpen=new About_Pane();
        contactpen=new ContactMe_Pane();
        
        
  
        // adding the above JPanel in the desktopPane
        desktopPane.add(homepen);
        desktopPane.add(stockpen);
        desktopPane.add(accountpen);
        desktopPane.add(customerpen);
        desktopPane.add(orderpen);
        desktopPane.add(searchpen);
        desktopPane.add(helppen);
        desktopPane.add(lblpen);
        
        desktopPane.add(chppen);
        desktopPane.add(dsppen);
        desktopPane.add(adppen);
        desktopPane.add(edtppen);
        desktopPane.add(dspcustpen);
        desktopPane.add(addcustpen);
        desktopPane.add(dspopen);
        desktopPane.add(adopen);
        desktopPane.add(dspicomopen);
        desktopPane.add(srhcustpen);
        desktopPane.add(srhproductpen);
        desktopPane.add(srhorderpen);
        desktopPane.add(abtpen);
        desktopPane.add(contactpen);
        desktopPane.add(dsplblpen);
        desktopPane.add(addlblpen);
        desktopPane.add(addbillpen);
        desktopPane.add(dspaccpen);
        
        //this is datapicker to display current date
        txtdate1.setVisible(false);
        //set the date format
        SimpleDateFormat sm = new SimpleDateFormat("MMM dd, yyyy");
        lbldate.setText(sm.format(txtdate1.getDate()));
       
        // this function do all the JPanels unvisible
        OffAllPen();
       
        
    } 
    // this function is used to make clickable effect on the Customer icon
    public void checkCustomerIcon()
    {
        Off(); 
        ImageIcon icon= new ImageIcon(getClass().getResource("/images/Customer_On.png"));
        lblcustomer.setIcon(icon);
        customer.setForeground(new Color(254,137,0));
        customerpen.uncheck();
        customerpen.setVisible(true);
    }
     // this function is used to make click effect on the product icon
    public void checkProductIcon()
    {
        homepen.setVisible(false);
        Off();    
        ImageIcon icon= new ImageIcon(getClass().getResource("/images/Stock_On.png"));
        lblstock.setIcon(icon);
        stock.setForeground(new Color(254,137,0));
        stockpen.uncheck();
        stockpen.setVisible(true);
    }
    // this method make unclick effect on the icons
    public void Off()
    {
        addbillpen.clearAll();
       
        ImageIcon hicon= new ImageIcon(getClass().getResource("/images/Home_Off.png"));  
        lblhome.setIcon(hicon);
        home.setForeground(new Color(0,0,0));
       
        ImageIcon sicon= new ImageIcon(getClass().getResource("/images/Stock_Off.png"));
        lblstock.setIcon(sicon);
        stock.setForeground(new Color(0,0,0));
         
        ImageIcon bicon= new ImageIcon(getClass().getResource("/images/Bill_Off.png"));
        lblbill.setIcon(bicon);
        bill.setForeground(new Color(0,0,0));
        
        ImageIcon cicon= new ImageIcon(getClass().getResource("/images/Account_Off.png"));
        lblcash.setIcon(cicon);
        cash.setForeground(new Color(0,0,0));      
        
        ImageIcon cuicon= new ImageIcon(getClass().getResource("/images/Customer_Off.png"));
        lblcustomer.setIcon(cuicon);
        customer.setForeground(new Color(0,0,0));
        
        ImageIcon oicon= new ImageIcon(getClass().getResource("/images/Orders_Off.png"));
        lblorder.setIcon(oicon);
        order.setForeground(new Color(0,0,0));
   
        ImageIcon seicon= new ImageIcon(getClass().getResource("/images/Search_Off.png"));
        lblsearch.setIcon(seicon);
        search.setForeground(new Color(0,0,0));
        
        ImageIcon licon= new ImageIcon(getClass().getResource("/images/Label_Off.png"));
        lbllabel.setIcon(licon);
        label.setForeground(new Color(0,0,0));
        
        ImageIcon heicon= new ImageIcon(getClass().getResource("/images/Help_Off.png"));
        lblhelp.setIcon(heicon);
        help.setForeground(new Color(0,0,0));
    
    }
   // this function do all the JPanels unvisible
    public void OffAllPen()
    {
        homepen.setVisible(false);
        stockpen.setVisible(false);
        accountpen.setVisible(false);
        customerpen.setVisible(false);
        orderpen.setVisible(false);
        searchpen.setVisible(false);
        helppen.setVisible(false);
        lblpen.setVisible(false);
        
        chppen.setVisible(false);
        dsppen.setVisible(false);
        adppen.setVisible(false);
        edtppen.setVisible(false);
        dspcustpen.setVisible(false);
        addcustpen.setVisible(false);
        dspopen.setVisible(false);
        adopen.setVisible(false);
        dspicomopen.setVisible(false);
        srhcustpen.setVisible(false);
        srhproductpen.setVisible(false);
        srhorderpen.setVisible(false);
        dsplblpen.setVisible(false);
        abtpen.setVisible(false);   
        contactpen.setVisible(false);
        addbillpen.setVisible(false);
        addlblpen.setVisible(false);   
        dspaccpen.setVisible(false);
       
        
    }
    //Folowing methos do click effect on the icons and open appropriate JPanels
    public void On(JLabel lbl)
    {  
        if(lbl==lblhome || lbl==home)
        {          
            Off();
            ImageIcon icon= new ImageIcon(getClass().getResource("/images/Home_On.png"));
            lblhome.setIcon(icon);
            home.setForeground(new Color(254,137,0));
            homepen.uncheck();
            homepen.setVisible(true);     
        }
        else if(lbl==lblstock || lbl==stock)
        {         
            homepen.setVisible(false);
            Off();    
            ImageIcon icon= new ImageIcon(getClass().getResource("/images/Stock_On.png"));
            lblstock.setIcon(icon);
            stock.setForeground(new Color(254,137,0));
            stockpen.uncheck();
            stockpen.setVisible(true);        
        }
        else if(lbl==lblbill || lbl==bill)
        {
            Off(); 
            ImageIcon icon= new ImageIcon(getClass().getResource("/images/Bill_On.png"));
            lblbill.setIcon(icon);
            bill.setForeground(new Color(254,137,0));
            addbillpen.setVisible(true);
        }
        else if(lbl==lblcash || lbl==cash)
        {
            Off(); 
            ImageIcon icon= new ImageIcon(getClass().getResource("/images/Account_On.png"));
            lblcash.setIcon(icon);
            cash.setForeground(new Color(254,137,0));
            accountpen.uncheck();
            accountpen.setVisible(true);         
        }        
        else if(lbl==lblcustomer || lbl==customer)
        {
            Off(); 
            ImageIcon icon= new ImageIcon(getClass().getResource("/images/Customer_On.png"));
            lblcustomer.setIcon(icon);
            customer.setForeground(new Color(254,137,0));
            customerpen.uncheck();
            customerpen.changeEdittoAdd();
            customerpen.setVisible(true);
        }
        else if(lbl==lblorder || lbl==order)
        {
            Off(); 
            ImageIcon icon= new ImageIcon(getClass().getResource("/images/Orders_On.png"));
            lblorder.setIcon(icon);
            order.setForeground(new Color(254,137,0));     
            orderpen.uncheck();
            orderpen.setVisible(true);
        }
        else if(lbl==lblsearch || lbl==search)
        {
            Off(); 
            ImageIcon icon= new ImageIcon(getClass().getResource("/images/Search_On.png"));
            lblsearch.setIcon(icon);
            search.setForeground(new Color(254,137,0)); 
            searchpen.uncheck();
            searchpen.setVisible(true);
        }
        else if(lbl==lbllabel || lbl==label)
        {
            Off(); 
            ImageIcon icon= new ImageIcon(getClass().getResource("/images/Label_On.png"));
            lbllabel.setIcon(icon);
            label.setForeground(new Color(254,137,0));   
            lblpen.uncheck();
            lblpen.setVisible(true);
        }
        else if(lbl==lblhelp || lbl==help)
        {
            Off(); 
            ImageIcon icon= new ImageIcon(getClass().getResource("/images/Help_On.png"));
            lblhelp.setIcon(icon);
            help.setForeground(new Color(254,137,0));
            helppen.uncheck();
            helppen.setVisible(true);
        }
    }
    public void mouseClicked(MouseEvent me)
    {}
    public void mouseEntered(MouseEvent me)
    {}
    public void mouseExited(MouseEvent me)
    {}
    public void mousePressed(MouseEvent me)
    {
        OffAllPen();
        On((JLabel)me.getSource());
    }
    public void mouseReleased(MouseEvent me)
    {}    
}

