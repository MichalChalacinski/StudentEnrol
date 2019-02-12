package com.enrol

class BootStrap {

    def init = { servletContext ->
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

def zoe=new Lecturer(
fullName: 'Go McNo',
post: 'dark', 
subject: 'nath', 
lecturerEmail: 'yesa@yahoo.com', 
office:'0900', 
bio:'whatevers', 
).save()

def computing=new Course(
department:'Computing',
courseCode:'CS123',
courseTitle:'Bsc Hon Computing',
courseLeader:joe,
startDate: new Date('09/09/2019'),
endDate: new Date('07/07/2023'),
numberOfStudents: 55,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:'Lorem ipsum etc etc'
).save()

def economics=new Course(
department:'Business',
courseCode:'BS123',
courseTitle:'Bsc Hon Economics',
courseLeader:doe,
startDate: new Date('09/11/2019'),
endDate: new Date('07/03/2023'),
numberOfStudents: 53,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:'Lorem ipsum etc et'
).save()

def biology=new Course(
department:'Biology',
courseCode:'CS123',
courseTitle:'Bsc Hon Biology',
courseLeader:zoe,
startDate: new Date('09/09/2019'),
endDate: new Date('07/07/2023'),
numberOfStudents: 50,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:'Lorem ipsum etc e'
).save()

def noe=new Module(
module_title:'module',
module_code:'123',
credits: 72,
lecturer:'No McNo',
description:'hi there'
).save()

def loe=new Module(
module_title:'yess',
module_code:'125',
credits: 71,
lecturer:'No McNo',
description:'hello'
).save()

def woe=new Module(
module_title:'yes',
module_code:'124',
credits: 75,
lecturer:'No McNo',
description:'hello'
).save()

def student=new Student(
studentName: 'JoeDoe',
studentID:'1',
dob: new Date ('08/08/2013'),  
studentEmail:'yes@gmail.com',
studentUsername:'user1',
studentPassword: 'password',
isFundingAvailable: 'yes',
course: computing
).save()

def bob=new Student(
studentName: 'BoeDoe',
studentID:'2',
dob: new Date ('08/08/2012'),  
studentEmail:'no@gmail.com',
studentUsername:'user2',
studentPassword: 'password',
isFundingAvailable: 'yes',
course: economics
).save()

def sans=new Student(
studentName: 'GoeDoe',
studentID:'3',
dob: new Date ('08/09/2012'),  
studentEmail:'noo@gmail.com',
studentUsername:'user3',
studentPassword: 'password',
isFundingAvailable: 'yes',
course: biology
).save()

joe.addToModules(noe)
//joe.addToModules(loe)
//doe.addToModules(woe)
//doe.addToModules(loe)
//zoe.addToModules(noe)
//zoe.addToModules(loe)
//zoe.addToModules(woe)

    }
    def destroy = {
    }
}
