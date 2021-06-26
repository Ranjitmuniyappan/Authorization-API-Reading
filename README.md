# Authorization-API-Reading

TASK:
Step 1: Consume a REST API (http://tlapi.filehvut.com/Version1/Contact/GetContactList)
Step 2: Save the specified parameters from response into SQLite Database
Step 3: Populate the saved values from Database into a RecyclerView.


METHOD:
http://tlapi.filehvut.com/Version1/Contact/GetContactList

HEADERS:
AuthKey: 6257 1/n2D6fw1kgAAAAAAAAAAAAAAAAAAAAA 0tsy9X+98x1Ib4YwuzAs6XvFI74Jd6HQqHVCgFFR sharmila.k+new@dotnetethics.com Android SDK built for x86
Content-Type:application/json
Accept:application/json

REQUEST:

{
    "ContactType": "ALL",
    "IsInitialLoad": true,
    "MobileDeviceId": "26134",
    "SubUserId": "0",
    "UserId": "6257"
}

RESPONSE:
{
 
  "CustomerList": [
    {
      "CI": 226246,//ContactId
      "CN": "C2",//CompanyName
      "CTN": " ",
      "DBAN": null,
      "AN": null,
      "ME": null,//MainEmail
      "CE": null,
      "AE": null,
      "OE": null,
      "MP": null,
      "MPE": null,
      "CP": null,
      "CPE": null,
      "OP": null,
      "OPE": null,
      "AD1": "3720 Stephen M White Drive",
      "AD2": null,
      "CT": "Los Angeles",
      "ST": "California (CA)",//State
      "CTY": "USA",//City
      "ZP": "90731",//Zipcode
      "ID": false,
      "CFN": null,
      "CLN": null,
      "PSP": null,
      "UID": 0,
      "CAO": null,
      "MCI": 0,
      "CAID": 94492,
      "SCL": false,
      "COID": 1,
      "STID": 5,
      "CUSID": 40147
    }
  ],
  "OperationStatus": 1,
  "ErrorMessage": null
}
