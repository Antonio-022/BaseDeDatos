
package proyecto;
/*0210202020202020202020202*/
import java.awt.*;
import java.sql.*;
import proyecto.datos;
import proyecto.conexionsql;
import java.util.*;
import java.util.*;
import javax.swing.table.*;

import javax.swing.*;
import javax.swing.border.Border;
/*
 * @author Fanboy022
 */
public class inteface1 extends javax.swing.JFrame {
    static ResultSet result;
    public inteface1() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        colores();
        jLabel1.setForeground(Color.white);
        conexionsql.getconexionsql();
        jButton4.setVisible(false);
        jPanel3.setVisible(true);
        cargarBD();  
        actualizar.setVisible(false);
        jPanel5.setLocation(0,100);
    }
   public void colores()
    {
        actualizar.setBackground(Color.white);
        jButton8.setBackground(Color.white);
        jButton1.setBackground(Color.RED);
        jButton1.setForeground(Color.white);
       // jButton2.setBackground(Color.white);
        jButton3.setBackground(Color.white);
        jButton4.setBackground(Color.white);
        jButton5.setBackground(Color.white);
        gener1.setBackground(Color.white);
    }
           public int contador; 
    public void cargarBD()
    {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        result = conexionsql.consulta("select*from alumno");
        try{
            while(result.next())
            {
                Vector c = new Vector();
                c.add(result.getInt(1));
                c.add(result.getString(2));
                c.add(result.getString(3));
                c.add(result.getString(4));
                c.add(result.getString(5));
                c.add(result.getString(6));
                model.addRow(c);
                tabla.setModel(model); 
            }
        }catch(SQLException e){
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        ap_pa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ap_ma = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        anho1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mes1 = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        dia1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        gener1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        TITULO = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setForeground(java.awt.Color.pink);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(64, 128, 235));

        jButton3.setText("registrar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("cancelar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("salir");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jButton1.setDoubleBuffered(true);
        jButton1.setFocusCycleRoot(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("buscar en la BD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setText("editar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        actualizar.setText("actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 890, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        jLabel8.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BIENVENIDO");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        ap_pa.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ap_pa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 128, 235), 1, true));
        ap_pa.setName("ap_pa"); // NOI18N

        jLabel9.setForeground(new java.awt.Color(64, 128, 235));
        jLabel9.setText("apellido materno");

        ap_ma.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ap_ma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 128, 235), 1, true));
        ap_ma.setName("ap_ma"); // NOI18N

        jLabel10.setForeground(new java.awt.Color(64, 128, 235));
        jLabel10.setText("ci");

        jLabel11.setForeground(new java.awt.Color(64, 128, 235));
        jLabel11.setText("fecha de nacimiento");

        cedula.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 128, 235), 1, true));

        anho1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        anho1.setForeground(new java.awt.Color(153, 153, 153));
        anho1.setText("año");
        anho1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 128, 235), 1, true));
        anho1.setName("ap_ma"); // NOI18N
        anho1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                anho1FocusGained(evt);
            }
        });
        anho1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anho1MouseClicked(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(64, 128, 235));
        jLabel12.setText("nombre");

        mes1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        mes1.setForeground(new java.awt.Color(153, 153, 153));
        mes1.setText("mes");
        mes1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 128, 235), 1, true));
        mes1.setName("ap_ma"); // NOI18N
        mes1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mes1FocusGained(evt);
            }
        });
        mes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mes1MouseClicked(evt);
            }
        });

        name.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 128, 235), 1, true));
        name.setName("name"); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        dia1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        dia1.setForeground(new java.awt.Color(153, 153, 153));
        dia1.setText("dia");
        dia1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 128, 235), 1, true));
        dia1.setName("ap_ma"); // NOI18N
        dia1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dia1FocusGained(evt);
            }
        });
        dia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia1MouseClicked(evt);
            }
        });
        dia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dia1ActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(64, 128, 235));
        jLabel13.setText("genero");

        gener1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gener1.setForeground(new java.awt.Color(51, 51, 51));
        gener1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "masculino", "femenino" }));
        gener1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 128, 235), 0, true));
        gener1.setDoubleBuffered(true);
        gener1.setName("gener1"); // NOI18N
        gener1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gener1ActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(64, 128, 235));
        jLabel14.setForeground(new java.awt.Color(64, 128, 235));
        jLabel14.setText("apellio paterno");

        jLabel15.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 153, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("REGISTRAR NUEVO USUARIO");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);

        tabla.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CI", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "FECHA DE NACIMIENTO", "GENERO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setToolTipText("");
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setDoubleBuffered(true);
        tabla.setFillsViewportHeight(true);
        tabla.setGridColor(new java.awt.Color(204, 204, 204));
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(15);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(20);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        TITULO.setFont(new java.awt.Font("Sitka Heading", 1, 48)); // NOI18N
        TITULO.setForeground(new java.awt.Color(51, 153, 255));
        TITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITULO.setText("ESTUDIANTES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(TITULO)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(ap_pa)
                    .addComponent(ap_ma)
                    .addComponent(cedula)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(anho1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dia1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(gener1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ap_pa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(5, 5, 5)
                .addComponent(ap_ma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anho1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gener1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cadena;
         cadena = JOptionPane.showConfirmDialog(this, "seguro que quieres salir?", "alerta", JOptionPane.YES_NO_OPTION);
         
        if(cadena == JOptionPane.YES_OPTION)
        {
        System.exit(0);
        }else
        {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        borrartext();
       
    }//GEN-LAST:event_jButton4ActionPerformed
public void borrartext()
{
        jButton3.setVisible(true);
        jButton8.setVisible(true);
        jButton4.setVisible(false);
        actualizar.setVisible(false);
        jLabel15.setText("REGISTRAR NUEVO USUARIO");
        mes1.setText(null);   
        dia1.setText(null);   
        anho1.setText(null);          
        name.setText(null);
        ap_pa.setText(null);
        cedula.setText(null);
        ap_ma.setText(null);
        jPanel3.setVisible(false);
        anho1.setText("año");
        mes1.setText("mes");
        dia1.setText("dia");
        gener1.setSelectedIndex(0);
        anho1.setForeground(Color.gray);
        mes1.setForeground(Color.gray);
        dia1.setForeground(Color.gray);
        jPanel3.setVisible(true);
        cargarBD();
        
}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

     String fecha ="";
     String cad = "0";
     String cad1 = "0";

        if(mes1.getText().length() == 1 & dia1.getText().length() == 1){
            cad = cad + mes1.getText();
            cad1 = cad1 + dia1.getText();
            fecha  = (anho1.getText()+cad+cad1);
        
        }
        else if(mes1.getText().length() == 1 & dia1.getText().length() != 1){
            cad = cad + mes1.getText();
            
            
            fecha  = (anho1.getText()+cad+dia1.getText());
        }
        else if(dia1.getText().length() == 1 & mes1.getText().length() != 1){
            cad1 = cad1 + dia1.getText();
            fecha  = (anho1.getText()+mes1.getText()+cad1);
        }
        else{
            fecha = anho1.getText()+mes1.getText()+dia1.getText();
        }

       
        if(name.getText().isEmpty()|| ap_pa.getText().isEmpty() ||ap_ma.getText().isEmpty() || cedula.getText().isEmpty() || anho1.getText().isEmpty()|| mes1.getText().isEmpty()|| dia1.getText().isEmpty())
        {
            
            JOptionPane.showMessageDialog(this, "error, casillas vacias", "alerta",JOptionPane.ERROR_MESSAGE);
            borrartext();
        }
        else
        {
 
             try{
                  result = conexionsql.consulta("select COUNT (ci) from alumno where ci='"+Integer.parseInt(cedula.getText())+"'");
                  try
                  {
                      while (result.next())
                      {
                          contador = result.getInt(1);
                      }
                      
                  }catch(SQLException e)
                  {
                      
                  }
                  if(contador >= 1)
                  {
                      JOptionPane.showMessageDialog(this, "error, el usuario ya existe", "alerta",JOptionPane.ERROR_MESSAGE);
                      cedula.setRequestFocusEnabled(true);
                      cedula.setBorder(BorderFactory.createLineBorder(Color.red));
                      jLabel1.setForeground(Color.red);
                  }
                  else{
                      datos.datosentrada(Integer.parseInt(cedula.getText()), name.getText(),ap_pa.getText(), ap_ma.getText(), fecha, gener1.getSelectedItem().toString());
                      cargarBD();
                      JOptionPane.showMessageDialog(null, "usuario registrado exitosamente", "registror",JOptionPane.INFORMATION_MESSAGE);
                      borrartext();
                      cedula.setBorder(BorderFactory.createLineBorder(Color.decode("#4080EB")));
                      cedula.setRequestFocusEnabled(false);
                      jLabel1.setForeground(Color.white);
                }
             }
             catch(SQLException e){
                 
          }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
        
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        busquedaBD j = new busquedaBD();
        dispose();
        j.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 

       try{
   
        int sun;
        int tablita = tabla.getSelectedRow();
        actualizar.setVisible(false);
        
        sun = JOptionPane.showConfirmDialog(this, "seguro que quieres editar al usuario : "+tabla.getValueAt(tablita, 1).toString()+" ?","advertencia",JOptionPane.YES_NO_OPTION);
        if(sun == JOptionPane.YES_OPTION)
        {
        jButton4.setVisible(true);
        jButton3.setVisible(false);
        jButton8.setVisible(false);
        actualizar.setVisible(true);
        jLabel15.setText("DATOS DE : "+tabla.getValueAt(tablita, 1).toString());
        anho1.setForeground(Color.black);
        mes1.setForeground(Color.black);
        dia1.setForeground(Color.black);
        cedula.setText(tabla.getValueAt(tablita, 0).toString());
        name.setText(tabla.getValueAt(tablita, 1).toString());
        ap_pa.setText(tabla.getValueAt(tablita, 2).toString());
        ap_ma.setText(tabla.getValueAt(tablita, 3).toString());
       if (tabla.getValueAt(tablita, 5).equals("femenino" )||tabla.getValueAt(tablita, 5).equals("female"))
       {
           gener1.setSelectedIndex(1);
       }else if(tabla.getValueAt(tablita, 5).equals("masculino")||tabla.getValueAt(tablita, 5).equals("male"))
       {
           gener1.setSelectedIndex(0);
       }
       String dato = tabla.getValueAt(tablita,4).toString();
       String[]  d= dato.split("-");
       String dia = d[2];
       String mes = d[1];
       String alo = d[0];
       anho1.setText(alo);
       mes1.setText(mes);
       dia1.setText(dia);
        }else{
            
           anho1.setForeground(Color.GRAY);
           mes1.setForeground(Color.GRAY);
           dia1.setForeground(Color.GRAY);
           jLabel15.setText("REGISTRAR NUEVO USUARIO");
           
           borrartext();}
       }catch(Exception e)
       {
           anho1.setForeground(Color.GRAY);
           mes1.setForeground(Color.GRAY);
           dia1.setForeground(Color.GRAY);
           jLabel15.setText("REGISTRAR NUEVO USUARIO");
           actualizar.setVisible(false);
           JOptionPane.showMessageDialog(this,"no se ha seleccionado un usuario");

       }
       
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
     String fecha ="";
     String cad = "0";
     String cad1 = "0";
     
int tablita = tabla.getSelectedRow();
int valor1 = Integer.parseInt(tabla.getValueAt(tablita, 0).toString());
        if(mes1.getText().length() == 1 & dia1.getText().length() == 1){
            cad += mes1.getText();
            cad1 += dia1.getText();
            fecha  = (anho1.getText()+cad+cad1);
        
        }
        else if(mes1.getText().length() == 1 & dia1.getText().length() != 1){
            cad += mes1.getText();
            
            
            fecha  = (anho1.getText()+cad+dia1.getText());
        }
        else if(dia1.getText().length() == 1 & mes1.getText().length() != 1){
            cad1 += dia1.getText();
            fecha  = (anho1.getText()+mes1.getText()+cad1);
        }
        else{
            fecha = anho1.getText()+mes1.getText()+dia1.getText();
        }
        try
        {
             datos.actualizacion(Integer.parseInt(cedula.getText()), name.getText(),ap_pa.getText(), ap_ma.getText(), fecha, gener1.getSelectedItem().toString(),valor1);
             cargarBD();
             JOptionPane.showMessageDialog(this, "usuario actualizado exitosamente", "actualizacion",JOptionPane.INFORMATION_MESSAGE);
             borrartext();
        }catch(SQLException e)
        {
            
        }
        
    }//GEN-LAST:event_actualizarActionPerformed

    private void gener1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gener1ActionPerformed

    }//GEN-LAST:event_gener1ActionPerformed

    private void dia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dia1ActionPerformed

    private void dia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia1MouseClicked
        dia1.setText("");
        dia1.setForeground(Color.black);
    }//GEN-LAST:event_dia1MouseClicked

    private void dia1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dia1FocusGained
        dia1.setText("");
        dia1.setForeground(Color.black);
    }//GEN-LAST:event_dia1FocusGained

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void mes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mes1MouseClicked
        mes1.setText("");
        mes1.setForeground(Color.black);
    }//GEN-LAST:event_mes1MouseClicked

    private void mes1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mes1FocusGained
        mes1.setText("");
        mes1.setForeground(Color.black);
    }//GEN-LAST:event_mes1FocusGained

    private void anho1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anho1MouseClicked

        anho1.setText("");
        anho1.setForeground(Color.black);
    }//GEN-LAST:event_anho1MouseClicked

    private void anho1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_anho1FocusGained
        anho1.setText("");
        anho1.setForeground(Color.black);
    }//GEN-LAST:event_anho1FocusGained

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inteface1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO;
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField anho1;
    private javax.swing.JTextField ap_ma;
    private javax.swing.JTextField ap_pa;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField dia1;
    private javax.swing.JComboBox<String> gener1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mes1;
    private javax.swing.JTextField name;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
