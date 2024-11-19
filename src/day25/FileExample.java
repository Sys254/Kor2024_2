package day25;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileExample {
    public static void main(String[] args) {

        // 1. 파일 출력(쓰기)
        // - 자바에서 사용되는 데이터를 자바외부(c:java)에 메모장(.txt)으로 저장
       try {
           //예외가 발생할 것 같은 코드를 try{} 안에서 작성한다.

           //c드라이브에 'java' 폴더 생성한다.
           //FileOutputStream fileoutput = new FileOutputStream("c:/test1.txt");
           //- 현재 프로젝트내 'src->day25->test1.txt' 파일 생성한다.
           FileOutputStream fileoutput = new FileOutputStream("./src/day25/test1.txt");
           fileoutput.write("Hello Java".getBytes());
           // fileOutput[객체].write[메소드](인자값1);

         }catch (FileNotFoundException e) { // [특정] 예외가 발생했을때 실행되는 코드 작성한다.
           e.printStackTrace();

       }catch (Exception e) {
           // [모든] 예외가 발생했을때 실행되는 코드를 작성한다.
           // ( Exception : 예외 클래스의 최상위 클래스 )
           e.printStackTrace();

       }finally {
            // 예외가 있던 없던 실행되는 코드를 작성한다.
         }
       }
}
