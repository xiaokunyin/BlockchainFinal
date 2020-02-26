/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financial_sys;

import java.io.IOException;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.utils.Convert;

/**
 *
 * @author kenyin
 */
public class Deploy {
    public void firstDeploy()throws Exception,IOException,CipherException{
        Web3j web3j = Web3j.build(new HttpService("http://localhost:8545"));
        Web3ClientVersion web3ClientVersion;    
    	web3ClientVersion =web3j.web3ClientVersion().send();  
    	String clientVersion = web3ClientVersion.getWeb3ClientVersion();  
    	System.out.println(clientVersion);  
        Credentials credentials = WalletUtils.loadCredentials(Consts.password,Consts.path);
        EthGetBalance ethGetBalance =web3j.ethGetBalance(Consts.walletAddress, DefaultBlockParameterName.LATEST).send();
        if(ethGetBalance!=null){
            // 打印账户余额
            System.out.println(ethGetBalance.getBalance());
            // 将单位转为以太，方便查看
            System.out.println(Convert.fromWei(ethGetBalance.getBalance().toString(), Convert.Unit.ETHER));
        }
        Financial_Sys_sol_Financial_Sys company
        =Financial_Sys_sol_Financial_Sys.deploy(web3j, credentials, Consts.GAS_PRICE, Consts.GAS_LIMIT).send();
        //获得合约部署地址
        System.out.println(company.getContractAddress());
        System.out.println(company.isValid());
    }
}
