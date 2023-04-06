package de.thb.dim.pizzaPronto;
import java.awt.Color;


public class ChefVO {
	
	private Color UEcolorApron;
	private String UElastName;
	private String UEfirstName;
	
	public ChefVO () {
		
	}
	
	
	public ChefVO (String lastName, String firstName, Color colorApron)  {
		UEcolorApron = colorApron;
		UElastName = lastName;
		UEfirstName = firstName;
		this.UEcolorApron = colorApron;
		this.UElastName = lastName;
		this.UEfirstName = firstName;
		
	}
	
	public void setColorApron (Color colorApron) {
		UEcolorApron = colorApron;
	}
	
	public Color getColorApron () {
		return UEcolorApron;
	}
	
	public void setLastName (String lastName) {
		UElastName = lastName;
	}
	
	public String getLastName () {
		return UElastName;
	}
	
	public void setFirstName (String firstName) {
		UEfirstName = firstName;
	}
	
	public String getFirstName () {
		return UEfirstName;
	}

}
