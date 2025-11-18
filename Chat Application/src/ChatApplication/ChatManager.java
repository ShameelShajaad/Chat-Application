package ChatApplication;

import java.util.ArrayList;

/**
 *
 * @author Shameel Shajaad
 */
public class ChatManager {

    private static ArrayList<SenderWindow> senderWindows = new ArrayList<>();

    public static void addWindow(SenderWindow window) {
        senderWindows.add(window);
    }

    public static void setMessage(String msg) {
        for (SenderWindow window : senderWindows) {
            window.receiveMessage(msg);
        }
    }
}
