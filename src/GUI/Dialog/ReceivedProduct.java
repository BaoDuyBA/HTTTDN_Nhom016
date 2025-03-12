/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.Dialog;

import BUS.PhieuNhapBUS;
import DAO.ChiTietPhieuNhapDAO;
import DAO.NhaCungCapDAO;
import DAO.SanPhamDAO;
import DTO.ChiTietPhieuNhapDTO;
import DTO.NguoiDungDTO;
import DTO.NhaCungCapDTO;
import DTO.PhieuNhapDTO;
import DTO.SanPhamDTO;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author trant
 */
public class ReceivedProduct extends javax.swing.JFrame{

    /**
     * Creates new form ReceivedProduct
     */
    PhieuNhapBUS pnBUS = new PhieuNhapBUS();
    DecimalFormat formatter = new DecimalFormat("###, ###, ###");        
    private PhieuNhapDTO pnDTO;
    private NguoiDungDTO userDTO;
    public ReceivedProduct(PhieuNhapDTO pn, NguoiDungDTO user) {
        userDTO = user ;
        pnDTO = pn;
        initComponents();
        
        modelCTPN = (DefaultTableModel) tblChiTietPhieu.getModel();

        
        renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        tblChiTietPhieu.setDefaultRenderer(String.class, renderer);

        loadTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChiTietPhieu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Xác nhận đơn hàng");
        setAlwaysOnTop(true);

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Xác nhận nhận hàng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(415, 415, 415))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblChiTietPhieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên sản phẩm", "Nhà cung cấp", "Số lượng nhập", "Số lượng nhận"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChiTietPhieu.setEditingColumn(4);
        tblChiTietPhieu.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(tblChiTietPhieu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            receiving();
        } catch (SQLException ex) {
            Logger.getLogger(ReceivedProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void loadTable(){

        modelCTPN.setRowCount(0);
        try {
            
            ArrayList<ChiTietPhieuNhapDTO> CTPhieu = ChiTietPhieuNhapDAO.getInstance().getDetailPhieuNhap(pnDTO.getMaPhieuNhap());
            DefaultTableModel tblCTPhieumd = (DefaultTableModel) tblChiTietPhieu.getModel();
            tblCTPhieumd.setRowCount(0);
            
            for (int i = 0; i < CTPhieu.size(); i++) {
                
                int maSanPham = CTPhieu.get(i).getMaSanPham();
                String tenSanPham = SanPhamDAO.getInstance().getNameByID(maSanPham);
                int soLuongDat = CTPhieu.get(i).getSoLuongNhap();
                int maNCC = CTPhieu.get(i).getMaNhaCungCap();
                NhaCungCapDTO ncc = NhaCungCapDAO.getInstance().getByID(maNCC);
                
                modelCTPN.addRow(new Object[]{
                    i + 1,  tenSanPham, ncc.getTenNhaCungCap(),soLuongDat, ""
                });
                
            }
            for(int i = 0; i < tblChiTietPhieu.getColumnCount(); i++){
                tblChiTietPhieu.getColumnModel().getColumn(i).setCellRenderer(renderer);
            }
        } catch (Exception e) {
        }
    }
    
    
    public void receiving() throws SQLException{
        int row = tblChiTietPhieu.getRowCount();
        int kq = 0;
        for(int i =0 ; i< row ; i++){
            if(tblChiTietPhieu.getValueAt(i, 4).equals("")){
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ số lượng nhận hàng của từng sản phẩm!");
                return ;
            }
            try {
                String value = tblChiTietPhieu.getValueAt(i, 4).toString();
                Integer.valueOf(value.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng ở dạng số tự nhiên!");
                return ;
            }
            int soLuongNhan = Integer.parseInt(tblChiTietPhieu.getValueAt(i, 4).toString().trim());
            int soLuongNhap = Integer.parseInt(tblChiTietPhieu.getValueAt(i,3 ).toString().trim());
            String ten = tblChiTietPhieu.getValueAt(i, 1).toString();
            if(soLuongNhan < 0 || soLuongNhan > soLuongNhap ){
                JOptionPane.showMessageDialog(this, "Số lượng nhận của sản phẩm " + ten + " không hợp lệ");
                return ;
            }  else {
                ChiTietPhieuNhapDTO ctpn = new ChiTietPhieuNhapDTO();
                ctpn.setMaPhieuNhap(pnDTO.getMaPhieuNhap());
                SanPhamDTO sp = SanPhamDAO.getInstance().selectProductByName(tblChiTietPhieu.getValueAt(i, 1).toString());
                ctpn.setMaSanPham(sp.getMaSanPham());
                NhaCungCapDTO ncc = NhaCungCapDAO.getInstance().getNCCByName(tblChiTietPhieu.getValueAt(i, 2).toString());
                ctpn.setMaNhaCungCap(ncc.getMaNhaCungCap());
                ctpn.setSoLuongNhap(soLuongNhap);
                ctpn.setSoLuongThucTe(soLuongNhan);

                if(!ChiTietPhieuNhapDAO.getInstance().updateSoluongThucTe(ctpn) ){
                    JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi");
                    return ;
                } else {
                    kq ++ ;
                }
            }
 
        }
        
        if(kq == row){
            int confirm = JOptionPane.showConfirmDialog(this,
                "Bạn có chắc muốn xác nhận giao hàng thành công cho phiếu nhập hàng này?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

            if(confirm == JOptionPane.YES_OPTION){
                    pnDTO.setNguoiNhanHang(userDTO.getTaiKhoan());
                    JOptionPane.showMessageDialog(this, pnBUS.xacNhanNhanHang(pnDTO));
                    pnBUS.updateTongTien(pnDTO.getMaPhieuNhap());
            }
        
        }
        
    }
       
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ReceivedProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ReceivedProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ReceivedProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ReceivedProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ReceivedProduct(pnDTO).setVisible(true);
//            }
//        });
//    }

    private DefaultTableCellRenderer renderer;
    private DefaultTableModel modelCTPN ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblChiTietPhieu;
    // End of variables declaration//GEN-END:variables
}
