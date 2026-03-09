// Abstract class
public abstract  class Bank{

    abstract void saving();
    abstract void current();
    abstract void salary();
    abstract void joint();
    public void branchDetails(){
        System.out.println("Branch : Inodre");
    }
}

// super class
class AxisBank extends Bank{

    public void saving(){
        System.out.println("Saving reguler");
    }

    public void current(){
        System.out.println("Current ");
    }

    public void salary(){
        System.out.println("salary");
    }

    public void joint(){
        System.out.println("joint");
    }

    public static void main(String[] args) {
        AxisBank Info = new AxisBank();

        Info.branchDetails();
        Info.saving();
        Info.current();
        Info.salary();
        Info.joint();

    }
}
    

