package com.konai.hsyang.konatoybe.exceptions;

public class NoFileFoundException extends RuntimeException{

    public NoFileFoundException(){

        super("파일이 없습니다.");
    }

    public NoFileFoundException(String message){
        super(message);
    }
}
