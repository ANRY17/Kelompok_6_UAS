/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;

/**
 *
 * @author Asfin Rizaldy
 */
import Praktikum07.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Raport extends JFrame {
    private JLabel lblNama = new JLabel("Nama");
    private JTextField txtNama = new JTextField();
    private JLabel lblKelas = new JLabel("Kelas");
    private JTextField txtKelas = new JTextField();
    private JLabel lblNomorAbsen = new JLabel("Nomor Absen");
    private JTextField txtNomorAbsen = new JTextField();
    private JLabel lblTahunAjaran = new JLabel("Tahun Ajaran");
    private JTextField txtTahunAjaran = new JTextField();
    private JLabel lblBahasaIndonesia = new JLabel("Bahasa Indonesia");
    private JTextField txtBahasaIndonesia = new JTextField();
    private JLabel lblMatematika = new JLabel("Matematika");
    private JTextField txtMatematika = new JTextField();
    private JLabel lblIpa = new JLabel("IPA");
    private JTextField txtIpa = new JTextField();
    private JLabel lblIps = new JLabel("IPS");
    private JTextField txtIps = new JTextField();
    private JLabel lblBahasaInggris = new JLabel("Bahasa Inggris");
    private JTextField txtBahasaInggris = new JTextField();
    private JLabel lblPendidikanAgama = new JLabel("Pend. Agama");
    private JTextField txtPendidikanAgama = new JTextField();
    private JLabel lblPkn = new JLabel("PKN");
    private JTextField txtPkn = new JTextField();
    private JLabel lblSeniBudaya = new JLabel("Seni Budaya");
    private JTextField txtSeniBudaya = new JTextField();
    private JLabel lblPenjaskes = new JLabel("PENJASKES");
    private JTextField txtPenjaskes = new JTextField();
    private JButton btnSubmit = new JButton("Submit");
    private JButton btnRefresh = new JButton("Refresh");
    private JTextArea txtHasil = new JTextArea();
    private JTable tableNilai;
    private DefaultTableModel tableModel;

    public Raport() {
        setLayout(null);

        lblNama.setBounds(10, 10, 120, 25);
        add(lblNama);

        txtNama.setBounds(140, 10, 230, 25);
        add(txtNama);

        lblKelas.setBounds(10, 40, 120, 25);
        add(lblKelas);

        txtKelas.setBounds(140, 40, 230, 25);
        add(txtKelas);

        lblNomorAbsen.setBounds(10, 70, 120, 25);
        add(lblNomorAbsen);

        txtNomorAbsen.setBounds(140, 70, 230, 25);
        add(txtNomorAbsen);
        
        lblTahunAjaran.setBounds(10, 100, 120, 25);
        add(lblTahunAjaran);

        txtTahunAjaran.setBounds(140, 100, 230, 25);
        add(txtTahunAjaran);

        lblBahasaIndonesia.setBounds(420, 10, 120, 25);
        add(lblBahasaIndonesia);

        txtBahasaIndonesia.setBounds(550, 10, 160, 25);
        add(txtBahasaIndonesia);

        lblMatematika.setBounds(420, 40, 120, 25);
        add(lblMatematika);

        txtMatematika.setBounds(550, 40, 160, 25);
        add(txtMatematika);

        lblIpa.setBounds(420, 70, 120, 25);
        add(lblIpa);

        txtIpa.setBounds(550, 70, 160, 25);
        add(txtIpa);
        
        lblIps.setBounds(420, 100, 120, 25);
        add(lblIps);

        txtIps.setBounds(550, 100, 160, 25);
        add(txtIps);

        lblBahasaInggris.setBounds(420, 130, 120, 25);
        add(lblBahasaInggris);
                
        txtBahasaInggris.setBounds(550, 130, 160, 25);
        add(txtBahasaInggris);
        
        lblPkn.setBounds(420, 160, 120, 25);
        add(lblPkn);       
        txtPkn.setBounds(550, 160, 160, 25);
        add(txtPkn);
       
        
        lblPendidikanAgama.setBounds(420, 190, 120, 25);
        add(lblPendidikanAgama);
        
        txtPendidikanAgama.setBounds(550, 190, 160, 25);
        add(txtPendidikanAgama);
        
        lblSeniBudaya.setBounds(420, 220, 120, 25);
        add(lblSeniBudaya);
        
        txtSeniBudaya.setBounds(550, 220, 160, 25);
        add(txtSeniBudaya);
        
        lblPenjaskes.setBounds(420, 250, 120, 25);
        add(lblPenjaskes);
        
        txtPenjaskes.setBounds(550, 250, 160, 25);
        add(txtPenjaskes);

        btnSubmit.setBounds(140, 250, 80, 25);
        add(btnSubmit); 
        
        btnRefresh.setBounds(285, 250, 80, 25);
        add(btnRefresh);
        
        tableModel = new DefaultTableModel();
        tableModel.addColumn("No.");
        tableModel.addColumn("Mata Pelajaran");
        tableModel.addColumn("Nilai");  
        tableModel.addColumn("KKM");  
        tableModel.addColumn("Keterangan");  

        tableNilai = new JTable(tableModel);
        tableNilai.setRowHeight(30);
        tableNilai.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableNilai.setDefaultEditor(Object.class, null);
        tableNilai.getTableHeader().setReorderingAllowed(false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for (int i = 0; i < tableNilai.getColumnCount(); i++) {
            tableNilai.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        JScrollPane scrollPane = new JScrollPane(tableNilai);
        scrollPane.setBounds(10, 360, 700, 200);
        add(scrollPane);

        txtHasil.setBounds(10, 320, 380, 35);
        txtHasil.setEditable(false);
        add(txtHasil);

        btnSubmit.addActionListener((ActionEvent e) -> {
            Siswa s = new Siswa(txtNama.getText(), txtKelas.getText(), txtNomorAbsen.getText(), txtTahunAjaran.getText());
            NilaiMataPelajaranTurunan n = new NilaiMataPelajaranTurunan(Double.parseDouble(txtBahasaIndonesia.getText()),
                    Double.parseDouble(txtMatematika.getText()), Double.parseDouble(txtIpa.getText()), Double.parseDouble(txtIps.getText()), Double.parseDouble(txtBahasaInggris.getText()),
            Double.parseDouble(txtPkn.getText()), Double.parseDouble(txtPenjaskes.getText()), Double.parseDouble(txtSeniBudaya.getText()), Double.parseDouble(txtPendidikanAgama.getText()));
            
            txtHasil.setText(s.toString());
            
            tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, "Bahasa Indonesia", n.getBahasaIndonesia(),"70" ,n.NilaiMataPelajaranTurunan("Bahasa Indonesia")});
            tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, "Matematika", n.getMatematika(), "70", n.NilaiMataPelajaranTurunan("Matematika")});
            tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, "IPA", n.getIpa(),"70", n.NilaiMataPelajaranTurunan("IPA")});
            tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, "IPS", n.getIps(),"80", n.NilaiMataPelajaranTurunan("IPS")});
            tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, "PENJASKES", n.getPenjaskes(),"78", n.NilaiMataPelajaranTurunan("PENJASKES")});
            tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, "Pend. Agama", n.getPendidikanAgama(),"80", n.NilaiMataPelajaranTurunan("Pendidikan Agama")});
            tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, "Bahasa Inggris", n.getBahasaInggris(),"75", n.NilaiMataPelajaranTurunan("Bahasa Inggris")});
            tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, "Seni Budaya", n.getSeniBudaya(),"77", n.NilaiMataPelajaranTurunan("Seni Budaya")});
            tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, "PKN", n.getPkn(),"82", n.NilaiMataPelajaranTurunan("PKN")});
            tableModel.addRow(new Object[]{"", "Rata - Rata ", n.hitungRataRata(),"", ""});
        });
        
        btnRefresh.addActionListener((ActionEvent e) -> {
            tableModel.setRowCount(0);
            txtNama.setText("");
            txtKelas.setText("");
            txtNomorAbsen.setText("");
            txtTahunAjaran.setText("");
            txtBahasaIndonesia.setText("");
            txtMatematika.setText("");
            txtIpa.setText("");
            txtIps.setText("");
            txtPenjaskes.setText("");
            txtPendidikanAgama.setText("");
            txtBahasaInggris.setText("");
            txtSeniBudaya.setText("");
            txtPkn.setText("");
            txtHasil.setText("");
        });

        setSize(735, 620);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Raport raport = new Raport();
    }
}


