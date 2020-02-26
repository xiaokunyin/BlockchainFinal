/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financial_sys;

import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;

/**
 *
 * @author kenyin
 */
public class dataOperator {
     private Web3j web3j;
    private String searchResult;
    
    public dataOperator(Web3j web3j){
        this.web3j=web3j;
    }
    //开始录入发票信息
    private Boolean setCom(Utf8String set_code,companyInstance companyInstance)throws Exception{
        Credentials credentials = WalletUtils.loadCredentials(Consts.password, Consts.path);  
        String address = Consts.contractAddress;  
        Financial_Sys_sol_Financial_Sys company = Financial_Sys_sol_Financial_Sys.load(address, this.web3j, credentials, Consts.GAS_PRICE,  
                Consts.GAS_LIMIT);  //部署智能合约
        company.SetCode(set_code).send();
        company.uploadInfo(companyInstance.getCom_Id(), companyInstance.getCom_Name(), companyInstance.getCom_Legal_Per(), companyInstance.getEmail(), companyInstance.getProject_Title(), companyInstance.getProject_Detail(), companyInstance.getFundraising_Target()).send();
        
        return true;
    }
    //根据FPH号码查询发票信息
    private Boolean getCom(Utf8String search_code)throws Exception{
        Credentials credentials = WalletUtils.loadCredentials(Consts.password, Consts.path);  
        String address = Consts.contractAddress;  
        Financial_Sys_sol_Financial_Sys company = Financial_Sys_sol_Financial_Sys.load(address, this.web3j, credentials, Consts.GAS_PRICE,  
                Consts.GAS_LIMIT);
        company.SearchCode(search_code).send();
        Utf8String Com_Id=company.getInfo().send().getValue1();
        Utf8String Com_Name=company.getInfo().send().getValue2();
        Utf8String Com_Legal_Per=company.getInfo().send().getValue3();
        Utf8String Email=company.getInfo().send().getValue4();
        Utf8String Project_Title=company.getInfo().send().getValue5();
        Utf8String Project_Detail=company.getInfo().send().getValue6();
        Utf8String Fundraising_Target=company.getInfo().send().getValue7();
        
        String companyInfo=("Company ID: "+Com_Id+"\n"
                +"Company Name: "+Com_Name+"\n"
                +"Company Legal Person: "+Com_Legal_Per+"\n"
                +"Email: "+Email+"\n"
                +"Project Title: "+Project_Title+"\n"
                +"Project Detail: "+Project_Detail+"\n"
                +"Fundraising Target: "+Fundraising_Target+"\n"
                );
        this.searchResult = companyInfo;
        return true;
    }
    
    public Boolean setComInfo(Utf8String setFPH,companyInstance companyInstance)throws Exception{
       setCom(setFPH,companyInstance);
       return true;
    }
    
    public String getComInfo(Utf8String search_code) throws Exception{
        if(getCom(search_code)){
            return this.searchResult;
        }
        else{
            System.out.println("not find!");
            return "Fail!";
        }
    }
}
