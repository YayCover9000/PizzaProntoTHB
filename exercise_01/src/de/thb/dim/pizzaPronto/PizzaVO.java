package de.thb.dim.pizzaPronto;

public class PizzaVO {
	private float uePrice;
	private String ueName;
	private String[] ueingredients;
	
	public PizzaVO () {
		
	}
	
	public PizzaVO (String name, String[] ingredients, float price) {
		this.setName(name);
		this.setPrice(price);
		this.setIngredients(ingredients);
	}
	
	public float getPrice () {
		if (uePrice != 0.0 || uePrice < 0) {
			return uePrice;
		}
		return (float) 0.0;
	}
	
	public void setPrice (float price) {
		if (price >= 0) {
			uePrice = price;
		}
	}
	
	public String getName () {
		return ueName;
	}
	
	public void setName (String name) {
		ueName = name;
	}

	public String[] getIngredients() {
		return ueingredients;
	}

	public void setIngredients(String[] ingredients) {
		this.ueingredients = ingredients;
	}

}
