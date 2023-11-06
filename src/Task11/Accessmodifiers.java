package Task12;
There are two types of modifiers in Java: access modifiers and non-access modifiers.

The access modifiers in Java specify the accessibility or scope of a field, method, constructor, or class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

There are four types of Java access modifiers:

Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package. The main purpose of this access modifier is re-usability of the method/ class. This will reduce code duplication hence code errors also.

class guvi 
{
    public void method1() {...} 
	// method1 is public, can be accessed by any other class
}

Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class. This will secure the data being used by others. Especially in the banking sector, Data management. 

class guvi 
{
 private void method2() {...}
	// method2 is private, cannot be accessed by any other class
}

Default: If you don't use any modifier, it is treated as default by default. The default modifier is accessible only within the package. It cannot be accessed from outside the package. It provides more accessibility than private. But, it is more restrictive than protected, and public.

Protected: The access level of a protected modifier is within the package and outside the package Task11 child class through inheritance only. If you do not make the child class, it cannot be accessed from outside the package.



