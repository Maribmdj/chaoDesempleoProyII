/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaodesempleo;

/**
 *
 * @author Mariela
 */
public class FormularioCompany extends javax.swing.JFrame {

    /**
     * Creates new form FormularioAdmin
     */
    public FormularioCompany() {
        initComponents();
        p33.setVisible(false);
        paneltabla(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p33 = new javax.swing.JPanel();
        namel = new javax.swing.JLabel();
        puestol = new javax.swing.JLabel();
        rangol = new javax.swing.JLabel();
        fechainil2 = new javax.swing.JLabel();
        fechainif2 = new com.toedter.calendar.JDateChooser();
        fechafinl2 = new javax.swing.JLabel();
        fechafinf2 = new com.toedter.calendar.JDateChooser();
        nombref = new javax.swing.JComboBox<>();
        puestof = new javax.swing.JComboBox<>();
        rangof = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        paneltabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p33.setBackground(new java.awt.Color(255, 255, 255));

        namel.setText("Nombre");

        puestol.setText("Puesto");

        rangol.setText("Rango de Edad");

        fechainil2.setText("                  de: ");

        fechainif2.setDateFormatString("DD/MM/YYYY");
        fechainif2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fechafinl2.setText("hasta:");

        fechafinf2.setDateFormatString("DD/MM/YYYY");
        fechafinf2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nombref.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        puestof.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        rangof.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p33Layout = new javax.swing.GroupLayout(p33);
        p33.setLayout(p33Layout);
        p33Layout.setHorizontalGroup(
            p33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p33Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(fechainil2)
                .addGap(4, 4, 4)
                .addComponent(fechainif2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(fechafinl2)
                .addGap(10, 10, 10)
                .addComponent(fechafinf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombref, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(puestol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puestof, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rangol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rangof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );
        p33Layout.setVerticalGroup(
            p33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namel)
                    .addComponent(puestol)
                    .addComponent(rangol)
                    .addComponent(nombref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puestof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rangof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(p33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechainil2)
                    .addComponent(fechainif2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechafinl2)
                    .addComponent(fechafinf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        paneltabla.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Solicitantes", "Informacion", "Descargar CV"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout paneltablaLayout = new javax.swing.GroupLayout(paneltabla);
        paneltabla.setLayout(paneltablaLayout);
        paneltablaLayout.setHorizontalGroup(
            paneltablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltablaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        paneltablaLayout.setVerticalGroup(
            paneltablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltablaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Consultas");

        jMenuItem3.setText("Listado de Puestos Solicitados");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

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
            .addComponent(p33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneltabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneltabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        p33.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           paneltabla.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fechafinf2;
    private javax.swing.JLabel fechafinl2;
    private com.toedter.calendar.JDateChooser fechainif2;
    private javax.swing.JLabel fechainil2;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel namel;
    private javax.swing.JComboBox<String> nombref;
    private javax.swing.JPanel p33;
    private javax.swing.JPanel paneltabla;
    private javax.swing.JComboBox<String> puestof;
    private javax.swing.JLabel puestol;
    private javax.swing.JComboBox<String> rangof;
    private javax.swing.JLabel rangol;
    // End of variables declaration//GEN-END:variables
}