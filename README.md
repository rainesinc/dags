DAGs

The java Main program is runnable on its own for showing the longest path from node 0.
Unit tests are runnable in the Intellij IDE upon cloning the git repository.

Graph Syntax:

graph.put(0, Arrays.asList(1, 3));

graph.put(1, Arrays.asList(2)):

graph.put(2, Arrays.asList(4));

graph.put(4, Arrays.asList(3));

means:
0 -> 1, 0 -> 3, 1 -> 2 -> 4 -> 3


Does the solution work for larger graphs?  Yes, the depth first search should scale linearly.

Can you think of any optimizations?  Not an optimization, but adding junit tests for more edge cases and adding a handler upon encountering a cycle would be nice.  For a recursive problem of this nature, you can never have enough tests!  I could reduce the code base (LOC) by combining the DepthFirstSearch algorithm into the Main program, although the reason the algorithm was abstracted from the Main class was for testability and thoughts around alternate algorithms to be implemented in the future.  For example: Kahn's algorthm as opposed to DFS.  (Optimization through computational timed tests for various algorithms.)

What’s the computational complexity of your solution?   The solution is recursive, thus computational complexity would be calculated as follows:

I used this reference for context below: https://en.wikipedia.org/wiki/Master_theorem_(analysis_of_algorithms)

(Master Theorem)
T(n) = aT(n/b) + f(n) 

Definitions:
T(n)  is the time complexity of solving a problem of size n. 
a: The number of subproblems created at each step in the algorithm.
b: The factor by which the problem size is reduced (so each subproblem is of size n/b).
f(n): The cost of the work done to divide the problem and combine the solutions of the subproblems. 

Are there any unusual cases that aren't handled?  As long as there are no cycles, and the graph is Directed, there should be no unhandled use cases.
