# Marvel-universe-as-a-social-network-java
A research paper was published in 2008 that modeled the marvel comics universe as a social network. For my algorithms assignment on graph theory the professor asked us to use that paper and a provided dataset of all character collaborations in marvel comics as of 2008 to determine how far away in terms of collaboration a given character was from Peter Parker/ Spider Man.

You can see the research paper as “0202174v1.pdf”, the assignment as “CSCI-3412-Program-3.pdf”, and my final report as “HW3 writeup.docx.pdf”. The following is adapted from my final report.
	
The social graph is represented as a square 2d array of integers, called a collaboration matrix. A given cell of this array index [n,m] is the number of times character n has been in a comic with m. Any index [n,n] is set to zero. In this representation the books are no longer nodes and are instead a family of mutually connected characters. The exact value of these integers is not of interest to us but, is useful in other applications.

My method of the six degrees of spider man fills an array with all characters that have collaborated with him directly. All of these characters are then given a Spiderman number of 1. I then fill a second array with every character the characters in the first array collaborate with and give anyone whose number is still the default value of 7 (diameter of the graph) a 2. Repeat the above once more to find all Spiderman numbers (Maximum Spiderman number is a 3 for any connected node).

For the collaboration matrix a 2d array of ints called colab is initialized with a size of 6486 by 6486. Three nested for loops seed the collaboration matrix. This is the longest runtime process in the program with a O(n3) however the runtime is still manageable considering that the lowest level loop is only the highest number of collaborators which is significantly smaller than the number of total characters.
