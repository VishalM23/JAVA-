package ProgramFour.RVCE;

import ProgramFour.CSE.Thirdsem;
public class Cse_dept extends Thirdsem {


    public static void main(String[] args) {
        System.out.println("Section:Different Package Sub-class");

        Cse_dept Cse_dept = new Cse_dept();
        Cse_dept.AccessSpecifiersChecking();
    }

    public void AccessSpecifiersChecking(){
//        super.methodDefault();
//        this.methodDefault();
//        super.methodPrivate();
//        this.methodPrivate();
        super.methodProtected();
        this.methodProtected();
        super.WelcomeMsg();
        this.WelcomeMsg();
    }

//    @Override
//    void methodDefault(){
//        System.out.println("Default Method is Overridden.");
//    }
//
//
//        @Override
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

class AseDept {
    public static void main(String[] args) {
        System.out.println("Section:Different Package Non-Sub-class");

        Thirdsem thirdSem = new Thirdsem();
//        thirdSem.methodDefault();
//        thirdSem.methodPrivate();
//        thirdSem.methodProtected();
        thirdSem.WelcomeMsg();
    }


}