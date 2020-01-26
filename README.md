# ConcurrencyProject
concurrency project set by Astha Shaw

## Results after running program 50 times

### Thread result orders
Shows which thread was run at what time after starting the program
Threads run .start() method in numerical order within the program

#### thread 1, thread 2, thread 3
* without implementing mutual exclusion and memory visibility: 15
* using volatile keyword on SharedCounter.counter: 22


#### thread 1, thread 3, thread 2
* without implementing mutual exclusion and memory visibility: 20
* using volatile keyword on SharedCounter.counter: 17


#### thread 2, thread 1, thread 3
* without implementing mutual exclusion and memory visibility: 3
* using volatile keyword on SharedCounter.counter: 6


#### thread 2, thread 3, thread 1
* without implementing mutual exclusion and memory visibility: 7
* using volatile keyword on SharedCounter.counter: 4


#### thread 3, thread 1, thread 2
* without implementing mutual exclusion and memory visibility: 5
* using volatile keyword on SharedCounter.counter: 1


#### thread 3, thread 2, thread 1
* without implementing mutual exclusion and memory visibility: 0
* using volatile keyword on SharedCounter.counter: 0
