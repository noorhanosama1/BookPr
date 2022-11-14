/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author jawwal
 */
public class Person {
     private String FirstName;
   private String LastName;
    private String Country ;
   private String City;
   private int PostalCode;
   private int T_Num;
   private String E_mail ;
   private BirthDate BD;

    public Person(String FirstName, String LastName, String Country, String City, int PostalCode, int T_Num, String E_mail, BirthDate BD) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Country = Country;
        this.City = City;
        this.PostalCode = PostalCode;
        this.T_Num = T_Num;
        this.E_mail = E_mail;
        this.BD = BD;
    }

    public String getFirstName() {
        return FirstName;
    }
//
  
    
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(int PostalCode) {
        this.PostalCode = PostalCode;
    }

    public int getT_Num() {
        return T_Num;
    }

    public void setT_Num(int T_Num) {
        this.T_Num = T_Num;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public BirthDate getBD() {
        return BD;
    }

    public void setBD(BirthDate BD) {
        this.BD = BD;
    }

    public String getPresonInfo() {
        return  "FirstName=" + FirstName + ", LastName=" + LastName + ", Country=" + Country + ", City=" + City + ", PostalCode=" + PostalCode + ", T_Num=" + T_Num + ", E_mail=" + E_mail + ", BD=" + BD ;
    }

}
