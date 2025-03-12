/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package GUI;


import BUS.ChiTietPhieuNhapBUS;
import BUS.PhieuNhapBUS;
import DAO.ChiTietCungCapDAO;
import DAO.ChiTietPhieuNhapDAO;
import DAO.NhaCungCapDAO;
import DAO.PhieuNhapDAO;
import DAO.SanPhamDAO;
import DTO.ChiTietCungCapDTO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import DTO.ChiTietPhieuNhapDTO;
import DTO.NguoiDungDTO;
import DTO.NhaCungCapDTO;
import DTO.PhieuNhapDTO;
import DTO.SanPhamDTO;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author DELL
 */
public class QuanLyPhieuNhapForm extends javax.swing.JFrame {

    private ArrayList<ChiTietPhieuNhapDTO> dsCTPN;
    private int rowSelectedOfTblChiTietPN = -1;
    private PhieuNhapDTO phieuNhapSelected;
    private PhieuNhapBUS pnBUS = new PhieuNhapBUS();
    private ChiTietPhieuNhapBUS ctpnBUS = new ChiTietPhieuNhapBUS();
    private PhieuNhapDTO pnDTO;
    private PhieuNhapForm pnForm;
    private NguoiDungDTO userDTO ;
    DefaultTableCellRenderer renderer;
    DecimalFormat formatter = new DecimalFormat("###, ###, ###");
    /**
     * Creates new form AdminConfirm
     */
    public QuanLyPhieuNhapForm(PhieuNhapDTO phieuNhap, PhieuNhapForm parent , NguoiDungDTO user) throws SQLException {
        pnDTO = phieuNhap;
        pnForm = parent;
        userDTO = user ;
        initComponents();
        this.setLocationRelativeTo(null);
        modelTableChiTietPN = (DefaultTableModel) tblChiTietPN.getModel();
        renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        tblChiTietPN.setDefaultRenderer(String.class, renderer);
        hienThiChiTietPhieuNhap(pnDTO.getMaPhieuNhap());
        showButton();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTietPN = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        btnXacNhan = new javax.swing.JButton();
        btnXoaPhieu = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        cbbNhaCungCap = new javax.swing.JComboBox<>();
        btnCapNhat = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        btnMinus = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnXoaChiTiet = new javax.swing.JButton();
        txtDonGia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(89, 168, 105));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHI TIẾT PHIẾU NHẬP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(365, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tblChiTietPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên sản phẩm", "Nhà cung cấp", "Đơn giá", "Số lượng"
            }
        ));
        tblChiTietPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietPNMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblChiTietPN);
        if (tblChiTietPN.getColumnModel().getColumnCount() > 0) {
            tblChiTietPN.getColumnModel().getColumn(0).setResizable(false);
            tblChiTietPN.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblChiTietPN.getColumnModel().getColumn(1).setResizable(false);
            tblChiTietPN.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblChiTietPN.getColumnModel().getColumn(2).setResizable(false);
            tblChiTietPN.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblChiTietPN.getColumnModel().getColumn(3).setResizable(false);
            tblChiTietPN.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblChiTietPN.getColumnModel().getColumn(4).setResizable(false);
            tblChiTietPN.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 242, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnXacNhan.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnXacNhan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setText("Xác nhận phiếu nhập");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        btnXoaPhieu.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        btnXoaPhieu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXoaPhieu.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaPhieu.setText("Xóa phiếu nhập");
        btnXoaPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPhieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(btnXoaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Thay đổi thông tin"));

        cbbNhaCungCap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbNhaCungCap.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cbbNhaCungCapMouseMoved(evt);
            }
        });
        cbbNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbNhaCungCapMouseClicked(evt);
            }
        });
        cbbNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNhaCungCapActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(0, 153, 0));
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_file_25px_2.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setText("Nhà cung cấp ");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setText("Số lượng ");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoLuong.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnXoaChiTiet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaChiTiet.setForeground(new java.awt.Color(204, 0, 0));
        btnXoaChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_close_window_25px.png"))); // NOI18N
        btnXoaChiTiet.setText("Xóa chi tiết");
        btnXoaChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaChiTietActionPerformed(evt);
            }
        });

        txtDonGia.setEditable(false);
        txtDonGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDonGia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDonGia.setDisabledTextColor(new java.awt.Color(240, 241, 241));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnAdd)))
                .addGap(98, 98, 98)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoaChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextField2)
                        .addGap(107, 107, 107))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnXoaChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMinus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(314, 314, 314))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaChiTietActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnXoaChiTietActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int soLuong = Integer.parseInt(txtSoLuong.getText());
        int newSoLuong = soLuong  + 1;
        txtSoLuong.setText(String.valueOf(newSoLuong));
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        // TODO add your handling code here:

        int soLuong = Integer.parseInt(txtSoLuong.getText());
        if( soLuong > 1 ){
            int newSoLuong = soLuong -1;
            txtSoLuong.setText(String.valueOf(newSoLuong));
        }
    }//GEN-LAST:event_btnMinusActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed

        int rowChiTietPN = tblChiTietPN.getSelectedRow();
        String tenSP = tblChiTietPN.getValueAt(rowChiTietPN, 1).toString();
        SanPhamDTO sp = SanPhamDAO.getInstance().selectProductByName(tenSP);
        int maSP = sp.getMaSanPham();
        String tenNCCBefore = tblChiTietPN.getValueAt(rowChiTietPN, 2).toString();
        NhaCungCapDTO nccBefore = NhaCungCapDAO.getInstance().getNCCByName(tenNCCBefore);
        String tenNCCAfter = cbbNhaCungCap.getSelectedItem().toString();
        NhaCungCapDTO nccAfter = NhaCungCapDAO.getInstance().getNCCByName(tenNCCAfter);
        int soLuong  = Integer.parseInt(txtSoLuong.getText());
        String gia = txtDonGia.getText().trim().replace(",", "");
        int donGia = Integer.parseInt(gia);
        ChiTietPhieuNhapDTO ctpn = new ChiTietPhieuNhapDTO();
        ctpn.setMaPhieuNhap(pnDTO.getMaPhieuNhap());
        ctpn.setDonGia(donGia);
        ctpn.setSoLuongNhap(soLuong);
        ctpn.setMaNhaCungCap(nccBefore.getMaNhaCungCap());
        ctpn.setMaSanPham(maSP);
        JOptionPane.showMessageDialog(this, ctpnBUS.updateChiTietPhieuNhap(ctpn, nccAfter.getMaNhaCungCap()));
        try {
            hienThiChiTietPhieuNhap(pnDTO.getMaPhieuNhap());
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyPhieuNhapForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void cbbNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNhaCungCapActionPerformed
        // TODO add your handling code here:
        if(tblChiTietPN.getSelectedRow() != -1 && modelCbbNcc.getSelectedItem() != null){
            String tenNCC = modelCbbNcc.getSelectedItem().toString();
            NhaCungCapDTO ncc = NhaCungCapDAO.getInstance().getNCCByName(tenNCC);
            int row = tblChiTietPN.getSelectedRow();
            String tenSP = tblChiTietPN.getValueAt(row, 1).toString();
            SanPhamDTO sp = SanPhamDAO.getInstance().selectProductByName(tenSP);
            int donGia = ChiTietCungCapDAO.getInstance().findDonGia(ncc.getMaNhaCungCap(), sp.getMaSanPham());
            txtDonGia.setText(formatter.format(donGia));
        }

    }//GEN-LAST:event_cbbNhaCungCapActionPerformed

    private void cbbNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbNhaCungCapMouseClicked

    }//GEN-LAST:event_cbbNhaCungCapMouseClicked

    private void cbbNhaCungCapMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbNhaCungCapMouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_cbbNhaCungCapMouseMoved

    private void tblChiTietPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietPNMouseClicked
        rowSelectedOfTblChiTietPN = tblChiTietPN.getSelectedRow();
        int row = tblChiTietPN.getSelectedRow();
        String tenSP = tblChiTietPN.getValueAt(row, 1).toString();
        SanPhamDTO sp = SanPhamDAO.getInstance().selectProductByName(tenSP);
        loadDanhSachNhaCungCap(sp.getMaSanPham());
        int soLuong = Integer.parseInt(tblChiTietPN.getValueAt(rowSelectedOfTblChiTietPN, 4).toString());
        txtSoLuong.setText(String.valueOf(soLuong));
        int donGia = Integer.parseInt(tblChiTietPN.getValueAt(row, 3).toString());
        txtDonGia.setText(formatter.format(donGia));
    }//GEN-LAST:event_tblChiTietPNMouseClicked

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        PhieuNhapDTO phieuNhap = new PhieuNhapDTO();
        phieuNhap.setMaPhieuNhap(pnDTO.getMaPhieuNhap());
        ArrayList<ChiTietPhieuNhapDTO> dsChiTietPhieuNhap;
        try {
            dsChiTietPhieuNhap = ChiTietPhieuNhapDAO.getInstance().getDetailPhieuNhap(pnDTO.getMaPhieuNhap());
            phieuNhap.setNguoiXacNhan(userDTO.getTaiKhoan());
            JOptionPane.showMessageDialog(this, pnBUS.xacNhanPhieuNhap(phieuNhap, dsChiTietPhieuNhap));
            dispose();
            pnForm.loadDanhSachPhieuNhap();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyPhieuNhapForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnXoaPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhieuActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, pnBUS.capNhatPhieuNhap(pnDTO.getMaPhieuNhap(), 2, null));
        dispose();
        pnForm.loadDanhSachPhieuNhap();
    }//GEN-LAST:event_btnXoaPhieuActionPerformed

    private void loadDanhSachNhaCungCap(int maSP) {
        modelCbbNcc = (DefaultComboBoxModel) cbbNhaCungCap.getModel();
        ArrayList<ChiTietCungCapDTO> nccList = ChiTietCungCapDAO.getInstance().findNhaCungCapByMaSanPham(maSP) ;
        for(int i = 0; i< nccList.size(); i++){
            int maNCC = nccList.get(i).getMaNhaCungCap();
            NhaCungCapDTO ncc = NhaCungCapDAO.getInstance().getByID(maNCC); 
            modelCbbNcc.addElement(ncc.getTenNhaCungCap());
        }
    }
    

    
    private void hienThiChiTietPhieuNhap(int maPhieu) throws SQLException {
        ArrayList<ChiTietPhieuNhapDTO> dsChiTietPhieuNhap = ChiTietPhieuNhapDAO.getInstance().getDetailPhieuNhap(maPhieu);
        if(dsChiTietPhieuNhap != null) {
            DefaultTableModel model = (DefaultTableModel) tblChiTietPN.getModel();
            model.setRowCount(0);
            for (int i = 0; i < dsChiTietPhieuNhap.size(); i++) {
                ChiTietPhieuNhapDTO ctpn = dsChiTietPhieuNhap.get(i);
                String tenSP = SanPhamDAO.getInstance().getNameByID(ctpn.getMaSanPham());
                NhaCungCapDTO ncc = NhaCungCapDAO.getInstance().getByID(ctpn.getMaNhaCungCap());
                Object[] row = {i+1, tenSP, ncc.getTenNhaCungCap(),ctpn.getDonGia(), ctpn.getSoLuongNhap()};
                model.addRow(row);
            }
            for(int i = 0; i < tblChiTietPN.getColumnCount(); i++){
                tblChiTietPN.getColumnModel().getColumn(i).setCellRenderer(renderer);
            }
        }
        else {
           return;
        }
    }
    
    private void showButton(){
        int trangThai = pnDTO.getTrangThai();
        switch (trangThai) {
            case 1: {
                btnXacNhan.setEnabled(true);
                btnXoaPhieu.setEnabled(true);
                btnCapNhat.setEnabled(true);
                btnXoaChiTiet.setEnabled(true);
                break;
            }
            case 2: {
                btnXacNhan.setEnabled(false);
                btnXoaPhieu.setEnabled(false);
                btnCapNhat.setEnabled(false);
                btnXoaChiTiet.setEnabled(false);
                break;
            }
            case 3: {
                btnXacNhan.setEnabled(false);
                btnXoaPhieu.setEnabled(false);
                btnCapNhat.setEnabled(false);
                btnXoaChiTiet.setEnabled(false);
                break;
            }
            case 4: {
                btnXacNhan.setEnabled(false);
                btnXoaPhieu.setEnabled(false);
                btnCapNhat.setEnabled(false);
                btnXoaChiTiet.setEnabled(false);
                break;
            }
            default : throw new AssertionError();
        }
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        try {
//            //UIManager.setLookAndFeel(
//            //UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//        }
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new QuanLyPhieuNhapForm(maPhieu).setVisible(true);
//            }
//        });
//    }
    private DefaultTableModel modelTableChiTietPN ;
    private DefaultComboBoxModel modelCbbNcc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JButton btnXoaChiTiet;
    private javax.swing.JButton btnXoaPhieu;
    private javax.swing.JComboBox<String> cbbNhaCungCap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblChiTietPN;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables

}
