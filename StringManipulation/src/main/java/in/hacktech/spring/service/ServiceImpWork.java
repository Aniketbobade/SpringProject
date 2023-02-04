package in.hacktech.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.logging.log4j.util.PropertySource.Comparator;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpWork implements StringWork{

	@Override
	public String removeExtraSpace(String str) {
		// TODO Auto-generated method stub
		String words[]=str.split(" ");
		String res="";
		for (String string : words) {
			if(!string.isEmpty())
				res=res+string+" ";
		}
		return res;
	}

	@Override
	public StringBuilder reverseString(String sentence) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder();
		s.append(sentence);
		s.reverse();
		return s;
	}

	@Override
	public ArrayList<String> sortList(List<String> list) {
		// TODO Auto-generated method stub
		ArrayList<String> stringList=new ArrayList<>(list);
		Collections.sort(stringList,(s1, s2) -> s1.charAt(0) - s2.toLowerCase().charAt(0));
		return stringList;
	}

	@Override
	public String upperCase(String string) {
		// TODO Auto-generated method stub
		
		return string.toUpperCase();
	}

	@Override
	public String lowerCase(String string) {
		// TODO Auto-generated method stub
		return string.toLowerCase();
	}

	@Override
	public int countWord(String sentence) {
		// TODO Auto-generated method stub
		String word[]=sentence.split("\s");
		int cnt=0;
		for (String string : word) {
			if(!string.isEmpty())
			cnt++;	
			}
		return cnt;
		
	}

	@Override
	public Details countChar(String sentence) {
		// TODO Auto-generated method stub
		int lower=0;
		int upper=0;
		int digit=0;
		int special=0;
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i)>='A' && sentence.charAt(i) <='Z' ) {
				upper++;
			}else if(sentence.charAt(i)>='a' && sentence.charAt(i)<='z') {
				lower++;
			}else if(sentence.charAt(i)>='0' && sentence.charAt(i)<='9') {
				digit++;
			}else {
				special++;
			}
		}
		Details obj=new  Details(upper, lower, digit, special);
		return obj;
	}

	@Override
	public TreeMap<String, Integer> countRepeatingWord(String sentence) {
		// TODO Auto-generated method stub
		String word[]=sentence.split("\s");
		TreeMap<String, Integer> map=new TreeMap<>();
		for (String string : word) {
			if(!string.isEmpty()) {
				Integer num=map.get(string);
				if (map.containsKey(string)) {
					map.put(string,num+1);
				}else {
					map.put(string, 1);
				}
			}
		}
		return map;
	}

}
