# linter-poc
poc for linter service of Wally 

POC that leverages GraalVM Native compile, Java 21 Virtual threads. Uses WebClient to call an external API

gradle clean build
gradle clean test


#Build GraalVM Native Image. This will take couple of minutes
gradle nativeCompile

#Start native app
./build/native/nativeCompile/linter-poc

Browse the urls
http://localhost:8080/coffee/iced
http://localhost:8080/coffee/hot
