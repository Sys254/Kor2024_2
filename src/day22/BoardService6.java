/*
BoardService6
    - BoardService5 모든 코드를 복사후 진행
    - 추가조건 : NewBoard 클랙스 객체들을 캡슐화(접근제한자) 하시오.
        -1.NewBoard는 앞전 Board와 동일하게 내용[String 타입]과 작성자[String 타입]과 비밀번호[int 타입]로 구성된 게시물 클래스
        -2.NewBoard의 모든 필드(멤버 변수)는 private로 선언한다.
        -3. 외부에서 객체 생성시 생성자를 사용한다.
        -4. getter(필드값 호출함수),setter(필드값 대입함수),toString(객체 정보함수)
        함수들을 이용하여 모든 필드의 데이터를 간접 접근한다.

        public : 공개용
        private : 비공개용
            - 이유 : 객체의 자료는 중요하기 때문에 쉽게 저장/변경 하면 안된다.(유효성검사 -1.원하는 데이터인지 2. 안전한 데이터인지)
            - 객체를 통해 필드에 직접 접근을 차단하고 간접 접근을 이용한 유효성 검사를 시행한다.
        protected : 동일한 패키지 내에서 접근 가능 , 상속 관계이면 다른 패키지에서도 접근 가능하다.
        (default) : 동일한 패키지 내에서 접근 가능 , 위에서 3가지를 작성 안했을때 기본적으로 적용되는 접근 제한자
 */
package day22;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService6 {public static void main(String[] args) {

    //-입력객체
    Scanner scan = new Scanner(System.in);
    Board[] boardList = null;
    // - 컬렉션 프레임 워크중 ArrayList 클래스를 이용한 배열을 대체한다.
    // 배열(고정길이) vs 컬렉션프레임워크(가변길이)
    ArrayList< Board > BoardList = new ArrayList<>();
    // -ArrayList<제네릭타입> : 리스트 객체에 저장할 여러개 객체들의 타입




    while (true) {
        System.out.print("1.글쓰기 2.글출력 : ");
        int choose = scan.nextInt();
        if (choose==1) {
            // -1. 사용자로 저장할 데이터 입력 받는다.
            scan.nextLine(); // 의미없는 nextLine() 코드를 작성한다.
            System.out.print("내용 : ");  String content = scan.nextLine();
            // .next() 문자열(공백x) 입력 , .nextLine() 문자열(공백/띄어쓰기 포함) 입력
            //.nextLine() 사용시 주의할점 : .nextLine() 앞에 또 다른.nextXX() 존재하면 의미없는.nextLine() 작성해준다.
            System.out.print("작성자 : "); String writer = scan.next();
            System.out.print("비밀번호 : "); int pwd = scan.nextInt();



            // 2. 배열내 빈 공간을 찾아서 게시물 작성하기 ,
            Board board = new Board();
            board.content = content; board.writer = writer; board.pwd = pwd;
            // 3. 컬렉션 프레임 워크인 리스트 객체에 게시물 저장한다
            BoardList.add( board );

        } else if (choose == 2) {

            // 배열내 존재하는 게시물 모두 출력하기
            for( int index = 0; index <= BoardList.size()-1; index++) {
                if (BoardList.get(index) != null) {// 게시물이 존재하면
                    System.out.printf("작성자 : %s , 내용 : %s \n", BoardList.get(index).writer, BoardList.get(index).content);
                }



            } // for end

        }
    } // w end
} // m end
}
