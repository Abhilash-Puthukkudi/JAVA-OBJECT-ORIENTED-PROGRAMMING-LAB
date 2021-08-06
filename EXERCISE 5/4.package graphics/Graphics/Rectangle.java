package Graphics;

//interface to implement
	 interface Calculate2 {
		static double PI = Math.PI;
		
		void area();
	}


public class Rectangle implements Calculate2{
		int length,width;
	
		public Rectangle(int length, int width) {
			this.length=length;
			this.width=width;
		}
		public void area() { 
			System.out.println("Area : "+(length*width));
		}
	}
