package staticExample;

public class SingletonClass {
    /*whoes only one object is created */

    private SingletonClass(){

    }

    private static SingletonClass singleInstance;

    public static SingletonClass getInstance(){
        // check if instance is created or not
        if(singleInstance == null){
            singleInstance = new SingletonClass();
        }
        return singleInstance;
    }
}
