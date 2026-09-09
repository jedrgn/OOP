Exercise Answers

46. What is the condition in the ternary expression? 
- grade >= 75

47. What are the two possible values returned by the ternary operator?
- "passed" and "failed"

48. Write the complete ternary expression that assigns the result to a String.
- String result = grade >= 75 ? "PASSED" : "FAILED";

49. What comparison is performed first in your nested ternary solution?
- a >= b

50. Can the program still work when two largest values are equal?
- yes because using >= allow equal values to still be compared and the largest value will be selected

51. Write a nested ternary expression that selects the largest value
- largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);

52. Why is && used instead of ||?
- because both grade and attendance requirements should be true

53. What does the expression grade >= 85 return?
- it returns true or false

54. What must be true for the entire logical expression to become true?
- the grade should be atleast 85 and the attendance must be atleast 80%

