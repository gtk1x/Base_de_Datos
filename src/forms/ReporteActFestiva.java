/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import forms.Conexion;
import forms.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import java.awt.print.PrinterException; 
import java.io.File;
import java.io.FileOutputStream;
import java.text.MessageFormat;
import javax.swing.JTable;

/**
 *
 * @author Alma
 */
public class ReporteActFestiva extends javax.swing.JFrame {

    /**
     * Creates new form ReporteActFestiva
     */
    public ReporteActFestiva() {
        initComponents();
        this.setLocationRelativeTo(null);
        combo();
         fech.setEnabled(false);
         Mostrardatos();
       
    }

    ReporteActFestiva(Principal aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       private void combo() {
            
    
        ResultSet rs;
        String sql= "SELECT * FROM usuario";//selecciona de la tabla
        PreparedStatement sqls = null;
        try {
            sqls = reg.prepareStatement(sql);
        
        
            rs=sqls.executeQuery();
            
        while(rs.next()){
            usuario u = new usuario();
            u.setUsuario(rs.getString("usuario"));
            comboUsuarios.addItem(u);
}
        
        
        }catch (SQLException ex) {
       
    
    }
    
        
    }
       
       
       void Mostrardatos(){
 
 DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Descripcion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Monto Q");
        modelo.addColumn("Usuario Encargado");
      

        tblfestiva.setModel(modelo);
    

        String sql="";
        
            sql="SELECT * FROM actividad_festiva, usuario WHERE actividad_festiva.USUARIO_id=usuario.id ORDER BY fecha ASC";
       

        String[] datos= new String[10];
        try {
            Statement at= reg.createStatement();
            ResultSet rs= at.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(2);
                datos[1]=rs.getString(3);
                datos[2]= rs.getString(4);
                datos[3]=rs.getString(5);
                datos[4]=rs.getString("usuario");
                


                modelo.addRow(datos);
            }

            tblfestiva.setModel(modelo);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ReporteActFestiva.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }     
   
       
       void enviar(){
String dia = Integer.toString(txtfecha.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(txtfecha.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(txtfecha.getCalendar().get(Calendar.YEAR));
String fecha = (year + "/"+  mes +"/" + dia);
fech.setText(fecha);       
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tblfestiva = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboUsuarios = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        txtfecha = new com.toedter.calendar.JDateChooser();
        fech = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnusuario = new javax.swing.JButton();
        btnfecha = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblfestiva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblfestiva);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        btnver.setText("Ver Todas las Actividades");
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        comboUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUsuariosActionPerformed(evt);
            }
        });

        jLabel23.setText("Fecha");

        txtfecha.setDateFormatString("dd-MM-yyyy");
        txtfecha.setMinSelectableDate(new java.util.Date(-62135744340000L));

        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnusuario.setText("ver");
        btnusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusuarioActionPerformed(evt);
            }
        });

        btnfecha.setText("ver");
        btnfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfechaActionPerformed(evt);
            }
        });

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(fech, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(51, 51, 51)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnfecha))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(comboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnusuario))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(btnver))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUsuariosActionPerformed

    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
   
 DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Descripcion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Monto Q");
        modelo.addColumn("Usuario Encargado");
      

        tblfestiva.setModel(modelo);
    

        String sql="";
        
            sql="SELECT * FROM actividad_festiva, usuario WHERE actividad_festiva.USUARIO_id=usuario.id ";
       

        String[] datos= new String[10];
        try {
            Statement at= reg.createStatement();
            ResultSet rs= at.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(2);
                datos[1]= rs.getString(3);
                datos[2]=rs.getString(4);
                datos[3]=rs.getString(5);
                datos[4]=rs.getString("usuario");
                


                modelo.addRow(datos);
            }

            tblfestiva.setModel(modelo);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ReporteActFestiva.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_btnverActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
try { 
    MessageFormat header= new MessageFormat("Reporte Actividades Festivas");
    tblfestiva.print(JTable.PrintMode.FIT_WIDTH, header, header);
}    catch (PrinterException ex) { 
}  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusuarioActionPerformed
         
         DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Descripcion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Monto Q");
        modelo.addColumn("Usuario Encargado");
      

        tblfestiva.setModel(modelo);
        String usuario=  comboUsuarios.getSelectedItem().toString();

        String sql="";
        if(usuario.equals(""))
        {
            sql="SELECT * FROM actividad_festiva";
        }
        else{   
            sql="SELECT * FROM actividad_festiva,usuario  WHERE actividad_festiva.USUARIO_id=usuario.id && usuario='"+usuario+"'";
        }

        String[] datos= new String[10];
        try {
            Statement at= reg.createStatement();
            ResultSet rs= at.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(2);
                datos[1]= rs.getString(3);
                datos[2]=rs.getString(4);
                datos[3]=rs.getString(5);
                datos[4]=rs.getString("usuario");
                


                modelo.addRow(datos);
            }

            tblfestiva.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ReporteActFestiva.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_btnusuarioActionPerformed

    private void btnfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfechaActionPerformed
enviar();

         
         DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Descripcion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Monto Q");
        modelo.addColumn("Usuario Encargado");
      

        tblfestiva.setModel(modelo);
          String fecha = fech.getText();

        String sql="";
        if(fecha.equals(""))
        {
            sql="SELECT * FROM actividad_festiva";
        }
        else{
            sql="SELECT * FROM actividad_festiva WHERE fecha='"+fecha+"'";
        }
         String[] datos= new String[10];
        try {
            Statement at= reg.createStatement();
            ResultSet rs= at.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(2);
                datos[1]= rs.getString(3);
                datos[2]=rs.getString(4);
                datos[3]=rs.getString(5);
                datos[4]=rs.getString(6);
                


                modelo.addRow(datos);
            }

            tblfestiva.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ReporteActFestiva.class.getName()).log(Level.SEVERE, null, ex);
        }  

    }//GEN-LAST:event_btnfechaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteActFestiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteActFestiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteActFestiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteActFestiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteActFestiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfecha;
    private javax.swing.JButton btnusuario;
    private javax.swing.JButton btnver;
    private javax.swing.JComboBox comboUsuarios;
    private javax.swing.JTextField fech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblfestiva;
    private com.toedter.calendar.JDateChooser txtfecha;
    // End of variables declaration//GEN-END:variables

Conexion con=new Conexion();
	Connection reg = con.conexion();
}
