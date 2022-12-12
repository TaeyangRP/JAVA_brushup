import javax.sql.rowset.spi.SyncResolver;

public class IfExample {

    public static void main(String[] args) throws Exception {
        int x = 40;

        if(x<10) {
            System.out.println("x가 10 미만이면 출력된다.");
        } else if(x<20) {
            System.out.println("x가 20 미만이면 출력된다.");
        } else if(x<30) {
            System.out.println("x가 30 미만이면 출력된다.");
        } else {
            System.out.println("x가 30 이상이면 출력된다.");
        }
        System.out.println("gitHub 업로드 연습을 겸한다.");
    }
}
