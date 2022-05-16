package entitycharacteristics;

import java.util.ArrayList;

public class BodyRegion {
   private String name;
   ArrayList<Organs> organs;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<Organs> getOrgans() {
	return organs;
}
public void setOrgans(ArrayList<Organs> organs) {
	this.organs = organs;
}
   
}
