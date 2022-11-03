/*
 * Created by JFormDesigner on Fri Oct 28 11:08:46 KST 2022
 */

package org.ucode;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import java.io.File;
import javax.swing.border.*;

/**
 * @author GOMGOM
 */
public class GUI extends JFrame {
    public GUI() {
        initComponents();
        setVisible(true);
    }

    private void OpenFile() {
        int ret = fileChooser1.showOpenDialog(null);
        if (ret != JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null, "폴더를 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
            fileChooser1.setSelectedFile(null);
            path.setText("");
            return;
        }
        File directory = fileChooser1.getSelectedFile();
        path.setText(directory.toString());
    }

    private void ConvertAction() {
        File directory = fileChooser1.getSelectedFile();
        if (directory != null) {
            int size = directory.listFiles().length;
            progressBar1.setMaximum(size);
            Convert.ChangeUCODE(directory);
            JOptionPane.showMessageDialog(null, "작업 완료", "알림", JOptionPane.INFORMATION_MESSAGE);
            progressBar1.setValue(0);
            fileChooser1.setSelectedFile(null);
            path.setText("");
        }
    }

    public JButton getButton1() {
        return this.button1;
    }

    public JButton getButton2() {
        return this.button2;
    }

    public JProgressBar getProgressBar1() {
        return this.progressBar1;
    }

    public JTextPane getPath() {
        return this.path;
    }

    public JFileChooser getFileChooser1() {
        return this.fileChooser1;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        this.button1 = new JButton();
        this.button2 = new JButton();
        this.progressBar1 = new JProgressBar();
        this.path = new JTextPane();
        this.fileChooser1 = new JFileChooser();

        //======== this ========
        setTitle("UCODE CONVERTER");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        var contentPane = getContentPane();

        //---- button1 ----
        this.button1.setText("\ud3f4\ub354\uc120\ud0dd");
        this.button1.addActionListener(e -> OpenFile());

        //---- button2 ----
        this.button2.setText("\ubcc0\ud658");
        this.button2.addActionListener(e -> ConvertAction());

        //---- path ----
        this.path.setEditable(false);
        this.path.setEnabled(false);
        this.path.setAutoscrolls(false);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(this.path)
                .addComponent(this.progressBar1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(154, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(this.button2, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addComponent(this.button1, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                    .addContainerGap(162, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(this.button1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(this.button2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(this.path, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(this.progressBar1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE))
        );

        //---- fileChooser1 ----
        this.fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        this.fileChooser1.setCurrentDirectory(null);

        setSize(400, 235);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JButton button1;
    private JButton button2;
    public static JProgressBar progressBar1;
    private JTextPane path;
    private JFileChooser fileChooser1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
