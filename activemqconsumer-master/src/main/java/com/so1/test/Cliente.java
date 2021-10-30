/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so1.test;

public class Cliente {

    private int idPlatformOrigin;
    private int idCoin;
    private int idPlatformDestiny;
    private int idProduct;
    private int Mount;
    private int Quantity;


    public Cliente() {
    }

    public Cliente(int idPlatformOrigin, int idCoin, int idPlatformDestiny, int idProduct, int Mount, int Quantity) {
        this.idPlatformOrigin = idPlatformOrigin;
        this.idCoin = idCoin;
        this.idPlatformDestiny = idPlatformDestiny;
        this.idProduct = idProduct;
        this.Mount = Mount;
        this.Quantity = Quantity;
    }

    public int getIdPlatformOrigin() {
        return idPlatformOrigin;
    }

    public void setIdPlatformOrigin(int idPlatformOrigin) {
        this.idPlatformOrigin = idPlatformOrigin;
    }

    public int getIdPlatformDestiny() {
        return idPlatformDestiny;
    }

    public void setIdPlatformDestiny(int idPlatformDestiny) {
        this.idPlatformOrigin = idPlatformDestiny;
    }

    public int getIdCoin() {
        return idCoin;
    }

    public void setIdCoin(int idCoin) {
        this.idCoin = idCoin;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getMount() {
        return Mount;
    }

    public void setMount(int Mount) {
        this.Mount = Mount;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    }


