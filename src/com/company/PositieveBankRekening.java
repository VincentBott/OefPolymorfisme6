package com.company;

public class PositieveBankRekening extends BankRekening {


    public PositieveBankRekening(String rekeningnummer) {

        super(rekeningnummer);
    }



    @Override
    public void afhalen(int bedrag) throws BankRekeningException {

        if (bedrag > getSaldo())
            throw new BankRekeningException("Bankrekening kan niet negatief worden.");
        else
            super.afhalen(bedrag);

    }

}

