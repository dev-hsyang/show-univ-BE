package com.konai.hsyang.konatoybe.exceptions;

public class NoCommentFoundException extends RuntimeException{

    public NoCommentFoundException(){

        super("댓글이 없습니다.");
    }

    public NoCommentFoundException(String message){

        super(message);
    }
}
