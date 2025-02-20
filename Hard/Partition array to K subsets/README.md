<h2><a href="https://www.geeksforgeeks.org/problems/partition-array-to-k-subsets/1?page=1&category=Dynamic%20Programming&difficulty=Hard&status=unsolved&sprint=94ade6723438d94ecf0c00c3937dad55&sortBy=submissions">Partition array to K subsets</a></h2><h3>Difficulty Level : Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an integer array <strong>a[ ]</strong> of <strong>N</strong> elements and an integer <strong>K</strong>, the task is to check if the array <strong>a[ ]</strong>&nbsp;could be divided into <strong>K</strong> non-empty subsets with equal sum of elements.<br>
<strong>Note:</strong>&nbsp;All elements of this array should be part of exactly one partition.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
N = 5
a[] = {2,1,4,5,6}
K = 3
<strong>Output:</strong> 
1
<strong>Explanation:</strong> we can divide above array 
into 3 parts with equal sum as (2, 4), 
(1, 5),&nbsp;(6)
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: 
N = 5 
a[] = {2,1,5,5,6}
K = 3
<strong>Output:</strong> 
0
<strong>Explanation</strong>: It is not possible to divide
above array into 3 parts with equal sum.</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>isKPartitionPossible()</strong>&nbsp;which takes the array a[],&nbsp;the size of the array N, and the value of K as inputs and returns true(same as 1) if possible, otherwise false(same as 0).</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N*2<sup>N</sup>).<br>
<strong>Expected Auxiliary&nbsp;Space:</strong>&nbsp;O(2<sup>N</sup>).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤&nbsp;K ≤ N ≤ 10<br>
1 ≤ a[i] ≤ 100</span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Backtracking</code>&nbsp;<code>Algorithms</code>&nbsp;