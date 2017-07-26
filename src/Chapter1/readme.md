# Chapter 1 Strategy Pattern
## Problem
* In maintenance,the use of inheritance in purpose of reusing code is not perfect. This would allow unwanted behavior for new sub-class
* Changing one code in parent class may affect all subclass, which causes unwanted change of behavior in subclass
* Inheritance can't solve maintenance issues when not all subclass share the behavior of the superclass
* Interface lost the ability to reuse code, it is necessary to reimplement the behavior for every class
* Can't dynamically change behavior
* It is hard to know the behavior of all ducks
## Solution
* Separate the code that need to be changed for every subclass from the common code
* Create distinct flyable and quackable class that inherit duck class
* Program to interface rather tha program to implementation
* Subclass(superclass to concrete class) implement interface that allows code reuse, but separate mutable code
* Prefer composition than inheritance

