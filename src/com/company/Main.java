package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws BankRekeningException {

        Scanner scanner = new Scanner(System.in);

        Map<String, BankRekening> rekeningen = new HashMap<>();

        rekeningen.put("000-0000011-11", new BankRekening("000-0000011-11"));
        rekeningen.put("000-0000022-22", new PositieveBankRekening("000-0000022-22"));

        System.out.println("De rekeningen:");

        for(String rek:rekeningen.keySet()){
            System.out.println( rek);
        }

        System.out.print("Welke rekening: ");
        String r = scanner.nextLine();

        BankRekening rekening = rekeningen.get(r);
        System.out.print("Wilt u 1) storten 2)afhalen? ");
        String antwoord = scanner.nextLine();
        System.out.print("Welk bedrag? ");
        int bedrag = Integer.parseInt(scanner.nextLine());

        if (antwoord.equals("1")){
            rekening.storten(bedrag);
        } else if (antwoord.equals("2")){
            rekening.afhalen(bedrag);
        }

        for(BankRekening rek: rekeningen.values()){
            System.out.printf("%s: %d EURO%n", rek.getRekeningnummer(), rek.getSaldo());
        }

    }
}
