public class Student{
    String studentName;
    String rollNumber;
    int marks;
    String courseName;
    int courseCredits;

    Student(String studentName,String rollNumber,int marks,String courseName,int courseCredits){
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;

    }

    int calculateFee(){
        int coursefee = courseCredits*1500;
        return coursefee;
    }
    boolean checkEligibility(){
        if(marks>=50)
            return true;
        return false;
    }
    double calculateScholarship(){
        double reducedfee = 0;
        if(marks>=85){
            reducedfee = 0.2*calculateFee();
        }
        else if (marks>=70 && marks<=84){
            reducedfee = 0.1*calculateFee();
        }
        return reducedfee;
    }
    double finalfee(){
        return calculateFee()-calculateScholarship();
    }



    void displayDetails(){
        System.out.println("---------------------------");
        System.out.println("STUDENT DETAILS: ");
        System.out.println("name: "+studentName);
        System.out.println("roll no: "+rollNumber);
        System.out.println("marks obtained: "+marks);
        System.out.println("course name: "+courseName);
        System.out.println("credits: "+courseCredits);
        System.out.println("---------------------------");
        System.out.println("Eligibility status: "+checkEligibility());
        if(checkEligibility()==false){
            System.out.println("student is not eligible");
        }
        else {
            System.out.println("total fee: " + calculateFee());
            System.out.println("Scholarship: " + calculateScholarship());
            System.out.println("final fee to be paid: " + finalfee());
        }

    }
    public static void main(String[] args){
        Student s = new Student("Dhruv","ABC123",89,"PSPJ",3);
        s.calculateFee();
        s.checkEligibility();
        s.calculateScholarship();
        s.displayDetails();
    }

}