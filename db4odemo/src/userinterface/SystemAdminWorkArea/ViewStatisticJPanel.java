/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

    /**
 *
 * @author sakshi
 * @author tarushukla
 */
public class ViewStatisticJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewStatisticJPanel
     */
    
        private JPanel userProcessContainer;
        private EcoSystem ecosystem;
       public ViewStatisticJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.ecosystem = ecosystem;
       }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnNetworkData = new javax.swing.JButton();
        btnEnterpriseData = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/93634-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 66, 66));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Select label from below to view statistics");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 26, -1, 33));

        btnNetworkData.setForeground(new java.awt.Color(51, 102, 255));
        btnNetworkData.setText("Network Data");
        btnNetworkData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNetworkDataActionPerformed(evt);
            }
        });
        add(btnNetworkData, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 71, 140, -1));

        btnEnterpriseData.setForeground(new java.awt.Color(51, 102, 255));
        btnEnterpriseData.setText("Enterprise Data");
        btnEnterpriseData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterpriseDataActionPerformed(evt);
            }
        });
        add(btnEnterpriseData, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 118, 140, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/icons/stats101.jpeg"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 500, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNetworkDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNetworkDataActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(Network n : ecosystem.getNetworkList()){
            dataset.setValue(n.getEnterpriseDirectory().getEnterpriseList().size(), "Number of Enterprises", n.getName());
        }

        JFreeChart chart = ChartFactory.createBarChart("Networks", "Enterprises", "Number", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Bar Chart", chart);
        frame.setVisible(true);
        frame.setSize(1000, 1000);
    }//GEN-LAST:event_btnNetworkDataActionPerformed

    private void btnEnterpriseDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterpriseDataActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(Network n : ecosystem.getNetworkList()){
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList())

            dataset.setValue(e.getOrganizationDirectory().getOrganizationList().size(), "Number of Organizations",String.valueOf(e.getOrgCity()));
        }

        JFreeChart chart = ChartFactory.createBarChart("Enterprises", "Organizations", "Number", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Bar Chart", chart);
        frame.setVisible(true);
        frame.setSize(1000, 1000);
    }//GEN-LAST:event_btnEnterpriseDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnterpriseData;
    private javax.swing.JButton btnNetworkData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    // End of variables declaration//GEN-END:variables
}