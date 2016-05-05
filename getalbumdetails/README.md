This is project is demonstration of RAML file use to create REST API,API gateway,exception handling and choice component and logger.

 /getalbumdetails/src/main/api/ - contains RAML file which is create for below API 

http://127.0.0.1:8081/api/album?albumName=amit2&albumId=1234444  GET method
response :- 
{
"albumName":"test",
"albumId":"13232"
}

This also demostrate how to use Choice component and redirect code flow as per choice.
Also Exception handling and logging is also included in this.
