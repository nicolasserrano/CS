# Points to verify when there are problems with a program  

Verify the next points until you find the problem:

- [ ] The program compiles.
- [ ] The program executes without errors.
- [ ] Verify that the execution of the program corresponds to the source code (introduce a trace at the beginning, example: ```System.out.println("Prog 1");``` 
- [ ] Introduce a trace to verify the most important variable, example: ```System.out.println("i: " + i);``` 
- [ ] Introduce a trace to verify the next most important variable, example: ```System.out.println("j: " + j);``` 
- [ ] Repeat the previous step for all the important variables 
- [ ] Introduce a trace to verify that the program goes through the middle of the code, example: ```System.out.println("Point A");``` 
- [ ] If the trace is printed, repeat for the next half of the code, if the trace is not printed, repeat for the previous half of the code.
- [ ] **The goal is to find the line that causes the error.**


# If the program doesn't compile

- [ ] Read the compile error message and correct it.
- [ ] If you don't know how to correct, comment the line or lines producing the error, with two slashes: ```// code ```  
- [ ] Alternatively, you can start with a program that works, for example the [Hello program](../Hello.md) and add the lines of the problematic program until it produces an error.
- [ ] **The goal is to find the line that causes the error.**
