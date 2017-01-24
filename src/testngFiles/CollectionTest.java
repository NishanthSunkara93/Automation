package testngFiles;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class CollectionTest {

	@Test
	public void testSortingCollections(){
	
		ArrayList<String> nameList = new ArrayList<String>();
	
		nameList.add("Venkat");
		nameList.add("Nishanth");
		nameList.add("Nikith");
		
		Collections.sort(nameList);
	
	}
}
