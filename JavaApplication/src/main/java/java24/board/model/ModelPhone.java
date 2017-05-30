package java24.board.model;

public class ModelPhone {
	
	private String   name			="";       //    	` VARCHAR(50) NOT NULL,
	private String   manufacturer	="";       //    	` VARCHAR(30) NOT NULL,
	private Integer  price			=null;       //    	` INT(11) NOT NULL
	
	
	public ModelPhone() {
		 name			="";   
		 manufacturer	="";   
		 price			=null; 	
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		String toreturn = "Phone{"
		+",name="+		 name			
		+",manufacturer="+		 manufacturer	
		+",price="+		 price			+"}";
		return toreturn;
	}

}
