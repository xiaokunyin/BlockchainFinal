package com.mycompany.financial_sys;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple7;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.4.0.
 */
public class Financial_Sys_sol_Financial_Sys extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610cde806100206000396000f3006080604052600436106100615763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416633f2706118114610066578063453631361461023557806351c338241461028e5780635a9b0b89146102e7575b600080fd5b34801561007257600080fd5b506040805160206004803580820135601f810184900484028501840190955284845261023394369492936024939284019190819084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a9998810197919650918201945092508291508401838280828437509497506105db9650505050505050565b005b34801561024157600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526102339436949293602493928401919081908401838280828437509497506107489650505050505050565b34801561029a57600080fd5b506040805160206004803580820135601f810184900484028501840190955284845261023394369492936024939284019190819084018382808284375094975061075f9650505050505050565b3480156102f357600080fd5b506102fc610772565b604051808060200180602001806020018060200180602001806020018060200188810388528f818151815260200191508051906020019080838360005b83811015610351578181015183820152602001610339565b50505050905090810190601f16801561037e5780820380516001836020036101000a031916815260200191505b5088810387528e818151815260200191508051906020019080838360005b838110156103b457818101518382015260200161039c565b50505050905090810190601f1680156103e15780820380516001836020036101000a031916815260200191505b5088810386528d5181528d516020918201918f019080838360005b838110156104145781810151838201526020016103fc565b50505050905090810190601f1680156104415780820380516001836020036101000a031916815260200191505b5088810385528c5181528c516020918201918e019080838360005b8381101561047457818101518382015260200161045c565b50505050905090810190601f1680156104a15780820380516001836020036101000a031916815260200191505b5088810384528b5181528b516020918201918d019080838360005b838110156104d45781810151838201526020016104bc565b50505050905090810190601f1680156105015780820380516001836020036101000a031916815260200191505b5088810383528a5181528a516020918201918c019080838360005b8381101561053457818101518382015260200161051c565b50505050905090810190601f1680156105615780820380516001836020036101000a031916815260200191505b5088810382528951815289516020918201918b019080838360005b8381101561059457818101518382015260200161057c565b50505050905090810190601f1680156105c15780820380516001836020036101000a031916815260200191505b509e50505050505050505050505050505060405180910390f35b60e0604051908101604052808881526020018781526020018681526020018581526020018481526020018381526020018281525060026000604051808280546001816001161561010002031660029004801561066e5780601f1061064c57610100808354040283529182019161066e565b820191906000526020600020905b81548152906001019060200180831161065a575b505092835250506040516020918190038201902082518051919261069792849290910190610c17565b5060208281015180516106b09260018501920190610c17565b50604082015180516106cc916002840191602090910190610c17565b50606082015180516106e8916003840191602090910190610c17565b5060808201518051610704916004840191602090910190610c17565b5060a08201518051610720916005840191602090910190610c17565b5060c0820151805161073c916006840191602090910190610c17565b50505050505050505050565b805161075b906001906020840190610c17565b5050565b805161075b906000906020840190610c17565b606080606080606080606060006002600160405180828054600181600116156101000203166002900480156107de5780601f106107bc5761010080835404028352918201916107de565b820191906000526020600020905b8154815290600101906020018083116107ca575b50509150509081526020016040518091039020905080600001816001018260020183600301846004018560050186600601868054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156108a45780601f10610879576101008083540402835291602001916108a4565b820191906000526020600020905b81548152906001019060200180831161088757829003601f168201915b5050895460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152959c508b9450925084019050828280156109325780601f1061090757610100808354040283529160200191610932565b820191906000526020600020905b81548152906001019060200180831161091557829003601f168201915b5050885460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152959b508a9450925084019050828280156109c05780601f10610995576101008083540402835291602001916109c0565b820191906000526020600020905b8154815290600101906020018083116109a357829003601f168201915b5050875460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152959a5089945092508401905082828015610a4e5780601f10610a2357610100808354040283529160200191610a4e565b820191906000526020600020905b815481529060010190602001808311610a3157829003601f168201915b5050865460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815295995088945092508401905082828015610adc5780601f10610ab157610100808354040283529160200191610adc565b820191906000526020600020905b815481529060010190602001808311610abf57829003601f168201915b5050855460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815295985087945092508401905082828015610b6a5780601f10610b3f57610100808354040283529160200191610b6a565b820191906000526020600020905b815481529060010190602001808311610b4d57829003601f168201915b5050845460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815295975086945092508401905082828015610bf85780601f10610bcd57610100808354040283529160200191610bf8565b820191906000526020600020905b815481529060010190602001808311610bdb57829003601f168201915b5050505050905097509750975097509750975097505090919293949596565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10610c5857805160ff1916838001178555610c85565b82800160010185558215610c85579182015b82811115610c85578251825591602001919060010190610c6a565b50610c91929150610c95565b5090565b610caf91905b80821115610c915760008155600101610c9b565b905600a165627a7a7230582059eb8f8f6b0431625c2b6f253b57fbe84f38db170d7ae0da0e20924014c4d9470029";

    public static final String FUNC_UPLOADINFO = "uploadInfo";

    public static final String FUNC_SEARCHCODE = "SearchCode";

    public static final String FUNC_SETCODE = "SetCode";

    public static final String FUNC_GETINFO = "getInfo";

    protected Financial_Sys_sol_Financial_Sys(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Financial_Sys_sol_Financial_Sys(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> uploadInfo(Utf8String _Com_Id, Utf8String _Com_Name, Utf8String _Com_Legal_Per, Utf8String _Email, Utf8String _Project_Title, Utf8String _Project_Detail, Utf8String _Fundraising_Target) {
        final Function function = new Function(
                FUNC_UPLOADINFO, 
                Arrays.<Type>asList(_Com_Id, _Com_Name, _Com_Legal_Per, _Email, _Project_Title, _Project_Detail, _Fundraising_Target), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> SearchCode(Utf8String _search_code) {
        final Function function = new Function(
                FUNC_SEARCHCODE, 
                Arrays.<Type>asList(_search_code), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> SetCode(Utf8String _set_code) {
        final Function function = new Function(
                FUNC_SETCODE, 
                Arrays.<Type>asList(_set_code), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Tuple7<Utf8String, Utf8String, Utf8String, Utf8String, Utf8String, Utf8String, Utf8String>> getInfo() {
        final Function function = new Function(FUNC_GETINFO, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteCall<Tuple7<Utf8String, Utf8String, Utf8String, Utf8String, Utf8String, Utf8String, Utf8String>>(
                new Callable<Tuple7<Utf8String, Utf8String, Utf8String, Utf8String, Utf8String, Utf8String, Utf8String>>() {
                    @Override
                    public Tuple7<Utf8String, Utf8String, Utf8String, Utf8String, Utf8String, Utf8String, Utf8String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple7<Utf8String, Utf8String, Utf8String, Utf8String, Utf8String, Utf8String, Utf8String>(
                                (Utf8String) results.get(0), 
                                (Utf8String) results.get(1), 
                                (Utf8String) results.get(2), 
                                (Utf8String) results.get(3), 
                                (Utf8String) results.get(4), 
                                (Utf8String) results.get(5), 
                                (Utf8String) results.get(6));
                    }
                });
    }

    public static RemoteCall<Financial_Sys_sol_Financial_Sys> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Financial_Sys_sol_Financial_Sys.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Financial_Sys_sol_Financial_Sys> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Financial_Sys_sol_Financial_Sys.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static Financial_Sys_sol_Financial_Sys load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Financial_Sys_sol_Financial_Sys(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Financial_Sys_sol_Financial_Sys load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Financial_Sys_sol_Financial_Sys(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
