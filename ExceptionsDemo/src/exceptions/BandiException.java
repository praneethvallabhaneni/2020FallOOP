/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.IOException;

/**
 *
 * @author ajay
 */
public class BandiException extends IOException{

    public BandiException() {
    }

    public BandiException(String message) {
        super(message);
    }
    
}
