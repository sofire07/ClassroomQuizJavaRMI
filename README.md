# ClassroomQuizJavaRMI

#Commands to run
javac *.java
rmiregistry&

- Starts server
java -Djava.security.policy=java.policy ClickerServer

- Starts clients
java -Djava.security.policy=java.policy UserGUI [Insert IP Address here]