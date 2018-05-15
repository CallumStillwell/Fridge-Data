package uk.ac.mmu.cnt2;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class JsonRead {
	
		@SerializedName("fdata")
		List<FData> sList  = new ArrayList<FData>();

		public List<FData> getsList() {
			return sList;
		}

		public void setsList(List<FData> sList) {
			this.sList = sList;
		}	

	}
