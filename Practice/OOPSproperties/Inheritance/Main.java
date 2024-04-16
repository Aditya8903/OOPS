package OOPSproperties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(4);
        Box b2 = new Box();
        System.out.println(b1.l);
        System.out.println(b2.l);
        BoxWeight bx1 = new BoxWeight();
        BoxWeight bx2 = new BoxWeight(4,20);
        BoxWeight bx3 = new BoxWeight(4,8,3,20);
        System.out.println(bx1.l);
        System.out.println(bx1.w);
        System.out.println(bx1.wt);
        System.out.println(bx2.l);
        System.out.println("box 2 width = " + bx2.w);
        System.out.println("box 3 width = " + bx3.w);
        System.out.println(bx2.wt);

        /*Good concept */
        Box sample = new BoxWeight(1,2,3,10);
        System.out.println(sample.l);
        System.out.println(sample.w);
        System.out.println(sample.h);
        // System.out.println(sample.wt); -> Gives Error
    }
}
