package MediatorPatteren;

import java.util.Date;

/**
 * Mediator pattern is used to reduce communication complexity betweeen multiple objects or classes.
 * This pattern provies a mediator class which normally handles all the communications betwen different
 * classes and supports easy maintainability of the code by loose coupling.
 * Created by Xiaojun YU on 2017-03-01.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [ " + user.getName() + "] : " + message);
    }
}
