
package paq_ventanas;
import paq_logica.*;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ven_login extends javax.swing.JDialog  {
    ResultSet resultado;
    cls_sql clase_sql= new cls_sql();
    int usuario;

    public ven_login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         java.awt.Image retValue = java.awt.Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("paq_iconos/vcard.png"));
         this.setIconImage(retValue);
         this.txt_usuario.requestFocus();
         this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pan_panel1 = new javax.swing.JPanel();
        lbl_titulo4 = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        Pan_identificacion = new javax.swing.JPanel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_imagen2 = new javax.swing.JButton();
        btn_imagen3 = new javax.swing.JButton();
        lbl_titulo1 = new javax.swing.JLabel();
        lbl_titulo3 = new javax.swing.JLabel();
        lbl_titulo2 = new javax.swing.JLabel();
        btn_imagen1 = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Pan_panel1.setBackground(new java.awt.Color(102, 102, 102));
        Pan_panel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_titulo4.setBackground(new java.awt.Color(255, 204, 255));
        lbl_titulo4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_titulo4.setForeground(new java.awt.Color(255, 255, 0));
        lbl_titulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo4.setText("Desarrollado por Josué Jonathan Ortega. 2010");

        lbl_titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(153, 255, 0));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Melody Neural Network");

        Pan_identificacion.setBackground(new java.awt.Color(102, 102, 102));
        Pan_identificacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificacion de Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 255, 51))); // NOI18N
        Pan_identificacion.setForeground(new java.awt.Color(255, 255, 255));
        Pan_identificacion.setFont(new java.awt.Font("Arial", 0, 11));

        lbl_usuario.setFont(new java.awt.Font("Tahoma", 1, 11));
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setText("Usuario :");

        lbl_password.setFont(new java.awt.Font("Tahoma", 1, 11));
        lbl_password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_password.setText("Password :");

        txt_usuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(255, 51, 51));
        txt_usuario.setText("admin");
        txt_usuario.setNextFocusableComponent(txt_password);
        txt_usuario.setSelectedTextColor(new java.awt.Color(255, 255, 102));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        txt_password.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 51, 51));
        txt_password.setText("admin");

        btn_imagen2.setBackground(new java.awt.Color(102, 102, 102));
        btn_imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/user.png"))); // NOI18N
        btn_imagen2.setToolTipText("Ingrese usuario ");
        btn_imagen2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_imagen2.setFocusable(false);

        btn_imagen3.setBackground(new java.awt.Color(102, 102, 102));
        btn_imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/key.png"))); // NOI18N
        btn_imagen3.setToolTipText("Ingrese contraseña");
        btn_imagen3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_imagen3.setFocusable(false);

        javax.swing.GroupLayout Pan_identificacionLayout = new javax.swing.GroupLayout(Pan_identificacion);
        Pan_identificacion.setLayout(Pan_identificacionLayout);
        Pan_identificacionLayout.setHorizontalGroup(
            Pan_identificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_identificacionLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(Pan_identificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_usuario)
                    .addComponent(lbl_password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pan_identificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_password)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pan_identificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        Pan_identificacionLayout.setVerticalGroup(
            Pan_identificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_identificacionLayout.createSequentialGroup()
                .addGroup(Pan_identificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Pan_identificacionLayout.createSequentialGroup()
                        .addGroup(Pan_identificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_usuario)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Pan_identificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_password)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Pan_identificacionLayout.createSequentialGroup()
                        .addComponent(btn_imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lbl_titulo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_titulo1.setForeground(new java.awt.Color(255, 204, 51));
        lbl_titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo1.setText("Universidad de Guayaquil");

        lbl_titulo3.setForeground(new java.awt.Color(255, 204, 51));
        lbl_titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo3.setText("Carrera de Ingeniería en Sistemas Computacionales");

        lbl_titulo2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_titulo2.setForeground(new java.awt.Color(255, 204, 51));
        lbl_titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo2.setText("Facultad de Ciencias Matematicas y Fisicas");

        btn_imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_imagenes/EscudoUdeGuayaquil.jpg"))); // NOI18N
        btn_imagen1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn_ingresar.setBackground(new java.awt.Color(102, 102, 102));
        btn_ingresar.setFont(new java.awt.Font("Arial", 1, 11));
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/door_in.png"))); // NOI18N
        btn_ingresar.setMnemonic('I');
        btn_ingresar.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btn_ingresar.setLabel("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        btn_ingresar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btn_ingresarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btn_ingresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_ingresarKeyPressed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(102, 102, 102));
        btn_salir.setFont(new java.awt.Font("Arial", 1, 11));
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq_iconos/door_out.png"))); // NOI18N
        btn_salir.setMnemonic('S');
        btn_salir.setLabel("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pan_panel1Layout = new javax.swing.GroupLayout(Pan_panel1);
        Pan_panel1.setLayout(Pan_panel1Layout);
        Pan_panel1Layout.setHorizontalGroup(
            Pan_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_panel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btn_ingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(Pan_panel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btn_imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(Pan_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Pan_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(Pan_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Pan_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pan_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pan_identificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Pan_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo4, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );
        Pan_panel1Layout.setVerticalGroup(
            Pan_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_panel1Layout.createSequentialGroup()
                .addComponent(lbl_titulo1)
                .addGap(1, 1, 1)
                .addComponent(lbl_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_titulo3)
                .addGap(4, 4, 4)
                .addComponent(btn_imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pan_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pan_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar)
                    .addComponent(btn_salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_titulo4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pan_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pan_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
}//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String sql;
        sql= "select count(*),usu_id from tab_usuario where usu_nombre='" + this.txt_usuario.getText() + "' and usu_password='"+ this.txt_password.getText() +"'";
        resultado= clase_sql.ejecutarSelect(sql);

        try{
          while( resultado.next())
          {
                if (resultado.getInt(1)==1 )
                {
                    this.usuario= resultado.getInt("usu_id");
                    javax.swing.JOptionPane.showMessageDialog(null, "Bienvenido al Sistema", "Identificacion", WIDTH, null);
                    dispose();
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "Usuario/Password Incorrecto", "Identificacion", WIDTH, null);
                    limpiar();
                }
          }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

     private void limpiar()
    {
        this.txt_usuario.setText("");
        this.txt_password.setText("");
        this.txt_usuario.requestFocus();
    }
    private void btn_ingresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_ingresarKeyPressed
         
}//GEN-LAST:event_btn_ingresarKeyPressed

    private void btn_ingresarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btn_ingresarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresarAncestorAdded

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed


  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pan_identificacion;
    private javax.swing.JPanel Pan_panel1;
    private javax.swing.JButton btn_imagen1;
    private javax.swing.JButton btn_imagen2;
    private javax.swing.JButton btn_imagen3;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_titulo1;
    private javax.swing.JLabel lbl_titulo2;
    private javax.swing.JLabel lbl_titulo3;
    private javax.swing.JLabel lbl_titulo4;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

}
