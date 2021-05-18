# Multithreading Exercise 
In this repo you can do a simple mutlithreading exercise. 

*Notice - you can pass over this exercise by the order - master and branch 0 are on the start of the exercise,*
*Branch A is my implementation to the task with single Thread. And at branch-B there is the solution by mutli-threading. *
*Feel free to send feedbacks to yimprogramming@gmail.com*

## The Real-World Problem 
Let's say we have a factory that produce some whatever product you imagine (a snakes for example).
So we are demonstrate the producing-process in simple way. Use your imagaination. It's simple. 

So that factory has "Filling-Machines" that in the process line, fill the boxes.
See the class program.FillingMachine. As you can see the Machine contains Items Generators as needed. 

Take a look at this ItemsGenerator class. 

You can see that each process took a 0.5 second,

also, as you can see each Box can contain 30 items,

and each item generator can generates only 20 items. 

So the filling Machine run this process. 

Until here all is good. 

### The Problem 
You can see at runMe class that the process of filling 1 box took about 15 seconds. There is here a waste of time, 
since, the ItemsGenerator2 is waiting to the first Generator to finish. There is no prevention that they will run together,
but this doesn't happen since all is running by single thread.

## You have two steps - 
**You can see in this branch that step 1 is ready **
### Step 1
1- See the service called "FillingMachine"  that will take a box and will fill it with items until it's full. 
First do it with simple way  of single threading. 
- Make output of the time that take the box to become full. 
- You don't need to put the items in the order. 

For example after the services has finished to run 
the out should be : 
"Box is Full"
"Item = [item #1, item #2 ... (30 item)]"
Filling time took N second (when N represent the number of seconds)
**You can see in  branch-A that step 1 is ready. **


### Step 2 - TODO
##### *The solution found the on Branch-B
 

Improve the time of filling by using two generator with multi-threading. For simplicity Use only two generator.  

If you want to get the solution checkout Branch B

* You can see the "Hint" class for getting some idea

 