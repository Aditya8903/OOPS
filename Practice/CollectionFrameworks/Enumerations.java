package CollectionFrameworks;

public class Enumerations {
    enum Week{
        monday,tuesday,wednesday,thursday,friday,saturday,sunday; // these are enum constants
        //enum const are -> 1.PUBLIC 2.STATIC 3.FINAL
        //FINAL->hence can't create child enums
        //Type is Week

        Week(){
            System.out.println("Constructor called for "+this);
        }
        /*
        1. this is not public or protected , only private or default
        2.why?
          we don't want to create new Objects as this is not concept of enum
        3.internally
          public static final Week monday = new Week();
        */
    }
    public static void main(String[] args) {
        Week week;
        week = Week.monday;

        System.out.println(week);
        // ORDINAL METHOD
        System.out.println("Ordinal value is -> "+week.ordinal());
        for (Week day : Week.values()) {
            System.out.println(day);
        }
    }
}
