package com.example.lgspuanhesaplama;

public class Lesson {
    int turkced;
    int turkcey;
    int matd;
    int maty;
    int fend;
    int feny;
    int inkd;
    int inky;
    int ingd;
    int ingy;
    int dind;
    int diny;
    double turnet;
    double matnet;
    double fennet;
    double inknet;
    double ingnet;
    double dinnet;
    double puan;

    public  boolean control(){
        if(turkced+turkcey>20 || turkced<0 || turkcey<0) {
            sifirla();
            return false;
        }
        else if(matd+maty>20 || matd<0 || maty<0){
            sifirla();
            return false;
        }
        else if(fend+feny>20 || fend<0 || feny<0){
            sifirla();
            return false;
        }
        else if(inkd+inky>10 || inkd<0 || inky<0){
            sifirla();
            return false;
        }
        else if(ingd+ingy>10 || ingd<0 || ingy<0){
            sifirla();
            return false;
        }
        else if(dind+diny>10 || dind<0 || diny<0){
            sifirla();
            return false;
        }
        else
            return true;
    }
    public void hesapla(){

        turnet = (double)turkced - (double)turkcey/3;
        matnet = (double)matd - (double)maty/3;
        fennet = (double)fend - (double)feny/3;
        inknet = (double)inkd - (double)inky/3;
        ingnet = (double)ingd - (double)ingy/3;
        dinnet = (double)dind - (double)diny/3;

        double turkce_asp = standart_puan(turnet,11.75,5.15) * 4 ;
        double mat_asp = standart_puan(matnet,5.09,4.24) * 4;
        double fen_asp = standart_puan(fennet,9.97,4.72) * 4;
        double ink_asp = standart_puan(inknet,6.88,2.82);
        double ing_asp = standart_puan(ingnet,4.65, 3.21);
        double din_asp = standart_puan(dinnet,6.83,2.41);

        double tasp = turkce_asp+mat_asp+fen_asp+ink_asp+ing_asp+din_asp;

        double enb_tur = standart_puan(20,11.75,5.15) * 4;
        double enb_mat = standart_puan(20,5.09,4.24) * 4;
        double enb_fen = standart_puan(20,9.97,4.72) * 4;
        double enb_ink = standart_puan(10,6.88,2.82);
        double enb_ing = standart_puan(10,4.65, 3.21);
        double enb_din = standart_puan(10,6.83,2.41);

        double enbuyuk_tasp = enb_din + enb_fen + enb_ing + enb_ink + enb_mat + enb_tur;

        double enk_tur = standart_puan(0.0,11.75,5.15) * 4;
        double enk_mat = standart_puan(0.0,5.09,4.24) * 4;
        double enk_fen = standart_puan(0.0,9.97,4.72) * 4;
        double enk_ink = standart_puan(0.0,6.88,2.82);
        double enk_ing = standart_puan(0.0,4.65, 3.21);
        double enk_din = standart_puan(0.0,6.83,2.41);

        double enkucuk_tasp = enk_din + enk_fen + enk_ing + enk_ink + enk_mat + enk_tur;

        puan = 100 + (400*(tasp-enkucuk_tasp)/(enbuyuk_tasp-enkucuk_tasp));




    }
    public double standart_puan(double net,double ortalama, double stardant_sapma){
        double sp = 50 + 10 * ((net - ortalama)/ stardant_sapma);
        return sp;
    }
    public void sifirla(){
        turkced =0;
        turkcey =0;
        turnet =0;
        matd =0;
        maty =0;
        matnet =0;
        fennet =0;
        fend =0;
        feny =0;
        inknet =0;
        inkd =0;
        inky =0;
        dinnet =0;
        dind =0;
        diny =0;
        ingd=0;
        ingy=0;
        ingnet=0;
    }
}