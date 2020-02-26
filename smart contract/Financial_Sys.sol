pragma solidity 0.4.24;

contract Financial_Sys{
    struct CompanyInfo{
        string Com_Id;
        string Com_Name;
        string Com_Legal_Per;
        string Email;
        string Project_Title;
        string Project_Detail;
        string Fundraising_Target;
    }
    
    string set_code;
    string search_code;
    mapping(string=>CompanyInfo)index;

    function SetCode(string _set_code) public{
        set_code=_set_code;
    }
    function SearchCode(string _search_code)public{
        search_code=_search_code;
    }
    function uploadInfo(
        string _Com_Id,
        string _Com_Name,
        string _Com_Legal_Per,
        string _Email,
        string _Project_Title,
        string _Project_Detail,
        string _Fundraising_Target

        ) public{index[set_code] = CompanyInfo(
                _Com_Id,
                _Com_Name,
                _Com_Legal_Per,
                _Email,
                _Project_Title,
                _Project_Detail,
                _Fundraising_Target);
        }
     
    function getInfo() public view returns(string,string,string,string,string,string,string){
        CompanyInfo storage newComInfo=index[search_code];
        return(newComInfo.Com_Id,
        newComInfo.Com_Name,
        newComInfo.Com_Legal_Per,
        newComInfo.Email,
        newComInfo.Project_Title,
        newComInfo.Project_Detail,
        newComInfo.Fundraising_Target);
    }

}