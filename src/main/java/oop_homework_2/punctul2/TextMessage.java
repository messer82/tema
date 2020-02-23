package oop_homework_2.punctul2;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextMessage that = (TextMessage) o;
        return Objects.equals(senderPhoneNumber, that.senderPhoneNumber) &&
                Objects.equals(textMessage, that.textMessage) &&
                Objects.equals(receiverPhoneNumber, that.receiverPhoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(senderPhoneNumber, textMessage, receiverPhoneNumber);
    }

    @Override
    public String toString() {
        return "TextMessage{" +
                "senderPhoneNumber='" + senderPhoneNumber + '\'' +
                ", textMessage='" + textMessage + '\'' +
                ", receiverPhoneNumber='" + receiverPhoneNumber + '\'' +
                '}';
    }

    public TextMessage(String senderPhoneNumber, String textMessage, String receiverPhoneNumber) {
        this.senderPhoneNumber = senderPhoneNumber;
        this.textMessage = textMessage;
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

}
