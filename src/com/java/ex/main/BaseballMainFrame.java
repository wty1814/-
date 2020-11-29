package com.java.ex.main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.java.ex.baseball.DoosanDateFrame;
import com.java.ex.baseball.HanwhaDateFrame;
import com.java.ex.baseball.KIADateFrame;
import com.java.ex.baseball.KTDateFrame;
import com.java.ex.baseball.KiwoomDateFrame;
import com.java.ex.baseball.LGDateFrame;
import com.java.ex.baseball.LotteDateFrame;
import com.java.ex.baseball.NCDateFrame;
import com.java.ex.baseball.SKDateFrame;
import com.java.ex.baseball.SamsungDateFrame;
import com.java.ex.insert.ListInsertBase;

public class BaseballMainFrame extends JFrame{
	
	private JPanel panel, panel1, panel2, panel3, panel4;
	private JLabel kind_belbl;
	private JTable table;
	private JScrollPane jscp1;
	private JButton detailbtn,joinbtn,mainbtn;
	private JComboBox<String> timelist ;
	String items[] = {"LG","�λ�","�Ｚ","SK","Ű��","��ȭ","�Ե�","NC","KIA","KT"};
	String header[]={"����/���", "��", "��", "�·�","����"}; //���� ǥ������ �̸����� ����
    String contents[][]={
            {"LG", "15", "5", null, null}, //ù°�� �����Է�  null �ϸ� ��ĭ���� ���
            {"�λ�", "13", "7", null, null},
            {"�Ｚ", "10", "10", null, null},
            {"SK", "5", "15", null, null},
            {"Ű��", "10", "10", null, null},
            {"��ȭ", "10", "10", null, null},
            {"�Ե�", "10", "10", null, null},
            {"NC", "10", "10", null, null},
            {"KIA", "10", "10", null, null},
            {"KT", "10", "10", null, null},
    };
	
	public BaseballMainFrame() {
		
		super("�߱����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

		panel = (JPanel)getContentPane();
		panel1 = (JPanel)getContentPane();
		panel2 = (JPanel)getContentPane();
		panel3 = (JPanel)getContentPane();
		panel4 = (JPanel)getContentPane();
		panel.setLayout(null);
		panel1.setLayout(null);
		panel2.setLayout(null);
		panel3.setLayout(null);
		panel4.setLayout(null);
		
		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		kind_belbl = new JLabel("���� - �߱�");
		table = new JTable(contents, header);
		jscp1 = new JScrollPane(table);
		timelist = new JComboBox<String>(items);
		detailbtn = new JButton("�󼼺���");
		joinbtn = new JButton("����߰�");
		mainbtn = new JButton("����ȭ��");
		
		jscp1.setLocation(30,100);
        jscp1.setSize(600,200);	
		
		Font f2 = new Font("", Font.BOLD, 20); //("����ü", Font.���ڽ�Ÿ��, ����ũ��)
		kind_belbl.setFont(f2);
		
		panel.add(kind_belbl);
		panel1.add(timelist);
		panel2.add(detailbtn);
		panel2.add(joinbtn);
		add(jscp1);
		panel4.add(mainbtn);
		
		
		
		add(panel);
		add(panel1);
		add(panel2);
		add(panel4);
		
		panel.setBounds(10,10, 100,50);
		panel1.setBounds(300,10, 150,50);
		panel2.setBounds(450,10, 200,50);
		panel4.setBounds(500,400, 100,50);
		
		
		
		

        mainbtn.addActionListener(new MyActionListener1());
        //detailbtn.addActionListener(new MyActionListener2());
        joinbtn.addActionListener(new MyActionListener3());
        detailbtn.addActionListener(new MyActionListener2());
        
    }
	class MyActionListener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			MainFrame mf = new MainFrame(null);
			dispose();
			mf.setSize(new Dimension(450,300));
			mf.setVisible(true);
				
		}
		
	}
	class MyActionListener3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			ListInsertBase mf = new ListInsertBase();
			mf.setSize(new Dimension(450,300));
			mf.setVisible(true);
			dispose();
		}
		
	}
	

	class MyActionListener2 implements ActionListener { 
		@Override
		
		public void actionPerformed(ActionEvent e) {
			//timelist.getSelectedItem().toString();
			if(timelist.getSelectedItem().toString() == "LG") {
				LGDateFrame LG = new LGDateFrame();
				LG.setSize(new Dimension(700,500));
				LG.setVisible(true);
				dispose();
			}
			else if(timelist.getSelectedItem().toString() == "KT") {
				KTDateFrame kt = new KTDateFrame();
				kt.setSize(new Dimension(700,500));
				kt.setVisible(true);
				dispose();
			}
			else if(timelist.getSelectedItem().toString() == "KIA") {
				KIADateFrame kia = new KIADateFrame();
				kia.setSize(new Dimension(700,500));
				kia.setVisible(true);
				dispose();
			}
			else if(timelist.getSelectedItem().toString() == "�λ�") {
				DoosanDateFrame doosan = new DoosanDateFrame();
				doosan.setSize(new Dimension(700,500));
				doosan.setVisible(true);
				dispose();
			}
			else if(timelist.getSelectedItem().toString() == "�Ｚ") {
				SamsungDateFrame samsung = new SamsungDateFrame();
				samsung.setSize(new Dimension(700,500));
				samsung.setVisible(true);
				dispose();
			}
			else if(timelist.getSelectedItem().toString() == "SK") {
				SKDateFrame sk = new SKDateFrame();
				sk.setSize(new Dimension(700,500));
				sk.setVisible(true);
				dispose();
			}
			else if(timelist.getSelectedItem().toString() == "NC") {
				NCDateFrame nc = new NCDateFrame();
				nc.setSize(new Dimension(700,500));
				nc.setVisible(true);
				dispose();
			}
			else if(timelist.getSelectedItem().toString() == "�Ե�") {
				LotteDateFrame lotte = new LotteDateFrame();
				lotte.setSize(new Dimension(700,500));
				lotte.setVisible(true);
				dispose();
			}
			else if(timelist.getSelectedItem().toString() == "��ȭ") {
				HanwhaDateFrame hanwha = new HanwhaDateFrame();
				hanwha.setSize(new Dimension(700,500));
				hanwha.setVisible(true);
				dispose();
			}
			else if(timelist.getSelectedItem().toString() == "Ű��") {
				KiwoomDateFrame kiwoom = new KiwoomDateFrame();
				kiwoom.setSize(new Dimension(700,500));
				kiwoom.setVisible(true);
				dispose();
			}
		}
		
	}
	public static void main(String[] args) {
		BaseballMainFrame bf = new BaseballMainFrame();
		bf.setSize(new Dimension(700,500));
		bf.setVisible(true);
		
	}
}


