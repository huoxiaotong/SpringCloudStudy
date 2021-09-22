package com.mumu.bootdemo;

import java.util.ArrayList;
import java.util.HashMap;

public class Enti {
        String aa;
        String bb;
        ArrayList<HashMap<String,String>> cc;
        String dd;

        public String getAa() {
            return aa;
        }

        public void setAa(String aa) {
            this.aa = aa;
        }

        public String getBb() {
            return bb;
        }

        public void setBb(String bb) {
            this.bb = bb;
        }

        public ArrayList<HashMap<String, String>> getCc() {
            return cc;
        }

        public void setCc(ArrayList<HashMap<String, String>> cc) {
            this.cc = cc;
        }

        public String getDd() {
            return dd;
        }

        public void setDd(String dd) {
            this.dd = dd;
        }

    @Override
    public String toString() {
        return "Enti{" +
                "aa='" + aa + '\'' +
                ", bb='" + bb + '\'' +
                ", cc=" + cc +
                ", dd='" + dd + '\'' +
                '}';
    }
}
