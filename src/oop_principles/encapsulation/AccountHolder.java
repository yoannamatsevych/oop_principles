package oop_principles.encapsulation;

public class AccountHolder {

   private String firstName;
    public String getFirstName(String passcode){
        if(passcode.equals("1234")) return firstName;
        else {
            System.out.println("The passcode you provided is wrong");
            return "";
        }
    }

    public void setFirstName(String firstName, String passcode){
        if(passcode.equals("1234")) this.firstName = firstName;
        else this.firstName = null;
    }
    String lastName;
    String address;
    String phoneNumber;
    private String SSN;

    //Create a double balance instance variable and encapsulate it

    private double balance;

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getSSN(){
        return this.SSN;
    }

    public void setSSN(String SSN){
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return "AccountHolder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
