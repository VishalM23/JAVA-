package ProgramFour.CSE;

public class Thirdsem  {
    void methodDefault(){
        System.out.println("Default Method is Accessible");
    }
    private void methodPrivate(){
        System.out.println("Private method is Accessible");
    }
    protected void methodProtected(){
        System.out.println("Protected Method is Accessible");
    }
    public void WelcomeMsg(){
        System.out.println("Public Method is Accessible \n Welcome to CSE-DEPT 3rd Sem young budding Engineers");
    }

    public static void main(String[] args){
        System.out.println("Section:Same Class");

        Thirdsem Thirdsem = new Thirdsem();

        Thirdsem.methodDefault();
        Thirdsem.methodPrivate();
        Thirdsem.methodProtected();
        Thirdsem.WelcomeMsg();
    }
}

class IseDept extends Thirdsem{
    public static void main(String[] args){
        System.out.println("Section:Same Package Sub-Class");
        IseDept iseDept = new IseDept();

        iseDept.AccessSpecifiersChecking();
    }


    public void AccessSpecifiersChecking(){
        super.methodDefault();
        this.methodDefault();
//        super.methodPrivate();
//        this.methodPrivate();
        super.methodProtected();
        this.methodProtected();
        super.WelcomeMsg();
        this.WelcomeMsg();
    }


    @Override
    void methodDefault(){
        System.out.println("Default Method is Overridden.");
    }

//    @Override
//    private void methodPrivate(){
//        System.out.println("Private Method is Overridden.");
//    }
    @Override
    protected void methodProtected(){
        System.out.println("Protected Method is Overridden.");
    }


    @Override
    public void WelcomeMsg(){

        System.out.println("Public Method is Overridden.");
    }



}

class EceDept {
    public static void main(String[] args){
        System.out.println("Section:Same Package Non-Sub-Class");
        Thirdsem Thirdsem = new Thirdsem();
        Thirdsem.methodDefault();
//        Thirdsem.methodPrivate();
        Thirdsem.methodProtected();
        Thirdsem.WelcomeMsg();
    }

}