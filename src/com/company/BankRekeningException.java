package com.company;

public class BankRekeningException extends Exception {


    public BankRekeningException(String melding)
    {
        super(melding);
    }


    // Hieronder is van de Jef.

    public BankRekeningException(String melding, Throwable cause) {
        super(melding, cause);
    }
}


