public class Parallelogram extends Trapezoid{


	public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){

		super(x1,y1,x2,y2,x3,y3,x4,y4);
	}


	//area = b*h
	

	public double getWidth(){
		double width;
		if(getP1().getY()==getP2().getY() ){
			 width = Math.abs(getP1().getX() - getP2().getX());
		}else{
			 width = Math.abs(getP1().getX()-getP3().getX());
		}
		return width;

	}
	
	
	@Override
	public String toString(){

		return String.format("\n%s%s%s%s\n%s%s\n%s%s\n%s%s\n","Coordinates of Parallelogram are :", getCoordinates(),
		 "The sum of bases is: ",getBasesSum(), "height is :", getHeight(),"Area is: ",
		  getArea(),"Width is: ",getWidth());

		 	}




}