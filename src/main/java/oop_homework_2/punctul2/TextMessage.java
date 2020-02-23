package oop_homework_2.punctul2;

public class TextMessage {
    private String senderPhoneNumber, textMessage, receiverPhoneNumber;

    public TextMessage() {

    }

    public String getSenderPhoneNumber() {
        return senderPhoneNumber;
    }

    public void setSenderPhoneNumber(String senderPhoneNumber) {
        this.senderPhoneNumber = senderPhoneNumber;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public TextMessage(String senderPhoneNumber, String textMessage, String receiverPhoneNumber) {
        this.senderPhoneNumber = senderPhoneNumber;
        this.textMessage = textMessage;
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

}
