/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financial_sys;

import java.math.BigInteger;

/**
 *
 * @author kenyin
 */
public class Consts {
    //账户密码
    public static String password="12345";
    //账户文件路径，可在keystore文件夹中找到
    public static String path="/Users/kenyin/Desktop/privatechain/data0/keystore/UTC--2018-06-22T00-35-20.884848735Z--ded0ca9d7cea876ee4e0f70becfe2e3c328db334";
    //钱包账户地址
    public static String walletAddress="0xded0ca9d7cea876ee4e0f70becfe2e3c328db334";
    //第一次部署合约后的地址
    public static String contractAddress="0x5cc816d4745bb814da68ef8ee32df33dfeb0fc76";
    //GAS价格
    public static BigInteger GAS_PRICE = BigInteger.valueOf(20000);
    //GAS上限
    public static BigInteger GAS_LIMIT = BigInteger.valueOf(2000000);
    //chain id, 创世区块中定义的
    public static byte CHAINID = (byte) 10;
}
