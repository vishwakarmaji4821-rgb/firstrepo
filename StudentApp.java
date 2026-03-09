public class StudentApp {
    public void studentName(){
        System.out.println("Name : Pradeep Kumar");
    }

    public void studentList(){
        System.out.println("List : 100");
    }

    public void studentMark(){
        System.out.println("Mark : 1005");
    }

    public void studentAddress(){
        System.out.println("Address : Indore");
    }

    public static void main(String[] args) {
        StudentApp Info = new StudentApp();

        Info.studentName();
        Info.studentList();
        Info.studentMark();
        Info.studentAddress();
        
    }
    
}
