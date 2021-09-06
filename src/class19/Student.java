package class19;


public class Student {
    String name,group;
    int roll,phn_number;
    
    void information( String n, String g, int r, int phone){
        name=n;
        group=g;
        roll=r;
        phn_number=phone;
    }
    
    void informaton(){
        System.out.println("Name :"+name);
        System.out.println("Group :"+group);
        System.out.println("Roll :"+roll);
        System.out.println("Phone : "+phn_number);
    }
    
   
    
}

