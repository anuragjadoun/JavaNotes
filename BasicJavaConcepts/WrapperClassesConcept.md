Wrapper Classes = A wrapper class is a class in java which converts primitive data types into an object.

OR

Java provides wrapper classes for all the primitive data types like Integer for int etc.. Wrapper classes allows to use primitive values as an object.

Primitive Data Type	              WrapperClass	                      Example
byte	                            Byte	                     Byte b = 10;
short	                            Short	                     Short s = 20;
int	                                Integer	                     Integer i = 100;
long	                            Long	                     Long l = 1000L;
float	                            Float	                     Float f = 10.5f;
double	                            Double	                     Double d = 20.5;
char	                            Character	                  Character c = 'A';
boolean	                             Boolean	                Boolean flag = true;



Autoboxing = Automatic conversion of primitive datatypes into the corresponding Wrapper class.
int a = 10;
Integer b = a;

AutoUnboxing = Automatic conversion of Wrapper class into the coressponding primitive data type.
Integer a = 10;
int b = a;

Integer Cache Range = -128 to 127.