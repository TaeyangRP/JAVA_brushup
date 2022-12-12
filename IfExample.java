import javax.sql.rowset.spi.SyncResolver;

public class IfExample {

    public static void main(String[] args) throws Exception {
        int x = 10;

        if(x<10) {
            System.out.println("x가 10 미만이면 출력된다.");
        } else {
            System.out.println("그렇지 않을 경우 출력된다.");

        }
    }
}
