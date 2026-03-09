// Abstract class
public abstract  class Bank{

    abstract void Saving();
    abstract void Current();
    abstract void Salary();
    abstract void Joint();
    public void branchDetails(){
        System.out.println("Branch : Inodre");
    }
}

// super class
class AxisBank extends Bank{

    public void Saving(){
        System.out.println("Saving reguler");
    }

    public void Current(){
        System.out.println("Current ");
    }

    public void Salary(){
        System.out.println("salary");
    }

    public void Joint(){
        System.out.println("joint");
    }

    public static void main(String[] args) {
        AxisBank Info = new AxisBank();

        Info.branchDetails();
        Info.Saving();
        Info.Current();
        Info.Salary();
        Info.Joint();

    }
}
    

