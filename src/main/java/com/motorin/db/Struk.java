package com.motorin.db;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Dimension;

public class Struk {

    public static void cetak(String id, String nama, String alamat,
            String total, String bayar, String kembali,
            DefaultTableModel model) {

        // 1. KITA RAKIT TEKSNYA DI SINI
        StringBuilder s = new StringBuilder();

        // Header
        s.append("================================================\n");
        s.append("              Toko Sperpart Motorin                \n");
        s.append("       Pusat sperpart Terlengkap & Termurah        \n");
        s.append("================================================\n");

        // Data Transaksi
        s.append("No Transaksi : " + id + "\n");
        String tgl = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm").format(new java.util.Date());
        s.append("Tanggal      : " + tgl + "\n");
        s.append("Kasir        : " + User.getNama() + "\n");
        s.append("------------------------------------------------\n");

        // Data Pelanggan
        s.append("Pelanggan    : " + nama + "\n");
        s.append("Alamat       : " + alamat + "\n");
        s.append("------------------------------------------------\n");

        // Daftar Barang (Looping otomatis sesuai jumlah barang)
        s.append("DAFTAR BELANJA:\n");
        int baris = model.getRowCount();
        for (int i = 0; i < baris; i++) {
            String namaBrg = model.getValueAt(i, 2).toString(); // Ambil Nama
            String harga = model.getValueAt(i, 3).toString();   // Ambil Harga
            String qty = model.getValueAt(i, 4).toString();     // Ambil Jumlah
            String subtotal = model.getValueAt(i, 5).toString();// Ambil Subtotal

            // Format tampilan per baris
            s.append((i + 1) + ". " + namaBrg + "\n");
            s.append("    " + qty + " x " + harga + " = Rp " + subtotal + "\n");
        }

        s.append("------------------------------------------------\n");

        // Total & Bayar
        s.append("TOTAL TAGIHAN : Rp " + total + "\n");
        s.append("TUNAI         : Rp " + bayar + "\n");
        s.append("KEMBALIAN     : Rp " + kembali + "\n");
        s.append("================================================\n");
        s.append("             TERIMA KASIH             \n");
        s.append("     Barang yang dibeli tidak dapat     \n");
        s.append("        ditukar atau dikembalikan       \n");
        s.append("================================================\n");

        // 2. TAMPILKAN KE LAYAR (POP-UP)
        JTextArea area = new JTextArea();
        area.setText(s.toString());
        area.setEditable(false); // Supaya teks tidak bisa diedit user
        area.setFont(new Font("Monospaced", Font.PLAIN, 12)); // Font ala mesin kasir

        JScrollPane scroll = new JScrollPane(area);
        scroll.setPreferredSize(new Dimension(400, 500)); // Ukuran jendela struk

        JOptionPane.showMessageDialog(null, scroll, "Struk Belanja", JOptionPane.INFORMATION_MESSAGE);
    }

}
