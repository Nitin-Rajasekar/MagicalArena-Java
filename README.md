

# Magical Arena


### Description

Magical Arena is a turn-based combat game, involving two players engaged in draining the other's health. Players take turns attacking their opponent, with their attack and defence dependent on a dice roll and their inherent attributes. The last player standing wins.

### Features

- Each player has three quantitative attributes - health, strength, attack. 
- At each turn, the attacking player roles a dice. The output multiplied by their attack attribute gives the net attack of their turn.
- Similarly, at each turn, the defending player roles a dice as well. The output multiplied by their strength attribute gives the net defence of their turn.
- If the turn's attack is more than the turn's defence, then their difference is subtracted from the defending players' health
- The player whose health drops below zero first loses
- The player with the lower health attribute at the beginning of the game makes the first attack - after that, the turns alternate

### Prerequisites

- **Java**, Version 11 or above
- **Maven**
- **JUnit** for testing - however since its already included as a dependency in the pom.xml, Maven should handle it

### Getting Started

1) Navigate to the Project directory:

  ```
   cd MagicalArena-Java/MagicalArena
  ```
   
2) Use Maven to build the project:

```
mvn clean install
```

### Playing

Again first navigate to the project directory

```
   cd MagicalArena-Java/MagicalArena
```

After building the project, you can run it using maven

```
mvn exec:java
```

### Testing

Again from the same project directory, run

```
   mvn test
```
This will execute all tests using JUnit.

## Structure


The project is a Maven-based Java project, and is structure is similar to that of a standard Maven project.

The project has been designed keeping the **Strategy Design Pattern** in mind.<br>
The Strategy Design Pattern is used to define a family of algorithms, encapsulate each one of them, and make them interchangeable.


In this context,

**Player.java**: Represents a player in the game. It contains attributes like health, strength, and attack.
**AttackStrategy.java**: Implements the attack strategy.
**DefendStrategy.java**: Implements the defense strategy.


The directory structure is as follows:

```

MagicalArena/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── magicalarena/
│   │   │           ├── Arena.java
│   │   │           ├── Player.java
│   │   │           ├── strategy/
│   │   │           │   ├── AttackStrategy.java
│   │   │           │   ├── DefendStrategy.java
│   │   │           │   └── DiceRollStrategy.java
│   │   │           ├── dice/
│   │   │           │   ├── SixSidedDie.java
│   │   │           │   └── Die.java
│   │   │           └── Main.java
│   │   └── resources/
│   ├── test/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── magicalarena/
│   │   │           ├── ArenaTest.java
│   │   │           ├── PlayerTest.java
│   │   │           └── dice/
│   │   │               └── SixSidedDieTest.java
│   │   └── resources/
└── pom.xml


```




