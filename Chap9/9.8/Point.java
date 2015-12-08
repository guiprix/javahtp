public class Point{

	private double coorX;
	private double coorY;


	public Point(double coorX, double coorY){

		this.coorX = coorX;
		this.coorY = coorY;
	}

	public double getX(){
		return coorX;
	} 
	public void setX(double coorY){
		this.coorY = coorY;

	}

	public double  getY(){
		return coorY;
	}

	public void setY(double coorY){
		this.coorY = coorY;
	}
	@Override
	public String toString(){
		return String.format("x:%s, y:%s", getX(), getY());
	}

}