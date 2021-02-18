
public class PersonTest 
{
    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        Person objPerson=new Person();
        Person objPerson1=new Person("Keerthana",21);
        Person objPerson2=new Person("Jacky",25,"TG");
        objPerson.input();
        objPerson.print();
        objPerson1.print();
    }
}