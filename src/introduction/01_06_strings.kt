package introduction

//13.06.1992 = fun introduction.getPattern() = """\d{2}\.\d{2}\.\d{4}"""
// Using introduction.getMonth variable rewrite this pattern in such a way that it matches the date in format 13 JUN 1992
// (two digits, a whitespace, a introduction.getMonth abbreviation, a whitespace, four digits).

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2} $month \d{4}"""
