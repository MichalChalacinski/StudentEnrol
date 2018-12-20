package com.enrol

class Course {

String department
String courseTitle
String courseCode
String courseLeader
Date startDate
Date endDate
String description
String studyMode
int numberOfStudents
double tuitionFees

    static constraints = {
courseTitle nullable: false, blank: false
department nullable: false, blank:false
courseLeader nullable: false, blank:false
courseCode nullable: false, blank:false
numberOfStudents nullable: false, blank:false, minSize: 20, maxSize: 60
startDate nullable: false, blank:false
endDate nullable: false, blank:false
studyMode nullable: false, blank:false, maxSize: 20
description nullable: false, blank:false, maxSize: 5000, widget: 'textarea'
tuitionFees nullable: false, blank:false, scale: 2
    }
}
