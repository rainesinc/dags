Does the solution work for larger graphs?  The depth first search should scale linearly.
Can you think of any optimizations?  Not an optimization, but adding junit tests for edge cases and cycle finding would be nice.
What’s the computational complexity of your solution?   The solution is recursive, thus computational complexity would be calculated as follows:
(Master Theorem)
T(n) = aT(n/b) + f(n) 
Definitions:
T(n)  is the time complexity of solving a problem of size n. 
a: The number of subproblems created at each step in the algorithm.
b: The factor by which the problem size is reduced (so each subproblem is of size n/b).
f(n): The cost of the work done to divide the problem and combine the solutions of the subproblems. 
Are there any unusual cases that aren't handled?  As long as there are no cycles, and the graph is Directed, there should be no unhandled cases.
