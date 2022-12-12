import javax.sql.rowset.spi.SyncResolver;

public class IfExample {

    public static void main(String[] args) throws Exception {
        String x = "R'ha";
        String y = "Persephone";
        String z = "Hades";

//        if (x == "R'ha" && y == "Persephone")  {
 //           System.out.println("R'ha Persephone");
 //       }

//        if (x == "R'ha" && y == "Persephone") {
 //           if(z == "Hades") {
//                System.out.println("Hades and Persephone");
 //           }

 if (x == "R'ha") {
    if (y == "Persephone") {
        if (z == "Hades") {
            System.out.println("Persephone and Hades");
        }
    }
 }
        }
        
    }

