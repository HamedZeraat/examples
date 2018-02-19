# Session Two - Object-Oriented Programming

<ol>
<li> 
(+)Write a program that prints a lottery combination, picking six distinct numbers between 1 and 49. 
   To pick six distinct numbers, start with an array list filled with <code>1...49</code>. 
   Pick a random index and remove the element. 
   Repeat six times. 
   Print the result in sorted order.
</li>
<li>
(+) Write a program that stores Pascal's triangle up to a given <code>n</code> 
in an <code>ArrayList&lt;ArrayList&lt;Integer&gt;&gt;</code>.
</li>
<li>
(+) Write a program that reads a two-dimensional array of integers and determines whether 
   it is a *magic square* (that is, whether the sum of all rows, all columns, and the diagonals is 
   the same). Accept lines of input that you break up into individual integers, 
   and stop when the user enters a blank line. For example, with the input:<br/>
<pre>
16 3 2 13
5 10 11 8
9 6 7 12
4 15 14 1
(Blank line)
</pre>
your program should respond affirmatively.
</li>
<li>
Consider the <code>nextInt</code> method of the <code>Scanner</code> class. 
Is it an *accessor* or *mutator*? 
Why? What about the <code>nextInt</code> method of the <code>Random</code> class?
</li>
<li>
Can you ever have a mutator method return something other than <code>void</code>? 
Can you ever have an accessor method return <code>void</code>? Give examples when possible.
</li>
<li>
Why can't you implement a Java method that swaps the contents of two <code>int</code> variables? 
Instead, write a method that swaps the contents of two <code>IntHolder</code> objects. 
(Look up this rather obscure class in the API documentation.) 
Can you swap the contents of two <code>Integer</code> objects?
</li>
<li>
(+) Implement an *immutable* class <code>Point</code> that describes a point in a plane. 
Provide a constructor to set it to a specific point, a no-arg constructor to set it to the origin, 
and methods <code>getX</code>, <code>getY</code>, <code>translate</code>, and 
<code>scale</code>. The <code>translate</code> method moves the point by 
a given amount in <code>x-</code> and <code>y-</code>direction. 
The <code>scale</code> method scales both coordinates by a given factor. 
Implement these methods so that they return new points with the results.
For example:
<pre>
Point p = new Point(3, 4).translate(1, 3).scale(0.5);
</pre>
should set <code>p</code> to a point with coordinates (2, 3.5).
</li>
<li>
Repeat the preceding exercise, but now make <code>translate</code> and 
<code>scale</code> into <em>mutators</em>.
</li>
<li>
Add <code>javadoc</code> comments to both versions of the <code>Point</code> class from the 
preceding exercises.
</li>
<li>
In the preceding exercises, providing the constructors and getter methods of the <code>Point</code> 
class was rather repetitive. Most IDEs have shortcuts for writing the boilerplate code. 
What does your IDE offer?
</li>
<li>
(+) Implement a class <code>Car</code> that models a car traveling along 
the <code>x-</code>axis, consuming fuel as it moves. 
Provide methods to drive by a given number of kilometres, to add a given number of litres to the fuel tank, 
and to get the current distance from the origin and fuel level. 
Specify the fuel efficiency (in km/litres) in the constructor. Should this be an immutable class? 
Why or why not?
</li>
<li>
(+) In the <code>RandomNumbers</code> class in the repository, provide two 
<code>static</code> methods <code>randomElement</code> that get a 
random element from an <em>array</em> or <em>array list</em> of integers. (Return <code>zero</code> 
if the array or array list is <em>empty</em>.<br/>Why couldn’t you make these methods into instance methods of <code>int[]</code> or <code>ArrayList&lt;Integer&gt;</code>?
</li>
</ol>