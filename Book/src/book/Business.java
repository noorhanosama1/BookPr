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
public class Business {
     private String title;
    private String gener;
    private String Website;
    private Person ContactPerson;

    public Business(String title, String gener, String Website, Person ContactPerson) {
        this.title = title;
        this.gener = gener;
        this.Website = Website;
        this.ContactPerson = ContactPerson;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public Person getContactPerson() {
        return ContactPerson;
    }

    public void setContactPerson(Person ContactPerson) {
        this.ContactPerson = ContactPerson;
    }

    
    public String getInfo() {
        return "title=" + title + ", gener=" + gener + ", Website=" + Website + ", ContactPerson=" + ContactPerson ;
    }


  
    
    
    
    
   

    
    

   
}
