class Bike{
 final int SPEED_LIMIT=90;//final variable
 void run(){
  //SPEED_LIMIT=800;
	 System.out.println("the speed limit of bike is:"+SPEED_LIMIT);
 }
 public static void main(String args[]){
 Bike obj=new  Bike();
 obj.run();
 }
}