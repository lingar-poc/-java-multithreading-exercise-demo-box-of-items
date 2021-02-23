# Multithreading Exercise 
In this repo you can do a simple mutlithreading exercise. 


as you can see each Box can contain 30 items.

And each item generator can generates only 20 items. 

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

##### You can skip this step and found the solution in the A branch. 
### Step 2

2- Improve the time of filling by using two generator with multithreading. For simplicity Use only two generator.  

If you want to get the solution checkout Branch B

* You can see the "Hint" class for getting some idea

 