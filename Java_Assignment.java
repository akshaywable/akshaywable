
package Assignment_Manager;
import java.util.*;

class Student extends Assignment {
        
        public String student_name;
        public int prn_no;
       
}

class Trainer extends Assignment {
        
        public String trainer_name;
       
}

class Assignment{
        
        public String Title;
        public int date;
        public String Description;
        public String Assignee;
             
}

class Assignment_Manager extends Assignment {
        
        Scanner sc = new Scanner(System.in);
    
        switch(select){
        case 1: System.out.println("createAssignment");
                case 2: System.out.println("addAssignment");
                        case 3: System.out.println("showAssignments");
                                case 4: System.out.println("saveAssignments");
                                        case 5: System.out.println("loadAssignments");
                                                default: System.out.println("Invalid Option");
          }
                
        void createAssignment(){
            
                System.out.println("Enter the name of Student: ");
                String student_name = sc.nextLine();
                
                System.out.println("Enter PRN No.: ");
                int prn_no = sc.nextInt();
                
                System.out.println("Enter the Trainer Name: ");
                String trainer_name = sc.nextLine();
                
                System.out.println("Enter the Title of Assignment: ");
                String Title = sc.nextLine();
                
                System.out.println("Enter the Assignment Date: ");
                int date = sc.nextInt();
                
                System.out.println("Enter the Description: ");
                String description = sc.nextLine();
                
                System.out.println("Enter the name of Assignee: ");
                String assignee = sc.nextLine();
        
        }
       
        String assign_1,assign_2,assign_3,assign_4;
        void addAssignment(){
  
        ArrayList<String> assignments = new ArrayList<>();
        assignments.add(assign_1);
        assignments.add(assign_2);
        assignments.add(assign_3);
        assignments.add(assign_4);
        
        Iterator<String> it = assignments.iterator();
        while(it.hasNext()){
               System.out.println(it.next());
        
        }
        
     }
        
        void showAssignments(){
              
            System.out.println("Assignment: "+assign_1);
            System.out.println("Assignment: "+assign_2);
            System.out.println("Assignment: "+assign_3);
            System.out.println("Assignment: "+assign_4);
        }
        
        void saveAssignment(){
              
        }
        
        void loadAssignment(){
             
        }

       
}
public class JavaAssignment {
        
    
                public static void main(String[] args) {
        
                Student s = new Student();
                s.student_name;
                s.prn_no;
                
                Trainer t = new Trainer();
                t.trainer_name;
                
                Assignment_Manager am = new Assignment_Manager();
                am.createAssignment();
                am.addAssignment();
                am.showAssignments();
                am.saveAssignment();
                am.loadAssignment();
         }
}
