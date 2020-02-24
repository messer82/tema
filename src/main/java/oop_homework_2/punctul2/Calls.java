package oop_homework_2.punctul2;

public class Calls {
    private String callerPhoneNumber, contactCalledPhoneNumber, phoneCallDuration;

    public String getCallerPhoneNumber() {
        return callerPhoneNumber;
    }

    public void setCallerPhoneNumber(String callerPhoneNumber) {
        this.callerPhoneNumber = callerPhoneNumber;
    }

    public String getContactCalledPhoneNumber() {
        return contactCalledPhoneNumber;
    }

    public void setContactCalledPhoneNumber(String contactCalledPhoneNumber) {
        this.contactCalledPhoneNumber = contactCalledPhoneNumber;
    }

    public String getPhoneCallDuration() {
        return phoneCallDuration;
    }

    public void setPhoneCallDuration(String phoneCallDuration) {
        this.phoneCallDuration = phoneCallDuration;
    }

    @Override
    public String toString() {
        return "Calls{" +
                "callerPhoneNumber='" + callerPhoneNumber + '\'' +
                ", contactCalledPhoneNumber='" + contactCalledPhoneNumber + '\'' +
                ", phoneCallDuration='" + phoneCallDuration + '\'' +
                '}';
    }

    public Calls(String callerPhoneNumber, String contactCalledPhoneNumber, String phoneCallDuration) {
        this.callerPhoneNumber = callerPhoneNumber;
        this.contactCalledPhoneNumber = contactCalledPhoneNumber;
        this.phoneCallDuration = phoneCallDuration;
    }
}
