package uk.ac.mmu.cnt2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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


public class First extends JFrame {

	private JPanel contentPane;
	private TextArea textArea;
	private static final String XML = "./fridgelogdata/fridgelogdata.xml";
	/**
	 * Create the frame.
	 * @throws JAXBException 
	 * @throws FileNotFoundException 
	 */
	public First() throws JAXBException, FileNotFoundException {
		setTitle("XML");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 306, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		textArea = new TextArea();
		textArea.setBounds(10, 111, 524, 238);
		contentPane.add(textArea);
		
	ArrayList<FridgeData> dList = new ArrayList<FridgeData>();
		
		JAXBContext context = JAXBContext.newInstance(jaxbRead.class);
		textArea.append("Printing out XML \n");
		 Unmarshaller um = context.createUnmarshaller();
		 jaxbRead dl = (jaxbRead) um.unmarshal(new FileReader(XML));

		 dList = dl.getdList();
		 
             //temp.add(d.getTemp());
             //temp.add(d.getTemp());
          
	for (FridgeData d : dList) {
        textArea.append(d + "\n"); 
	 }

	
		 //Do calculations and plot graph
		 //need new class for graph
		 //create list of double for temp max = new
		 //and another for min
		 //use both variables for 
		 //getters and setter
		 //
	}
	
}

	
	




