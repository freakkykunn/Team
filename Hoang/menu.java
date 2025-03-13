package Hoang;

import javax.swing.*;
import java.awt.*;

public class menu extends JFrame {
    public menu() {
        setTitle("Form với 3 nút");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton btnThan = new JButton("Thân");
        JButton btnHuy = new JButton("Huy");
        JButton btnTheAnh = new JButton("Thế Anh");

        btnThan.addActionListener(e -> new tron_hcn());
        btnHuy.addActionListener(e -> new nhan_chia());
        btnTheAnh.addActionListener(e -> new cong_tru());

        panel.add(btnThan);
        panel.add(btnHuy);
        panel.add(btnTheAnh);

        add(panel);
        setVisible(true);
    }
}
