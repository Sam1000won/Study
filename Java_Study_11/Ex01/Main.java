package Java_Study_11.Ex01; // 패키지 선언

import java.net.InetAddress; // InetAddress 클래스를 가져옵니다. 네트워크 주소를 다루기 위해 사용됩니다.
import java.net.UnknownHostException; // UnknownHostException 클래스를 가져옵니다. 호스트를 찾을 수 없을 때 발생하는 예외입니다.

public class Main { // Main 클래스를 정의합니다.
    public static void main(String[] args) throws UnknownHostException { // 프로그램의 시작점인 main 메서드입니다.
        // 로컬 호스트의 IP 주소를 가져옵니다.
        InetAddress addr = InetAddress.getLocalHost(); // 현재 컴퓨터의 로컬 호스트 주소를 가져옵니다.
        System.out.println(addr.getHostAddress()); // 로컬 호스트의 IP 주소를 출력합니다.
        System.out.println(); // 빈 줄을 출력합니다.

        // 특정 도메인 이름을 사용하여 IP 주소를 가져옵니다.
        String domin = "www.gdu.co.kr"; // 도메인 이름을 정의합니다.
        addr = InetAddress.getByName(domin); // 도메인 이름에 대한 InetAddress 객체를 가져옵니다.
        System.out.println(domin + ": " + addr.getHostAddress()); // 도메인 이름과 해당 IP 주소를 출력합니다.

        // 또 다른 도메인 이름에 대한 여러 IP 주소를 가져옵니다.
        domin = "www.youtube.com"; // 다른 도메인 이름을 정의합니다.
        InetAddress[] addrs = InetAddress.getAllByName(domin); // 도메인 이름에 대한 모든 IP 주소를 가져옵니다.
        System.out.println(domin); // 도메인 이름을 출력합니다.

        // 가져온 모든 IP 주소를 출력합니다.
        for (InetAddress ip : addrs) { // 각 InetAddress 객체에 대해 반복합니다.
            System.out.println(ip.getHostAddress()); // 각 IP 주소를 출력합니다.
        }
    }
}
