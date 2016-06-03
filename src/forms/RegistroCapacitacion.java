
package forms;
import forms.Conexion;
import forms.usuario;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class RegistroCapacitacion extends javax.swing.JFrame {
    
    
    
    
        // LIMPIAR DESPUES DE ACTUALIZAR.----------------------------------------------------
    public void limpiarEntradas(){
        this.txttem.setText(null);
        this.txthora.setText(null);
        this.txtfecha.setText(null);
        this.txtmon.setText(null);
    }
       // FINAL DE LIMPIAR DESPUES DE ACTUALIZAR.----------------------------------------------------
    
    
    
   
     // INSERTAR FECHA
    void fecha(){
String dia = Integer.toString(jdt.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(jdt.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(jdt.getCalendar().get(Calendar.YEAR));
String fecha = (dia + "/"+  mes +"/" + year);
txtfecha.setText(fecha);       
   }
    // FIN INSERTAR FECHA

 

// COMBOBOX PARA USUARIO_id
  void Combo1(){
        
        ResultSet rs;
        String sql= "SELECT * FROM usuario";
        PreparedStatement sqls = null;
        try {
            sqls = con.prepareStatement(sql);
        
        
            rs=sqls.executeQuery();
        
     while(rs.next()){
            usuario p = new usuario();
            p.setUsuario(rs.getString("usuario"));
            usuario.addItem(p);
                }
        
        
        }catch (SQLException ex) {
            Logger.getLogger(RegistroActividad.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
       // FIN COMBO BOX USUARIO_id   
    
  
  
        // COMBOBOX PARA USUARIO_id
  void Combo2(){
        
        ResultSet rs;
        String sql= "SELECT * FROM grupo";
        PreparedStatement sqls = null;
        try {
            sqls = con.prepareStatement(sql);
        
        
            rs=sqls.executeQuery();
        
     while(rs.next()){
            grupo p = new grupo ();
            p.setGrupo(rs.getString("nombre"));
            grupo.addItem(p);
                }
 
        }catch (SQLException ex) {
            Logger.getLogger(RegistroActividad.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
       // FIN COMBO BOX USUARIO_id   
  
 
    
    public RegistroCapacitacion() {
        initComponents();
        txtfecha.setEnabled(false);
        txtid.setVisible(false);
        this.setLocationRelativeTo(null); 
        Combo1();
        Combo2();
    }

    @SuppressWarnings("unchecked")
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Editar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txttem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txthora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jdt = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtmon = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtgid = new javax.swing.JTextField();
        txtuid = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        usuario = new javax.swing.JComboBox();
        grupo = new javax.swing.JComboBox();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE CAPACITACIONES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS GENERALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 0, 153))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Tema");

        txttem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttemKeyTyped(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Hora");

        txthora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthoraActionPerformed(evt);
            }
        });
        txthora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthoraKeyTyped(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Fecha");

        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Monto");

        txtmon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmonKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttem, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmon, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setForeground(new java.awt.Color(0, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ACTUALIZAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MOSTRAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CERRAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtgid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgidActionPerformed(evt);
            }
        });

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(323, 323, 323)
                        .addComponent(jButton4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(grupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtgid, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtuid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addGap(41, 41, 41)
                                    .addComponent(jButton3)))
                            .addGap(12, 12, 12))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtgid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
         // INICIO DE REGISTRO DE CAPACITACIONES-----------------------------------------------------------------------------
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   this.fecha();
        
        PreparedStatement ps;
        try {
            ps=con.prepareCall("call capacitaciones (?, ?, ?, ?, ?, ?)");
            ps.setString (1, this.txttem.getText());
            ps.setString (2, this.txthora.getText());
            ps.setString (3, this.txtfecha.getText());
            ps.setString (4, this.txtmon.getText());
            ps.setString (5, this.txtgid.getText());
            ps.setString (6, this.txtuid.getText());
         
            int res=ps.executeUpdate();
            if (res==1){
                JOptionPane.showMessageDialog (rootPane, "Datos Guardados..");
            }
        }catch (SQLException | HeadlessException e){
        }
    this.limpiarEntradas();
    }//GEN-LAST:event_jButton1ActionPerformed
          //FIN DE REGISTRO DE DE DATOS
    
    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Inventario("");
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    
        // INICIO DE MODIFICAR DATOS---------------------------------------------------------------------------------------
    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
          
        int fila= jTable1.getSelectedRow();
        if(fila>=0){
            txtid.setText(jTable1.getValueAt(fila, 0).toString());
            txttem.setText(jTable1.getValueAt(fila, 1).toString());
            txthora.setText(jTable1.getValueAt(fila, 2).toString());
            txtfecha.setText(jTable1.getValueAt(fila, 3).toString());
            txtmon.setText(jTable1.getValueAt(fila, 4).toString());
            txtgid.setText(jTable1.getValueAt(fila, 5).toString());
            txtuid.setText(jTable1.getValueAt(fila, 6).toString());
        }
    }//GEN-LAST:event_EditarActionPerformed
        // FIN DE MODIFICAR DATOS-----------------------------------------------------------------------------------------
    
    
    
    
          // BOTON DE GUARDAR DATOS MODIFICADOS --------------------------------------------------------------------------------- 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        PreparedStatement ps;
    try {
    ps=con.prepareCall("call ModificarCapacitacion(?,?,?,?,?,?,?)");
    ps.setString(1,this.txtid.getText());
    ps.setString(2,this.txttem.getText());
    ps.setString(3,this.txthora.getText());
    ps.setString(4,this.txtfecha.getText());
    ps.setString(5,this.txtmon.getText());
    ps.setString(6,this.txtgid.getText());
    ps.setString(7,this.txtuid.getText());
      int res=ps.executeUpdate();
      if(res==1){
          JOptionPane.showMessageDialog(rootPane,"Datos editados correctamente");
      }
      
    } catch (SQLException | HeadlessException e) {
        System.out.print(e.getMessage());
    }
    this.limpiarEntradas();
    }//GEN-LAST:event_jButton2ActionPerformed
         // FIN DE BOTON DE MODIFICAR DATOS.----------------------------------------------------------------------------------
    
    
    
    
          // ELIMINAR REGISTRO-----------------------------------------------------------------------------------------------------
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
            
    int fila= jTable1.getSelectedRow();
    String cod="";
    cod=jTable1.getValueAt(fila, 0).toString();
    if(fila>=0)
    {
        try {
            PreparedStatement ps=con.prepareCall("{call EliminarCapacitacion(?)}");
            ps.setString(1, cod);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroActividad.class.getName()).log(Level.SEVERE, null, ex);
        }
        {
            JOptionPane.showMessageDialog(rootPane,"Dato eliminado");
        }
        
    }
    else
    {
        JOptionPane.showMessageDialog(this, "No ha selecionada ninguna fila");
    }
    }//GEN-LAST:event_EliminarActionPerformed
          // FIN ELIMINAR REGISTRO-----------------------------------------------------------------------------------------------------  
    
    
    
    
    private void txthoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthoraActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txttemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttemKeyTyped
          int numerocaracteres=45;
        if (txttem.getText().length ()>numerocaracteres) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "solo 45 caracteres");
    }
    }//GEN-LAST:event_txttemKeyTyped

    private void txthoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthoraKeyTyped

        
    }//GEN-LAST:event_txthoraKeyTyped

    private void txtmonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmonKeyTyped
       char c = evt.getKeyChar();
       if (c< '0' || c>'9') evt. consume();// TODO add your handling code here:
    }//GEN-LAST:event_txtmonKeyTyped

    private void txtgidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgidActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

        // INGRESAR DATOS AL COMBO-BOX
    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed

        try{
            Statement Sent1=con.createStatement();
            ResultSet rs1= Sent1.executeQuery("select id from usuario where usuario= '"+this.usuario.getSelectedItem()+"'");
            rs1.next();
            this.txtuid.setText(String.valueOf(rs1.getInt("id")));

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_usuarioActionPerformed

    private void grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoActionPerformed
               try{
            Statement Sent1=con.createStatement();
            ResultSet rs1= Sent1.executeQuery("select id from grupo where nombre= '"+this.grupo.getSelectedItem()+"'");
            rs1.next();
            this.txtgid.setText(String.valueOf(rs1.getInt("id")));

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_grupoActionPerformed
        // FIN INGRESAR DATOS AL COMBO-BOX
    
    //INICIO DE TABLA DE MOSTRAR DATOS.---------------------------------------------------------------------------------
 
    void Inventario(String valor){
        Conexion con=new Conexion();
        Connection reg=con.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("tema");
        modelo.addColumn("hora");
        modelo.addColumn("fecha");
        modelo.addColumn("monto");
        modelo.addColumn("GRUPO_id");
        modelo.addColumn("USUARIO_dpi");
         jTable1.setModel(modelo);
        String sql="";
        if(valor.equals(""))
        {
            sql="SELECT * FROM capacitacion"; 
        }
        
        String[] datos= new String[7];
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

                modelo.addRow(datos);
            }
            
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroActividad.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

     //FIN DE TABLA DE MOSTRAR DATOS.----------------------------------------------------------------------------------
    

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
            java.util.logging.Logger.getLogger(RegistroCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCapacitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JComboBox grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdt;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtgid;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmon;
    private javax.swing.JTextField txttem;
    private javax.swing.JTextField txtuid;
    private javax.swing.JComboBox usuario;
    // End of variables declaration//GEN-END:variables
Conexion cc= new Conexion();
Connection con=cc.conexion();
}
