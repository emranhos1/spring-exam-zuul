package com.eh.webapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Md. Emran Hossain<emranhos1@gmail.com>
 * @version 1.0.00.EH
 * @since 1.0.00.EH
 */
@Entity
@Table(name = "marital_status")
public class T02007 {

    @Column(name = "update_date")
    private Date amendDate;
    @Column(name = "update_user")
    private String amendUser;
    @Column(name = "entry_date")
    private Date entryDate;
    @Column(name = "entry_user")
    private String entryUser;

    @Id
    @Column(name = "marital_status_code")
    private String maritalStatusCode;
    @Column(name = "lang1_name")
    private String nameNative;
    @Column(name = "lang2_name")
    private String nameGlobal;

    public Date getAmendDate() {
        return amendDate;
    }

    public void setAmendDate(Date amendDate) {
        this.amendDate = amendDate;
    }

    public String getAmendUser() {
        return amendUser;
    }

    public void setAmendUser(String amendUser) {
        this.amendUser = amendUser;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryUser() {
        return entryUser;
    }

    public void setEntryUser(String entryUser) {
        this.entryUser = entryUser;
    }

    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }

    public String getNameNative() {
        return nameNative;
    }

    public void setNameNative(String nameNative) {
        this.nameNative = nameNative;
    }

    public String getNameGlobal() {
        return nameGlobal;
    }

    public void setNameGlobal(String nameGlobal) {
        this.nameGlobal = nameGlobal;
    }
}