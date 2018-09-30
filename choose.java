
package encrypt1;

import java.io.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class choose extends javax.swing.JFrame {
String str;

// int total;
// int n;


    public choose() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ad Kr\\Desktop\\images.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        jRadioButton2.setBackground(new java.awt.Color(153, 255, 153));
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jRadioButton2.setText("Audio File");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(153, 255, 153));
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jRadioButton1.setText("Text file");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(153, 255, 153));
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jRadioButton3.setText("Video File");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel3.setText("Choose which type of the file you want to encrypt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jRadioButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        FileInputStream fin= null;
        try {
                
            JFileChooser ch=new JFileChooser();
            int b=ch.showOpenDialog(null);
            File f=ch.getSelectedFile();
            
            
          // n= (int)f.length();
          
            if(b==JFileChooser.APPROVE_OPTION)
            {
                String filename=f.getAbsolutePath();
            }
            else
            {
                System.out.println("dd");
// break      
            }    
             

            jLabel1.setIcon(new ImageIcon("loader1.gif"));
         int str1=Integer.parseInt(JOptionPane.showInputDialog("ENTER THE 4 DIGIT NUMERIC PASSWORD "));
         


int a1=str1/1000;
int b1=str1%10;
int c1=(a1+b1)/2;

         
     
           str= JOptionPane.showInputDialog("Enter the name you want to save for the Encrypted File");
           //str2= JOptionPane.showInputDialog("Enter the path");
           
          
           
            if(str==null)
{
    
}
else
{
             
         //   fin = new FileInputStream(f0);
            
 InputStreamReader p= new InputStreamReader(fin);
 int c=0; 

 FileOutputStream fos = new FileOutputStream(str+".txt");
 
 
            try {
                while((c= fin.read())!=-1)
                {
                    
                   // if(c1>0&&c1<10)
                    //{
                    fos.write((char)c+c1);
                   // fos.write((byte)c-2);
    //            c1++;}
                //else if(c1==-1)
                  //c1=0;
//                else if(c1==10)
  //                  c1=1;
                  
                   // fos.write((char)c+2);
                   
                 
                }
                       
            JOptionPane.showMessageDialog(ch, "Successfully Encrypted");//
                             jLabel1.setIcon(null);

            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
}   
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fin.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                 
    
   
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
byte[] a=new byte[4000];
        
       
       FileInputStream fin= null;
        try {
                
            JFileChooser ch=new JFileChooser();
            int b=ch.showOpenDialog(null);
            File f=ch.getSelectedFile();
            
            
            if(b==JFileChooser.APPROVE_OPTION)
            {
                String filename=f.getAbsolutePath();
            }
            else
            {
                System.out.println("dd");          
                
    }      
                        jLabel1.setIcon(new ImageIcon("loader4.gif"));
int str1=Integer.parseInt(JOptionPane.showInputDialog("ENTER THE 4 DIGIT NUMERIC PASSWORD "));
int a1=str1/1000;
int b1=str1%10;
int c1=(a1+b1)/2;
str= JOptionPane.showInputDialog("Enter the name you want to save for the Encrypted File");
            
          
if(str==null)
{
    
}
else
{
fin = new FileInputStream(f);
 InputStreamReader p= new InputStreamReader(fin);
 int c=0; 
 
 FileOutputStream fos = new FileOutputStream(str+".mp3");
 
 
 
            try {
                while((c= fin.read())!=-1)
                {
                    
                    
      //              if(c1>0&&c1<10)
        //            {
                    fos.write((byte)c+c1);
                   // fos.write((byte)c-2);
          //      c1++;}
                //else if(c1==-1)
                  //c1=0;
            //    else if(c1==10)
              //      c1=1;
                 
                
                   // fos.write(a, 0, c+2);
                    //fos.write((byte) c+2);
                }  
                
                
                

                
            JOptionPane.showMessageDialog(ch, "Successfully Encrypted");
                                           jLabel1.setIcon(null);

            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
}
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fin.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
     
        
        
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed

        
        FileInputStream fin= null;
        try {
                
            JFileChooser ch=new JFileChooser();
            int b=ch.showOpenDialog(null);
            File f=ch.getSelectedFile();
            if(b==JFileChooser.APPROVE_OPTION)
            {
                String filename=f.getAbsolutePath();
            }
            else
            {
                System.out.println("dd");          
                
    }         
                                    jLabel1.setIcon(new ImageIcon("loader3.gif"));
int str1=Integer.parseInt(JOptionPane.showInputDialog("ENTER THE 4 DIGIT NUMERIC PASSWORD "));
int a1=str1/1000;
int b1=str1%10;
int c1=(a1+b1)/2;

str= JOptionPane.showInputDialog("Enter the name you want to save for the Encrypted File");
            if(str==null)
{
    
}
else
{
            fin = new FileInputStream(f);
 InputStreamReader p= new InputStreamReader(fin);
 int c=0; 
 
 FileOutputStream fos = new FileOutputStream(str+".mp4");
            try {
                while((c= fin.read())!=-1)
                {
                       
                    
      //              if(c1>0&&c1<10)
        //            {
                    fos.write((byte)c+c1);
                   // fos.write((byte)c-2);
          //      c1++;}
                //else if(c1==-1)
                  //c1=0;
            //    else if(c1==10)
              //      c1=1;
                 
                
                   // fos.write(a, 0, c+2);
                    //fos.write((byte) c+2);  
                    
                    
                //    fos.write((byte)c+2);
                   
                 
                } 

            JOptionPane.showMessageDialog(ch, "Successfully Encrypted");
                                             jLabel1.setIcon(null);

            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
}
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fin.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choose().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}