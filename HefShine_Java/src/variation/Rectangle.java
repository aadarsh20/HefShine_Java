package variation;


public class Rectangle {
		int length;
		int width;
		
		Rectangle(int l,int w)
		{
			this.length=l;
			this.width=w;
		}
		void rectangle_area()
		{
			System.out.println("Area of rectangle : "+length*width);
		}
		void rectangle_perimeter()
		{
			System.out.println("perimeter of rectaangle : "+(2*(length+width)));
		}
	public static void main(String[] args) {
		
		Rectangle re=new Rectangle(2,3);
		re.rectangle_area();
		re.rectangle_perimeter();

	}

}
