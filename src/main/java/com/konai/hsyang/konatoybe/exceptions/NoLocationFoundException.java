package com.konai.hsyang.konatoybe.exceptions;

public class NoLocationFoundException extends RuntimeException{

    public NoLocationFoundException(){

        super("위치정보를 찾을 수 없습니다.");
    }

    public NoLocationFoundException(String message){

        super(message);
    }
}
