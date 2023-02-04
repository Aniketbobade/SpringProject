package in.hacktech.spring.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.hacktech.spring.service.Details;
import in.hacktech.spring.service.ServiceImpWork;
import in.hacktech.spring.service.StringWork;

@RestController
public class ControllerWork {

	
	@Autowired
	StringWork stringWork = new ServiceImpWork();
	
	Details details=new Details();
	
	@RequestMapping("/removespaces")
	public String removingSpaces(@RequestBody String s) {
		try {
			return stringWork.removeExtraSpace(s);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
	
	@PutMapping("/reverse")
	public StringBuilder reverseString(@RequestBody String s) {
		try {
			return stringWork.reverseString(s);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	@PutMapping("/sortlist")
	public ArrayList<String> sortlist(@RequestBody List<String> list){
		try {
			return stringWork.sortList(list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	@PutMapping("/toupper")
	public String toupperCase(@RequestBody String s) {
		try {
			return stringWork.upperCase(s);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	@PutMapping("/tolower")
	public String tolowerCase(@RequestBody String str) {
		try {
			return stringWork.lowerCase(str);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	@PutMapping("/countword")
	public int countWord(@RequestBody String sentence) {
		try {
			return stringWork.countWord(sentence);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}
	@PutMapping("/countchar")
	public Details countChar(@RequestBody String sentence) {
		try {
			return stringWork.countChar(sentence);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	@PutMapping("/countrepeatword")
	public TreeMap<String, Integer> countRepeatWord(@RequestBody String sentence){
		try {
			return stringWork.countRepeatingWord(sentence);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
 }
