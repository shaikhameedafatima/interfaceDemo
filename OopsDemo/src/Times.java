
public class Times {
	public class AddTimes {
	    int hour,min,sec;
	    
	    public AddTimes(int h,int m,int s)
	    {
	        hour=h;
	        min=m;
	        sec=s;
	        
	    }
	    void add(AddTimes obj2) {
	        this.hour+=obj2.hour;
	        this.min+=obj2.min;
	        this.sec+=obj2.sec;
	    }
	    void check() {
	        if(this.sec>=60)
	        {
	            this.min+=1;
	            this.sec=this.sec-60;
	        }
	        if(this.min>=60)
	        {
	            this.hour+=1;
	            this.min=this.min-60;
	        }
	        if(this.hour>12)
	        {
	            
	            this.hour=this.hour-12;
	        }
	    }
	    void display() {
	        System.out.print("Addition is: ");
	        System.out.println(this.hour+":"+this.min+":"+this.sec);
	    }
	    public  void main(String[] args) {
	        // TODO Auto-generated method stub
	        AddTimes obj1=new AddTimes(10,45,60);
	        AddTimes obj2=new AddTimes(3,55,5);        
	        
	        obj1.add(obj2);
	        obj1.check();
	        obj1.display();
	        
	    }
	    }
	}

	    

	 

	
	 
	
