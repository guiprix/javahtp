public class TestQaudril{

	public static void main(String[] args){

/*
		Quadrilateral quadril = new Quadrilateral(1,3,5,3,1,10,5,10);
		//System.out.println(rect.getX1());
		Trapezoid trap = new Trapezoid(11,7,20,27,53,7,36,27);
		//Point p = rect.getP1();	
		Parallelogram parall = new Parallelogram(12,10,21,10,8,5,17,5);
		
		Rectangle rect = new Rectangle(3,5,20,5,3,10,20,10);

		Square sqr = new Square(3,5,20,5,3,22,20,22);
		
		

		System.out.printf(" %s\n %s\n %s\n%s\n%s\n",quadril, trap, parall, rect,sqr);
*/
		 Quadrilateral quadrilateral = 
         new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);

      // A trapezoid is a quadrilateral having exactly two parallel sides
      Trapezoid trapezoid = 
         new Trapezoid(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);
      
      // A parallelogram is a quadrilateral with opposite sides parallel
      Parallelogram parallelogram = 
         new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);

      // A rectangle is an equiangular parallelogram
      Rectangle rectangle = 
         new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0);

      // A square is an equiangular and equilateral parallelogram
      Square square = 
         new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);

      System.out.printf(
         "%s %s %s %s %s\n", quadrilateral, trapezoid, parallelogram, 
         rectangle, square);
   
	}
}