package class19;

public class Information {
    public static void main(String[] args) {
        //OBJECT DECLARE & OBJECT CREAT
        
        Student student1= new Student(); 
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        
        Student obj= new Student();
        
        
        
        System.out.println("-----Student Information-----"); 
        
           
        System.out.println("Student 1:");  
        student1.information("Halima Sadia", "A", 147183, 1234567890);
        student1.informaton();
        
        System.out.println("\n\nStudent 2:");
        student2.information("Mim", "A", 147183, 453437843);
        student2.informaton();
                      
        System.out.println("\n\nStudent 2:");
        student3.information("Sadia", "A", 147183, 453437843);
        student3.informaton();
        
        System.out.println("\n\nStudent 2:");
        student4.information("Shanta", "A", 147173, 453437843);
        student4.informaton();
      
        
    }
}
