package com.konai.hsyang.konatoybe.exceptions;

public class NoClubFoundException extends RuntimeException{

    public NoClubFoundException(){

        super("해당 동아리가 없습니다.");
    }

    public NoClubFoundException(String message){

        super(message);
    }
}
