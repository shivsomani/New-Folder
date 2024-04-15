let name1="Shivam";
let age=23;
let isHappy= true;
/*
console.log("My name is " + name1 + " and my age is " + age);

if(isHappy==true)
    console.log(name1 + " is happy");
else
    console.log(name1 + " is not happy");


console.log("This persons name is ");
console.log(name1);*/

//Objects in JavaScript
//Combination of multiple elements
//Similar to objects in Java
//const, var , val - used to declare variables, objects.

let users1={
    firstName: "harkirat",
    gender: "male"
}

console.log(users1["firstName"]);
console.log(users1["gender"]);


const users=[1,2,3];                                        //Array of Integers
const users2=["Shivam","Shiva","Shiv"];                     //Array of Strings

const users3=[{                                             //Array of Objects
    firstName: "Shivam",
    Age: 30
},
{
    firstName: "Sakshi",
    Age: 25
},
{
    firstName: "Shiv",
    Age: 27
}]

/*
//Accessing normal arrays
for(let i=0;i<users.length;i++)                     
{
    console.log(users[i] +" "+ users2[i]);
}*/

console.log();

//Accessing an array of objects
for(let i=0;i<users3.length;i++)
{
    if(users3[i]["Age"]==27)
    {
        //console.log(users3[i]["firstName"]); 
        
        console.log(users3[i].firstName); 
        console.log(users3[i]["Age"]);      
        //Only considers first statemet for 'in' condition
        //if brackets are not specified 
    }                                               
        
}