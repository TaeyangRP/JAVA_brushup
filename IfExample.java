import javax.sql.rowset.spi.SyncResolver;

public class IfExample {

    public static void main(String[] args) throws Exception {
        String x = "R'ha";
        String y = "Persephone";

        if (x == "R'ha") {
            if (y == "Persephone") {
                System.out.println("R'ha Persephone");
            }
        }
        
    }
}
