package uk.ac.mmu.cnt2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import uk.ac.mmu.cnt.JSON.Student;
import uk.ac.mmu.cnt.JSON.StudentList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Second extends JFrame {

	private JPanel contentPane;
	private TextArea textArea;

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public Second() throws FileNotFoundException {
		setTitle("JSON");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		textArea = new TextArea();
		textArea.setBounds(10, 111, 524, 238);
		contentPane.add(textArea);
		
		List<FData> sList  = new ArrayList<FData>();
        
		//textArea.append("Printing out JSON");
		
        Gson gsonRead = new Gson();
        BufferedReader br = new BufferedReader(
				new FileReader("./fridgelogdata/fridgelogdata.json"));
		//convert the json string back to object
    	JsonRead out = gsonRead.fromJson(br, JsonRead.class);
    	
    	sList = out.getsList();

		for(FData s: sList){
	    	textArea.append(s +"\n");
	    } 
	
	}

}
