package main.java.algorithms.croppingmessage;

public class Algorithm {

    public String croppingMsg(String message, int k) {
        String croppedMessage = null;
        if(k > message.length()){
            return message;
        }
        String subMessage = message.substring(0, k);
        if(!message.contains(" "))
        {
            return message;
        }
		if(subMessage.substring(k-1, k).equals(" ") || message.substring(k, k+1).equals(" ")){
		    return subMessage;
        }
        else{
             croppedMessage=subMessage.substring(0, subMessage.lastIndexOf(" "));
        }

        return croppedMessage;
    }


}
