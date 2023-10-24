# CChallenge

Simple project for Server-Client communication with Java Sockets and implementation of Dijsktra Algorithm.  


## Project overview

Implement a simple string protocol communicating over sockets. Server is open on port 50000 and it is listening for upcoming connections (Clients). After connection has been established Server and Client exchange information's where Client provides custom typed input and Server is responding with appropriate message. Following commands are available for Client to type after providing his name:

- ADD NODE <X> where X is the name of NODE
- REMOVE NODE <X> where X is the name of NODE
- ADD EDGE <X><Y><WEIGHT> where X is the name of SOURCE NODE, Y name of the DESTINATION NODE and WEIGHT is value of that link
- REMOVE EDGE <X><Y> where X is the name of SOURCE NODE, Y name of the DESTINATION NODE
- SHORTEST PATH <X><Y> where X is the name of SOURCE NODE, Y name of the DESTINATION NODE
- CLOSER THAN <WEIGHT><X> where WEIGHT is maximum value of combined links, X name of the SOURCE NODE 

If any of commands are not give in above pattern without (<>) Server would not accept it. Client can end connection by typing BYE MATE! which will disconnect him from the Server.

### Note
```
- Server will remain open for upcoming connections and it will shutdown only if Server closes manually
- Default timeout for Clients is 30 seconds
```

## Getting Started

Clone the project to your machine and install dependencies using maven if needed.

### Prerequisites

- Java 1.8 and above (Oracle or OpenJDK)
- Maven 3.6.0 or above

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system


## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Author

* **Massimo Gruicic** 
