import java.io.*;
import java.net.*;

public class GPTEX3Client {
    public static void main(String[] args) {
        String host = "localhost"; // 伺服器位址
        int port = 12345; // 伺服器埠號

        try (Socket socket = new Socket(host, port)) {
            System.out.println("已連接到伺服器：" + host);

            // 建立輸入與輸出流
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            // 與伺服器進行通訊
            String userInput;
            System.out.println("輸入訊息，輸入 'bye' 斷開連接：");
            while ((userInput = consoleInput.readLine()) != null) {
                out.println(userInput); // 傳送訊息到伺服器
                System.out.println("伺服器回應：" + in.readLine()); // 顯示伺服器回應

                if ("bye".equalsIgnoreCase(userInput)) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
