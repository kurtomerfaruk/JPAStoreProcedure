/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.ofarukkurt.jpastoreprocedure.models;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk Kurt
 * @Created on date 28/08/2018 14:13:14 
 */
@Entity
@Table(name = "tblStok")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblStok.findAll", query = "SELECT t FROM TblStok t"),
    @NamedQuery(name = "TblStok.findById", query = "SELECT t FROM TblStok t WHERE t.id = :id"),
    @NamedQuery(name = "TblStok.findByStokKod", query = "SELECT t FROM TblStok t WHERE t.stokKod = :stokKod"),
    @NamedQuery(name = "TblStok.findByStokAd", query = "SELECT t FROM TblStok t WHERE t.stokAd = :stokAd"),
    @NamedQuery(name = "TblStok.findByBirim", query = "SELECT t FROM TblStok t WHERE t.birim = :birim"),
    @NamedQuery(name = "TblStok.findByBarkod", query = "SELECT t FROM TblStok t WHERE t.barkod = :barkod"),
    @NamedQuery(name = "TblStok.findByKdv", query = "SELECT t FROM TblStok t WHERE t.kdv = :kdv"),
    @NamedQuery(name = "TblStok.findByEkleyen", query = "SELECT t FROM TblStok t WHERE t.ekleyen = :ekleyen"),
    @NamedQuery(name = "TblStok.findByEklemeTarihi", query = "SELECT t FROM TblStok t WHERE t.eklemeTarihi = :eklemeTarihi"),
    @NamedQuery(name = "TblStok.findByGuncelleyen", query = "SELECT t FROM TblStok t WHERE t.guncelleyen = :guncelleyen"),
    @NamedQuery(name = "TblStok.findByGuncellemeTarihi", query = "SELECT t FROM TblStok t WHERE t.guncellemeTarihi = :guncellemeTarihi"),
    @NamedQuery(name = "TblStok.findBySilindiMi", query = "SELECT t FROM TblStok t WHERE t.silindiMi = :silindiMi"),
    @NamedQuery(name = "TblStok.findByStokSeviyesiUyar", query = "SELECT t FROM TblStok t WHERE t.stokSeviyesiUyar = :stokSeviyesiUyar"),
    @NamedQuery(name = "TblStok.findByAsgariStokSeviyesi", query = "SELECT t FROM TblStok t WHERE t.asgariStokSeviyesi = :asgariStokSeviyesi"),
    @NamedQuery(name = "TblStok.findBySeriNoZorunlu", query = "SELECT t FROM TblStok t WHERE t.seriNoZorunlu = :seriNoZorunlu")})
public class TblStok implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "stokKod")
    private String stokKod;
    @Column(name = "stokAd")
    private String stokAd;
    @Basic(optional = false)
    @Column(name = "birim")
    private String birim;
    @Column(name = "barkod")
    private String barkod;
    @Basic(optional = false)
    @Column(name = "kdv")
    private int kdv;
    @Column(name = "ekleyen")
    private BigInteger ekleyen;
    @Column(name = "eklemeTarihi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eklemeTarihi;
    @Column(name = "guncelleyen")
    private BigInteger guncelleyen;
    @Column(name = "guncellemeTarihi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date guncellemeTarihi;
    @Column(name = "silindiMi")
    private Boolean silindiMi;
    @Column(name = "stokSeviyesiUyar")
    private Boolean stokSeviyesiUyar;
    @Column(name = "asgariStokSeviyesi")
    private Integer asgariStokSeviyesi;
    @Basic(optional = false)
    @Column(name = "seriNoZorunlu")
    private boolean seriNoZorunlu;

    public TblStok() {
    }

    public TblStok(Long id) {
        this.id = id;
    }

    public TblStok(Long id, String stokKod, String birim, int kdv, boolean seriNoZorunlu) {
        this.id = id;
        this.stokKod = stokKod;
        this.birim = birim;
        this.kdv = kdv;
        this.seriNoZorunlu = seriNoZorunlu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStokKod() {
        return stokKod;
    }

    public void setStokKod(String stokKod) {
        this.stokKod = stokKod;
    }

    public String getStokAd() {
        return stokAd;
    }

    public void setStokAd(String stokAd) {
        this.stokAd = stokAd;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public int getKdv() {
        return kdv;
    }

    public void setKdv(int kdv) {
        this.kdv = kdv;
    }

    public BigInteger getEkleyen() {
        return ekleyen;
    }

    public void setEkleyen(BigInteger ekleyen) {
        this.ekleyen = ekleyen;
    }

    public Date getEklemeTarihi() {
        return eklemeTarihi;
    }

    public void setEklemeTarihi(Date eklemeTarihi) {
        this.eklemeTarihi = eklemeTarihi;
    }

    public BigInteger getGuncelleyen() {
        return guncelleyen;
    }

    public void setGuncelleyen(BigInteger guncelleyen) {
        this.guncelleyen = guncelleyen;
    }

    public Date getGuncellemeTarihi() {
        return guncellemeTarihi;
    }

    public void setGuncellemeTarihi(Date guncellemeTarihi) {
        this.guncellemeTarihi = guncellemeTarihi;
    }

    public Boolean getSilindiMi() {
        return silindiMi;
    }

    public void setSilindiMi(Boolean silindiMi) {
        this.silindiMi = silindiMi;
    }

    public Boolean getStokSeviyesiUyar() {
        return stokSeviyesiUyar;
    }

    public void setStokSeviyesiUyar(Boolean stokSeviyesiUyar) {
        this.stokSeviyesiUyar = stokSeviyesiUyar;
    }

    public Integer getAsgariStokSeviyesi() {
        return asgariStokSeviyesi;
    }

    public void setAsgariStokSeviyesi(Integer asgariStokSeviyesi) {
        this.asgariStokSeviyesi = asgariStokSeviyesi;
    }

    public boolean getSeriNoZorunlu() {
        return seriNoZorunlu;
    }

    public void setSeriNoZorunlu(boolean seriNoZorunlu) {
        this.seriNoZorunlu = seriNoZorunlu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblStok)) {
            return false;
        }
        TblStok other = (TblStok) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blogspot.ofarukkurt.jpastoreprocedure.models.TblStok[ id=" + id + " ]";
    }

}
