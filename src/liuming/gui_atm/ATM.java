package liuming.gui_atm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ATM extends JFrame implements ActionListener{
	public ATM(){
		  this.setLayout(null);//绝对布局
		  Font font = new Font("宋体",Font.PLAIN,12);//创建一个字体以便其它调用

		  
		  JLabel jl2 = new JLabel("注册账号");
		  jl2.setBounds(360,310,60,20);
		  jl2.setForeground(Color.BLUE);//字体颜色
		  jl2.setFont(font);
		  this.add(jl2);
		  
		  JLabel jl3 = new JLabel("找回密码");
		  jl3.setBounds(360,340,60,20);
		  jl3.setForeground(Color.BLUE);//字体颜色
		  jl3.setFont(font);
		  this.add(jl3);
		  
		  //账号的文本框
		  JTextField user = new JTextField();
		  user.setBounds(190,310,160,23);
		  user.setFont(font);
		  this.add(user);
		  //密码的文本框
		  JPasswordField pwd = new JPasswordField();
		  pwd.setBounds(190,340,160,23);
		  pwd.setFont(font);
		  this.add(pwd);
		  
		  JCheckBox jcb1 = new JCheckBox("记住密码",true);
		  jcb1.setBounds(198,370,80,20);
		  jcb1.setFont(font);
		  jcb1.setOpaque(false);//去掉组件背景色
		  this.add(jcb1);
		  
		  JCheckBox jcb2 = new JCheckBox("自动登录");
		  jcb2.setBounds(298,370,80,20);
		  jcb2.setFont(font);
		  jcb2.setOpaque(false);//去掉组件背景色
		  this.add(jcb2);

		  JButton jb1 = new JButton("登录");
		  jb1.setBounds(190,400,75,20);
		  jb1.setFont(font);
		  this.add(jb1);
		  jb1.addActionListener(this);
		  
		  JButton jb3 = new JButton("退出");
		  jb3.setBounds(300,400,70,20);
		  jb3.setFont(font);
		  this.add(jb3);
		  jb3.addActionListener(this);
		  
		  //窗口图像
		  Image image = new ImageIcon("login.jpg").getImage();
		  this.setIconImage(image);
		  
		  //设置背景
		  JLabel jl1 = new JLabel();
		  Image image1 = new ImageIcon("login.jpg").getImage().getScaledInstance(595, 800,0);
		  jl1.setIcon(new ImageIcon(image1));
		  jl1.setBounds(0,0,800,780);
		  this.add(jl1);
		  

		 
		  
		  this.setTitle("ICBC ATM");
		  
		  this.setSize(600,800);
		  
		  this.setResizable(false);//设置尺寸不可改变
		  
		  this.setLocationRelativeTo(null);//设置居中
		  
		  this.setDefaultCloseOperation(3);//当点击关闭时进行关闭
		  
		  this.setVisible(true);
	
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
	 
		  String getCommand = e.getActionCommand();
		  
		  if("登录".equals(getCommand)){
			  JOptionPane.showMessageDialog(null,"你点击的是'登陆'按钮！");
		  }
		  else if("退出".equals(getCommand)){
			  JOptionPane.showMessageDialog(null,"你点击的是'退出'按钮！");
		  }
	 }
	 public static void main(String[] args) {
		 new ATM();
	 }
}
