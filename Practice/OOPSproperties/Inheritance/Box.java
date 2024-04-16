package OOPSproperties.Inheritance;

public class Box {
    int l;
    int h;
    int w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(int side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(int l , int w , int h){
        this.h =  h;
        this.l = l;
        this.w =  w;
    }

    Box(Box old){
        this.h =  old.h;
        this.l = old.l;
        this.w =  old.w;
    }
    
}
