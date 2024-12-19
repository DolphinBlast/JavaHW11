import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GPTEX2 {
    public static void main(String[] args) {
        // 建立 Frame
        Frame frame = new Frame("AWT 範例程式");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout()); // 設定版面配置

        // 建立 Label
        Label label = new Label("按下按鈕以顯示訊息");
        frame.add(label);

        // 建立按鈕
        Button button = new Button("點我!");
        frame.add(button);

        // 設定按鈕的事件處理
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("按鈕已被按下！");
            }
        });

        // 加入關閉視窗的事件處理
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // 顯示視窗
        frame.setVisible(true);
    }
}
