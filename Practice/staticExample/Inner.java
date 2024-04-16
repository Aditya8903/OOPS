package staticExample;

class Inner{
    static class Test1{
        String name;
        static int count1 = 0;
        int count2;

        public Test1(String name){
            this.name = name;
            count1++;
            count2++;
        }
    }

    class Test2{
        int roll;

        public Test2(int rol){
            this.roll = rol;
        }
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1("Aditya");
        Test1 t5 = new Test1("Mohit");
        System.out.println(t1.name);
        System.out.println(t5.name);
        System.out.println(Test1.count1);
        System.out.println(t1.count2);
        System.out.println(t5.count2);
        /*Not allowed as it is non static (Test2) but inside a class i.e Inner class and we are trying to access it in static method
        Test2 t2 = new Test2(109);
        */
        Test4 t4 = new Test4(90.3f);
        System.out.println(t4.marks);
    }
}
/*Not Allowed 
static class Test3{

}*/
class Test4{
    double marks;

    public Test4(double marks){
        this.marks = marks;
    }
}

/***********************NOTE************************/
/*if u r keeping a non static class inside a class it says that class 1 is dependent on parent class but 
 * if a class is non static but not inside a class it is said to be independent hence no issue.
 * And when a static class is kept inside a class then class1 is dependent on parent class but not its object , hence can be instantiated 
 without parent class instantiation
 */
