package com.enrol

class BootStrap {

    def init = { servletContext ->
def computing=new Course(
department:'Computing',
courseCode:'CS123',
courseTitle:'Bsc Hon Computing',
courseLeader:'Dr Michelle Murphy',
startDate: new Date('09/09/2019'),
endDate: new Date('07/07/2023'),
numberOfStudents: 55,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:'Lorem ipsum etc etc'
).save()

def student=new Student(
studentName: 'JoeDoe',
studentID:'1',
dob: new Date ('08/08/2013'),  
studentEmail:'yes@gmail.com',
studentUsername:'user1',
studentPassword: 'password',
isFundingAvailable: 'yes',
course: 'Bsc Hon Computing'
).save()

def bob=new Student(
studentName: 'BoeDoe',
studentID:'2',
dob: new Date ('08/08/2012'),  
studentEmail:'no@gmail.com',
studentUsername:'user2',
studentPassword: 'password',
isFundingAvailable: 'yes',
course: 'Bsc Hon Computing'
).save()

def joe=new Lecturer(
fullName: 'No McNo',
post: 'office', 
subject: 'math', 
lecturerEmail: 'no@yahoo.com', 
office:'090', 
bio:'whatever', 
).save()

def doe=new Lecturer(
fullName: 'No McNo',
post: 'park', 
subject: 'math', 
lecturerEmail: 'yes@yahoo.com', 
office:'090', 
bio:'whatever', 
).save()

def noe=new Module(
module_title:'module',
module_code:'123',
credits: 72,
lecturer:'No McNo',
course:'Computing',
description:'hi there'
).save()

def loe=new Module(
module_title:'yes',
module_code:'124',
credits: 75,
lecturer:'No McNo',
course:'Computing',
description:'hello'
).save()

    }
    def destroy = {
    }
}
