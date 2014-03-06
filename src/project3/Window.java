/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

//JUNG LIBRARY
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

//API DE JAVA
import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author josehernandez
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    DefaultListModel modelo;

    Graph g1; //Grafo principal, ciudades y sus vuelos

    public Window() {
        initComponents();
        modelo = new DefaultListModel();
        g1 = new DirectedSparseGraph<String, RutaArista>();

        //Agregar Los Vertices(Aeropuertos)
        g1.addVertex("TGU");//Aeropuerto de Tegucigalpa
        g1.addVertex("MIA");//Aeropuerto de Miami
        g1.addVertex("ATL");//Aeropuerto de Atlanta
        g1.addVertex("JFK");//Aeropuerto de New York City
        g1.addVertex("SAP");//Aeropuerto de San Pedro Sula
        g1.addVertex("RTB");//Aeropuerto de Roatán
        g1.addVertex("MEX");//Aeropuerto de Mexico City
        g1.addVertex("SAL");//Aeropuerto de San Salvador
        g1.addVertex("MGA");//Aeropuerto de Managua
        g1.addVertex("PTY");//Aeropuerto de Panama City
        g1.addVertex("BOG");//Aeropuerto de Bogotá
        g1.addVertex("LIM");//Aeropuerto de Lima
        g1.addVertex("CUN");//Aeropuerto de Cancun
        g1.addVertex("PHL");//Aeropuerto de Philadelphia
        g1.addVertex("LAX");//Aeropuerto de Los Angeles
        g1.addVertex("DFW");//Aeropuerto de Dallas
        g1.addVertex("SEA");//Aeropuerto de Seattle
        g1.addVertex("MAD");//Aeropuerto de Madrid
        g1.addVertex("HNL");//Aeropuerto de Honolulu
        g1.addVertex("BER");//Aeropuerto de Berlin
        g1.addVertex("HND");//Aeropuerto de Tokyo
        g1.addVertex("AMS");//Aeropuerto de Amsterdam
        g1.addVertex("NAP");//Aeropuerto de Napoli
        g1.addVertex("BWI");//Aeropuerto de Baltimore-Washington D.C.

        //Agregar las Aristas (Vuelos y Sus Precios)
        g1.addEdge(new RutaArista("Avianca Avianca Taca", 706.30), "TGU", "MIA");
        g1.addEdge(new RutaArista("American Airlines", 706.30), "TGU", "CUN");
        g1.addEdge(new RutaArista("Delta Airlines", 557.81), "ATL", "JFK");
        g1.addEdge(new RutaArista("American Airlines", 877.10), "TGU", "BWI");
        g1.addEdge(new RutaArista("Avianca Avianca Taca", 183.70), "TGU", "SAP");
        g1.addEdge(new RutaArista("Avianca Taca", 497.03), "SAL", "TGU");
        g1.addEdge(new RutaArista("Avianca Taca", 159.00), "SAP", "RTB");
        g1.addEdge(new RutaArista("Avianca Taca", 198.20), "RTB", "TGU");
        g1.addEdge(new RutaArista("Avianca Taca", 529.76), "SAP", "MGA");
        g1.addEdge(new RutaArista("American Airlines", 589.10), "MIA", "MEX");
        g1.addEdge(new RutaArista("Avianca Taca", 646.65), "MEX", "SAL");
        g1.addEdge(new RutaArista("American Airlines", 586.90), "MIA", "TGU");
        g1.addEdge(new RutaArista("Avianca Taca", 417.93), "SAP", "SAL");
        g1.addEdge(new RutaArista("Avianca Taca", 431.73), "MGA", "SAL");
        g1.addEdge(new RutaArista("Avianca Taca", 520.33), "SAL", "PTY");
        g1.addEdge(new RutaArista("Avianca Taca", 441.93), "SAL", "MGA");
        g1.addEdge(new RutaArista("American Airlines", 548.66), "PTY", "MIA");
        g1.addEdge(new RutaArista("Avianca Avianca Taca", 520.33), "PTY", "BOG");
        g1.addEdge(new RutaArista("Avianca Taca", 638.13), "BOG", "LIM");
        g1.addEdge(new RutaArista("Avianca Taca", 554.96), "PHL", "ATL");
        g1.addEdge(new RutaArista("Avianca Taca", 641.81), "TGU", "ATL");
        g1.addEdge(new RutaArista("Avianca Taca", 1738.36), "LIM", "TGU");
        g1.addEdge(new RutaArista("Avianca Taca", 194.88), "TGU", "RTB");
        g1.addEdge(new RutaArista("Avianca Taca", 897.20), "TGU", "BOG");
        g1.addEdge(new RutaArista("United", 859.00), "CUN", "SAP");
        g1.addEdge(new RutaArista("American Airlines", 543.25), "MIA", "PHL");
        g1.addEdge(new RutaArista("Copa Airlines", 427.49), "SAP", "MEX");
        g1.addEdge(new RutaArista("Copa Airlines", 651.80), "SAP", "PTY");
        g1.addEdge(new RutaArista("Copa Airlines", 1133.40), "TGU", "LAX");
        g1.addEdge(new RutaArista("Copa Airlines", 1123.40), "LAX", "SAP");
        g1.addEdge(new RutaArista("American Airlines", 483.55), "SEA", "DFW");
        g1.addEdge(new RutaArista("American Airlines", 381.00), "MIA", "JFK");
        g1.addEdge(new RutaArista("American Airlines", 2912.00), "JFK", "MAD");
        g1.addEdge(new RutaArista("American Airlines", 488.00), "MEX", "BWI");
        g1.addEdge(new RutaArista("American Airlines", 266.00), "BWI", "LAX");
        g1.addEdge(new RutaArista("American Airlines", 406.00), "LAX", "HNL");
        g1.addEdge(new RutaArista("American Airlines", 425.00), "MIA", "SEA");
        g1.addEdge(new RutaArista("American Airlines", 2907.00), "MIA", "BER");
        g1.addEdge(new RutaArista("easyJet", 300.34), "BER", "MAD");
        g1.addEdge(new RutaArista("Delta", 2006.00), "JFK", "HND");
        g1.addEdge(new RutaArista("American Airlines", 453.45), "NAP", "AMS");
        g1.addEdge(new RutaArista("American Airlines", 3074.80), "AMS", "JFK");
        g1.addEdge(new RutaArista("American Airlines", 528.36), "DFW", "MIA");
        g1.addEdge(new RutaArista("American Airlines", 3754.47), "MIA", "AMS");
        g1.addEdge(new RutaArista("Spirit", 190.32), "SAP", "MIA");
        g1.addEdge(new RutaArista("Spirit", 405.82), "SAL", "JFK");
        g1.addEdge(new RutaArista("easyJet", 383.13), "MAD", "NAP");
        g1.addEdge(new RutaArista("United", 304.00), "HNL", "HND");
        g1.addEdge(new RutaArista("United", 307.00), "HND", "HNL");
        g1.addEdge(new RutaArista("American Airlines", 788.00), "HND", "LAX");
        g1.addEdge(new RutaArista("American Airlines", 408.00), "HNL", "LAX");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        ciudades_lista = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        ciudades_cmBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        origen_cmBox = new javax.swing.JComboBox();
        btnAgregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aerolineas H&G");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jButton1.setText("Buscar Vuelo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 130, 124, 29);

        jLabel3.setText("Escalas");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 220, 50, 16);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 200, 300, 10);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Origen", "Destino", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 240, 300, 180);

        jScrollPane1.setViewportView(ciudades_lista);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 30, 130, 150);

        jLabel2.setText("Ciudades");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 60, 60, 16);

        ciudades_cmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TGU", "ATL", "SAL", "SAP", "RTB", "MIA", "MEX", "MGA", "PTY", "BOG", "PHL", "LIM", "CUN", "LAX", "SEA", "JFK", "BWI", "NAP", "AMS", "DFW", "SPS", "MAD", "HNL", "HND", "BER" }));
        ciudades_cmBox.setSelectedIndex(ciudades_cmBox.getItemCount()-1);
        ciudades_cmBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudades_cmBoxActionPerformed(evt);
            }
        });
        jPanel1.add(ciudades_cmBox);
        ciudades_cmBox.setBounds(10, 80, 110, 27);

        jLabel1.setText("Ciudades a Visitar");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 10, 120, 16);

        jLabel4.setText("Origen");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 10, 50, 16);

        origen_cmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TGU", "ATL", "SAL", "SAP", "RTB", "MIA", "MEX", "MGA", "PTY", "BOG", "PHL", "LIM", "CUN", "LAX", "SEA", "JFK", "BWI", "NAP", "AMS", "DFW", "SPS", "MAD", "HNL", "HND", "BER" }));
        origen_cmBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origen_cmBoxActionPerformed(evt);
            }
        });
        jPanel1.add(origen_cmBox);
        origen_cmBox.setBounds(10, 30, 110, 27);

        btnAgregar.setText("+");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(120, 80, 40, 30);

        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 160, 97, 29);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Generar Grafo");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator2);

        jMenuItem2.setText("Salir");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        modelo.add(modelo.getSize(), ciudades_cmBox.getSelectedItem());
        ciudades_lista.setModel(modelo);
        ciudades_cmBox.removeItemAt(ciudades_cmBox.getSelectedIndex());
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void origen_cmBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origen_cmBoxActionPerformed
        if (!modelo.isEmpty()) {
            modelo.set(0, origen_cmBox.getSelectedItem());
            ciudades_lista.setModel(modelo);
        } else {
            modelo.add(0, origen_cmBox.getSelectedItem());
            ciudades_lista.setModel(modelo);
        }
    }//GEN-LAST:event_origen_cmBoxActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        /*SimpleGraphView sgv = new SimpleGraphView(); //We create our graph in here
         // The Layout<V, E> is parameterized by the vertex and edge types
         Layout<Integer, String> layout = new CircleLayout(sgv.g1);
         layout.setSize(new Dimension(500, 500)); // sets the initial size of the space
         // The BasicVisualizationServer<V,E> is parameterized by the edge types
         BasicVisualizationServer<Integer, String> vv
         = new BasicVisualizationServer<Integer, String>(layout);
         vv.setPreferredSize(new Dimension(600, 600)); //Sets the viewing area size
         vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
         vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
         vv.getRenderer().getVertexLabelRenderer().setPosition(Position.CNTR);
         JFrame frame = new JFrame("Mapa de Ciudades");
         frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         frame.getContentPane().add(vv);
         frame.pack();
         frame.setVisible(true);*/
        // I create the graph in the following...
        InteractiveGraphView1 sgv = new InteractiveGraphView1();
        // Layout<V, E>, VisualizationComponent<V,E>
        Layout<Integer, String> layout = new CircleLayout(sgv.g1);
        layout.setSize(new Dimension(300, 300));
        VisualizationViewer<Integer, String> vv
                = new VisualizationViewer<Integer, String>(layout);
        vv.setPreferredSize(new Dimension(350, 350));
        // Show vertex and edge labels
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
        // Create a graph mouse and add it to the visualization component
        DefaultModalGraphMouse gm = new DefaultModalGraphMouse();
        gm.setMode(ModalGraphMouse.Mode.TRANSFORMING);
        vv.setGraphMouse(gm);
        JFrame frame = new JFrame("Mapa de Ciudades");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);

    }//GEN-LAST:event_jButton2MouseClicked

    private void ciudades_cmBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudades_cmBoxActionPerformed
        if (ciudades_cmBox.getSelectedItem() == origen_cmBox.getSelectedItem()) {
            JOptionPane.showMessageDialog(null, "No puede visitar su ciudad de origen", "Error", JOptionPane.ERROR_MESSAGE);
            btnAgregar.setEnabled(false);
        } else {
            btnAgregar.setEnabled(true);
        }
    }//GEN-LAST:event_ciudades_cmBoxActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        /*SimpleGraphView sgv = new SimpleGraphView(); //We create our graph in here
         // The Layout<V, E> is parameterized by the vertex and edge types
         Layout<Integer, String> layout = new CircleLayout(sgv.g1);
         layout.setSize(new Dimension(500, 500)); // sets the initial size of the space
         // The BasicVisualizationServer<V,E> is parameterized by the edge types
         BasicVisualizationServer<Integer, String> vv
         = new BasicVisualizationServer<Integer, String>(layout);
         vv.setPreferredSize(new Dimension(600, 600)); //Sets the viewing area size
         vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
         vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
         vv.getRenderer().getVertexLabelRenderer().setPosition(Position.CNTR);
         JFrame frame = new JFrame("Mapa de Ciudades");
         frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         frame.getContentPane().add(vv);
         frame.pack();
         frame.setVisible(true);*/
        // I create the graph in the following...
        InteractiveGraphView1 sgv = new InteractiveGraphView1();
        // Layout<V, E>, VisualizationComponent<V,E>
        Layout<Integer, String> layout = new CircleLayout(sgv.g1);
        layout.setSize(new Dimension(300, 300));
        VisualizationViewer<Integer, String> vv
                = new VisualizationViewer<Integer, String>(layout);
        vv.setPreferredSize(new Dimension(350, 350));
        // Show vertex and edge labels
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
        // Create a graph mouse and add it to the visualization component
        DefaultModalGraphMouse gm = new DefaultModalGraphMouse();
        gm.setMode(ModalGraphMouse.Mode.TRANSFORMING);
        vv.setGraphMouse(gm);
        JFrame frame = new JFrame("Mapa de Ciudades");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox ciudades_cmBox;
    private javax.swing.JList ciudades_lista;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox origen_cmBox;
    // End of variables declaration//GEN-END:variables
}
