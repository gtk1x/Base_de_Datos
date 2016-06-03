/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import forms.Conexion;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Gerardo
 */
public class NewGroup extends javax.swing.JDialog {
  

    void enviar(){
String dia = Integer.toString(jdt.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(jdt.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(jdt.getCalendar().get(Calendar.YEAR));
String fecha = (dia + "/"+  mes +"/" + year);
txtfecha.setText(fecha);       
   }
    
      public void limpiarEntradas(){
        this.txtatributo.setText(null);
        this.txtcantidad.setText(null);
        this.txtfecha.setText(null);
        this.txtid.setText(null);
        this.txtidd.setText(null);
        this.txtmision.setText(null);
        this.txtnombre.setText(null);
        this.txtvision.setText(null);
    }
    
    
    
    
    /**
     * Creates new form Nueva_Actividad
     */
    public NewGroup(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        txtfecha.setEnabled(false);
        jTextField1.setVisible(false);
        try{
                   
           Statement Sent=reg.createStatement();
           ResultSet rs=Sent.executeQuery("select * from usuario");
           while (rs.next()){
               this.cmbnombre.addItem(rs.getString("usuario"));
           }
                        
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        try{
           
           Statement Sent2=reg.createStatement();
           ResultSet rs2=Sent2.executeQuery("select * from localidad");
           while (rs2.next()){
               this.cmblocalidad.addItem(rs2.getString("nombre"));
           }
            
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
     public void mostrar()
    {
    
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
                 this.tblgrup.setModel(modelo);
                 
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        Editar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmision = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtvision = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtatributo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        txtidd = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jdt = new com.toedter.calendar.JDateChooser();
        cmbnombre = new javax.swing.JComboBox();
        cmblocalidad = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblgrup = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        jPopupMenu2.add(Editar);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu2.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Actividad");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre del grupo:");

        jLabel3.setText("MISIÓN:");

        txtmision.setName("txtmision"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("CREACIÓN DE UN NUEVO GRUPO");

        jLabel9.setText("VISION:");

        jLabel12.setText("Cantidad");

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });

        txtatributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtatributoActionPerformed(evt);
            }
        });

        jLabel4.setText("Atributo");

        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        txtidd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiddActionPerformed(evt);
            }
        });

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        cmbnombre.setName("ghjklñ"); // NOI18N
        cmbnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnombreActionPerformed(evt);
            }
        });

        cmblocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmblocalidadActionPerformed(evt);
            }
        });

        jLabel5.setText("Usuario");

        jLabel6.setText("Fecha");

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Localidad");

        tblgrup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblgrup.setComponentPopupMenu(jPopupMenu2);
        jScrollPane1.setViewportView(tblgrup);

        jButton6.setText("Actualizar tabla");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(130, 130, 130)
                                                .addComponent(jLabel3)
                                                .addGap(173, 173, 173))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(txtmision, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jdt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(99, 99, 99)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(txtidd, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel6)))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addComponent(jLabel4)
                                                            .addGap(22, 22, 22)
                                                            .addComponent(txtatributo))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addComponent(jLabel12)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel7)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(cmblocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txtvision))
                                                .addContainerGap(61, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(202, 202, 202))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton6)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addContainerGap())))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(318, 318, 318))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(49, 49, 49)
                                .addComponent(jButton3)
                                .addGap(364, 364, 364))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmblocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtidd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtatributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtvision)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtmision)
                        .addGap(37, 37, 37)
                        .addComponent(jButton6)
                        .addGap(4, 4, 4)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        PreparedStatement ps;
   
   enviar();
   this.mostrar();
try{
    ps=reg.prepareCall("call grupo(?,?,?,?,?,?,?,?)");
  
    ps.setString(1,this.txtnombre.getText());
    ps.setString(2,this.txtmision.getText());
    ps.setString(3,this.txtvision.getText());
    ps.setString(4,this.txtcantidad.getText());
    ps.setString(5,this.txtatributo.getText());
    ps.setString(6,this.txtfecha.getText());
    ps.setString(7,this.txtidd.getText());
    ps.setString(8,this.txtid.getText());
    int res=ps.executeUpdate();
    if (res==1){
        JOptionPane.showMessageDialog(rootPane,"Datos Guardados..");
         
    }
    
} catch (SQLException ex){
    Logger.getLogger(NewGroup.class.getName()).log(Level.SEVERE, null, ex);
    
            }
   
    this.limpiarEntradas();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtatributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtatributoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtatributoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnombreActionPerformed
try{
    
           Statement Sent1=reg.createStatement();
           ResultSet rs1= Sent1.executeQuery("select id from usuario where usuario= '"+this.cmbnombre.getSelectedItem()+"'");
           rs1.next();
           this.txtidd.setText(String.valueOf(rs1.getInt("id")));
    
    
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbnombreActionPerformed

    private void cmblocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblocalidadActionPerformed

        try{
    
           Statement Sent3=reg.createStatement();
           ResultSet rs3= Sent3.executeQuery("select id from localidad where nombre= '"+this.cmblocalidad.getSelectedItem()+"'");
           rs3.next();
           this.txtid.setText(String.valueOf(rs3.getInt("id")));
    
    
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}
        // TODO add your handling code here:
    }//GEN-LAST:event_cmblocalidadActionPerformed

    private void txtiddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiddActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
this.mostrar();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

PreparedStatement ps;
    try {
    ps=reg.prepareCall("call actualizarGrupo(?,?,?,?,?,?,?,?,?)");
    ps.setString(1,this.jTextField1.getText());
    ps.setString(2,this.txtnombre.getText());
    ps.setString(3,this.txtvision.getText());
    ps.setString(4,this.txtmision.getText());
    ps.setString(5,this.txtcantidad.getText());
    ps.setString(6,this.txtatributo.getText());
    ps.setString(7,this.txtfecha.getText());
    ps.setString(8,this.txtidd.getText());
    ps.setString(9,this.txtid.getText());
    
      int res=ps.executeUpdate();
      if(res==1){
          JOptionPane.showMessageDialog(rootPane,"Datos editados correctamente");
      }
      

    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
      
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
int fila = tblgrup.getSelectedRow();
if (fila>=0){
    jTextField1.setText(tblgrup.getValueAt(fila, 0).toString());
    txtnombre.setText(tblgrup.getValueAt(fila, 1).toString());
    txtvision.setText(tblgrup.getValueAt(fila, 2).toString());
    txtmision.setText(tblgrup.getValueAt(fila, 3).toString());
    txtcantidad.setText(tblgrup.getValueAt(fila, 4).toString());
    txtatributo.setText(tblgrup.getValueAt(fila, 5).toString());
    txtfecha.setText(tblgrup.getValueAt(fila, 6).toString());
    txtidd.setText(tblgrup.getValueAt(fila, 7).toString());
    txtid.setText(tblgrup.getValueAt(fila, 8).toString());
   
    
    
    
    
}
        
// TODO add your handling code here:
    }//GEN-LAST:event_EditarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        
    int fila= tblgrup.getSelectedRow();
    String cod="";
    cod=tblgrup.getValueAt(fila, 0).toString();
    if(fila>=0)
    {
        try {
            PreparedStatement ps=reg.prepareCall("{call eliminarGrupo(?)}");
            ps.setString(1, cod);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NewGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
        {
            JOptionPane.showMessageDialog(rootPane,"Dato eliminado");
        }
        
    }
    else
    {
        JOptionPane.showMessageDialog(this, "No ha selecionada ninguna fila");
    }

        
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

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
            java.util.logging.Logger.getLogger(NewGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewGroup dialog = new NewGroup(new javax.swing.JFrame(), true);
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
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JComboBox cmblocalidad;
    private javax.swing.JComboBox cmbnombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private com.toedter.calendar.JDateChooser jdt;
    private javax.swing.JTable tblgrup;
    private javax.swing.JTextField txtatributo;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidd;
    private javax.swing.JTextField txtmision;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtvision;
    // End of variables declaration//GEN-END:variables

Conexion con=new Conexion();
	Connection reg = con.conexion();
   
}
