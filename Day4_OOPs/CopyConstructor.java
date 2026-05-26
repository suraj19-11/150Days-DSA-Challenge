public class CopyConstructor {
    public static void main(String[] args) {
      Student s1 = new Student(); 
      s1.name = "suraj";
      s1.rollno = 101;
      s1.password = "suraj123";
      s1.marks = new int[3];
      s1.marks[0] = 90;
      s1.marks[1] = 85; 
      s1.marks[2] = 88;

      Student s2 = new Student(s1);
      s2.password = "abcd"; //independent password
      s1.marks[2] = 100; //modifying s1 marks

      for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
      }
        
    }
    
}

class Student{
    String name;
    int rollno;
    String password;
    int marks[];

    //Shallow Copy Constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     this.marks = s1.marks;
    // }

    //Deep Copy Constructor
    Student(Student s1){
        marks = new int[3]; 
        this.name = s1.name;
        this.rollno = s1.rollno;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }   
    }


        Student() {  //Non-parameterized constructor
            System.out.println("Constructor called");
            marks = new int[3];
        }
    Student(String name) {  //Non-parameterized constructor
        this.name = name;
    }   

    Student(int rollno) { //Parameterized constructor
        this.rollno = rollno;
    }   

}