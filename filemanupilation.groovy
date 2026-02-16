def file = new File ("sample.txt")

//if (file.exists()) {
//    // Reading code goes here
//} else {
//    println("File does not exist.")
//}
//
//if (file.exists()) {
//    def fileContents = file.text
//    println fileContents
//}

//Write something to a file

def content = "Hello"
file.write(content)

def fileContents = file.text
    for (char letter in fileContents) {
    println letter
}




