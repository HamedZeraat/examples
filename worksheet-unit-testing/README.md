# Session Three - Unit Testing in Java

## Learning goals

Before the next day, you should have achieved the following learning goals: 

* Understand the importance of automated testing.
* Write your own tests for classes already defined.
* Execute your own tests for classes already defined.

This is a long worksheet, but also one of the most important on the course. 

For all the following questions you should follow the following steps:

1. Write (or update) the interface(s) for the functionality required (where appropriate).
2. Generate the tests for the functionality required at that stage. The tests may not even compile at this point.
3. Write the bare minimum code of the classes implementing the interfaces to make the test-class(es) compile. 
   Check that the new tests fail while the old ones pass.
4. Write the minimum code in the methods of the implementing class(es) that makes all the new tests pass.
5. Refactor the code to make it clearer, if needed. Your first implementation may not be as clear as possible. 
   Think of the next programmer that will come after you: will they understand the code easily? 
   Are variable names clear and descriptive? Can you simplify those for loops and/or those if...else branches?
6. Document the code if it has not been done yet. Check that the documentation formats correctly and is easy to read.


## Install JUnit 4

This should be straight forward via your IDE but if you need (want) to use the console then you will need to
[install JUnit][junit]; follow the instructions that appear on the site.

## Exercises

For these questions you will be writing a simple application for keeping track of the books in a library. 
The functionality will be described incrementally by stages. 

   
3. Create a class for books. Books have authors and titles. The class should implement *getters* for both 
   author name and title, but these must be set at construction time and never be modified afterwards. 
   (Reminder: An object whose fields cannot be changed after construction is called an *immutable* object.)
   
4. Create a class for the users of the library. Users have a name and a library-ID (an `int`), 
   both of which must be unique in a library. The name is set at construction time, but the library-ID is not. 
   The class must implement methods to get the name of the person and their ID, and to set the latter.

5. Expand the class you have just created to allow users to register with a library. 
   You will need two methods `register(Library)` and `getLibrary()`. 
   The former method is the way to obtain the user-ID.
   
   **Important:** As you do not have a `Library` class yet, you will need a *fake* `Library` object to test your 
   method `register(Library)`. This is called a *mock object*, and it is a common practice when writing testing 
   code because it allows the programmer to test one class at a time instead of testing several classes at the 
   same time, which is more complex and thus error prone. 
   
   The mock library object does not need to do anything apart from providing a name (so that your class can return 
   it when you call `getLibrary()` and an ID when you call `getID()`. As it is a *mock object* and not the real one, 
   it can return trivial values (i.e., the name can always be `“Library name”` and the ID can always be `13`).

6. Create a class `Library` for the library. Libraries have a `name`, set at construction time. 
   They also have a *“maximum number of books borrowed by the same person”* policy (e.g., a maximum of 
   three books per user), which can be updated at any time. 
   Of course, they also have a method to get the maximum number of books to be borrowed at any time (e.g.,
   `getMaxBooksPerUser()`).

7. Add a method `getId(String)` that returns the `ID `of a person for a given name in this library. 
   If the person does not have an `ID` yet, a new unique identifier is created and returned.
   Any subsequent calls to this method with the same name argument should return the same identifier.
  
8. Expand your library class a bit further. Add three new methods:	

   `addBook(String title, String author)` - Adds a new book to the list of books in this library.
   
   `borrowBook(String title)` - If the book is not borrowed, marks the book as borrowed and returns it. 
   If the book is borrowed, `null` is returned.
   
   `returnBook(Book book)` - Marks the book as not borrow.
   
   **Important:** At this point you have to make a design decision: 
   
   "should the information about the books 'being borrowed' be stored in the book class or in the library class?"
   
   If this information is part of a book, you must add some functionality to the `Book` class: maybe methods 
   like `isborrow()` and `setborrow(boolean)`, and some private boolean field; 
   if the responsibility lies on the library’s camp, then you must add the adequate data structures.

9. Expand your library once more to include the following methods: 
   
   `getReaderCount()` - returns the number of users registered in this library.
   
   `getBookCount()` - returns the number of books in this library. 
   
   `getBookBorrowedCount()` - returns the number of borrowed books in this library.

10. Add a method to your users that returns a list (or an array) with the titles of all the 
    books they are borrowing at the moment.
    
11. Expand your library class one more time with two methods that return:
    * a list (or an array) with all the users that are borrowing books at the moment.
    * a list (or an array) with all the users, borrowing or not.
    * the name of the person that is borrowing a specific given title at the moment; if nobody is borrowing 
    the book, or the book does not exist in the library, you must return `null` (**not** an empty String).

12. Modify your method `setMaxBookPolicy(int)` in your library class, so that it does not return `void` anymore.
    Instead, it should return an array of users that have more books than the new policy allows. 
    The array may be empty.

    For example, if the maximum policy is three books per user, `Marge`, `Lisa`, and `Maggie` 
    may have borrowed one, two, and three books. If the policy is then set to a maximum of one book, 
    the method must return the names of `Lisa` and `Maggie` (so that the library can track them down and 
    ask them to return the excess books).

13. Once you have finished implementing all this functionality, write a small program that illustrates these 
    situations:	
	* A user borrowing one book and then returning it.
    * A user trying to borrow more books than allowed. 
      And then returning one of the books they already have to borrow a new one.
    * Several users borrow books. The library is then asked who has some specific title, if anyone. 
    * The “maximum books” is reduced to one, then to zero, then it is increased to the original value.



[junit]: http://junit.org
