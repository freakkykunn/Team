package Hoang;
import javax.swing.*;
import java.awt.*;
class tron_hcn extends JFrame {
    private JTextField txtRadius, txtWidth, txtHeight;
    private JLabel lblResult;

    public tron_hcn() {
        setTitle("Tính diện tích");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("Bán kính hình tròn: "));
        txtRadius = new JTextField();
        panel.add(txtRadius);

        panel.add(new JLabel("Chiều rộng HCN: "));
        txtWidth = new JTextField();
        panel.add(txtWidth);

        panel.add(new JLabel("Chiều dài HCN: "));
        txtHeight = new JTextField();
        panel.add(txtHeight);

        JButton btnCircleArea = new JButton("Diện tích hình tròn");
        JButton btnRectangleArea = new JButton("Diện tích HCN");
        lblResult = new JLabel("Kết quả: ");

        btnCircleArea.addActionListener(e -> calculateCircleArea());
        btnRectangleArea.addActionListener(e -> calculateRectangleArea());

        panel.add(btnCircleArea);
        panel.add(btnRectangleArea);
        panel.add(lblResult);

        add(panel);
        setVisible(true);
    }

    private void calculateCircleArea() {
        try {
            double radius = Double.parseDouble(txtRadius.getText());
            double area = Math.PI * radius * radius;
            lblResult.setText("Diện tích hình tròn: " + area);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập bán kính hợp lệ!");
        }
    }

    private void calculateRectangleArea() {
        try {
            double width = Double.parseDouble(txtWidth.getText());
            double height = Double.parseDouble(txtHeight.getText());
            double area = width * height;
            lblResult.setText("Diện tích HCN: " + area);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!");
        }
    }
}

