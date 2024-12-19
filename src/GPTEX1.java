import java.io.*;

public class GPTEX1 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String contentToWrite = "這是一個與 java.io 有關的範例程式。";

        // 寫入檔案
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(contentToWrite);
            System.out.println("已成功寫入檔案: " + fileName);
        } catch (IOException e) {
            System.err.println("寫入檔案時發生錯誤: " + e.getMessage());
        }

        // 讀取檔案
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("讀取檔案內容: ");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("讀取檔案時發生錯誤: " + e.getMessage());
        }
    }
}
