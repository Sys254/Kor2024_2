/*
    BoardService1
        - 내용과 작성자로 구성된 게시물 3개까지 저장하는 서비스 구축
        - 조건 : main함수 1개와 변수 6개와 반복문 사용
        - 구축 : 게시물 쓰기와 게시물 출력 기능 구현


 */

package day21;

import java.util.Scanner;

public class BoardService1 {
    public static void main(String[] args) { // main start // 번역된 코드들을 실행하는 기능(main 스레드) 포함
        // - 입력 객체
        Scanner scan = new Scanner(System.in); // - 입력객체

        // - 저장소 설계 , 게시물 1개당 내용과 작성자(2개) , 게시물 3개면 내용 6개
            // 변수란 ? 하나의 데이터/주소값 을 저장하는 공간 / 메모리
            // 타입이란 ?변수의 저장될 데이터/주소의 타입 , 데이터 분류 , 기본타입 vs 참조타입

        String content1 = null;  String writer1 = null;  // 첫번째 게시물 내용
        String content2 = null;  String writer2 = null;  // 두번째 게시물 내용
        String content3 = null;  String  writer3 = null; // 세번째 게시물 내용

        // if : 다중 if는 다중 조건의 다중 결과를 충족할 수 있다.
        // if~ else if : 다중 조건의 무조건 1개 결과를 충족한다.


        while ( true ) { // 무한루프
            System.out.println("1.게시물쓰기 2.게시물출력 선택 : ");
            int choose = scan.nextInt(); // 입력
            if( choose == 1 ) { // 만약에 입력한 값이 1이면 게시물 쓰기 구현
                // 게시물을 저장할 내용 입력 받기
                System.out.println("새로운 게시물 내용 : "); String content = scan.next();
                System.out.println("새로운 게시물 작성자 : "); String writer = scan.next();


                // 게시물을 작성할 공간이 있는지 체크, 임의로 게시물이 존재하지 않는 뜻 , null(객체없음) 또는 ""
                if( content1 == null ){ // 만약에 첫번째 게시물의 정보가 비어있으면
                    content1 = content;     writer1 =writer; // 입력받은 값들을 첫번째 게시물 변수에 저장
                }
                else if( content2 == null ) { // 만약에 두번째 게시물의 정보가 비어있으면
                    content2 = content;
                    writer2 = writer;
                } // else if end
                else if (content3 == null) {
                    content3 = content; writer3 = writer;

                }
                else {
                    System.out.println("게시물 쓰기 실패 : 빈공간이 없습니다.");
                } // else end
            } // if end
            if ( choose == 2 ) { // 만약에 입력한 값이 2이면 게시물 출력 구현

                if (content1 != null) {//만약에 첫번째 게시물이 존재하면
                    System.out.printf("작성자 : %s , 내용 : %s", writer1, content1);
                } // if end
                if (content2 != null) {//만약에 첫번째 게시물이 존재하면
                    System.out.printf("작성자 : %s , 내용 : %s", writer2, content2);
                } // if end
                if (content3 != null) {//만약에 첫번째 게시물이 존재하면
                    System.out.printf("작성자 : %s , 내용 : %s", writer3, content3);
                }
            }// if end
        }// while end
    } // main end
} // class end
