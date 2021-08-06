package Graphics;

//interface to implement
	interface Calculate3 {
		static double PI = Math.PI;
		
		void area();
	}

	
	public class Square implements Calculate3 {
		int side;
	
		public Square(int side) {
			this.side=side;
			
		}
		public void area() { 
			System.out.println("Area : "+(side*side));
		}
	}
