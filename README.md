# Apache-Kafka-Consumer
Basic Implementation of Apache Kafka- Consumer

the kafka file has zookeeper inside it so no need to add a zookeeper separately

Basic commands that can come handy:

zookeeper-server-start.bat config\zookeeper.properties

kafka-console-consumer --bootstrap-server localhost:9092 --topic Kafka_Example2 --from-beginning

kafka-topics --zookeeper localhost:2181 --describe --topic Kafka_Example

kafka-topics --zookeeper localhost:2181 --list

kafka-topics --zookeeper localhost:2181 --create --topic test --partitions 3 --replication-factor 1
