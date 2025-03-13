package Hoang;

import javax.swing.*;
import java.awt.*;
class nhan_chia extends JFrame {
    private JTextField txtNum1, txtNum2;
    private JLabel lblResult;

    public nhan_chia() {
        setTitle("Nhân chia đơn giản");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        panel.add(new JLabel("Số thứ nhất: "));
        txtNum1 = new JTextField();
        panel.add(txtNum1);

        panel.add(new JLabel("Số thứ hai: "));
        txtNum2 = new JTextField();
        panel.add(txtNum2);

        JButton btnMultiply = new JButton("Nhân");
        JButton btnDivide = new JButton("Chia");
        lblResult = new JLabel("Kết quả: ");

        btnMultiply.addActionListener(e -> calculate('*'));
        btnDivide.addActionListener(e -> calculate('/'));

        panel.add(btnMultiply);
        panel.add(btnDivide);
        panel.add(lblResult);

        add(panel);
        setVisible(true);
    }

    private void calculate(char operator) {
        try {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            if (operator == '/' && num2 == 0) {
                JOptionPane.showMessageDialog(this, "Không thể chia cho 0!");
                return;
            }
            double result = (operator == '*') ? num1 * num2 : num1 / num2;
            lblResult.setText("Kết quả: " + result);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!");
        }
    }
}
