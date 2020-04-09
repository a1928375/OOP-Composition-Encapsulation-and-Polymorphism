# OOP-Composition-Encapsulation-and-Polymorphism

1. Composition:
  
     (1) Create a single room of a house using composition. Think about the things that should be included in the room. Maybe physical          parts of the house but furniture as well. Add at least one method to access an object via a getter and then that objects public            method as you saw in the previous video.
     
     (2) Then add at least one method to hide the object e.g. not using a getter but to access the object used in composition within the        main class like you saw in the video.
     
2. Encapsulation:

     (1) Create a class and demonstate proper encapsulation techniques the class will be called Printer. It will simulate a real              Computer Printer. It should have fields for the toner Level, number of pages printed, and also whether its a duplex printer              (capable of printing on both sides of the paper).
     
     (2) Add methods to fill up the toner (up to a maximum of 100%), another method to simulate printing a page (which should increase        the number of pages printed). Decide on the scope, whether to use constructors, and anything else you think is needed.

3. PolymorphismTest:

     (1) We are going to go back to the car analogy. Create a base class called Car. It should have a few fields that would be                appropriate for a generice car calss. Ex: engine, cylinders, wheels, etc. Constructor should initialize cylinders (number of) and         name, and set wheels to 4 and engine to true. Cylinders and names would be passed parameters.

     (2) Create appropriate getters. Create some methods like startEngine, accelerate, and brakes. Show a message for each in the base        class. Now create 3 sub classes for your favorite vehicles. Override the appropriate methods to demonstrate polymorphism in use.        Put all classes in the one java file.
     
4. BillBurgers: 

     (1) The purpose of the application is to help a fictitious company called Bills Burgers to manage their process of selling              hamburgers. Our application will help Bill to select types of burgers, some of the additional items (additions) to be added to the      burgers and pricing.
     
     (2) We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store. The basic          hamburger should have the following items. Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato,          carrot, etc) that the customer can select to be added to the burger. Each one of these items gets charged an additional price so        you need some way to track how many items got added and to calculate the final price (base burger with all the additions). This          burger has a base price and the additions are all separately priced (up to 4 additions, see above).
     
     (3) Create a Hamburger class to deal with all the above. The constructor should only include the roll type, meat and price, can          also include name of burger or you can use a setter. Also create two extra varieties of Hamburgers (subclasses) to cater for 
     
            (a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added. The healthy burger can have 6                 items (Additions) in total.
            Hint:  you probably want to process the two additional items in this new class (subclass of Hamburger), not the base class               (Hamburger), since the two additions are only appropriate for this new class (in other words new burger type).
     
            (b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
            Hint:  You have to find a way to automatically add these new additions at the time the deluxe burger object is created, and             then prevent other additions being made.
      
            (c) All 3 classes should have a method that can be called anytime to show the base price of the hamburger plus all                       additionals, each showing the addition name, and addition price, and a grand/final total for the burger (base price + all               additions)
     
            (d) For the two additional classes this may require you to be looking at the base class for pricing and then adding totals               to final price.
            
