public class Trapezoid extends Quadrilateral{

	

	public Trapezoid(double x1,double y1, double x2, double y2, double x3, double y3, double x4, double y4){
		super(x1,y1, x2,y2, x3,y3, x4,y4);
		


	}

	public double getBasesSum(){
		double basesSum;
		if(getP1().getY() == getP2().getY()){
			 basesSum = (Math.abs(getP2().getX() - getP1().getX())+ 
			 Math.abs(getP3().getX()-getP4().getX()));
			 //System.out.println("ciao");
		}else if(getP2().getY()==getP3().getY()){
			 basesSum = Math.abs(getP2().getX() - getP3().getX()) + 
			 (Math.abs(getP1().getX()-getP4().getX()));

		}else{
			basesSum = Math.abs(getP2().getX() - getP4().getX())+
			(Math.abs(getP3().getX() - getP1().getX()));
		}
		return basesSum;
	}

	public double getHeight(){
		double height;
		if(getP1().getY() != getP2().getY()){
			 height = Math.abs(getP1().getY() - getP2().getY());

		}else{
			 height = Math.abs(getP2().getY()- getP3().getY());
		}

		return height;

	}
	public double getArea(){

		double area;
		//System.out.println("enter area");
		area = getHeight()*(getBasesSum()/2);
		return area;
	}
	@Override
	public String toString(){

		return String.format("\n%s%s%s%s\n%s%s\n","Coordinates of Trapezoid are :", getCoordinates(),
		 "The sum of bases is: ",getBasesSum(), "Area is: ", getArea());

	}
	
}