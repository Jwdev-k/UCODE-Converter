/*
 * Created by JFormDesigner on Fri Oct 28 11:08:46 KST 2022
 */

package org.ucode;

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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        button1 = new JButton();
        button2 = new JButton();
        progressBar1 = new JProgressBar();
        path = new JTextPane();
        fileChooser1 = new JFileChooser();

        //======== this ========
        setTitle("UCODE CONVERTER");
        setResizable(false);
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("\ud3f4\ub354\uc120\ud0dd");
        button1.addActionListener(e -> OpenFile());

        //---- button2 ----
        button2.setText("\ubcc0\ud658");
        button2.addActionListener(e -> ConvertAction());

        //---- path ----
        path.setEditable(false);
        path.setEnabled(false);
        path.setAutoscrolls(false);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(path)
                .addComponent(progressBar1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(154, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1))
                    .addContainerGap(162, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(button1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(path, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE))
        );
        setSize(400, 235);
        setLocationRelativeTo(null);

        //---- fileChooser1 ----
        fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser1.setCurrentDirectory(null);
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
