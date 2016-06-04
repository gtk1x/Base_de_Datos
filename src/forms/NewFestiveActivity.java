/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import forms.Conexion;
import forms.NewGroup;
import forms.ReporteActFestiva;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;
  

/**
 *
 * @author Gerardo&Robin
 */
public class NewFestiveActivity extends javax.swing.JDialog {

    /**
     * Creates new form Nueva_Actividad
     */
    public NewFestiveActivity(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        fech.setEnabled(false);
        fech1.setEnabled(false);
        txtcod.setVisible(false);
        txtclear.setEnabled(false);
        Mostrardatos();
    }

    NewFestiveActivity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfecha = new com.toedter.calendar.JDateChooser();
        fech = new javax.swing.JTextField();
        hora = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcosto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        combouser = new javax.swing.JComboBox();
        btnGuardar = new javax.swing.JButton();
        txtclear = new javax.swing.JButton();
        txtcod = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblfestiva = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        txtfecha1 = new com.toedter.calendar.JDateChooser();
        btnfecha = new javax.swing.JButton();
        fech1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jMenuItem1.setText("Editar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Actividad");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Actividad Festiva"));

        jLabel10.setText("DESCRIPCION:");

        jLabel7.setText("Fecha:");

        txtfecha.setDateFormatString("dd-MM-yyyy");
        txtfecha.setMinSelectableDate(new java.util.Date(-62135744340000L));

        hora.setText("00:00:00");

        jLabel8.setText("Hora:");

        jLabel4.setText("Costo:");

        jLabel12.setText("Usuario Encargado");

        combouser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        combouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combouserActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon("/Users/gtk1x/Desktop/gromm/Briefcase-48.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtclear.setIcon(new javax.swing.ImageIcon("/Users/gtk1x/Desktop/gromm/Restart-48.png")); // NOI18N
        txtclear.setText("Actualizar");
        txtclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(44, 44, 44)
                                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(fech, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcosto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(hora)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(combouser, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(332, 332, 332)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtclear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(combouser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar)
                        .addComponent(txtclear)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        tblfestiva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblfestiva.setComponentPopupMenu(jPopupMenu2);
        tblfestiva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblfestivaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblfestiva);

        jLabel23.setText("Fecha");

        txtfecha1.setDateFormatString("dd-MM-yyyy");
        txtfecha1.setMinSelectableDate(new java.util.Date(-62135744340000L));

        btnfecha.setIcon(new javax.swing.ImageIcon("/Users/gtk1x/Desktop/gromm/Search-48.png")); // NOI18N
        btnfecha.setText("Buscar");
        btnfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfechaActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("/Users/gtk1x/Desktop/gromm/News-48.png")); // NOI18N
        jButton1.setText("Ver todas las actividades");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(txtfecha1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fech1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267)
                .addComponent(jButton1)
                .addGap(45, 45, 45))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fech1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnfecha)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23)
                        .addComponent(txtfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 260, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        btnCancelar.setIcon(new javax.swing.ImageIcon("/Users/gtk1x/Desktop/gromm/Minus-48.png")); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
   void enviar(){
String dia = Integer.toString(txtfecha.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(txtfecha.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(txtfecha.getCalendar().get(Calendar.YEAR));
String fecha = (year + "/"+  mes +"/" + dia);
fech.setText(fecha);       
   }
   
   void enviar1(){
String dia = Integer.toString(txtfecha1.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(txtfecha1.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(txtfecha1.getCalendar().get(Calendar.YEAR));
String fecha = (year + "/"+  mes +"/" + dia);
fech1.setText(fecha); }
    
   
   void Mostrardatos(){
//            Conexion  cc= new Conexion();
//Connection cn= cc.conexion();

 DefaultTableModel modelo = new DefaultTableModel();
  modelo.addColumn("ID");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Monto Q");
        modelo.addColumn("Usuario Encargado");
      

        tblfestiva.setModel(modelo);
    

        String sql="";
        
            sql="SELECT * FROM actividad_festiva, usuario WHERE actividad_festiva.USUARIO_id=usuario.id ORDER BY fecha ASC";
       

        String[] datos= new String[6];
        try {
            Statement at= reg.createStatement();
            ResultSet rs= at.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString("usuario");
                


                modelo.addRow(datos);
            }

            tblfestiva.setModel(modelo);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(NewFestiveActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }     
   
   private void limpiar() {
       txtDesc.setText("");
        fech.setText("");
        fech.setEnabled(false);
        txtfecha.setEnabled(true);
       hora.setText("00:00:00");
        txtcosto.setText("");
        
    }
   
   
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
               
enviar();

        try {
           PreparedStatement pst;
             pst=reg.prepareCall("call nuevafest(?,?,?,?,?)");
            pst.setString(1, txtDesc.getText());
            pst.setString(2,  fech.getText());
            pst.setString(3, hora.getText());
            pst.setString(4, txtcosto.getText());
            pst.setString(5, combouser.getSelectedItem().toString());
           
            
            
            int n=pst.executeUpdate();
            if(n>0){
            JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
            
            }
            Mostrardatos();
        } catch (SQLException ex) {
            Logger.getLogger(NewGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void combouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combouserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combouserActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfechaActionPerformed
        enviar1();

//        Conexion  cc= new Conexion();
  //      Connection cn= cc.conexion();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Monto Q");
        modelo.addColumn("Usuario Encargado");

        tblfestiva.setModel(modelo);
        String fecha = fech1.getText();

        String sql="";
        if(fecha.equals(""))
        {
            sql="SELECT * FROM actividad_festiva";
        }
        else{
            sql="SELECT * FROM actividad_festiva WHERE fecha='"+fecha+"'";
        }
        String[] datos= new String[7];
        try {
            Statement at= reg.createStatement();
            ResultSet rs= at.executeQuery(sql);
            while(rs.next()){
                 datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);

                modelo.addRow(datos);
            }

            tblfestiva.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ReporteActFestiva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnfechaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Mostrardatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblfestivaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblfestivaMouseClicked
        /*Conexion  cc= new Conexion();
Connection cn= cc.conexion();

        if (evt.getButton()==1){                                        
       int fila =tblfestiva.getSelectedRow();
       try {
            Statement at= cn.createStatement();
           String sql="select * from actividad_festiva where id"+tblfestiva.getValueAt(fila, 0);
           at=cn.createStatement();
           ResultSet rs= at.executeQuery(sql);
           rs.next();
           txtDesc.setText(rs.getString("descripcion"));
           txtfecha.setDate(rs.getDate("fecha"));
           hora.setText(rs.getString("hora"));
           txtcosto.setText(rs.getString("monto"));
           
       
        }   catch (SQLException ex) { 
                Logger.getLogger(NewFestiveActivity.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }  */                              
        
    }//GEN-LAST:event_tblfestivaMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
fech.setEnabled(true);
txtfecha.setEnabled(false);
btnGuardar.setEnabled(false);
txtclear.setEnabled(true);
        int fila= tblfestiva.getSelectedRow();
        if(fila>=0){
        txtcod.setText(tblfestiva.getValueAt(fila, 0).toString());
        txtDesc.setText(tblfestiva.getValueAt(fila, 1).toString());
         
        fech.setText(tblfestiva.getValueAt(fila, 2).toString());
        hora.setText(tblfestiva.getValueAt(fila, 3).toString());
        txtcosto.setText(tblfestiva.getValueAt(fila, 4).toString());
       combouser.setSelectedItem(tblfestiva.getValueAt(fila, 5).toString());
               }
        else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila");
            }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclearActionPerformed
  
        PreparedStatement pst;
    try {
    pst=reg.prepareCall("call actualizarfest(?,?,?,?,?,?)");
    pst.setString(1,this.txtcod.getText());
    pst.setString(2,this.txtDesc.getText());
    pst.setString(3,this.fech.getText());
    pst.setString(4,this.hora.getText());
    pst.setString(5,this.txtcosto.getText());
    pst.setString(6,this.combouser.getSelectedItem().toString());
   int n=pst.executeUpdate();
        
        if(n>0){
            JOptionPane.showMessageDialog(null, "Registro Editado con Exito");
            
            }
        limpiar(); 
        Mostrardatos();
        btnGuardar.setEnabled(true);
        txtclear.setEnabled(false);
        
    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
    
       
        
          // TODO add your handling code here:
    }//GEN-LAST:event_txtclearActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
            int fila= tblfestiva.getSelectedRow();
    String cod="";
    cod=tblfestiva.getValueAt(fila, 0).toString();
    if(fila>=0)
    {
        try {
            PreparedStatement ps=reg.prepareCall("{call eliminarfest(?)}");
            ps.setString(1, cod);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
        {
            JOptionPane.showMessageDialog(rootPane,"Dato eliminado");
        }
        Mostrardatos();
    }
    else
    {
        JOptionPane.showMessageDialog(this, "No ha selecionada ninguna fila");
    }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewFestiveActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewFestiveActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewFestiveActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewFestiveActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewFestiveActivity dialog = new NewFestiveActivity(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnfecha;
    private javax.swing.JComboBox combouser;
    private javax.swing.JTextField fech;
    private javax.swing.JTextField fech1;
    private javax.swing.JTextField hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblfestiva;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JButton txtclear;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtcosto;
    private com.toedter.calendar.JDateChooser txtfecha;
    private com.toedter.calendar.JDateChooser txtfecha1;
    // End of variables declaration//GEN-END:variables

Conexion  con= new Conexion();
Connection reg= con.conexion();
}
