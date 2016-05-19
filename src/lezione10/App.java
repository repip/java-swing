/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione10;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) {

        JFrame f = new JFrame("Esempio swing");
        f.setBounds(100, 100, 300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contenitore = f.getContentPane();
        contenitore.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton btn = new JButton("invia");
        btn.setBounds(10, 10, 100, 50);
        contenitore.add(btn);
        
        JButton btn1 = new JButton("invia1");
        btn1.setPreferredSize(new Dimension(100,200));
        contenitore.add(btn1);
        f.setVisible(true);

    }

}
