# memory-error

mvn package

* java -Xmx256m -jar heap/target/heap-1.0-SNAPSHOT.jar
* java -XX:MaxMetaspaceSize=64m -jar metaspace/target/metaspace-1.0-SNAPSHOT-jar-with-dependencies.jar
* java -Xss160k -jar stack/target/stack-1.0-SNAPSHOT.jar
