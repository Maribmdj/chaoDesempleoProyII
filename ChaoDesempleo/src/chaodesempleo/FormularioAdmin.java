/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaodesempleo;
import org.xml.sax.Attributes;

/**
 *
 * @author Mariela
 */
public class FormularioAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FormularioAdmin
     */
    public FormularioAdmin() {
        initComponents();
        p11.setVisible(false);
        p22.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p11 = new javax.swing.JPanel();
        p22 = new javax.swing.JPanel();
        namel = new javax.swing.JLabel();
        namef = new javax.swing.JTextField();
        lastnamel = new javax.swing.JLabel();
        lastname1f = new javax.swing.JTextField();
        lastname2l = new javax.swing.JLabel();
        lastname2f = new javax.swing.JTextField();
        idl = new javax.swing.JLabel();
        idf = new javax.swing.JTextField();
        fechainil2 = new javax.swing.JLabel();
        fechainif2 = new com.toedter.calendar.JDateChooser();
        fechafinl2 = new javax.swing.JLabel();
        fechafinf2 = new com.toedter.calendar.JDateChooser();
        nombrel1 = new javax.swing.JLabel();
        edadf1 = new javax.swing.JComboBox<>();
        edadl1 = new javax.swing.JLabel();
        fechainif1 = new com.toedter.calendar.JDateChooser();
        fechafinf1 = new com.toedter.calendar.JDateChooser();
        fechainil1 = new javax.swing.JLabel();
        fechafinl1 = new javax.swing.JLabel();
        gradof1 = new javax.swing.JComboBox<>();
        gradol1 = new javax.swing.JLabel();
        nombref = new javax.swing.JComboBox<>();
        paneltabla = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p11.setBackground(new java.awt.Color(255, 255, 255));
        p11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p22.setBackground(new java.awt.Color(255, 255, 255));

        namel.setText("Nombre");

        lastnamel.setText("Primer Apellido ");

        lastname2l.setText("Segundo Apellido");

        idl.setText("Cedula");

        fechainil2.setText("                  de: ");

        fechainif2.setDateFormatString("DD/MM/YYYY");
        fechainif2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fechafinl2.setText("hasta:");

        fechafinf2.setDateFormatString("DD/MM/YYYY");
        fechafinf2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout p22Layout = new javax.swing.GroupLayout(p22);
        p22.setLayout(p22Layout);
        p22Layout.setHorizontalGroup(
            p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p22Layout.createSequentialGroup()
                        .addComponent(namel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namef, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p22Layout.createSequentialGroup()
                        .addComponent(idl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idf)))
                .addGap(18, 18, 18)
                .addGroup(p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p22Layout.createSequentialGroup()
                        .addComponent(lastnamel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastname1f, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastname2l)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastname2f))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p22Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fechainil2)
                        .addGap(4, 4, 4)
                        .addComponent(fechainif2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(fechafinl2)
                        .addGap(10, 10, 10)
                        .addComponent(fechafinf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        p22Layout.setVerticalGroup(
            p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namel)
                    .addComponent(namef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnamel)
                    .addComponent(lastname1f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname2l)
                    .addComponent(lastname2f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idl)
                        .addComponent(idf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fechainil2)
                        .addComponent(fechainif2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fechafinl2)
                        .addComponent(fechafinf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        p11.add(p22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 597, -1));

        nombrel1.setText("Nombre");
        p11.add(nombrel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        edadf1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-18", "18-30", "31-45", "46-55", "56-65", "66-75", "+75" }));
        p11.add(edadf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 11, -1, -1));

        edadl1.setText("Edad");
        p11.add(edadl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 14, -1, -1));

        fechainif1.setDateFormatString("DD/MM/YYYY");
        fechainif1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p11.add(fechainif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        fechafinf1.setDateFormatString("DD/MM/YYYY");
        fechafinf1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p11.add(fechafinf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        fechainil1.setText("Publicacion de: ");
        p11.add(fechainil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        fechafinl1.setText("hasta:");
        p11.add(fechafinl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        gradof1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        p11.add(gradof1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 11, -1, -1));

        gradol1.setText("GradoAcademico");
        p11.add(gradol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 14, -1, -1));

        nombref.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        p11.add(nombref, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 90, -1));

        paneltabla.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout paneltablaLayout = new javax.swing.GroupLayout(paneltabla);
        paneltabla.setLayout(paneltablaLayout);
        paneltablaLayout.setHorizontalGroup(
            paneltablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paneltablaLayout.setVerticalGroup(
            paneltablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jMenu1.setText("Consultas");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Puestos por empresa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Empresas Asociadas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Usuarios sin modificar clave");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operaciones");

        jMenuItem4.setText("Agregar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Editar");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Eliminar");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Estadísticas");

        jMenuItem7.setText("Solicitantes por edad");
        jMenu3.add(jMenuItem7);

        jMenuItem9.setText("Solicitantes por Canton");
        jMenu3.add(jMenuItem9);

        jMenuItem8.setText("Solicitantes por distrito");
        jMenu3.add(jMenuItem8);

        jMenuItem10.setText("Solicitantes por provincia");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Top N de empresas con mayor solicitud");
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Top N de puestos con mayor solicitud");
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneltabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneltabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        p11.setVisible(true);
        p22.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> edadf1;
    private javax.swing.JLabel edadl1;
    private com.toedter.calendar.JDateChooser fechafinf1;
    private com.toedter.calendar.JDateChooser fechafinf2;
    private javax.swing.JLabel fechafinl1;
    private javax.swing.JLabel fechafinl2;
    private com.toedter.calendar.JDateChooser fechainif1;
    private com.toedter.calendar.JDateChooser fechainif2;
    private javax.swing.JLabel fechainil1;
    private javax.swing.JLabel fechainil2;
    private javax.swing.JComboBox<String> gradof1;
    private javax.swing.JLabel gradol1;
    private javax.swing.JTextField idf;
    private javax.swing.JLabel idl;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JTextField lastname1f;
    private javax.swing.JTextField lastname2f;
    private javax.swing.JLabel lastname2l;
    private javax.swing.JLabel lastnamel;
    private javax.swing.JTextField namef;
    private javax.swing.JLabel namel;
    private javax.swing.JComboBox<String> nombref;
    private javax.swing.JLabel nombrel1;
    private javax.swing.JPanel p11;
    private javax.swing.JPanel p22;
    private javax.swing.JPanel paneltabla;
    // End of variables declaration//GEN-END:variables
}
