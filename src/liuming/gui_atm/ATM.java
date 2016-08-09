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
		  this.setLayout(null);//���Բ���
		  Font font = new Font("����",Font.PLAIN,12);//����һ�������Ա���������

		  
		  JLabel jl2 = new JLabel("ע���˺�");
		  jl2.setBounds(360,310,60,20);
		  jl2.setForeground(Color.BLUE);//������ɫ
		  jl2.setFont(font);
		  this.add(jl2);
		  
		  JLabel jl3 = new JLabel("�һ�����");
		  jl3.setBounds(360,340,60,20);
		  jl3.setForeground(Color.BLUE);//������ɫ
		  jl3.setFont(font);
		  this.add(jl3);
		  
		  //�˺ŵ��ı���
		  JTextField user = new JTextField();
		  user.setBounds(190,310,160,23);
		  user.setFont(font);
		  this.add(user);
		  //������ı���
		  JPasswordField pwd = new JPasswordField();
		  pwd.setBounds(190,340,160,23);
		  pwd.setFont(font);
		  this.add(pwd);
		  
		  JCheckBox jcb1 = new JCheckBox("��ס����",true);
		  jcb1.setBounds(198,370,80,20);
		  jcb1.setFont(font);
		  jcb1.setOpaque(false);//ȥ���������ɫ
		  this.add(jcb1);
		  
		  JCheckBox jcb2 = new JCheckBox("�Զ���¼");
		  jcb2.setBounds(298,370,80,20);
		  jcb2.setFont(font);
		  jcb2.setOpaque(false);//ȥ���������ɫ
		  this.add(jcb2);

		  JButton jb1 = new JButton("��¼");
		  jb1.setBounds(190,400,75,20);
		  jb1.setFont(font);
		  this.add(jb1);
		  jb1.addActionListener(this);
		  
		  JButton jb3 = new JButton("�˳�");
		  jb3.setBounds(300,400,70,20);
		  jb3.setFont(font);
		  this.add(jb3);
		  jb3.addActionListener(this);
		  
		  //����ͼ��
		  Image image = new ImageIcon("login.jpg").getImage();
		  this.setIconImage(image);
		  
		  //���ñ���
		  JLabel jl1 = new JLabel();
		  Image image1 = new ImageIcon("login.jpg").getImage().getScaledInstance(595, 800,0);
		  jl1.setIcon(new ImageIcon(image1));
		  jl1.setBounds(0,0,800,780);
		  this.add(jl1);
		  

		 
		  
		  this.setTitle("ICBC ATM");
		  
		  this.setSize(600,800);
		  
		  this.setResizable(false);//���óߴ粻�ɸı�
		  
		  this.setLocationRelativeTo(null);//���þ���
		  
		  this.setDefaultCloseOperation(3);//������ر�ʱ���йر�
		  
		  this.setVisible(true);
	
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
	 
		  String getCommand = e.getActionCommand();
		  
		  if("��¼".equals(getCommand)){
			  JOptionPane.showMessageDialog(null,"��������'��½'��ť��");
		  }
		  else if("�˳�".equals(getCommand)){
			  JOptionPane.showMessageDialog(null,"��������'�˳�'��ť��");
		  }
	 }
	 public static void main(String[] args) {
		 new ATM();
	 }
}
