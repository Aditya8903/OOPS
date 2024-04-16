package OOPSproperties.Inheritance;

public class BoxWeight extends Box {
    int wt;

    BoxWeight(){
        this.wt = -1;
    }

    BoxWeight(int side , int wt){
        super(side);
        this.wt = wt;
    }

    BoxWeight(int l , int w , int h , int wt){
        super(l,w,h); // call parent class constructor
        this.wt = wt;
    }
}
