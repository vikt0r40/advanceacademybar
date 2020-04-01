package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductsForm {
    private JButton okButton;
    public JPanel productsPanel;
    private JButton cancelButton;
    private JLabel nameLabel;
    private JButton backButton;
    private JCheckBox option1CheckBox;

    public ProductsForm() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK");
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cancel");
            }
        });

    }
}
