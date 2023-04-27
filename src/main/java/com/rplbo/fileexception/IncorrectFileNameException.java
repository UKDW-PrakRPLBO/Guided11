package com.rplbo.fileexception;

public class IncorrectFileNameException extends Exception {
    private int errCode;
    private String errMessage;
    public IncorrectFileNameException(int errCode) {
        super();
        //tulis disini
        
    }

    public IncorrectFileNameException(String errorMessage){
        super(errorMessage);
    }

    //getter 
}
