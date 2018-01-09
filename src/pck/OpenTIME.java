/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Patrick Dale
 */
public class OpenTIME {
    
    public static int delay=1000;
    public static int ot1=0,ot2=0,ot3=0,ot4=0,ot5=0,ot6=0,ot7=0,ot8=0,ot9=0,ot10=0,ot11=0,ot12=0;
    public static Timer t1 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot1++;
            if(ot1<60){
            PCR.tLeft1.setText(""+ot1+"m");
            }
            else if(ot1==60){
            PCR.tLeft1.setText(""+1+"h");
            }
            else if(ot1>60){
            PCR.tLeft1.setText(""+(int)ot1/60+"h"+ot1%60+"m");
            }
        }
        });
    public static Timer t2 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot2++;
            if(ot2<60){
            PCR.tLeft2.setText(""+ot2+"m");
            }
            else if(ot2==60){
            PCR.tLeft2.setText(""+1+"h");
            }
            else if(ot2>60){
            PCR.tLeft2.setText(""+(int)ot2/60+"h"+ot2%60+"m");
            }      
        }
        });
    public static Timer t3 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot3++;
            if(ot3<60){
            PCR.tLeft3.setText(""+ot3+"m");
            }
            else if(ot3==60){
            PCR.tLeft3.setText(""+1+"h");
            }
            else if(ot3>60){
            PCR.tLeft3.setText(""+(int)ot3/60+"h"+ot3%60+"m");
            }      
        }
        });
    public static Timer t4 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot4++;
            if(ot4<60){
            PCR.tLeft4.setText(""+ot4+"m");
            }
            else if(ot4==60){
            PCR.tLeft4.setText(""+1+"h");
            }
            else if(ot4>60){
            PCR.tLeft4.setText(""+(int)ot4/60+"h"+ot4%60+"m");
            }      
        }
        });
    public static Timer t5 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot5++;
            if(ot5<60){
            PCR.tLeft5.setText(""+ot5+"m");
            }
            else if(ot5==60){
            PCR.tLeft5.setText(""+1+"h");
            }
            else if(ot5>60){
            PCR.tLeft5.setText(""+(int)ot5/60+"h"+ot5%60+"m");
            }      
        }
        });
    public static Timer t6 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot6++;
            if(ot6<60){
            PCR.tLeft6.setText(""+ot6+"m");
            }
            else if(ot6==60){
            PCR.tLeft6.setText(""+1+"h");
            }
            else if(ot6>60){
            PCR.tLeft6.setText(""+(int)ot6/60+"h"+ot6%60+"m");
            }      
        }
        });
    public static Timer t7 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot7++;
            if(ot7<60){
            PCR.tLeft7.setText(""+ot7+"m");
            }
            else if(ot7==60){
            PCR.tLeft7.setText(""+1+"h");
            }
            else if(ot7>60){
            PCR.tLeft7.setText(""+(int)ot7/60+"h"+ot7%60+"m");
            }
        }
        });
    public static Timer t8 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot8++;
            if(ot8<60){
            PCR.tLeft8.setText(""+ot8+"m");
            }
            else if(ot8==60){
            PCR.tLeft8.setText(""+1+"h");
            }
            else if(ot8>60){
            PCR.tLeft8.setText(""+(int)ot8/60+"h"+ot8%60+"m");
            }      
        }
        });
    public static Timer t9 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot9++;
            if(ot9<60){
            PCR.tLeft9.setText(""+ot9+"m");
            }
            else if(ot9==60){
            PCR.tLeft9.setText(""+1+"h");
            }
            else if(ot9>60){
            PCR.tLeft9.setText(""+(int)ot9/60+"h"+ot9%60+"m");
            }
        }
        });
    public static Timer t10 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot10++;
            if(ot10<60){
            PCR.tLeft10.setText(""+ot10+"m");
            }
            else if(ot10==60){
            PCR.tLeft10.setText(""+1+"h");
            }
            else if(ot10>60){
            PCR.tLeft10.setText(""+(int)ot10/60+"h"+ot10%60+"m");
            }      
        }
        });
    public static Timer t11 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot11++;
            if(ot11<60){
            PCR.tLeft11.setText(""+ot11+"m");
            }
            else if(ot11==60){
            PCR.tLeft11.setText(""+1+"h");
            }
            else if(ot11>60){
            PCR.tLeft11.setText(""+(int)ot11/60+"h"+ot11%60+"m");
            }      
        }
        });
    public static Timer t12 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot12++;
            if(ot12<60){
            PCR.tLeft12.setText(""+ot12+"m");
            }
            else if(ot12==60){
            PCR.tLeft12.setText(""+1+"h");
            }
            else if(ot12>60){
            PCR.tLeft12.setText(""+(int)ot12/60+"h"+ot12%60+"m");
            }
        }
        });
    
    public static void StartOpenTime(){
        if(PCR.BUTTON==PCR.PC1){
        t1.start();
        }
        else if(PCR.BUTTON==PCR.PC2){
           t2.start();  
        }
        else if(PCR.BUTTON==PCR.PC3){
             t3.start();
        }
        else if(PCR.BUTTON==PCR.PC4){
            t4.start();
        }
        else if(PCR.BUTTON==PCR.PC5){
            t5.start();
        }
        else if(PCR.BUTTON==PCR.PC6){
            t6.start();
        }
        else if(PCR.BUTTON==PCR.PC7){
         t7.start();
        }
        else if(PCR.BUTTON==PCR.PC8){
        t8.start();
        }
        else if(PCR.BUTTON==PCR.PC9){
          t9.start();  
        }
        else if(PCR.BUTTON==PCR.PC10){
           t10.start();
        }
        else if(PCR.BUTTON==PCR.PC11){
            t11.start();
        }
        else if(PCR.BUTTON==PCR.PC12){
            t12.start();
        }
    }  
    public static void StopOpenTime(){
        if(PCR.BUTTON==PCR.PC1){
        t1.stop();
        }
        else if(PCR.BUTTON==PCR.PC2){
           t2.stop();  
        }
        else if(PCR.BUTTON==PCR.PC3){
             t3.stop();
        }
        else if(PCR.BUTTON==PCR.PC4){
            t4.stop();
        }
        else if(PCR.BUTTON==PCR.PC5){
            t5.stop();
        }
        else if(PCR.BUTTON==PCR.PC6){
            t6.stop();
        }
        else if(PCR.BUTTON==PCR.PC7){
         t7.stop();
        }
        else if(PCR.BUTTON==PCR.PC8){
        t8.stop();
        }
        else if(PCR.BUTTON==PCR.PC9){
          t9.stop();  
        }
        else if(PCR.BUTTON==PCR.PC10){
           t10.stop();
        }
        else if(PCR.BUTTON==PCR.PC11){
            t11.stop();
        }
        else if(PCR.BUTTON==PCR.PC12){
            t12.stop();
        }
    }
    
    public static void ResetOpenTime(){
        if(PCR.BUTTON==PCR.PC1){
            PCR.tLeft1.setText("");
            ot1=0;
        }
        else if(PCR.BUTTON==PCR.PC2){
           PCR.tLeft2.setText("");
            ot2=0;  
        }
        else if(PCR.BUTTON==PCR.PC3){
             PCR.tLeft3.setText("");
            ot3=0;
        }
        else if(PCR.BUTTON==PCR.PC4){
            PCR.tLeft4.setText("");
            ot4=0;
        }
        else if(PCR.BUTTON==PCR.PC5){
            PCR.tLeft5.setText("");
            ot5=0;
        }
        else if(PCR.BUTTON==PCR.PC6){
            PCR.tLeft6.setText("");
            ot6=0;
        }
        else if(PCR.BUTTON==PCR.PC7){
         PCR.tLeft7.setText("");
            ot7=0;
        }
        else if(PCR.BUTTON==PCR.PC8){
        PCR.tLeft8.setText("");
            ot8=0;
        }
        else if(PCR.BUTTON==PCR.PC9){
         PCR.tLeft9.setText("");
            ot9=0;  
        }
        else if(PCR.BUTTON==PCR.PC10){
           PCR.tLeft10.setText("");
            ot10=0;
        }
        else if(PCR.BUTTON==PCR.PC11){
            PCR.tLeft11.setText("");
            ot11=0;
        }
        else if(PCR.BUTTON==PCR.PC12){
            PCR.tLeft12.setText("");
            ot12=0;
            
            
        }
        
    }
    
    public static void GetOpenTime(){    
        if(PCR.BUTTON==PCR.PC1){
            PCR.time1=(float)ot1/60;
        }
        else if(PCR.BUTTON==PCR.PC2){
           PCR.time2=(float)ot2/60; 
        }
        else if(PCR.BUTTON==PCR.PC3){
             PCR.time3=(float)ot3/60;
        }
        else if(PCR.BUTTON==PCR.PC4){
            PCR.time4=(float)ot4/60;
        }
        else if(PCR.BUTTON==PCR.PC5){
            PCR.time5=(float)ot5/60;
        }
        else if(PCR.BUTTON==PCR.PC6){
            PCR.time6=(float)ot6/60;
        }
        else if(PCR.BUTTON==PCR.PC7){
        PCR.time7=(float)ot7/60;
        }
        else if(PCR.BUTTON==PCR.PC8){
        PCR.time8=(float)ot8/60;
        }
        else if(PCR.BUTTON==PCR.PC9){
         PCR.time9=(float)ot9/60;
        }
        else if(PCR.BUTTON==PCR.PC10){
           PCR.time10=(float)ot10/60;
        }
        else if(PCR.BUTTON==PCR.PC11){
            PCR.time11=(float)ot11/60;
        }
        else if(PCR.BUTTON==PCR.PC12){
            PCR.time12=(float)ot12/60;
        }
    }
}   
    

