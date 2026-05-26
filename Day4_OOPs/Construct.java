public class Construct {
    public static void main(String[] args) {
      Student s1 = new Student(); //Calling non-parameterized constructors
      s1.name = "suraj";
      s1.rollno = 101;
      s1.password = "suraj123";
      s1.marks = new int[3];
      s1.marks[0] = 90;
      s1.marks[1] = 85; 
      s1.marks[2] = 88;

      Student s2 = new Student(s1);
      s2.password = "abcd"; //independent password

      for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
      }
        
    }
    
}

class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    //Copy Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.marks = s1.marks;


    }

      Student() {  //Non-parameterized constructor
        System.out.println("Constructor called");
    }

    Student(String name) {  //Non-parameterized constructor
        this.name = name;
    }

    Student(int rollno) { //Parameterized constructor
        this.rollno = rollno;
    }
}
