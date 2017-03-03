package MediatorPatteren;

/**
 * Created by Xiaojun YU on 2017-03-01.
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        setName(name);
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }
}
