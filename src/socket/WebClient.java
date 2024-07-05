package socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class WebClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        // 소켓 준비
        // 클라이언트 측 포트번호는 알아서 정해짐 알려면 알 수 있다
        Socket socket = new Socket("192.168.0.79", 8080);
        System.out.println(socket.isConnected() ? "y" : "n");

        // 클라이언트 입출력버퍼 준비
        Scanner scan = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream(), true);

        // 출력버퍼로 서버에 요청하기
        // 요청형식 Request-Line = Method SP Request-URI SP HTTP-Version CRLF
        String requestLine = "Get /html/hi HTTP/1.1\r\n";
        // requestHeader
        // https://datatracker.ietf.org/doc/html/rfc2616#section-5.3
        String requestHeader = "Host:192.168.0.79\r\n\r\n";
        out.println(requestLine + requestHeader);

        System.out.println("작업완료");

    }
}
