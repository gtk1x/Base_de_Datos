/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import forms.Conexion;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class Reporte_Grupo extends javax.swing.JFrame {

    /**
     * Creates new form Reporte_Grupo
     */
    public Reporte_Grupo() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
            
            Statement Sent9=reg.createStatement();
            ResultSet rs9 = Sent9.executeQuery("SELECT E.id, E.nombre, E.vision, E.mision, E.cantidad, E.atributo,\n" +
                                                "E.fecha, A.usuario, C.nombre FROM \n" +
                                                "grupo E INNER JOIN \n" +
                                                "usuario A ON E.USUARIO_id=A.id INNER JOIN \n" +
                                                "localidad C ON C.id=E.LOCALIDAD_id");
            ResultSetMetaData rsm=rs9.getMetaData();
                
            int numcolum=rsm.getColumnCount();
                 DefaultTableModel modelo = new DefaultTableModel();
                 this.tblreportegrupo.setModel(modelo);
                 
                 for (int x=1; x<=numcolum; x++){
                     modelo.addColumn(rsm.getColumnLabel(x));
                        
              }
                 while(rs9.next()){
                     Object [] fila = new Object[numcolum];
                     for (int y=0; y<numcolum; y++){
                         fila[y]=rs9.getObject(y+1);
                         
                     }
                     modelo.addRow(fila);
                 }
           
           
            
        }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
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

        Ordenar = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblreportegrupo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblreportegrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblreportegrupo);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ORDEMAR POR:", 0, 0, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        Ordenar.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1.setText("Nombre");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });

        Ordenar.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2.setText("Fecha");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(33, 33, 33))
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("/Users/gtk1x/Desktop/gromm/Document-50.png")); // NOI18N
        jButton2.setText("IMPRIMIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("/Users/gtk1x/Desktop/gromm/Toolbox-48.png")); // NOI18N
        jButton3.setText("MENU");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("REPORTE DE GRUPOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabel1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
ordenar("");   
           


// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked

ordenar1("");        
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try { 

    MessageFormat header= new MessageFormat("REPORTE DE GRUPOS");
    tblreportegrupo.print(JTable.PrintMode.FIT_WIDTH, header, header);

}    catch (PrinterException ex) { 
} 
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Reporte_Grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_Grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_Grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_Grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte_Grupo().setVisible(true);
            }
        });
    }
    
      void ordenar(String valor)
     {
       
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("VISION");
        modelo.addColumn("MISION");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("ATRIBUTO");
        modelo.addColumn("FECHA");
        modelo.addColumn("USUARIO");
        modelo.addColumn("LOCALIDAD");
        
        
  
         tblreportegrupo.setModel(modelo);
        
        String sql="";
        if(valor.equals(""))
        {
            sql="SELECT E.id, E.nombre, E.vision, E.mision, E.cantidad, E.atributo,\n" +
                                                "E.fecha, A.usuario, C.nombre FROM \n" +
                                                "grupo E INNER JOIN \n" +
                                                "usuario A ON E.USUARIO_id=A.id INNER JOIN \n" +
                                                "localidad C ON C.id=E.LOCALIDAD_id order by E.nombre";
        }
        else{
            sql="SELECT * FROM grupo WHERE id='"+valor+"' ";
        }
        
        String[] datos= new String[11];
        try {
            Statement at= reg.createStatement();
            ResultSet rs= at.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
	datos[8]=rs.getString(6);
               
             
                modelo.addRow(datos);
            }
            
           tblreportegrupo.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Reporte_Grupo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
      
      void ordenar1(String valor)
     {
       
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("VISION");
        modelo.addColumn("MISION");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("ATRIBUTO");
        modelo.addColumn("FECHA");
        modelo.addColumn("USUARIO");
        modelo.addColumn("LOCALIDAD");
        
        
  
         tblreportegrupo.setModel(modelo);
        
        String sql="";
        if(valor.equals(""))
        {
            sql="SELECT E.id, E.nombre, E.vision, E.mision, E.cantidad, E.atributo,\n" +
                                                "E.fecha, A.usuario, C.nombre FROM \n" +
                                                "grupo E INNER JOIN \n" +
                                                "usuario A ON E.USUARIO_id=A.id INNER JOIN \n" +
                                                "localidad C ON C.id=E.LOCALIDAD_id order by E.fecha";
                    
        }
        else{
            sql="SELECT * FROM grupo WHERE id='"+valor+"' ";
        }
        
        String[] datos= new String[11];
        try {
            Statement at= reg.createStatement();
            ResultSet rs= at.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
	datos[8]=rs.getString(6);
               
             
                modelo.addRow(datos);
            }
            
           tblreportegrupo.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Reporte_Grupo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Ordenar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblreportegrupo;
    // End of variables declaration//GEN-END:variables
Conexion con=new Conexion();
        Connection reg=con.conexion();
}
