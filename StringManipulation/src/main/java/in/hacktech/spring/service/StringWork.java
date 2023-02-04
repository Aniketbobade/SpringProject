package in.hacktech.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

@Service
public interface StringWork {
	
	Details detials=new Details();

	public String removeExtraSpace(String sentence);
	
	public StringBuilder reverseString(String sentence);
	
	public ArrayList<String> sortList(List<String> list);
	
	public String upperCase(String string);
	
	public String lowerCase(String string);
	
	public int countWord(String sentence);
	
	public Details countChar(String sentence);
	
	public TreeMap<String, Integer> countRepeatingWord(String sentence);
	
	
	
	
}
