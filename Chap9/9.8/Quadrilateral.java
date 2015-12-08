public class Quadrilateral{

	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;

	public Quadrilateral(double x1, double y1,double x2, double y2, double x3,double y3, double x4, double y4){


		 p1 = new Point(x1, y1);
		 p2 = new Point(x2, y2);
		 p3 = new Point(x3, y3);
		 p4 = new Point(x4, y4);
	
	}

	public Point getP1(){
		return p1;
	}
	public void setP1(Point p1)
{s
	this.p1  = p1;
}	

	public Point getP2(){
		return p2;
	}
	public void setP2(Point p2){
		this.p2 = p2;
	}
	public Point getP3(){
		return p3;
	}
	public void setP3(Point p3){
		this.p3 = p3;
	}
	public Point getP4(){
		return p4;
	}
	public void setP4(Point p4){
		this.p4 = p4;
	}

	@Override
	public String toString(){
		return String.format("quadrlilateral coordinates : %s\n", getCoordinates());
	}
	

	public String getCoordinates(){


		return String.format("point1 %s, point2 %s, point3 %s, point4 %s\n", p1,p2, p3,p4);

	}
}