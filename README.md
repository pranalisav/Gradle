Today I perfromed gradle demo in which below are the things i noted:

1.How to run gradle project in CLI
2.How to run eclipse gradle project
3.How to add maven and external dependencies in gradle project
4.Also as per gardle version we can use  'compile' inplace of 'impleentation' in build.gradle

//Highlights of build.gradle file
plugins {
// Apply the java-library plugin to add support for Java Library
id 'java'
}
repositories {
mavenCentral()
maven {
url "https://maven.repository.redhat.com/ga/"
}
}
dependencies {
// https://mvnrepository.com/artifact/junit/junit
testImplementation group: 'junit', name: 'junit', version: '4.13'
// https://mvnrepository.com/artifact/joda-time/joda-time
compile group: 'joda-time', name: 'joda-time', version: '2.9.7.redhat-1'
}
