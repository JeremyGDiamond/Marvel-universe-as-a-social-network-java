# Marvel-universe-as-a-social-network-java
A research paper was published in 2008 that modeled the marvel comics universe as a social network. For my algorithms assignment on graph theory the professor asked us to use that paper and a provided dataset of all character collaborations in marvel comics, as of 2008, to determine how far away in terms of collaboration a given character was from Peter Parker/ Spiderman. 
## Reasoning
This kind of game is often called 6 degrees of separation. It is famously easy to do with certain people, most notably actor Kevin Bacon and mathematician Paul Erdős. In which case the distance is described as the Bacon number and Erdős number respectively. In both cases it is considered a decent heuristic to determine one's overall influence in the field. For example the median Erdős number of all fields medalists (the largest award in mathematics) is 3. The clear analog for such a figure in marvel comics is Spiderman. With a 56 year publication history Spiderman has sold more comics than any other marvel hero, the third most of any franchise in the US, and the fourth most world wide. 
### Sidenote
The best selling comics globally are in order.
1. Superman
2. Batman
3. One Piece (Japanese Manga)
4. Spiderman
The presence of One Piece is extremely impressive considering that, while all of the other comics on this list have 50+ year publication histories and entier teams working on them, One Piece has been written and drawn by one person for only 21 years.
### References
You can see the research paper as “0202174v1.pdf”, the assignment as “CSCI-3412-Program-3.pdf”, and my final report as “HW3 writeup.docx.pdf”. The following is adapted from my final report.

## Implementation 
### Collaboration Matrix	
The social graph is represented as a square 2d array of integers, called a collaboration matrix. A given cell of this array index [n,m] is the number of times character n has been in a comic with m. Any index [n,n] is set to zero. In this representation the books are no longer nodes and are instead a family of mutually connected characters. The exact value of these integers is not of interest to us but, is useful in other applications.

For the collaboration matrix a 2d array of ints called colab is initialized with a size of 6486 by 6486. Three nested for loops seed the collaboration matrix. This is the longest runtime process in the program with a O(n3) however the runtime is still manageable considering that the lowest level loop is only the highest number of collaborators which is significantly smaller than the number of total characters.

### Spiderman number finder
My method of the six degrees of spider man fills an array with all characters that have collaborated with him directly. All of these characters are then given a Spiderman number of 1. I then fill a second array with every character the characters in the first array collaborate with and give anyone whose number is still the default value of 7 (diameter of the graph) a 2. Repeat the above once more to find all Spiderman numbers (Maximum Spiderman number is a 3 for any connected node).


