# ProductManagement-P1
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// Dakota Varnell
Dakota Varnell

Purpose: The data backend is just read in through a text file by java and then each product becomes instantiated into an instance of our single-entity class and then finally that single entity class product is added to our ProductCollection class which is the entire inventory of the store at this particular time. The ProductCollection class use many different built in features to manage what happens to the inventory and how it is managed.

Single-Entity-Class: Every product that is read in from the text file is converted into an instance of our single entity class which allows it
to be properly managed as an object.

Product-Collection-Class: Utilizing an ArrayList the program will add each individual product previously created into our ProductCollection class
which is representative of the entire inventory of a store.  The ProductCollection class also provides access to many useful management features such 
as the ability to
-Add Products
-Remove Products
-Decrease Quantity
-Increase Quantity
-Suggest Product
-Find a Product

The suggestion method will take into account your previous purchases and then it will suggest something that has good synergy with that item.  For 
example, if you have purchased a guitar it will suggest a guitar cable or a guitar amplifier.  

Tester-Class: The tester class exists just to call the ProductCollection and begin the reading and writing of the file.  

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
