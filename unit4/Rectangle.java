public class Rectangle 
{ 
	private double base; 
	private double height; 
	public Rectangle(double base, double height) 
	{ 
		this.base = base; 
		this.height=height; 
	} 
	public double getBase()
	{  
	return base; 
} 
public double getHeight() 
{ 
	return height; 
} 
public double getArea() 
{ 
	return base * height; 
} 
public double getPerimeter() 
{ 
	return (2*base)+(2*height); 
} 
public double getHypotenuse() 
{ 
	return Math.sqrt((base*base)+(height*height)); 
}
}


