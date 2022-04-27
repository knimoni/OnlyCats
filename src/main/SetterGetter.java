/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author naura
 */
public class SetterGetter {
    //atribut
    private String Username, Tanggal1, Tanggal2, Password, Nama, LamaPenitipan, 
            Berat, Jam, Jenis, Status, Target;
    //setter
        protected void setUsername (String Username) {
        this.Username = Username;
    }
    protected void setPassword (String Password) {
        this.Password = Password;
    }
    public void setNama (String Nama) {
        this.Nama = Nama;
    }
    public void setTanggal1 (String Tanggal1) {
        this.Tanggal1 = Tanggal1;
    }
        public void setTanggal2 (String Tanggal2) {
        this.Tanggal2 = Tanggal2;
    }
    public void setLamaPenitipan (String LamaPenitipan){
        this.LamaPenitipan = LamaPenitipan;
    }
    public void setBerat (String Berat){
        this.Berat = Berat;
    }
    public void setJenis (String Jenis){
        this.Jenis = Jenis;
    }
        public void setJam (String Jam){
        this.Jam = Jam;
    }
    public void setStatus (String Status){
        this.Status = Status;
    }

    public void setTarget(String Target) {
        this.Target = Target;
    }
    
    //getter
    protected String getUsername(){
        return Username;
    }
    protected String getPassword() {
        return Password;
    }

    public String getTanggal1() {
        return Tanggal1;
    }

    public String getTanggal2() {
        return Tanggal2;
    }

    public String getNama() {
        return Nama;
    }

    public String getLamaPenitipan() {
        return LamaPenitipan;
    }

    public String getBerat() {
        return Berat;
    }

    public String getJam() {
        return Jam;
    }

    public String getJenis() {
        return Jenis;
    }

    public String getStatus() {
        return Status;
    }

    public String getTarget() {
        return Target;
    }
    
}