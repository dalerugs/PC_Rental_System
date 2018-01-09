/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck;

import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Patrick Dale
 */
public class PCR extends javax.swing.JInternalFrame {
    
   public static javax.swing.JButton BUTTON;
   
   DecimalFormat dt = new DecimalFormat("#.#");
   DecimalFormat da = new DecimalFormat("#");
   
   static Connection connection;
    static String url;
    static Statement st;
    static ResultSet rs;
    
    //0-Set Time 1-Open Time
    int status1,status2,status3,status4,status5,status6,status7,status8,status9,status10,status11,status12;
    public static float time1=0,time2=0,time3=0,time4=0,time5=0,time6=0,time7=0,time8=0,time9=0,time10=0,time11=0,time12=0;
    public static int ExtendTime;
   
           
   

    public PCR() {
        initComponents();
        groupButton();
        Visible();
      
        
    }
    
    
    private void save(Date date, float amount){
   
        try{
        Class.forName("com.mysql.jdbc.Driver");
        url = "jdbc:mysql://localhost:3306/pcrs";
        connection = DriverManager.getConnection(url, "root", "");
        st = connection.createStatement();
        
        st.executeUpdate("Insert into sales("
                            + "date, amount"
                            + ") VALUES ('"
                            + date + "','"
                            + amount + " ')");
            
        }
        catch(Exception exc){
        }
    }
    
    private void Visible(){
        IN.setVisible(false);
        out2.setVisible(false);
        ExOut.setVisible(false);
}

    
    private void groupButton(){
        ButtonGroup bg1=new ButtonGroup();
        bg1.add(OpenTime);
        bg1.add(SetTime);
        
        ButtonGroup bg2=new ButtonGroup();
        bg2.add(Extend);
        bg2.add(Outex);
      
        ButtonGroup bg3=new ButtonGroup();
        bg3.add(OKex);
        bg3.add(CancelEx);
    }
    
    private float amount(float time){
        float total;
        float rate=ChangeRate.Rate();
            total=time*rate;
            return total;
        
    }
    
    
    private void settime(String time){
        if(BUTTON==PC1){
            time1=time1+Float.parseFloat(time);
          
        }
        else if(BUTTON==PC2){
             time2=time2+Float.parseFloat(time);
         
        }
        else if(BUTTON==PC3){
             time3=time3+Float.parseFloat(time);
          
        }
        else if(BUTTON==PC4){
            time4=time4+Float.parseFloat(time);
        
        }
        else if(BUTTON==PC5){
            time5=time5+Float.parseFloat(time);
         
        }
        else if(BUTTON==PC6){
            time6=time6+Float.parseFloat(time);
           
        }
        else if(BUTTON==PC7){
            time7=time7+Float.parseFloat(time);
          
        }
        else if(BUTTON==PC8){
            time8=time8+Float.parseFloat(time);
         
        }
        else if(BUTTON==PC9){
            time9=time9+Float.parseFloat(time);
         
        }
        else if(BUTTON==PC10){
            time10=time10+Float.parseFloat(time);
         
        }
        else if(BUTTON==PC11){
            time11=time11+Float.parseFloat(time);
          
        }
        else if(BUTTON==PC12){
            time12=time12+Float.parseFloat(time);
        }
 
    }
    
    private void SetStatus(int x){
        if(BUTTON==PC1){
            status1=x;
        }
        else if(BUTTON==PC2){
             status2=x;
        }
        else if(BUTTON==PC3){
             status3=x;
        }
        else if(BUTTON==PC4){
            status4=x;
        }
        else if(BUTTON==PC5){
            status5=x;
        }
        else if(BUTTON==PC6){
            status6=x;
        }
        else if(BUTTON==PC7){
         status7=x;
        }
        else if(BUTTON==PC8){
        status8=x;
        }
        else if(BUTTON==PC9){
            status9=x;
        }
        else if(BUTTON==PC10){
            status10=x;
        }
        else if(BUTTON==PC11){
            status11=x;
        }
        else if(BUTTON==PC12){
            status12=x;
        }
    }
    
    private Boolean IsSetTime(){
        if(BUTTON==PC1){
            if(status1==0){
                return true;
            }
            else
                return false;
        }
        else if(BUTTON==PC2){
             if(status2==0){
                return true;
            }
            else
                return false;
        }
        else if(BUTTON==PC3){
             if(status3==0){
                return true;
            }
            else
                return false;
        }
        else if(BUTTON==PC4){
            if(status4==0){
                return true;
            }
            else
                return false;
        }
        else if(BUTTON==PC5){
            if(status5==0){
                return true;
            }
            else
                return false;
        }
        else if(BUTTON==PC6){
            if(status6==0){
                return true;
            }
            else
                return false;
        }
        else if(BUTTON==PC7){
            if(status7==0){
                return true;
            }
            else
                return false;
        }
        else if(BUTTON==PC8){
            if(status8==0){
                return true;
            }
            else
                return false;
        }
        else if(BUTTON==PC9){
            if(status9==0){
                return true;
            }
            else
                return false;
        }
        else if(BUTTON==PC10){
            if(status10==0){
                return true;
            }
            else
                return false;
        }
        else if(BUTTON==PC11){
            if(status11==0){
                return true;
            }
            else
                return false;
        }
        else if(BUTTON==PC12){
            if(status12==0){
                return true;
            }
            else
                return false;
        }
        else{
            return false;
        }
    }
    
    private float GetTime(){
        if(BUTTON==PC1){
            return time1;
        }
        else if(BUTTON==PC2){
             return time2;
        }
        else if(BUTTON==PC3){
             return time3;
        }
        else if(BUTTON==PC4){
            return time4;
        }
        else if(BUTTON==PC5){
            return time5;
        }
        else if(BUTTON==PC6){
            return time6;
        }
        else if(BUTTON==PC7){
         return time7;
        }
        else if(BUTTON==PC8){
        return time8;
        }
        else if(BUTTON==PC9){
            return time9;
        }
        else if(BUTTON==PC10){
            return time10;
        }
        else if(BUTTON==PC11){
            return time11;
        }
        else if(BUTTON==PC12){
            return time12;
        }
        else{
            return 0;
        }
    }
    
    private Date date() {
      java.util.Date utilDate = new java.util.Date();
      java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
      return sqlDate;
   }
    
    
    private void Empty(){
        if(BUTTON==PC1){
            time1=0;
        }
        else if(BUTTON==PC2){
            time2=0;
        }
        else if(BUTTON==PC3){
            time3=0;
        }
        else if(BUTTON==PC4){
            time4=0;
        }
        else if(BUTTON==PC5){
            time5=0;
        }
        else if(BUTTON==PC6){
            time6=0;
        }
        else if(BUTTON==PC7){
            time7=0;
        }
        else if(BUTTON==PC8){
            time8=0;
        }
        else if (BUTTON==PC9){
            time9=0;
        }
        else if(BUTTON==PC10){
            time10=0;
        }
        else if(BUTTON==PC11){
            time11=0;
        }
        else if(BUTTON==PC12){
            time12=0;
        }
    }
    
    private void SetTimeAmount(){
        if(BUTTON==PC1){
            TimeOut.setText(""+dt.format(time1));
            Amount.setText(""+da.format(amount(time1)));
        }
        else if(BUTTON==PC2){
            TimeOut.setText(""+dt.format(time2));
            Amount.setText(""+da.format(amount(time2)));
        }
        else if(BUTTON==PC3){
            TimeOut.setText(""+dt.format(time3));
            Amount.setText(""+da.format(amount(time3)));
        }
        else if(BUTTON==PC4){
            TimeOut.setText(""+dt.format(time4));
            Amount.setText(""+da.format(amount(time4)));
        }
        else if(BUTTON==PC5){
            TimeOut.setText(""+dt.format(time5));
            Amount.setText(""+da.format(amount(time5)));
        }
        else if(BUTTON==PC6){
            TimeOut.setText(""+dt.format(time6));
            Amount.setText(""+da.format(amount(time6)));
        }
        else if(BUTTON==PC7){
            TimeOut.setText(""+dt.format(time7));
            Amount.setText(""+da.format(amount(time7)));
        }
        else if(BUTTON==PC8){
            TimeOut.setText(""+dt.format(time8));
            Amount.setText(""+da.format(amount(time8)));
        }
        else if (BUTTON==PC9){
            TimeOut.setText(""+dt.format(time9));
            Amount.setText(""+da.format(amount(time9)));
        }
        else if(BUTTON==PC10){
            TimeOut.setText(""+dt.format(time10));
            Amount.setText(""+da.format(amount(time10)));
        }
        else if(BUTTON==PC11){
            TimeOut.setText(""+dt.format(time11));
            Amount.setText(""+da.format(amount(time11)));
        }
        else if(BUTTON==PC12){
            TimeOut.setText(""+dt.format(time12));
            Amount.setText(""+da.format(amount(time12)));
        }
    }
    
    
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        PC1 = new javax.swing.JButton();
        PC2 = new javax.swing.JButton();
        PC3 = new javax.swing.JButton();
        PC4 = new javax.swing.JButton();
        PC5 = new javax.swing.JButton();
        PC6 = new javax.swing.JButton();
        PC7 = new javax.swing.JButton();
        PC8 = new javax.swing.JButton();
        PC9 = new javax.swing.JButton();
        PC10 = new javax.swing.JButton();
        PC11 = new javax.swing.JButton();
        PC12 = new javax.swing.JButton();
        out2 = new javax.swing.JPanel();
        OK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PCnoOut = new javax.swing.JTextField();
        TimeOut = new javax.swing.JLabel();
        Amount = new javax.swing.JLabel();
        IN = new javax.swing.JPanel();
        SetTime = new javax.swing.JRadioButton();
        OpenTime = new javax.swing.JRadioButton();
        hours = new javax.swing.JComboBox();
        Inbut = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        PCnoIn = new javax.swing.JTextField();
        ExOut = new javax.swing.JPanel();
        Extend = new javax.swing.JRadioButton();
        Outex = new javax.swing.JRadioButton();
        lblexhours = new javax.swing.JLabel();
        ExHours = new javax.swing.JComboBox();
        OKex = new javax.swing.JButton();
        CancelEx = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tLeft1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tLeft2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tLeft3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tLeft4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tLeft5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tLeft6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tLeft7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tLeft8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tLeft9 = new javax.swing.JLabel();
        tLeft10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tLeft11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tLeft12 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(null);

        PC1.setBackground(null);
        PC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/p1.png"))); // NOI18N
        PC1.setToolTipText("");
        PC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PC1ActionPerformed(evt);
            }
        });

        PC2.setBackground(null);
        PC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/p2.png"))); // NOI18N
        PC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PC2ActionPerformed(evt);
            }
        });

        PC3.setBackground(null);
        PC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/p3.png"))); // NOI18N
        PC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PC3ActionPerformed(evt);
            }
        });

        PC4.setBackground(null);
        PC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/p4.png"))); // NOI18N
        PC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PC4ActionPerformed(evt);
            }
        });

        PC5.setBackground(null);
        PC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/p5.png"))); // NOI18N
        PC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PC5ActionPerformed(evt);
            }
        });

        PC6.setBackground(null);
        PC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/p6.png"))); // NOI18N
        PC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PC6ActionPerformed(evt);
            }
        });

        PC7.setBackground(null);
        PC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/p7.png"))); // NOI18N
        PC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PC7ActionPerformed(evt);
            }
        });

        PC8.setBackground(null);
        PC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/p8.png"))); // NOI18N
        PC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PC8ActionPerformed(evt);
            }
        });

        PC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/p9.png"))); // NOI18N
        PC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PC9ActionPerformed(evt);
            }
        });

        PC10.setBackground(null);
        PC10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/p10.png"))); // NOI18N
        PC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PC10ActionPerformed(evt);
            }
        });

        PC11.setBackground(null);
        PC11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/p11.png"))); // NOI18N
        PC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PC11ActionPerformed(evt);
            }
        });

        PC12.setBackground(null);
        PC12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/p12.png"))); // NOI18N
        PC12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PC12ActionPerformed(evt);
            }
        });

        out2.setBackground(new java.awt.Color(255, 255, 255));

        OK.setText("OK ");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        jLabel1.setText("TIME:");

        jLabel2.setText("AMOUNT:");

        PCnoOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PCnoOut.setBorder(null);
        PCnoOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCnoOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout out2Layout = new javax.swing.GroupLayout(out2);
        out2.setLayout(out2Layout);
        out2Layout.setHorizontalGroup(
            out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(out2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, out2Layout.createSequentialGroup()
                        .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, out2Layout.createSequentialGroup()
                        .addGroup(out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TimeOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Amount, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, out2Layout.createSequentialGroup()
                        .addComponent(PCnoOut, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        out2Layout.setVerticalGroup(
            out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(out2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PCnoOut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TimeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        IN.setBackground(new java.awt.Color(255, 255, 255));

        SetTime.setText("Set Time");
        SetTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetTimeActionPerformed(evt);
            }
        });

        OpenTime.setText("Open time");
        OpenTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenTimeActionPerformed(evt);
            }
        });

        hours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        hours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursActionPerformed(evt);
            }
        });

        Inbut.setText("IN");
        Inbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InbutActionPerformed(evt);
            }
        });

        jLabel4.setText("Hours");

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        PCnoIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PCnoIn.setBorder(null);
        PCnoIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCnoInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout INLayout = new javax.swing.GroupLayout(IN);
        IN.setLayout(INLayout);
        INLayout.setHorizontalGroup(
            INLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(INLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(INLayout.createSequentialGroup()
                        .addComponent(SetTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OpenTime)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(INLayout.createSequentialGroup()
                        .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INLayout.createSequentialGroup()
                        .addComponent(Inbut, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cancel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PCnoIn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        INLayout.setVerticalGroup(
            INLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PCnoIn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(INLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetTime)
                    .addComponent(OpenTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(INLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(INLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(Inbut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ExOut.setBackground(java.awt.Color.white);

        Extend.setText("Extend");
        Extend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtendActionPerformed(evt);
            }
        });

        Outex.setText("Out");
        Outex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutexActionPerformed(evt);
            }
        });

        lblexhours.setText("Hours");

        ExHours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        ExHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExHoursActionPerformed(evt);
            }
        });

        OKex.setText("OK ");
        OKex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKexActionPerformed(evt);
            }
        });

        CancelEx.setText("Cancel");
        CancelEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelExActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ExOutLayout = new javax.swing.GroupLayout(ExOut);
        ExOut.setLayout(ExOutLayout);
        ExOutLayout.setHorizontalGroup(
            ExOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExOutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ExOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ExOutLayout.createSequentialGroup()
                        .addComponent(OKex, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CancelEx, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ExOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(ExOutLayout.createSequentialGroup()
                            .addComponent(Extend)
                            .addGap(25, 25, 25)
                            .addComponent(Outex))
                        .addGroup(ExOutLayout.createSequentialGroup()
                            .addComponent(ExHours, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblexhours, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30))))
                .addGap(40, 40, 40))
        );
        ExOutLayout.setVerticalGroup(
            ExOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExOutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ExOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Extend)
                    .addComponent(Outex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ExOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblexhours))
                .addGap(18, 18, 18)
                .addGroup(ExOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKex)
                    .addComponent(CancelEx))
                .addContainerGap())
        );

        jLabel6.setText("Time:");

        jLabel7.setText("Time:");

        jLabel8.setText("Time:");

        jLabel9.setText("Time:");

        jLabel10.setText("Time:");

        jLabel11.setText("Time:");

        jLabel12.setText("Time:");

        jLabel13.setText("Time:");

        jLabel14.setText("Time:");

        jLabel15.setText("Time:");

        jLabel16.setText("Time:");

        jLabel17.setText("Time:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PC1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tLeft1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PC2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel7)
                                    .addGap(4, 4, 4)
                                    .addComponent(tLeft2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tLeft3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(PC3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(PC4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel9)
                                    .addGap(2, 2, 2)
                                    .addComponent(tLeft4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PC5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tLeft5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tLeft6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(PC6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PC7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tLeft7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tLeft8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PC8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tLeft9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PC9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PC10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tLeft10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PC11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tLeft11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tLeft12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PC12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(out2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PC2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PC1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PC3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tLeft1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(tLeft2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tLeft3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PC5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PC4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PC6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(tLeft4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(tLeft6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tLeft5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PC9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PC8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PC7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(tLeft7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(tLeft9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(tLeft8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PC10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PC12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PC11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(tLeft10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(tLeft12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(tLeft11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(IN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(out2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PC2ActionPerformed
        BUTTON=PC2;
        
        if(BUTTON.isBackgroundSet()){
           Visible();  
           if(!IsSetTime()){
                Extend.setVisible(false);
                ExHours.setVisible(false);
                lblexhours.setVisible(false);
                Outex.doClick();
            }
            else{
                Extend.setVisible(true);
                ExHours.setVisible(true);
                lblexhours.setVisible(true);
            }
            ExOut.setVisible(true);
            PCnoOut.setText("PC2");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PCnoIn.setText("PC2");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_PC2ActionPerformed

    private void PC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PC5ActionPerformed
       
           BUTTON=PC5;
        if(BUTTON.isBackgroundSet()){
           Visible();  
           if(!IsSetTime()){
                Extend.setVisible(false);
                ExHours.setVisible(false);
                lblexhours.setVisible(false);
                Outex.doClick();
            }
            else{
                Extend.setVisible(true);
                ExHours.setVisible(true);
                lblexhours.setVisible(true);
            }
            ExOut.setVisible(true);
            PCnoOut.setText("PC5");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PCnoIn.setText("PC5");
            
        }
// TODO add your handling code here:
    }//GEN-LAST:event_PC5ActionPerformed

    private void PC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PC8ActionPerformed
          BUTTON=PC8;
        if(BUTTON.isBackgroundSet()){
           Visible();  
           if(!IsSetTime()){
                Extend.setVisible(false);
                ExHours.setVisible(false);
                lblexhours.setVisible(false);
                Outex.doClick();
            }
            else{
                Extend.setVisible(true);
                ExHours.setVisible(true);
                lblexhours.setVisible(true);
            }
            ExOut.setVisible(true);
            PCnoOut.setText("PC8");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PCnoIn.setText("PC8");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_PC8ActionPerformed

    private void PC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PC11ActionPerformed
          BUTTON=PC11;
        if(BUTTON.isBackgroundSet()){
           Visible();  
           if(!IsSetTime()){
                Extend.setVisible(false);
                ExHours.setVisible(false);
                lblexhours.setVisible(false);
                Outex.doClick();
            }
            else{
                Extend.setVisible(true);
                ExHours.setVisible(true);
                lblexhours.setVisible(true);
            }
            ExOut.setVisible(true);
            PCnoOut.setText("PC11");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PCnoIn.setText("PC11");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_PC11ActionPerformed

    private void PC12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PC12ActionPerformed
        BUTTON=PC12;
        if(BUTTON.isBackgroundSet()){
           Visible();  
           if(!IsSetTime()){
                Extend.setVisible(false);
                ExHours.setVisible(false);
                lblexhours.setVisible(false);
                Outex.doClick();
            }
            else{
                Extend.setVisible(true);
                ExHours.setVisible(true);
                lblexhours.setVisible(true);
            }
            ExOut.setVisible(true);
            PCnoOut.setText("PC12");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PCnoIn.setText("PC12");
        }        
// TODO add your handling code here:
    }//GEN-LAST:event_PC12ActionPerformed
    
    private void PC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PC1ActionPerformed
        BUTTON=PC1;
        
        if(BUTTON.isBackgroundSet()){
            Visible();  
            if(!IsSetTime()){
                Extend.setVisible(false);
                ExHours.setVisible(false);
                lblexhours.setVisible(false);
                Outex.doClick();
            }
            else{
                Extend.setVisible(true);
                ExHours.setVisible(true);
                lblexhours.setVisible(true);
            }
            ExOut.setVisible(true);
            PCnoOut.setText("PC1");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PCnoIn.setText("PC1");
        }       // TODO add your handling code here:
    }//GEN-LAST:event_PC1ActionPerformed

    
    private void hoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursActionPerformed
  
        
// TODO add your handling code here:
    }//GEN-LAST:event_hoursActionPerformed
    
    
    
    private void InbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InbutActionPerformed
        String time;
        if(SetTime.isSelected()){
        SetStatus(0);
        BUTTON.setBackground(Color.GREEN);
        time=(String)(hours.getSelectedItem());
        settime(time);
        SetTIME.GetTime();
        SetTIME.Start();
        Visible();
        }
        if(OpenTime.isSelected()){
            SetStatus(1);
            OpenTIME.StartOpenTime();
            BUTTON.setBackground(Color.GREEN);
            Visible();
        }
           
        // TODO add your handling code here:
    }//GEN-LAST:event_InbutActionPerformed
    
    
    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
       BUTTON.setBackground(null);
       save(date(),(float)amount(GetTime()));
       Empty();
       Visible();
    }//GEN-LAST:event_OKActionPerformed

    private void PC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PC9ActionPerformed
   BUTTON=PC9;
        if(BUTTON.isBackgroundSet()){
          Visible();  
          if(!IsSetTime()){
                Extend.setVisible(false);
                ExHours.setVisible(false);
                lblexhours.setVisible(false);
                Outex.doClick();
            }
            else{
                Extend.setVisible(true);
                ExHours.setVisible(true);
                lblexhours.setVisible(true);
            }
            ExOut.setVisible(true);
            PCnoOut.setText("PC9");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PCnoIn.setText("PC9");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_PC9ActionPerformed

    private void PC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PC3ActionPerformed
   BUTTON=PC3;
        if(BUTTON.isBackgroundSet()){
          Visible();  
          if(!IsSetTime()){
                Extend.setVisible(false);
                ExHours.setVisible(false);
                lblexhours.setVisible(false);
                Outex.doClick();
            }
            else{
                Extend.setVisible(true);
                ExHours.setVisible(true);
                lblexhours.setVisible(true);
            }
            ExOut.setVisible(true);
            PCnoOut.setText("PC3");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PCnoIn.setText("PC3");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_PC3ActionPerformed

    private void PC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PC4ActionPerformed
   BUTTON=PC4;
        if(BUTTON.isBackgroundSet()){
           Visible();  
           if(!IsSetTime()){
                Extend.setVisible(false);
                ExHours.setVisible(false);
                lblexhours.setVisible(false);
                Outex.doClick();
            }
            else{
                Extend.setVisible(true);
                ExHours.setVisible(true);
                lblexhours.setVisible(true);
            }
            ExOut.setVisible(true);
            PCnoOut.setText("PC4");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PCnoIn.setText("PC4");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_PC4ActionPerformed

    private void PC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PC6ActionPerformed
           BUTTON=PC6;  
        if(BUTTON.isBackgroundSet()){
           Visible();
           if(!IsSetTime()){
                Extend.setVisible(false);
                ExHours.setVisible(false);
                lblexhours.setVisible(false);
                Outex.doClick();
            }
            else{
                Extend.setVisible(true);
                ExHours.setVisible(true);
                lblexhours.setVisible(true);
            }
            ExOut.setVisible(true);
            PCnoOut.setText("PC6");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PCnoIn.setText("PC6");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_PC6ActionPerformed

    private void PC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PC7ActionPerformed
   BUTTON=PC7;
        if(BUTTON.isBackgroundSet()){
           Visible();  
           if(!IsSetTime()){
                Extend.setVisible(false);
                ExHours.setVisible(false);
                lblexhours.setVisible(false);
                Outex.doClick();
            }
            else{
                Extend.setVisible(true);
                ExHours.setVisible(true);
                lblexhours.setVisible(true);
            }
            ExOut.setVisible(true);
            PCnoOut.setText("PC7");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PCnoIn.setText("PC7");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_PC7ActionPerformed

    private void PC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PC10ActionPerformed
   BUTTON=PC10;
        if(BUTTON.isBackgroundSet()){
          Visible();  
          if(!IsSetTime()){
                Extend.setVisible(false);
                ExHours.setVisible(false);
                lblexhours.setVisible(false);
                Outex.doClick();
            }
            else{
                Extend.setVisible(true);
                ExHours.setVisible(true);
                lblexhours.setVisible(true);
            }
            ExOut.setVisible(true);
            PCnoOut.setText("PC10");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PCnoIn.setText("PC10");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_PC10ActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
    Visible();        // TODO add your handling code here:
    }//GEN-LAST:event_CancelActionPerformed

    private void PCnoInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCnoInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCnoInActionPerformed

    private void PCnoOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCnoOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCnoOutActionPerformed

    private void SetTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetTimeActionPerformed
        hours.enable();
    }//GEN-LAST:event_SetTimeActionPerformed

    private void OpenTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenTimeActionPerformed
      hours.disable();
    }//GEN-LAST:event_OpenTimeActionPerformed

    private void ExtendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtendActionPerformed
    ExHours.enable();   
// TODO add your handling code here:
    }//GEN-LAST:event_ExtendActionPerformed

    private void ExHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExHoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExHoursActionPerformed

    private void OKexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKexActionPerformed
        String time;
        if(Extend.isSelected()){
        BUTTON.setBackground(Color.GREEN);
        time=(String)(ExHours.getSelectedItem());
        ExtendTime=Integer.parseInt((String)(ExHours.getSelectedItem()));
        settime(time);
        SetTIME.ExtendTime();
        SetTIME.Start();
        Visible();
        }     
        if(Outex.isSelected()){
            Visible();
            BUTTON.setBackground(Color.RED);
            if(!IsSetTime()){
                OpenTIME.StopOpenTime();
                OpenTIME.GetOpenTime();
                OpenTIME.ResetOpenTime();
            }
            else{
                SetTIME.Stop();
                SetTIME.Reset();
            }
            SetTimeAmount();
            out2.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_OKexActionPerformed

    
    
    private void CancelExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelExActionPerformed
        Visible();
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelExActionPerformed

    private void OutexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutexActionPerformed
    ExHours.disable();        // TODO add your handling code here:
    }//GEN-LAST:event_OutexActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton CancelEx;
    private javax.swing.JComboBox ExHours;
    public static javax.swing.JPanel ExOut;
    private javax.swing.JRadioButton Extend;
    private javax.swing.JPanel IN;
    private javax.swing.JButton Inbut;
    private javax.swing.JButton OK;
    private javax.swing.JButton OKex;
    private javax.swing.JRadioButton OpenTime;
    private javax.swing.JRadioButton Outex;
    public static javax.swing.JButton PC1;
    public static javax.swing.JButton PC10;
    public static javax.swing.JButton PC11;
    public static javax.swing.JButton PC12;
    public static javax.swing.JButton PC2;
    public static javax.swing.JButton PC3;
    public static javax.swing.JButton PC4;
    public static javax.swing.JButton PC5;
    public static javax.swing.JButton PC6;
    public static javax.swing.JButton PC7;
    public static javax.swing.JButton PC8;
    public static javax.swing.JButton PC9;
    private javax.swing.JTextField PCnoIn;
    private javax.swing.JTextField PCnoOut;
    private javax.swing.JRadioButton SetTime;
    private javax.swing.JLabel TimeOut;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox hours;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblexhours;
    private javax.swing.JPanel out2;
    public static javax.swing.JLabel tLeft1;
    public static javax.swing.JLabel tLeft10;
    public static javax.swing.JLabel tLeft11;
    public static javax.swing.JLabel tLeft12;
    public static javax.swing.JLabel tLeft2;
    public static javax.swing.JLabel tLeft3;
    public static javax.swing.JLabel tLeft4;
    public static javax.swing.JLabel tLeft5;
    public static javax.swing.JLabel tLeft6;
    public static javax.swing.JLabel tLeft7;
    public static javax.swing.JLabel tLeft8;
    public static javax.swing.JLabel tLeft9;
    // End of variables declaration//GEN-END:variables

  
}
