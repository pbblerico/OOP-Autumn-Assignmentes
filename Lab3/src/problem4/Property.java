package problem4;

public class Property {
	String address;
	double price;
	double area;
	String description;
	String author;
	
	public Property() {}
	
	public Property(String address, double price, double area, String author, String description) {
		this.address = address;
		this.price = price;
		this.area = area;
		this.description = description;
		this.author = author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Property p = (Property) o;
		
		return price == p.price && area == p.area && address.equals(p.address) && description.equalsIgnoreCase(p.description);
	}

	public int compareTo(Property o) {
		if(price > o.getPrice()) return 1;
		if(price == o.getPrice()) return 0;
		return -1;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Property p = (Property) super.clone();
		return p;
	}
}
