package Praktikum9_1;

import java.awt.*;
import java.awt.event.*;

public class NilaiGUI extends Frame implements ActionListener {

    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    Button btnHitung, btnTampil;
    TextArea area;

    CheckboxGroup groupMK;
    Checkbox cbASD, cbPemlan, cbMatkomlan, cbProbstat;

    double nASD=0, nPemlan=0, nMatkomlan=0, nProbstat=0;

    public NilaiGUI() {
        setLayout(null);

        groupMK = new CheckboxGroup();
        cbASD = new Checkbox("ASD", groupMK, false);
        cbPemlan = new Checkbox("Pemlan", groupMK, true);
        cbMatkomlan = new Checkbox("Matkomlan", groupMK, false);
        cbProbstat = new Checkbox("Probstat", groupMK, false);

        add(cbASD); add(cbPemlan); add(cbMatkomlan); add(cbProbstat);
        cbASD.addItemListener(new ItemListener() {
    public void itemStateChanged(ItemEvent e) {
        txtTugas.setText("0");
        txtKuis.setText("0");
        txtUTS.setText("0");
        txtUAS.setText("0");
        txtHasil.setText("0");
    }
});

cbPemlan.addItemListener(new ItemListener() {
    public void itemStateChanged(ItemEvent e) {
        txtTugas.setText("0");
        txtKuis.setText("0");
        txtUTS.setText("0");
        txtUAS.setText("0");
        txtHasil.setText("0");
    }
});

cbMatkomlan.addItemListener(new ItemListener() {
    public void itemStateChanged(ItemEvent e) {
        txtTugas.setText("0");
        txtKuis.setText("0");
        txtUTS.setText("0");
        txtUAS.setText("0");
        txtHasil.setText("0");
    }
});

cbProbstat.addItemListener(new ItemListener() {
    public void itemStateChanged(ItemEvent e) {
        txtTugas.setText("0");
        txtKuis.setText("0");
        txtUTS.setText("0");
        txtUAS.setText("0");
        txtHasil.setText("0");
    }
});
        Label lbTugas = new Label("Tugas");
Label lbKuis = new Label("Kuis");
Label lbUTS = new Label("UTS");
Label lbUAS = new Label("UAS");
Label lbHasil = new Label("Hasil");

add(lbTugas);
add(lbKuis);
add(lbUTS);
add(lbUAS);
add(lbHasil);

lbTugas.setBounds(90, 90, 50, 20);
lbKuis.setBounds(90, 120, 50, 20);
lbUTS.setBounds(90, 150, 50, 20);
lbUAS.setBounds(90, 180, 50, 20);
lbHasil.setBounds(90, 210, 50, 20);

        cbASD.setBounds(50,50,70,20);
        cbPemlan.setBounds(120,50,80,20);
        cbMatkomlan.setBounds(200,50,100,20);
        cbProbstat.setBounds(310,50,100,20);

        txtTugas = new TextField("0");
        txtKuis = new TextField("0");
        txtUTS = new TextField("0");
        txtUAS = new TextField("0");
        txtHasil = new TextField("0");

        add(txtTugas); add(txtKuis); add(txtUTS); add(txtUAS); add(txtHasil);

        txtTugas.setBounds(150,90,60,20);
        txtKuis.setBounds(150,120,60,20);
        txtUTS.setBounds(150,150,60,20);
        txtUAS.setBounds(150,180,60,20);
        txtHasil.setBounds(150,210,60,20);

        btnHitung = new Button("Hitung");
        btnTampil = new Button("Tampilkan nilai semua matkul");

        add(btnHitung); add(btnTampil);

        btnHitung.setBounds(120,240,100,25);
        btnTampil.setBounds(80,400,250,30);

        btnHitung.addActionListener(this);
        btnTampil.addActionListener(this);

        area = new TextArea();
        add(area);
        area.setBounds(80,280,250,100);

        setSize(450,500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double t = Double.parseDouble(txtTugas.getText());
        double k = Double.parseDouble(txtKuis.getText());
        double uts = Double.parseDouble(txtUTS.getText());
        double uas = Double.parseDouble(txtUAS.getText());

        double hasil = 0;

        if (cbASD.getState()) {
            ASD a = new ASD();
            hasil = a.hitung(t,k,uts,uas);
            nASD = hasil;
        } 
        else if (cbPemlan.getState()) {
            Pemlan p = new Pemlan();
            hasil = p.hitung(t,k,uts,uas);
            nPemlan = hasil;
        } 
        else if (cbMatkomlan.getState()) {
            Matkomlan m = new Matkomlan();
            hasil = m.hitung(t,k,uts,uas);
            nMatkomlan = hasil;
        } 
        else if (cbProbstat.getState()) {
            Probstat pr = new Probstat();
            hasil = pr.hitung(t,k,uts,uas);
            nProbstat = hasil;
        }

        if (e.getSource() == btnHitung) {
            txtHasil.setText(String.valueOf(hasil));
        }

        if (e.getSource() == btnTampil) {
            area.setText(
                "HASIL NILAI SEMUA MATA KULIAH\n\n" +
                "ASD : " + nASD + "\n" +
                "Pemlan : " + nPemlan + "\n" +
                "Matkomlan : " + nMatkomlan + "\n" +
                "Probstat : " + nProbstat
            );
        }
    }

    public static void main(String[] args) {
        new NilaiGUI();
    }
}