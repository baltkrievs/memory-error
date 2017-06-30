# memory-error

mvn package

* java -Xmx256m -jar heap/target/heap.jar
* java -XX:MaxMetaspaceSize=64m -jar metaspace/target/metaspace.jar
* java -Xss160k -jar stack/target/stack.jar
