package com.mycompany.chattingapplication;

import javax.swing.*;
import java.awt.*;

public class server extends JFrame{
	
	JPanel p1;

	server(){
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("com.mycompany.chattingapplication.icon/3.png"));
        Image i2 = i1.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
        l1.setBounds(5,5,30,30);
        add(l1);
		
        setLayout(null);
		setSize(350,550);
		setLocation(700,50);
		setVisible(true);
		}
	public static void main(String[] args) {
		new server().setVisible(true);

	}

}