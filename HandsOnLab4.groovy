def file = new File ("sample.txt")

def fileContents = file.text

if (file.text.trim()) {
    println "Pass"
    println fileContents
} else {
    println "Fail"
}


