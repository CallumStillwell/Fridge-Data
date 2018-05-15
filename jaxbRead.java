package uk.ac.mmu.cnt2;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement(name = "dd")
public class jaxbRead {
	
	private ArrayList<FridgeData> dList;
	
	@XmlElement(name = "row")	
	public ArrayList<FridgeData> getdList() {
		return dList;
	}
	public void setdList (ArrayList <FridgeData> dList) {
		this.dList = dList;
	}
	
	
	
	

}
