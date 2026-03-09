

public interface Bank1 {

    abstract void saving();
    abstract void current();
    abstract void salary();
    abstract void joint();
    public void branchDetails();

}

// Super class
 class AxisBank1 implements Bank1{

    public void saving(){
        System.out.println(" Saving : Saving Account");
    }

    public void current(){
        System.out.println("Current : Current Account");
    }

    public void salary(){
        System.out.println("Salary :Salary Account");
    }

    public void joint(){
        System.out.println("joint : Joint Account");
    }

    public void branchDetails(){
        System.out.println("Branch : Indore");
    }

    public static void main(String[] args) {
        AxisBank1 Info = new AxisBank1();

        Info.branchDetails();
        Info.saving();
        Info.salary();
        Info.current();
        Info.joint();
    }
}
