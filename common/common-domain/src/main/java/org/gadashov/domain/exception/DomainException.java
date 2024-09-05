package org.gadashov.domain.exception;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 9/4/2024
 * Time: 11:11 PM
 */

public class DomainException extends RuntimeException{

    public DomainException(String message){
        super(message);
    }

    public DomainException(String message, Throwable casue){
        super(message,casue);
    }

}
