package edu.kau.fcit.cpit252.observers;



public class EmailObserver extends Observer{

        public EmailObserver(String recipient){
            super.setRecipient(recipient);
        }
        @Override
        public void update(String message){
            System.out.println("Email Observer :: @" + getRecipient() + " " + message);
        }
    
}
