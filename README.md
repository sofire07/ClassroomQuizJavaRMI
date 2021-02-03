# ClassroomQuizJavaRMI
A Client/Server based classroom response system is a tool that allows an
instructor to send a question to all participant students and to collect their answers.
The system was developed with Java RMI and is composed of multiple CRS clients (for students and the instructor) and a
CRS server. The CRS client recognizes two types of users: instructor and student. The
systems allows both types of uses to register and login. Additionally, the instructor can
send a question to all online students. The system collects all the responses and shows the
results to the instructor. Online students receive all the questions submitted by the
instructor and can submit their answers. The CRS client program also displays the list of
online/offline users in the system (and their types). The CRS server manages the users
and forwards messages to online users.

# Commands to run
- javac *.java
- rmiregistry&

- Starts server
  - java -Djava.security.policy=java.policy ClickerServer

- Starts clients
  - java -Djava.security.policy=java.policy UserGUI [Insert IP Address here]
