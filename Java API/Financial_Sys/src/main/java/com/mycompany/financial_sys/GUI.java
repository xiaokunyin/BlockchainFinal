/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financial_sys;

/**
 *
 * @author kenyin
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import org.web3j.abi.datatypes.Utf8String;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

public class GUI extends JFrame {
	private JFrame frame;
	private JPanel Global, show,upload,Post,Search,entrepreneur,investors;
	private JTextArea project_show,project_upload;
        private JTextField upload_info;
	private JPanel ID,Name,Person,Email,Title,Detail,Target,Setcode;
	private JTextField text_id,text_name,text_person,text_email,text_detail,text_target,text_setcode,text_title;
	private JLabel label_id,label_name,label_person,label_email,label_detail,label_target,label_setcode,label_title,label_entrepreneur,label_investors;
	
	private JScrollPane project_show_scroll,project_upload_scroll;
	private JButton button_post,button_search;
	
	
	public GUI(){
		initComponents();
		
	}
	
	public void initComponents() {
		this.frame=new JFrame("Finacial System"); 
	    this.frame.setLayout(new BorderLayout(10,10));
	    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.frame.setLocation(500,50);
	    this.frame.setResizable(true);
	   // this.frame.setVisible(true);
	    
	   //ID panel
	    this.ID=new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
	    this.label_id=new JLabel("Company ID:");
	    this.label_id.setPreferredSize(new Dimension(200,30));
	    this.text_id=new JTextField();
	    this.text_id.setPreferredSize(new Dimension(200,30));
	    this.ID.add(label_id);
	    this.ID.add(text_id);
	    
	    
	   //name
	    this.Name=new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
	   
	    this.label_name=new JLabel("Company Name:");
	    this.label_name.setPreferredSize(new Dimension(200,30));
	    this.text_name=new JTextField();
	    this.text_name.setPreferredSize(new Dimension(200,30));
	    this.Name.add(label_name);
	    this.Name.add(text_name);
	    
	    //person    	    
	    this.Person=new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));

	    this.label_person=new JLabel("Company legal Person:");
	    this.label_person.setPreferredSize(new Dimension(200,30));
	    this.text_person=new JTextField();
	    this.text_person.setPreferredSize(new Dimension(200,30));
	    this.Person.add(label_person);
	    this.Person.add(text_person);
	    
	    
	    
	    //Email
	    this.Email=new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
	    this.label_email=new JLabel("Company Email:");
	    this.label_email.setPreferredSize(new Dimension(200,30));
	    this.text_email=new JTextField();
	    this.text_email.setPreferredSize(new Dimension(200,30));
	    this.Email.add(label_email);
	    this.Email.add(text_email);
	    
	    
	    //Title
	    this.Title=new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
	    this.label_title=new JLabel("Company Title:");
	    this.label_title.setPreferredSize(new Dimension(200,30));
	    this.text_title=new JTextField();
	    this.text_title.setPreferredSize(new Dimension(200,30));
	    this.Title.add(label_title);
	    this.Title.add(text_title);
	    
	    
	    //Detail
	    this.Detail=new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
	    this.label_detail=new JLabel("Company Detail:");
	    this.label_detail.setPreferredSize(new Dimension(200,30));
	    this.text_detail=new JTextField();
	    this.text_detail.setPreferredSize(new Dimension(200,30));
	    this.Detail.add(label_detail);
	    this.Detail.add(text_detail);
	    
	    //Target
	    this.Target=new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
	    this.label_target=new JLabel("Fundraising Target:");
	    this.label_target.setPreferredSize(new Dimension(200,30));
	    this.text_target=new JTextField();
	    this.text_target.setPreferredSize(new Dimension(200,30));
	    this.Target.add(label_target);
	    this.Target.add(text_target);
	    
	    //Setcode
	    this.Setcode=new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
	    this.label_setcode=new JLabel("Setcode:");
	    this.label_setcode.setPreferredSize(new Dimension(200,30));
	    this.text_setcode=new JTextField();
	    this.text_setcode.setPreferredSize(new Dimension(200,30));
	    this.Setcode.add(label_setcode);
	    this.Setcode.add(text_setcode);
	    
	    
	    //project upload
	    this.show=new JPanel(new BorderLayout(20,10));
	    this.entrepreneur=new JPanel(new BorderLayout(20,10));
	    this.label_entrepreneur=new JLabel("Enterepreneur Console");
	    
	    this.project_upload_scroll=new JScrollPane();
	    this.project_upload=new JTextArea();
	    this.project_upload_scroll.setViewportView(project_upload);
	    this.project_upload_scroll.setPreferredSize(new Dimension(100,50));
	    
	    //this.entrepreneur.add(label_entrepreneur,BorderLayout.NORTH );
	    this.entrepreneur.add(project_upload_scroll,BorderLayout.CENTER);
	    
	    this.show.add(entrepreneur, BorderLayout.NORTH);
	    
	  
	    //project show part
	    this.investors=new JPanel(new BorderLayout(20,10));
	    this.label_investors=new JLabel("Investors Console");
	    this.project_show_scroll=new JScrollPane();
	    this.project_show=new JTextArea();
	    this.project_show_scroll.setViewportView(project_show);
	    this.project_show_scroll.setPreferredSize(new Dimension(400,200));
	    //this.investors.add(label_investors, BorderLayout.NORTH);
	    this.investors.add(project_show_scroll, BorderLayout.CENTER);
	    
	    this.show.add(investors, BorderLayout.CENTER);
	    
	    
	    
	   
	  
	    
	    //ad information panel
	    this.upload=new JPanel(new GridLayout(8,1));
	    this.upload.add(ID);
	    this.upload.add(Name);
	    this.upload.add(Person);
	    this.upload.add(Email);
	    this.upload.add(Detail);
	    this.upload.add(Target);
	    this.upload.add(Setcode);
	    
	    //Post button
	    this.button_post=new JButton("Post Project");
	    this.button_post.setPreferredSize(new Dimension(130, 50));
            
	    this.Post=new JPanel(new FlowLayout(FlowLayout.CENTER,30,10));
	    
            this.upload_info = new JTextField();
            this.upload_info.setPreferredSize(new Dimension(130,50));
            this.Post.add(upload_info);
            this.Post.add(button_post);
            
	    this.upload.add(Post, BorderLayout.SOUTH);
	    
	    //Search button
	    this.button_search=new JButton("Search");
	    this.button_search.setPreferredSize(new Dimension(130, 50));
	    this.Search=new JPanel(new FlowLayout(FlowLayout.CENTER,30,10));
	    this.Search.add(button_search);
	    this.show.add(Search, BorderLayout.SOUTH);
	    
	    
	    //global panel setting
	    //Frame add
            this.Global = new JPanel(new BorderLayout(20,20));
            this.Global.add(this.show, BorderLayout.CENTER);
            this.Global.add(this.upload, BorderLayout.WEST);
            //border
            this.upload.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"entrepreneur console"));
            this.show.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"investors console"));
            this.entrepreneur.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"search code"));
            this.investors.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"search result"));
            this.upload.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"entrepreneur console"));
            this.frame.add(Global);
            this.frame.setVisible(true);
            this.frame.pack();    
	}
        
        public static void main(String[] args) throws Exception{
            GUI gui=new GUI();
            
            Web3j web3j = Web3j.build(new HttpService("http://localhost:8545"));
            dataOperator company=new dataOperator(web3j);
            
            //Utf8String searchcode = new Utf8String("1");
            //System.out.println("the invoice "+searchcode+" is below:\n"+company.getComInfo(searchcode));
            
            gui.button_post.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    //System.out.println("aa");
                    String com_id=gui.text_id.getText();
                    String com_name=gui.text_name.getText();
                    String com_person=gui.text_person.getText();
                    String com_email=gui.text_email.getText();
                    String pro_title=gui.text_title.getText();
                    String pro_detail=gui.text_detail.getText();
                    String fun_target=gui.text_target.getText();
                    String set_code=gui.text_setcode.getText();
                    Utf8String setcode = new Utf8String(set_code);
                    companyInstance comInfo = new companyInstance(com_id,com_name,com_person,com_email,pro_title,pro_detail,fun_target);
                
                    try {
                        company.setComInfo(setcode, comInfo);
                        gui.upload_info.setText("Upload done!!");
                        gui.text_id.setText("");
                        gui.text_name.setText("");
                        gui.text_person.setText("");
                        gui.text_email.setText("");
                        gui.text_title.setText("");
                        gui.text_detail.setText("");
                        gui.text_target.setText("");
                        
                    } catch (Exception ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
            gui.button_search.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    String search_code=gui.project_upload.getText();
                    Utf8String searchcode = new Utf8String(search_code);
                
                    try {
                        String result=company.getComInfo(searchcode);
                        gui.project_show.setText(result);
                    } catch (Exception ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
            
        }
    
}
