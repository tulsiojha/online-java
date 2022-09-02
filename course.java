//basic

variables
constants

data types
    byte = 120
    short = 1
    int = 1
    long = 1305


    float
    double
    boolean
    char
    strings
    arrays
    classes

type casting


Strings
    charAt
    concat
    contains
    endsWith
    equals
    equalsIgnoreCase
    indexOf
    isEmpty
    lastIndexOf
    length
    replace
    startsWith
    substring
    toLowerCase
    toString
    toUpperCase
    trim




if else
switch
for loop
arrays
while loop
break/continue



//functions or Methods
parameters
overloading
scope
recursion


//classes
OOPS
class/objects
attributes
Methods
constructors
modifiers

method overloading / polymorphism
constructor overloading
super
toString()
method overriding
interface
abastraction
ArrayList
Exception handling

//hashmaps --put--get
import java.util.HashMap;
HashMap<String, String> capitalCities = new HashMap<String, String>();

Enums
static class

threading (Thread, Runnable)

command line arguments

import java.io.FileWriter;   // Import the FileWriter class
import java.io.FileReader;   // Import the FileWriter class
import java.io.IOException;


debugging


inputstream/outputstream
HttpURLConnection




project:

1. Student management

- login

- menu
    - Add, Update, delete, view student detali, marks, subjects.

    -- use OOPS
    -- store in file as JSON


        {
           "students":{
             "123":{
                "detail":{
                    "name":"abc",
                    "roll no":"123",
                    ...
                },
                "marks":{
                    "1":10,
                    "2":30
                }
            },
            
            "234":{
                "detail":{
                    "name":"xyz",
                    "roll no":"234",
                    ...
                },
                "marks":{
                    "1":100,
                    "2":300
                }
            }
           },
           
           "subjects":{
            "1":"Python",
            "2":"Java"
           }
        }



2. Syncing system

- host
    - scan files in a given folder;
    - upload files to always data;
    - upload progress;

- client
    - get list of files from always data;
    - check files in local;
    - update folder;

