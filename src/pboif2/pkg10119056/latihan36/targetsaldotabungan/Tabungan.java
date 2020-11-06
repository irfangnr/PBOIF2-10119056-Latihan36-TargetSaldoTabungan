/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan36.targetsaldotabungan;

/**
 *
 * @author ACER
 */
public class Tabungan {
        private int saldo;
        private int saldoAwal = 3500000;
        private int bunga=8;
        private int saldoTarget=6000000;
        private int saldoAkhir=0;
    
    public int saldo(){
        for (int i=1; saldoAkhir <= saldoTarget; i++){
        saldo=(saldoAwal * bunga/100) ;
        saldoAkhir=saldo+saldoAwal;
        System.out.println("saldo di bulan ke-"+ i + " Rp."+ saldoAkhir);
        saldoAwal+=saldo;
        }
        return saldoAwal;
    }
}

