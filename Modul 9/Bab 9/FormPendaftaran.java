package Praktikum9_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormPendaftaran extends JFrame {

    JLabel lblNama, lblTanggal, lblNoPendaftaran, lblNoTelp, lblAlamat, lblEmail;
    JTextField txtNama, txtTanggal, txtNoPendaftaran, txtNoTelp, txtEmail;
    JTextArea txtAlamat;   
    JScrollPane scrollAlamat; 
    JButton btnSubmit;

    public FormPendaftaran() {

        setTitle("Form Pendaftaran Mahasiswa Baru");
        setSize(400, 390);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblNama = new JLabel("Nama Lengkap");
        lblNama.setBounds(20, 20, 130, 25);
        add(lblNama);

        txtNama = new JTextField();
        txtNama.setBounds(160, 20, 200, 25);
        add(txtNama);

        lblTanggal = new JLabel("Tanggal Lahir");
        lblTanggal.setBounds(20, 55, 130, 25);
        add(lblTanggal);

        txtTanggal = new JTextField();
        txtTanggal.setBounds(160, 55, 200, 25);
        add(txtTanggal);

        lblNoPendaftaran = new JLabel("Nomor Pendaftaran");
        lblNoPendaftaran.setBounds(20, 90, 130, 25);
        add(lblNoPendaftaran);

        txtNoPendaftaran = new JTextField();
        txtNoPendaftaran.setBounds(160, 90, 200, 25);
        add(txtNoPendaftaran);

        lblNoTelp = new JLabel("No. Telp");
        lblNoTelp.setBounds(20, 125, 130, 25);
        add(lblNoTelp);

        txtNoTelp = new JTextField();
        txtNoTelp.setBounds(160, 125, 200, 25);
        add(txtNoTelp);

        lblAlamat = new JLabel("Alamat");
        lblAlamat.setBounds(20, 160, 130, 25);
        add(lblAlamat);

        txtAlamat = new JTextArea();
        txtAlamat.setLineWrap(true);     
        txtAlamat.setWrapStyleWord(true); 

        scrollAlamat = new JScrollPane(txtAlamat);
        scrollAlamat.setBounds(160, 160, 200, 60);
        add(scrollAlamat);

        lblEmail = new JLabel("E-mail");
        lblEmail.setBounds(20, 235, 130, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(160, 235, 200, 25);
        add(txtEmail);

        btnSubmit = new JButton("submit");
        btnSubmit.setBounds(285, 280, 75, 28);
        add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                prosesSubmit();             }
        });

        setVisible(true);
    }
    void prosesSubmit() {
        if (txtNama.getText().trim().isEmpty() ||
            txtTanggal.getText().trim().isEmpty() ||
            txtNoPendaftaran.getText().trim().isEmpty() ||
            txtNoTelp.getText().trim().isEmpty() ||
            txtAlamat.getText().trim().isEmpty() || 
            txtEmail.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                "Semua kolom harus diisi!",
                "Peringatan",
                JOptionPane.WARNING_MESSAGE);
            return; 
        }

        int pilihan = JOptionPane.showConfirmDialog(this,
            "Apakah anda yakin data yang Anda isi sudah benar?",
            "Konfirmasi",
            JOptionPane.YES_NO_OPTION);

        if (pilihan == JOptionPane.YES_OPTION) {
           Mahasiswa mhs = new Mahasiswa(
                txtNama.getText(),
                txtTanggal.getText(),
                txtNoPendaftaran.getText(),
                txtNoTelp.getText(),
                txtAlamat.getText(),
                txtEmail.getText()
            );

            
            new JendelaData(mhs);
        }

    }
    public static void main(String[] args) {
        new FormPendaftaran(); 
    }
}