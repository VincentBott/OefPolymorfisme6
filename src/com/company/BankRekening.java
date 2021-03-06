package com.company;

public class BankRekening  {

    private String rekeningnummer;
    private int saldo;


    public BankRekening(String rekeningnummer) {
        this.rekeningnummer = rekeningnummer;
    }


    public String getRekeningnummer() {
        return this.rekeningnummer;
    }


    public int getSaldo() {
        return this.saldo;
    }

    public void storten(int bedrag) throws BankRekeningException {
        saldo = saldo + bedrag;
    }

    public void afhalen(int bedrag) throws BankRekeningException  {
        saldo = saldo - bedrag;
    }
}
