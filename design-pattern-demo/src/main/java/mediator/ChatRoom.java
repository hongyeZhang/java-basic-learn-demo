package mediator;

import java.util.Date;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 17:03
 **/
public class ChatRoom {
    public static void sendMessage(User user, String message) {
        System.out.println(new Date().toString() + ": name : " + user.getName() + " message : " + message);
    }
}
