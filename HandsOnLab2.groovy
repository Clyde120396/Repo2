def users = [
        [username: 'Cali', role: 'Manual QA'],
        [username: 'Alison', role: 'Perf QA'],
        [username: 'Cruz', role: 'Automation QA']
]

users.each { user ->
    println user.username

}







