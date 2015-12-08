public  class TwoDimen extends Shape{

	//private double base;
	//private double height;

	public TwoDimen(double b, double h, double p ){
		super(b, h, p);
	}

	@Override
	public double getArea(){

		return getBase() * getHeight();
	}

}