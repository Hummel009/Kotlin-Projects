package messages;






public class Message implements java.io.Serializable {

    public static enum MessageTypes {
        MATCHED, START, MOVE, END, PAIRING, CHECK, LEAVE
    };

    public MessageTypes type;
    public Object content;

    public Message(MessageTypes type) {
        this.type = type;
    }
}
