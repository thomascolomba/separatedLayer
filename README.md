# separatedLayer

The aim of this project is to show how to separate the java layer processing between request handling / business / dao. With access to a technical(Util) layer from each layer.

<div>
"request handling" layer is supposed to handle any request (whatever type of request). It should contain source code to receive the request, check the request is valid, send back the response.
</div> 
<div>
"business" layer contains business logic and business object. It implements the application features.
</div>  
<div>
"dao" layer access the data. Here the data is stored in memory but we could any kind of datasource.
</div>  
<div>
"technical" contains utility classes.
</div>  
<div>
  &nbsp;
<div>
"request handling" can interact with "business" but not "dao".
</div>
<div>
"dao" can interact with "business" but not "request handling".
</div>
<div>
"business" interacts with both.
</div>
<div>
  &nbsp;
</div>
<div>
"technical" can interact with any layer.
</div>
<div>
  &nbsp;
</div>
<div>
  &nbsp;
</div>
A user can use the application with Postman in order to create and retrieve messages.
By default, a user can access msg1 and msg2.
</div>
<div>
The postman requests are located in src/main/resources/
</div>
