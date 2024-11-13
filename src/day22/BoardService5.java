/*
BoardService5
    - BoardService4 모든 코드를 복사후 진행
    - 기존코드 : 가변길이 배열 구현 , Board[] boardList = null;
    - 수정조건 : 가변길이 배열 대신 ArrayList 컬렉션 프레임으로 수정하시오.

    - 컬렉션(수집) 프레임워크(미리 만들어진 구조) : (데이터)수집 관련 클래스들
        - 여러개의 데이터들을 하나의 객체에서 관리하기 위해서 --> 배열은 고정길이라 가변길이로 구현하는 방법은 복잡
                                                      --> 자바 회사에서 배열을 이용한 가변 길이의 배열 클래스를 만들었다.
        - 대표 인터페이스 : ArrayList , Set , Map 컬렉션
        - ArrayList 클래스
            대표 함수
                .add(새로운 객체) : 리스트에 지정한 객체 저장
                .size() : 리스트내 저장한 총 객체수 반환 함수
                .remove(인덱스) : 리스트내 지정한 인덱스에 객체 삭제하는 함수

 */
package day22;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService5 { public static void main(String[] args) {

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
