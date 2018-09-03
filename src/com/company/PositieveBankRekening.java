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


    @Override
    public void storten(int bedrag) throws BankRekeningException {

        if (getSaldo() + bedrag < 0) throw new BankRekeningException("Saldo mag niet negatief worden.");

        super.storten(bedrag);
    }

}

