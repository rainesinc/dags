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


Does the solution work for larger graphs?  Yes, the depth first search should scale linearly for work (edge traversal) vs time.

Can you think of any optimizations?  Not an optimization, but adding junit tests for more edge cases and adding a handler upon encountering a cycle would be nice.  For a recursive problem of this nature, you can never have enough tests!  I could reduce the code base (LOC) by combining the DepthFirstSearch algorithm into the Main program, although the reason the algorithm was abstracted from the Main class was for testability and thoughts around alternate algorithms to be implemented in the future.  For example: Kahn's algorthm as opposed to DFS.  (Optimization through computational timed tests for various algorithms.)

What’s the computational complexity of your solution?  We will consider the time complexity as opposed to space complexity.   The solution is recursive, thus computational complexity would be calculated as follows:

I used this reference for context below: https://en.wikipedia.org/wiki/Master_theorem_(analysis_of_algorithms)

(Master Theorem)
T(n) = aT(n/b) + f(n) 

Definitions:
T(n)  is the time complexity of solving a problem of size n. 
a: The number of subproblems created at each step in the algorithm.
b: The factor by which the problem size is reduced (so each subproblem is of size n/b).
f(n): The cost of the work done to divide the problem and combine the solutions of the subproblems. 

Consider: 0 -> 1, 0 -> 3, 1 -> 2 -> 4 -> 3

Assumptions: 
Lets assume an edge correlates 1:1 to a subproblem.
a = lets say, the average number of sub problems created out of (1 edge,1 edge,3 edges) is 2 or 1.5 rounded up, so we don't have a decimal to deal with.
b = 1 (the factor here is 1 because the work is a whole edge).  Also assume 1 unit of work = 1ms of time. Thus, TIME_COMPLEXITY = a * T(n) + Z. 

As a former Algebra teacher, I must pause here to point out what our rather linient assumptions have created for us.  An equation in slope intercept form.  It is important to note this is the REAL answer to not only this question
but question number 1 as well; 'does it scale'.  The answer is not concrete, but rather the answer is 'it depends'.  The answer is an equation, a graph if you will, of a straight line, showing work over time, intercepting the Y axis at Z.

If you simply must have something concrete, we consider again our example graph.  Simple substitution would lead us to believe the approximate time complexity for our example is 2 * 5 + 'the time to call depthFistSearch() * 5' => 10ms +( 1ms * 5) => 15ms

Are there any unusual cases that aren't handled?  As long as there are no cycles, and the graph is Directed, there should be no unhandled use cases.
