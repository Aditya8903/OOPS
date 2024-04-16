package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        try{
            //if exception occur , no new call catered
            // divide(a, 0);
            divide(a,b);
            String name = "Aditya";
            if(name.equals("Aditya")){
                throw new MyException("name is Aditya , can't use it sorry");
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Not arithematic excep.");
        }
        /*Here Exception is parent class hence checked later vice versa shouldn't be done */
        finally{
            System.out.println("Alwayz");
        }
    }
    //throws say that this method may throw an exception
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("DENOMR. is Zero");
        }
        System.out.println("Division done!");
        return a/b;
    }
}
