


	
		// TODO Auto-generated method stub
		class Father {
			  String familyName;
			  String houseaddress;
			  Father() {
			    familyName = "Programmer";
			    houseaddress = "Delhi";
			  }
			}
			class Son extends Father {
			  Son() {
			    System.out.println("I am the Son");
			    System.out.println("My family name is " + this.familyName + " and I am from " + this.houseaddress);

			 

			  }

			 

			}
			class Daughter extends Father {
			  Daughter() {
			    System.out.println("I am the Daughter");
			    System.out.println("My family name is " + this.familyName + " and I am from " + this.houseaddress);
			  }
			}
			class TestFather {
			  public static void main(String[] args) {
			    Son s = new Son();
			    Daughter d = new Daughter();
			  }
			}
	


