package Graphics;


//interface to implement
	 interface Calculate4 {
		static double PI = Math.PI;
		
		void area();
	}


public class Triangle implements Calculate4 {
		double base,height;
	
		public Triangle(double base, double height) {
			this.base=base;
			this.height=height;
		}
		public void area() { 
			System.out.println("Area : "+(0.5*base*height));
		}
	}
