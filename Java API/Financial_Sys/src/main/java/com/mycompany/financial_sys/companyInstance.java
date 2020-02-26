/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financial_sys;

import org.web3j.abi.datatypes.Utf8String;

/**
 *
 * @author kenyin
 */
public class companyInstance {
        private Utf8String Com_Id=new Utf8String("c1");
        private Utf8String Com_Name=new Utf8String("company1");
        private Utf8String Com_Legal_Per=new Utf8String("Bob");
        private Utf8String Email=new Utf8String("company1@mail.com");
        private Utf8String Project_Title=new Utf8String("blockchain");
        private Utf8String Project_Detail=new Utf8String("www.company1.com");
        private Utf8String Fundraising_Target=new Utf8String("10000000000");

        
        public companyInstance(String Com_Id, String Com_Name, 
                String Com_Legal_Per, String Email, String Project_Title, 
                String Project_Detail, String Fundraising_Target){
            
            
            if(Com_Id != null&& Com_Name != null&& 
                Com_Legal_Per != null&& Email != null&& Project_Title != null&& 
                Project_Detail != null&& Fundraising_Target != null){
            this.Com_Id =new Utf8String(Com_Id);
            this.Com_Name = new Utf8String(Com_Name);
            this.Com_Legal_Per = new Utf8String(Com_Legal_Per);
            this.Email = new Utf8String(Email);
            this.Project_Title = new Utf8String(Project_Title);
            this.Project_Detail = new Utf8String(Project_Detail);
            this.Fundraising_Target = new Utf8String(Fundraising_Target);
           
                }
        }

    /**
     * @return the Com_Id
     */
    public Utf8String getCom_Id() {
        return Com_Id;
    }

    /**
     * @return the Com_Name
     */
    public Utf8String getCom_Name() {
        return Com_Name;
    }

    /**
     * @return the Com_Legal_Per
     */
    public Utf8String getCom_Legal_Per() {
        return Com_Legal_Per;
    }

    /**
     * @return the Email
     */
    public Utf8String getEmail() {
        return Email;
    }

    /**
     * @return the Project_Title
     */
    public Utf8String getProject_Title() {
        return Project_Title;
    }

    /**
     * @return the Project_Detail
     */
    public Utf8String getProject_Detail() {
        return Project_Detail;
    }

    /**
     * @return the Fundraising_Target
     */
    public Utf8String getFundraising_Target() {
        return Fundraising_Target;
    }

}
