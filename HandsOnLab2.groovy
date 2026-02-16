def users = [
        [username: 'Clyde', role: 'Manual QA'],
        [username: 'Mark', role: 'Perf QA'],
        [username: 'Cruz', role: 'Automation QA']
]

users.each { user ->
    println user.username

}







