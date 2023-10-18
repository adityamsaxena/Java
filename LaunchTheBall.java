class Ball{
	String color;
	int cost;
	String brand;

		void bounce(){
		System.out.println("Ball is Bouncing");
		}
		void roll(){
		System.out.println("Ball is Rolling");
		} 
}
	class LaunchTheBall{
		public static void main(String[]args){
		Ball b1 = new Ball();
		     b1.bounce();
		     b1.roll();
			   }
}