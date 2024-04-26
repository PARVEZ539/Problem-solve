public class student {

    public void myInformation(){
        System.out.println("My name is parvez ahmed pavel");
        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);

        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}

