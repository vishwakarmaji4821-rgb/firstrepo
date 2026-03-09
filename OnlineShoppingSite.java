// Method creation and object creation and method called by object.
public class OnlineShoppingSite {

    public void myAccount(){
        System.out.println("Account : ShoppingSite");
    }

    public void cataLog(){
        System.out.println("cataLog : MyCat");
    }

    public void orders(){
        System.out.println("orders : My Orders");
    }

    public void myWishList(){
        System.out.println("myWishList : Wish List");
    }

    public static void main(String[] args) {
        OnlineShoppingSite Info = new OnlineShoppingSite();

        Info.myAccount();
        Info.cataLog();
        Info.orders();
        Info.myWishList();
    }
    
}
