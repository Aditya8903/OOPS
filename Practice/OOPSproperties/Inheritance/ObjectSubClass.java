package OOPSproperties.Inheritance;

public class ObjectSubClass {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     super.finalize();
    // }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectSubClass obj = new ObjectSubClass();
        ObjectSubClass obj2 = new ObjectSubClass();
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj.toString());
    }
    
}
