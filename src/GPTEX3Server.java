import java.io.*;
import java.net.*;

public class GPTEX3Server {
    public static void main(String[] args) {
        int port = 12345; // 伺服器監聽的埠號
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("伺服器啟動，等待客戶端連接...");

            // 等待客戶端連接
            Socket clientSocket = serverSocket.accept();
            System.out.println("客戶端已連接：" + clientSocket.getInetAddress());

            // 建立輸入與輸出流
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // 接收並回應訊息
            String clientMessage;
            while ((clientMessage = in.readLine()) != null) {
                System.out.println("收到客戶端訊息：" + clientMessage);
                if ("bye".equalsIgnoreCase(clientMessage)) {
                    out.println("伺服器斷開連接");
                    break;
                }
                out.println("伺服器回應：" + clientMessage.toUpperCase());
            }

            // 關閉連接
            clientSocket.close();
            System.out.println("客戶端已斷開連接");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
