def tests = [
        [name: 'Login', expected: '200', actual: '200'],
        [name: 'Logout', expected: '200', actual: '200'],
        [name: 'Send Money', expected: '200', actual: '500']
]

tests.each { test ->
//    println "${test.name}: " + (test.expected==test.actual?'PASS':'FAIL') shortcut for if else
    if (test.expected == test.actual) {
        println("${test.name}: Pass")
    } else {
        println("${test.name}: Fail")

    }

}



