package uk.ac.mmu.cnt2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import uk.ac.mmu.cnt.JSON.Student;
import uk.ac.mmu.cnt.JSON.StudentList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.ActionEvent;


public class Programme extends JFrame {
	
	private static final String XML = "./fridgelogdata/fridgelogdata.xml";
	private JPanel contentPane;
	ArrayList<FridgeData> dList = new ArrayList<FridgeData>();
	List<FData> sList  = new ArrayList<FData>();
	
	public static void main(String[] args) {
		
		
		// Launching the application
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programme frame = new Programme();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Programme () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnXML = new JButton("XML");
		btnXML.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				First XML = null;
				try {
					XML = new First();
				} catch (FileNotFoundException | JAXBException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}//just create a new object of the Jframe class and set visible to true
				XML.setVisible(true);
			}
		});
		
		btnXML.setBounds(116, 11, 130, 23);
		contentPane.add(btnXML);
		
		
		JButton btnJSON = new JButton("JSON");
		btnJSON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Second JSON = null;
				try {
					JSON = new Second();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JSON.setVisible(true);
			}
		});
		
		btnJSON.setBounds(300, 11, 130, 23);
		contentPane.add(btnJSON);
			
		}
	}


