# separatedLayer

The aim of this project is to show how to separate the java layer processing between request handling / business / dao. With access to a technical(Util) layer from each layer.

"request handling" layer is supposed to handle any request (whatever type of request). It should contain source code to receive the request, check the request is valid, send back the response.
"business" layer contains business logic and business object. It implements the application features.
"dao" layer access the data. Here the data is stored in memory but we could any kind of datasource.
"technical" contains utility classes.

"request handling" can interact with "business" but not "dao".
"dao" can interact with "business" but not "request handling".
"business" interacts with both.

"technical" can interact with any layer.



A user can use the application with Postman in order to create and retrieve messages.
By default, a user can access msg1 and msg2.
