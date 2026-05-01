package Praktikum9_2;

import javax.swing.*;
import java.awt.*;

public class JendelaData extends JFrame {

    public JendelaData(Mahasiswa mhs) {

        setTitle("Data Mahasiswa");
        setSize(350, 230);
        setLocationRelativeTo(null); 
        setLayout(null);

        JLabel lblJudul = new JLabel("Data Mahasiswa", SwingConstants.CENTER);
        lblJudul.setBounds(0, 10, 340, 25);
        lblJudul.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblJudul);

        JSeparator garis = new JSeparator();
        garis.setBounds(10, 38, 320, 2);
        add(garis);

        String[][] data = {
            {"Nama",           mhs.getNama()},
            {"Tanggal Lahir",  mhs.getTanggalLahir()},
            {"No.Pendaftaran", mhs.getNoPendaftaran()},
            {"No.Telp",        mhs.getNoTelp()},
            {"Alamat",         mhs.getAlamat()},
            {"E-mail",         mhs.getEmail()}
        };

        int startY = 50;
        for (String[] baris : data) {
            JLabel lblKey = new JLabel(baris[0]);
            lblKey.setBounds(20, startY, 110, 20);
            add(lblKey);

            JLabel lblValue = new JLabel(baris[1]);
            lblValue.setBounds(140, startY, 190, 20);
            add(lblValue);

            startY += 22; 
        }

        setVisible(true); 
    }
}