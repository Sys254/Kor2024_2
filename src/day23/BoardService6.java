/*
BoardService6
    - BoardService5 모든 코드를 복사후 진행
    - 추가조건 : NewBoard 클랙스 객체들을 캡슐화(접근제한자) 하시오.
        -1.NewBoard는 내용[String 타입]과 작성자[String 타입]과 비밀번호[int 타입]로 구성된 게시물 클래스
        -2.NewBoard의 모든 필드(멤버 변수)는 private로 선언한다.
        -3. 외부에서 객체 생성시 생성자를 사용한다.
        -4. getter(필드값 호출함수),setter(필드값 대입함수),toString(객체 정보함수)
        함수들을 이용하여 모든 필드의 데이터를 간접 접근한다.

 */

package day23;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService6 {
    public static void main(String[] args) {

        // - 확인코드
            // - 1. toString 오버라이딩 하기전
       // Board b1 = new Board();
       // System.out.println(b1.toString()); // 객체의 (힙영역) 주소값

        // - 2. toString 오버라이딩 했을때 , toString() 함수는 생략가능.
        Board b1 = new Board();
        System.out.println(b1.toString()); // 객체의 (힙영역) 주소값

        // 구현 : BoardService5 코드를 복사해서 진행
        //-입력객체

        Scanner scan = new Scanner(System.in);
        ArrayList<Board> BoardList = new ArrayList<>();
        while (true) {
            System.out.print("1.글쓰기 2.글출력 : ");
            int choose = scan.nextInt();
            if (choose==1) {
                scan.nextLine();
                System.out.print("내용 : ");  String content = scan.nextLine();
                System.out.print("작성자 : "); String writer = scan.next();
                System.out.print("비밀번호 : "); int pwd = scan.nextInt();
                Board board = new Board(content,writer,pwd);
                BoardList.add( board );
            } else if (choose == 2) {


                for( int index = 0; index <= BoardList.size()-1; index++) {
                    if (BoardList.get(index) != null) {// 게시물이 존재하면
                        System.out.printf("작성자 : %s , 내용 : %s \n",
                                BoardList.get(index).getContent(),
                                BoardList.get(index).getWriter() );
                    }



                } // for end

            }
        } // w end
    } // m end


    }



























