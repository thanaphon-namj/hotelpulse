/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.myproject.hotelpulse;

import com.google.firebase.database.*;
import java.io.IOException;
import java.util.logging.*;
import javax.swing.JLabel;
import javax.swing.table.*;

/**
 *
 * @author thanapon
 */
public class GuestsFrame extends javax.swing.JFrame {
    private final DatabaseReference ref;
    /**
     * Creates new form CheckInFrame
     */
    public GuestsFrame() {
        initComponents();
        
        FireBaseService fbs = null;
        
        try {
            fbs = new FireBaseService();
        } catch (IOException ex) {
            Logger.getLogger(GuestsFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ref = fbs.getDb().getReference("guests");
        updateTable();
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
        jPanel2 = new javax.swing.JPanel();
        checkinBtn = new javax.swing.JButton();
        checkoutBtn = new javax.swing.JButton();
        bookingBtn = new javax.swing.JButton();
        roomsBtn = new javax.swing.JButton();
        guestsBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        guestsT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guests");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(189, 227, 255));

        checkinBtn.setBackground(new java.awt.Color(179, 179, 179));
        checkinBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        checkinBtn.setText("Check In");
        checkinBtn.setBorderPainted(false);
        checkinBtn.setFocusPainted(false);
        checkinBtn.setFocusable(false);
        checkinBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkinBtnMouseClicked(evt);
            }
        });
        checkinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinBtnActionPerformed(evt);
            }
        });

        checkoutBtn.setBackground(new java.awt.Color(179, 179, 179));
        checkoutBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        checkoutBtn.setText("Check Out");
        checkoutBtn.setBorderPainted(false);
        checkoutBtn.setFocusPainted(false);
        checkoutBtn.setFocusable(false);
        checkoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkoutBtnMouseClicked(evt);
            }
        });

        bookingBtn.setBackground(new java.awt.Color(179, 179, 179));
        bookingBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bookingBtn.setText("Booking");
        bookingBtn.setBorderPainted(false);
        bookingBtn.setFocusPainted(false);
        bookingBtn.setFocusable(false);
        bookingBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingBtnMouseClicked(evt);
            }
        });

        roomsBtn.setBackground(new java.awt.Color(179, 179, 179));
        roomsBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        roomsBtn.setText("Rooms");
        roomsBtn.setBorderPainted(false);
        roomsBtn.setFocusPainted(false);
        roomsBtn.setFocusable(false);
        roomsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomsBtnMouseClicked(evt);
            }
        });

        guestsBtn.setBackground(new java.awt.Color(117, 117, 117));
        guestsBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        guestsBtn.setForeground(new java.awt.Color(255, 255, 255));
        guestsBtn.setText("Guests");
        guestsBtn.setBorderPainted(false);
        guestsBtn.setEnabled(false);
        guestsBtn.setFocusPainted(false);
        guestsBtn.setFocusable(false);

        backBtn.setBackground(new java.awt.Color(242, 242, 242));
        backBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backBtn.setFocusPainted(false);
        backBtn.setFocusable(false);
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(checkinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(checkoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(bookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(roomsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(guestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        guestsT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        guestsT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Room No", "Name", "Phone", "Passport", "Check-in", "Check-out", "Arriving Time", "Guests"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        guestsT.setFocusable(false);
        guestsT.setGridColor(new java.awt.Color(0, 0, 0));
        guestsT.setRowHeight(25);
        guestsT.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        guestsT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(guestsT);
        if (guestsT.getColumnModel().getColumnCount() > 0) {
            guestsT.getColumnModel().getColumn(0).setResizable(false);
            guestsT.getColumnModel().getColumn(1).setResizable(false);
            guestsT.getColumnModel().getColumn(2).setResizable(false);
            guestsT.getColumnModel().getColumn(3).setResizable(false);
            guestsT.getColumnModel().getColumn(4).setResizable(false);
            guestsT.getColumnModel().getColumn(5).setResizable(false);
            guestsT.getColumnModel().getColumn(6).setResizable(false);
            guestsT.getColumnModel().getColumn(7).setResizable(false);
        }
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        if (guestsT.getColumnModel().getColumnCount() > 0) {
            guestsT.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            guestsT.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            guestsT.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            guestsT.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            guestsT.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
            guestsT.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
            guestsT.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
            guestsT.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setText("Hotel Pulse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 909, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkinBtnActionPerformed

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        // TODO add your handling code here:
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnMouseClicked

    private void checkinBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkinBtnMouseClicked
        // TODO add your handling code here:
        CheckInFrame checkinFrame = new CheckInFrame();
        checkinFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_checkinBtnMouseClicked

    private void roomsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsBtnMouseClicked
        // TODO add your handling code here:
        RoomsFrame roomsFrame = new RoomsFrame();
        roomsFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_roomsBtnMouseClicked

    private void bookingBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingBtnMouseClicked
        // TODO add your handling code here:
        BookingFrame bookingFrame = new BookingFrame();
        bookingFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bookingBtnMouseClicked

    private void checkoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkoutBtnMouseClicked
        // TODO add your handling code here:
        CheckOutFrame checkoutFrame = new CheckOutFrame();
        checkoutFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_checkoutBtnMouseClicked

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
            java.util.logging.Logger.getLogger(GuestsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuestsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuestsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuestsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestsFrame().setVisible(true);
            }
        });
    }
    
    private void updateTable() {
        DefaultTableModel model = (DefaultTableModel) guestsT.getModel();
        model.setRowCount(0);
        
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    Guest guest = ds.getValue(Guest.class);
                    model.addRow(new Object[]{
                        guest.getNo(),
                        guest.getName(),
                        guest.getPhone(),
                        guest.getPassport(),
                        guest.getIn(),
                        guest.getOut(),
                        guest.getArriving(),
                        guest.getGuests()
                    });
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                System.out.println("The read failed: " + error.getCode());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookingBtn;
    private javax.swing.JButton checkinBtn;
    private javax.swing.JButton checkoutBtn;
    private javax.swing.JButton guestsBtn;
    private javax.swing.JTable guestsT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton roomsBtn;
    // End of variables declaration//GEN-END:variables
}
