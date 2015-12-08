public abstract class Shape{

	private double base;
	private double height;
	private double profondity;

	public Shape (double b , double h, double p){
		base  = b;
		height = h;
		profondity = p;
	}


	public double getBase(){
		return base;
	}
	public void setBase(double b){
		base = b;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double h){
		height = h;
	}
	public double getProfondity(){
		return profondity;
	}
	public void setProfondify(double p){
		profondity = p;
	}
	public  abstract double getArea();
	//public abstract getVolume(){};



}