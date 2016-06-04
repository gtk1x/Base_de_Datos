/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import forms.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gerardo&Robin
 */
public class NewVisit extends javax.swing.JDialog {
      void envi(){
String dia = Integer.toString(dtc.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(dtc.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(dtc.getCalendar().get(Calendar.YEAR));
String fecha = (year + "/"+  mes +"/" + dia);
txtfech.setText(fecha);       
   }

      
        public void limpiarEntradas(){
        this.txtcosto.setText(null);
        this.txtfech.setText(null);
        this.txtgrup.setText(null);
        this.txthora.setText(null);
        this.txtid.setText(null);
        this.txtus.setText(null);
    }
    /**
     * Creates new form Nueva_Actividad
     */
    public NewVisit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        txtfech.setEnabled(false);
        txtid.setVisible(false);
  
        try {
            
            
           
            Statement Sent9=reg.createStatement();
            ResultSet rs9 = Sent9.executeQuery("SELECT E.id, E.fecha, E.hora, E.monto,\n" +
                                                " A.nombre, C.usuario FROM \n" +
                                                "visita E INNER JOIN \n" +
                                                "grupo A ON E.GRUPO_id=A.id INNER JOIN \n" +
                                                "usuario C ON C.id=E.USUARIO_id");
            ResultSetMetaData rsm=rs9.getMetaData();
                
            int numcolum=rsm.getColumnCount();
                 DefaultTableModel modelo = new DefaultTableModel();
                 this.tblvisita.setModel(modelo);
                 
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
  
        
        try{
           
           Statement Sent4=reg.createStatement();
           ResultSet rs4=Sent4.executeQuery("select * from grupo");
           while (rs4.next()){
               this.cmbgrupo.addItem(rs4.getString("nombre"));
           }
            
            
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        try{
           
           Statement Sent5=reg.createStatement();
           ResultSet rs5=Sent5.executeQuery("select * from usuario");
           while (rs5.next()){
               this.cmbusuario.addItem(rs5.getString("usuario"));
           }
            
            
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
     void ver()
    {
    try{
           
            Statement Sent9=reg.createStatement();
            ResultSet rs9 = Sent9.executeQuery("SELECT E.id, E.fecha, E.hora, E.monto,\n" +
                                                " A.nombre, C.usuario FROM \n" +
                                                "visita E INNER JOIN \n" +
                                                "grupo A ON E.GRUPO_id=A.id INNER JOIN \n" +
                                                "usuario C ON C.id=E.USUARIO_id");
            ResultSetMetaData rsm=rs9.getMetaData();
                
            int numcolum=rsm.getColumnCount();
                 DefaultTableModel modelo = new DefaultTableModel();
                 this.tblvisita.setModel(modelo);
                 
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Editar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        dtc = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcosto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbgrupo = new javax.swing.JComboBox();
        txtfech = new javax.swing.JTextField();
        txtgrup = new javax.swing.JTextField();
        cmbusuario = new javax.swing.JComboBox();
        txtus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txthora = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblvisita = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Editar);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Actividad");

        jButton1.setIcon(new javax.swing.ImageIcon("/Users/gtk1x/Desktop/gromm/Briefcase-48.png")); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("/Users/gtk1x/Desktop/gromm/Minus-48.png")); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Monto:");

        jLabel7.setText("Fecha:");

        jLabel8.setText("Hora:");

        jLabel9.setText("Grupo:");

        cmbgrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbgrupoActionPerformed(evt);
            }
        });

        cmbusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbusuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        try {
            txthora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tblvisita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
            }
        ));
        tblvisita.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tblvisita);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NUEVA VISITA");

        jButton3.setIcon(new javax.swing.ImageIcon("/Users/gtk1x/Desktop/gromm/Restart-48.png")); // NOI18N
        jButton3.setText("ACTUALIZAR TABLA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("id");

        jButton4.setIcon(new javax.swing.ImageIcon("/Users/gtk1x/Desktop/gromm/Restart-48.png")); // NOI18N
        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("/Users/gtk1x/Desktop/gromm/Toolbox-48.png")); // NOI18N
        jButton5.setText("MENU");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtfech, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dtc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel1))
                                    .addComponent(jButton4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(37, 37, 37)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbgrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtgrup)
                                            .addComponent(txtus, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(168, 168, 168)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(17, 17, 17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtfech)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txthora.getAccessibleContext().setAccessibleParent(txthora);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbgrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbgrupoActionPerformed
try{
    
           Statement Sent1=reg.createStatement();
           ResultSet rs1= Sent1.executeQuery("select id from grupo where nombre= '"+this.cmbgrupo.getSelectedItem()+"'");
           rs1.next();
           this.txtgrup.setText(String.valueOf(rs1.getInt("id")));
    
    
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbgrupoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
envi();

        
        PreparedStatement ps;
       
try{
    ps=reg.prepareCall("call visita (?,?,?,?,?)");
    ps.setString(1,this.txtfech.getText());
    ps.setString(2,this.txthora.getText());
    ps.setString(3,this.txtcosto.getText());
    ps.setString(4,this.txtgrup.getText());
    ps.setString(5,this.txtus.getText());
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

    private void cmbusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbusuarioActionPerformed
try{
    
           Statement Sent7=reg.createStatement();
           ResultSet rs7= Sent7.executeQuery("select id from usuario where usuario= '"+this.cmbusuario.getSelectedItem()+"'");
           rs7.next();
           this.txtus.setText(String.valueOf(rs7.getInt("id")));
    
    
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}
        
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbusuarioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     this.ver();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
     int fila = tblvisita.getSelectedRow();
if (fila>=0){
    txtid.setText(tblvisita.getValueAt(fila, 0).toString());
    txtfech.setText(tblvisita.getValueAt(fila, 1).toString());
    txthora.setText(tblvisita.getValueAt(fila, 2).toString());
    txtcosto.setText(tblvisita.getValueAt(fila, 3).toString());
    txtgrup.setText(tblvisita.getValueAt(fila, 4).toString());
    txtus.setText(tblvisita.getValueAt(fila, 5).toString());
    
    
    
    
    
}
        
        // TODO add your handling code here:
    }//GEN-LAST:event_EditarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
PreparedStatement ps;
    try {
    ps=reg.prepareCall("call actualizarVisita(?,?,?,?,?,?)");
    ps.setString(1,this.txtid.getText());
    ps.setString(2,this.txtfech.getText());
    ps.setString(3,this.txthora.getText());
    ps.setString(4,this.txtcosto.getText());
    ps.setString(5,this.txtgrup.getText());
    ps.setString(6,this.txtus.getText());
    
      int res=ps.executeUpdate();
      if(res==1){
          JOptionPane.showMessageDialog(rootPane,"Datos editados correctamente");
      }
      
        

    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    int fila= tblvisita.getSelectedRow();
    String cod="";
    cod=tblvisita.getValueAt(fila, 0).toString();
    if(fila>=0)
    {
        try {
            PreparedStatement ps=reg.prepareCall("{call eliminarVisita(?)}");
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(NewVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewVisit dialog = new NewVisit(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cmbgrupo;
    private javax.swing.JComboBox cmbusuario;
    private com.toedter.calendar.JDateChooser dtc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblvisita;
    private javax.swing.JTextField txtcosto;
    private javax.swing.JTextField txtfech;
    private javax.swing.JTextField txtgrup;
    private javax.swing.JFormattedTextField txthora;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtus;
    // End of variables declaration//GEN-END:variables
Conexion con=new Conexion();
        Connection reg=con.conexion();

}
