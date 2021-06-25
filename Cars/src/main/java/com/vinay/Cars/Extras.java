package com.vinay.Cars;
import java.util.*;

public class Extras {
	public Map<String,List<String>> getlocations(){
		  Map<String,List<String>> loc = new TreeMap<>();
		  List<String> dist = new ArrayList<>();
		  //Andhra Pradesh
		  dist.add("Anantapur");
		  dist.add("Chittoor");
		  dist.add("East Godavari");
		  dist.add("Guntur");
		  dist.add("Kadapa");
		  dist.add("Krishna");
		  dist.add("Kurnool");
		  dist.add("Prakasam");
		  dist.add("Nellore");
		  dist.add("Srikakulam");
		  dist.add("Visakhapatnam");
		  dist.add("Vizianagaram");
		  dist.add("West Godavari");
		  loc.put("Andhra Pradesh",dist);
		  dist = new ArrayList<>();
		  //Arunachal Pradesh
		  dist.add("Anjaw");
		  dist.add("Changlang");
		  dist.add("East Kameng");
		  loc.put("Arunachal Pradesh",dist);
		  //System.out.println(loc);
		  return loc;
		}
}
