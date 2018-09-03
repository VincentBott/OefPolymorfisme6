package com.company;

public class PositieveBankRekening extends BankRekening {


    public PositieveBankRekening(String rekeningnummer) {

        super(rekeningnummer);
    }


    @Override
    public void afhalen(int bedrag) throws BankRekeningException {

        if (bedrag > saldo)
            throw new BankRekeningException("Bankrekening kan niet negatief worden.");
        else
            saldo = saldo - bedrag;
    }
}
