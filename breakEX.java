public class breakEX {

    public static void main(String[] args) {
 //       for(int i = 50; i >= 0; i -= 10) { // 50에서 시작해서, 10씩 줄어들며 0 이상인 수를 반복해서 출력
 //           if (i == 30) {
 //               break; //i가 30이 될 경우 반복문을 중지, 따라서 50과 40만 출력됨

  //          }
 //           System.out.print(i);
//            System.out.print("\n");



//        }
          int [] numbers = {10, 20, 30, 40, 50};

          for(int x : numbers ) { // 10부터 50까지 왼쪽부터 순서대로 출력하되
            if (x == 30) { // numbers를 출력하는 x가 30에 도달하면 중단
                break;
            }
            System.out.print(x); // 10과 20만 출력됨
            System.out.print("\n");
          }

    }
    
}
