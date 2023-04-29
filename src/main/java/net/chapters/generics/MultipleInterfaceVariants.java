package net.chapters.generics;//: generics/MultipleInterfaceVariants.java
// {CompileTimeError} (Won't compile)

interface Payable<T> {}

// Originally this class called Employee (without 2)
// but it has conflict with Employee from class InstantiateGenericType
class Employee2 implements Payable<Employee2> {}

// Originally this code is not commented.
// But if you uncomment it, you will see mistake like
// "'Payable' cannot be inherited with different type arguments: 'Employee' and 'Hourly'"
//class Hourly extends Employee2
//  implements Payable<Hourly> {} ///:~
//