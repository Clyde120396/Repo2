
def sumTwoNum ( a, b ) {
a + b
}

def subTwoNum ( a, b ) {
a - b
}

def multiTwoNum ( a, b ) {
a * b
}

def divTwoNum ( a, b ) {
if ( b == 0 ) {
println "Cannot Divide by zero"
return null
}
a / b
}


println "Enter first number (0 to exit):"
def num1 = System.in.newReader().readLine().toInteger()
while (num1 != 0) {

    println "Enter second number:"
    def num2 = System.in.newReader().readLine().toInteger()

    println "+, -, *, /"
    def operators = System.in.newReader().readLine()


    if (operators == "+") {
        println "Result: ${sumTwoNum(num1, num2)}"
    } else if (operators == "-") {
        println "Result: ${subTwoNum(num1, num2)}"
    } else if (operators == "*") {
        println "Result: ${multiTwoNum(num1, num2)}"
    } else {
        println "Result: ${divTwoNum(num1, num2)}"
    }

    println "\nEnter first number (0 to exit):"
    num1 = System.in.newReader().readLine().toInteger()
}