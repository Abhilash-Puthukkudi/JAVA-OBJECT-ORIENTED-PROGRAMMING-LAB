package Graphics;

//interface to implement
     interface Calculate1 {
		static double PI = Math.PI;
		
		void area();
	}

	
	public class Circle implements Calculate1 {
		int radius;
	
		public Circle(int radius) {
			this.radius=radius;
		
		}
		public void area() { 
			System.out.format("Area : %.3f",(Math.PI*(radius*radius)));
		}
	}

