//def (a,b, boolean c) = [10,20,30]
//
//println(a)
//println(b)
//println(c)
//
////Data Types
//
////byte
//byte d = 10
//println(d)
//println Byte.MIN_VALUE
//println Byte.MAX_VALUE
//println "_____________________"
////short
//short s = 100
//println s
//println Short.MIN_VALUE
//println Short.MAX_VALUE
//println "____________________"
////int
//int i = 100.03
//println i
////long
////float
//float f = 100.03
//println f
////double is like float but more deciman
////char
//char e = 'a'
//println e
////boolean
////String
//String str = "I love you"
//println str.getClass().getName()
//println str

//Operators


//conditional statement
//    println "${test.name}: " + (test.expected==test.actual?'PASS':'FAIL') shortcut for if else
//if (test.expected == test.actual) {
//    println("${test.name}: Pass")
//} else {
//    println("${test.name}: Fail")
//
//}

//string

//def name = "clyde"
//println name
//println "my name is " + name
//println "my name is ${name}"
//println name.length()
//println name[2]
//println name[0,2]
//println name[0..2]

//def str = "This is a practice"
//println str.split(" ")
//println str-("is")
//println str.replace("a", "aa")
//println str.toLowerCase()
//println str.toUpperCase()

//method

//def method(){
//    println "Hello"
//}
//method()
//
//def sum (int a, int b ) {
//    println "sum is " + (a+b)
//}
//
//sum(5,6)
//
//def sub(int a, int b){
//    def c = a - b
//    return c
//}
//
//def result = sub(10, 20)
//print result

//Closures

//def str = "Hello"
//def myclosure1 = { name -> println "${str} ${name}"}
//
//myclosure1.call("Clyde")
//
//def mylist = ["Apples", "Oranges", "Pomelos"]
//
//println mylist.each {it}
//
//def maps = [
//        [username: 'Clyde', role: 'Manual QA'],
//        [username: 'Mark', role: 'Perf QA'],
//        [username: 'Cruz', role: 'Automation QA']
//]
//
//maps.each { map ->
//    println map.username
//
//}
//def mylist = [1,2,3,4,5]
//
//println mylist.find { items -> items == 3 }
//println mylist.findAll { items -> items > 3 }

//list

def myfruits = ["Apple", "Oranges" , "Grapes"]
println myfruits[1]

def mylist = [1,2,3,["A", "B", "Groovy"], 4]

println mylist[2]
println mylist[3][2]






