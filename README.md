# linter-poc
poc for linter service of Wally 

POC that leverages GraalVM Native compile, Java 21 Virtual threads. Uses WebClient to call an external API

http://localhost:8080/coffee/iced
http://localhost:8080/coffee/hot


#Build GraalVM Native Image. This will take couple of minutes
./gradlew nativeCompile 
or
gradle nativeCompile

#Start native app
./build/native/nativeCompile/poc-webclient
