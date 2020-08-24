# Overview
Online Auction System: 
 
As a software engineer, you are asked to design an Online Auction System. 
In an auction system, sellers can post product items for sale and potential buyers bid on products. 
Each time when a buyer bids on a specific product item, all other buyers will be notified about the new bid.

Develop an Auction System that can notify all buyers about the bids.
Provide a simple implementation for this online auction system. (20 points)

Document in your README.md file. Which pattern would you have used for this problem? (3 points)
Document in your README.md file. Describe how would your design of the notification system inform buyers about the new bids? (2 points)
Classes:
Provide a class for "AuctionSystem"
Provide a class for "Buyer"
Provide a class for "Seller"
Provide a class for "Product"
Provide a class for "Bid"
Simulate your system in a Junit Test or a Main function in Java (one of them is enough).
Objects:
Create one object of "AuctionSystem", "Seller", "Product" , one "Bid"
Create at least two "Buyer"s, and create a "Bid" on a product for one of the buyer and inform other buyers.


# Observer Pattern
The Observer Pattern is a software design pattern in which an object, called the ‘subject,’ maintains a list of its dependents, called ‘observers,’ and notifies them automatically of any state changes, usually by calling one of their methods.

In this system, the AuctionSystem maintains a list of the buyers and also includes the register() and 
notice() methods.  This later method is used to notify buyers of a new bid.


# README

- This applies the Observer pattern

# Project Template

This is a Java Maven Project Template

# How to compile the project

We use Apache Maven to compile and run this project.

You need to install Apache Maven (https://maven.apache.org/) on your system.

Type on the command line:

```bash
mvn clean compile
```

# How to create a binary runnable package

```bash
mvn clean compile assembly:single
```

# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project.

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies.

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath ./target/JavaProjectTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar  edu.bu.met.cs665.Main
```

# Run all the unit test classes.

```bash
mvn clean compile test

```

# Using Findbugs

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using

```bash
mvn findbugs:gui
```

or

```bash
mvn findbugs:findbugs
```

For more info about FindBugs see

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see
https://gleclaire.github.io/findbugs-maven-plugin/index.html

You can install Findbugs Eclipse Plugin

http://findbugs.sourceforge.net/manual/eclipse.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.

# Run Checkstyle

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style.
You can change it to other styles like sun checkstyle.

To analyze this example using CheckStyle run

```bash
mvn checkstyle:check
```

This will generate a report in XML format

```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser.

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```

# Generate coveralls:report

You can find more info about coveralls

https://coveralls.io/

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```
