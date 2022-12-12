/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.Administration;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Organization.AssignmentDonation;

import finalprojectUserInterface.MainJFrameForm;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author sneha
 */
public class Visualization extends javax.swing.JPanel {

    /**
     * Creates new form Visualization
     */
    MainJFrameForm MainLPage;
    //FirebaseHelper firebaseHelper;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;

    public Visualization(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        
        initComponents();
        
        display();
    }
    
    private static final int N = 128;
    private static final Random random = new Random();
    
    
    
    private ChartPanel chartPanelCategoryEntity() {
        final XYSeries series = new XYSeries("Data");
        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
                series.add(i, random.nextGaussian());
            }
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        DefaultCategoryDataset defaultCatDataset = new DefaultCategoryDataset();
        
        Map<String, Integer> hashMap = new HashMap();
        for(AssignmentDonation dasn: operatingSystem.getAssignmentDonationList()){
                String key = dasn.getCategory().toLowerCase();

                hashMap.put(key,  hashMap.containsKey(key)? 1+hashMap.get(key):1);

            }
        for(String k:hashMap.keySet()){
                System.out.println("key: "+k+": "+hashMap.get(k));
                defaultCatDataset.addValue(hashMap.get(k), "", k);
            }
        
        JFreeChart chart = ChartFactory.createBarChart("", "CATEGORY",
            "Range", defaultCatDataset, PlotOrientation.VERTICAL, false, false, false);
        return new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(N * 2, N * 2);
                }
        };
    }
    
    private ChartPanel chartPanelNameEntity() {
        final XYSeries series = new XYSeries("Data");
        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
                series.add(i, random.nextGaussian());
            }
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        DefaultCategoryDataset defaultCatDataset = new DefaultCategoryDataset();
        
        Map<String, Integer> hashMap = new HashMap();
        for(AssignmentDonation dasn: operatingSystem.getAssignmentDonationList()){
                String key = dasn.getEntityName().toLowerCase();

                hashMap.put(key,  hashMap.containsKey(key)? 1+hashMap.get(key):1);

            }
        for(String k:hashMap.keySet()){
                System.out.println("key: "+k+": "+hashMap.get(k));
                defaultCatDataset.addValue(hashMap.get(k), "", k);
            }
        
        JFreeChart chart = ChartFactory.createBarChart("", "ITEM",
            "Range", defaultCatDataset, PlotOrientation.VERTICAL, false, false, false);
        return new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(N * 2, N * 2);
                }
        };
    }
    
    private ChartPanel chartPanelEnterpriseEntity() {
        final XYSeries series = new XYSeries("Data");
            for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
                series.add(i, random.nextGaussian());
            }
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        DefaultCategoryDataset defaultCatDataset = new DefaultCategoryDataset();
        
        Map<String, Integer> hashMap = new HashMap();
        for(AssignmentDonation dasn: operatingSystem.getAssignmentDonationList()){
            try{
            String key = dasn.getDonEnterpriseClass().getNameEnterprise().toLowerCase();
            
            hashMap.put(key,  hashMap.containsKey(key)? 1+hashMap.get(key):1);
            }
            catch (Exception e){
                //JOptionPane.showMessageDialog(this,"Visualization not able to show, Try again");
            }
           
        }
        for(String k:hashMap.keySet()){
            System.out.println("key: "+k+": "+hashMap.get(k));
            defaultCatDataset.addValue(hashMap.get(k), "", k);
        }
        
        JFreeChart chart = ChartFactory.createBarChart("", "Donor User Entity.",
            "Range", defaultCatDataset, PlotOrientation.VERTICAL, false, false, false);
        return new ChartPanel(chart) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(N * 2, N * 2);
            }
        };
    }
    
    private ChartPanel chartPanelReceiverEntityChartPanel() {
        final XYSeries series = new XYSeries("Data");
        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
            series.add(i, random.nextGaussian());
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        DefaultCategoryDataset defaultCatDataset = new DefaultCategoryDataset();
        
        Map<String, Integer> hashMap = new HashMap();
        for(AssignmentDonation dasn: operatingSystem.getAssignmentDonationList()){
            try{
            String key = dasn.getRecEnterpriseClass().getNameEnterprise().toLowerCase();
            
            hashMap.put(key,  hashMap.containsKey(key)? 1+hashMap.get(key):1);
            }
            catch (Exception e){
                //e.printStackTrace();
            }
           
        }
        for(String k:hashMap.keySet()){
            System.out.println("key: "+k+": "+hashMap.get(k));
            defaultCatDataset.addValue(hashMap.get(k), "", k);
        }
        
        JFreeChart chart = ChartFactory.createBarChart("", "Receiver user Entity.",
            "Range", defaultCatDataset, PlotOrientation.VERTICAL, false, false, false);
        return new ChartPanel(chart) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(N * 2, N * 2);
            }
        };
    }
    
    private ChartPanel chartPanelStatusPanel() {
        final XYSeries series = new XYSeries("Data");
        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
            series.add(i, random.nextGaussian());
        }
 
        Map<String, Integer> hashMap = new HashMap();
        
        for(AssignmentDonation dasn: operatingSystem.getAssignmentDonationList()){
            try{
            String key = dasn.getStatusDonation().toLowerCase();
            
            hashMap.put(key,  hashMap.containsKey(key)? 1+hashMap.get(key):1);
            }
            catch (Exception e){
               // e.printStackTrace();
            }
           
        }
        DefaultPieDataset ds = new DefaultPieDataset();
//      dataset.setValue( "IPhone 5s" , new Double( 20 ) );  
        for(String k:hashMap.keySet()){
            System.out.println("key: "+k+": "+hashMap.get(k));
            ds.setValue( k , Double.valueOf( hashMap.get(k) ) ); 
        }
        
        JFreeChart chart = ChartFactory.createPieChart("CurrentStatus", 
         ds,        
         true,            
         true, 
         false);
        return new ChartPanel(chart) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(N * 2, N * 2);
            }
        };
    }
    
    private void display() {
        JFrame f = new JFrame("Graphs");
        JPanel p = new JPanel(new GridLayout(1, 1));
        p.add(chartPanelNameEntity());        
        p.add(chartPanelCategoryEntity());
        p.add(chartPanelEnterpriseEntity());
        //p.add(chartPanelReceiverEntityChartPanel());
        p.add(chartPanelStatusPanel());
        f.add(p);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText("Visualizations");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(jLabel1)
                .addContainerGap(476, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(627, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
