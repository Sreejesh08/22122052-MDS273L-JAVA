Name: Sreejesh S Nair Class: 2MSDS-A Reg. No: 22122052 Email: sreejesh.nair@msds.christuniversity.in

PROBLEM
Create a java program, that stores the details of a student (Name, Register Number, Email, Class, Department).
You can use a two-dimensional array to store the details.
HINT: String arr[] = {{"Alwin","1847207","alwin@christ.in","MCA","Computer Science"},{"Balagangadhar","2011204","bala@christ.in","MDS","Data Science"}}

You need to have functions to:
Collect the details of the student
Display the details of the student
Search the details of the student
With the help of a menu-driven main function, you need to access these functions inside your class and perform the operations.

Whenever you are entering the details of a student, you need to enter the value into a static global string array, that stores the names that the user has entered. Searching this array will help you to find if the details of the student are already entered into the program.

You will have a function to perform this search operation, which can be used to implement two functionality in the code
To check if the name is already entered
While searching for a name, you can identify the index of the two-dimensional array to print the details directly.
In the end, you will have
Four functions inside your lab program class including your main class
One static String array storing the names (note the program can store up to 1024 students)
One two-dimensional string array storing the details of up to 1024 students
A menu-driven main method implementing the functions and functionality
Plan your program with a flow chart before starting with coding.
Since you are using functions, plan what should be the returning values and how to implement them.

Output
Enter the choice. 
 1. Collect details of a student. 
 2. Display the details of a student. 
 3. Search the details of a student. 
1
***********************************************
Enter the Name.
Sreejesh
Enter the Register Number.
22122052
Enter the e-mail ID.
sreejesh@gmail.com
Enter the Class.
MSCDSA
Enter the Department.
Data Science
***********************************************
Do you wish to Enter more student details[1/2].
1
***********************************************
Enter the Name.
Aashi
Enter the Register Number.
22122101
Enter the e-mail ID.
aashi@gmail.com
Enter the Class.
MSCDSB
Enter the Department.
Data Science
***********************************************
Do you wish to Enter more student details[1/2].
1
***********************************************
Enter the Name.
Sahil
Enter the Register Number.
22122061
Enter the e-mail ID.
sahil@gmail.com
Enter the Class.
BBA LLB
Enter the Department.
Law
***********************************************
Do you wish to Enter more student details[1/2].
2
*****************************
Do you wish to continue[1/2].
1
Enter the choice. 
 1. Collect details of a student. 
 2. Display the details of a student. 
 3. Search the details of a student. 
2
Details of the 0 student.
***********************************************
The Name is: Sreejesh
The Register Number is: 22122052
The e-mail ID is: sreejesh@gmail.com
The Class ID is: MSCDSA
The Department ID is: Data Science

Details of the 1 student.
***********************************************
The Name is: Aashi
The Register Number is: 22122101
The e-mail ID is: aashi@gmail.com
The Class ID is: MSCDSB
The Department ID is: Data Science

Details of the 2 student.
***********************************************
The Name is: Sahil
The Register Number is: 22122061
The e-mail ID is: sahil@gmail.com
The Class ID is: BBA LLB
The Department ID is: Law

*****************************
Do you wish to continue[1/2].
1
Enter the choice. 
 1. Collect details of a student. 
 2. Display the details of a student. 
 3. Search the details of a student. 
3
Enter the name that needs to be searched.
Sahil
The student details is present at the2th location.
Details of the 2 student.
The Name is: Sahil
The Register Number is: 22122061
The e-mail ID is: sahil@gmail.com
The Class ID is: BBA LLB
The Department ID is: Law
*****************************
Do you wish to continue[1/2].
2