# Re:Drop

*“Re:Drop”—I Was a Second-Year CS Student Trying to Drop Calculus, but I Slipped on the Stairs and Got Transported to Another World — Now My Magical Encyclopedia Lets Me Edit Any Living Being at Will?! and I have a beautiful girl to guide me in this brand new world - How much luck can I get?*

## Group Members

- Gerald Arambulo
- Royce Albolote
- Steven Arcallo
- Keniel De Guzman
- Josh Abraham Panoy

## Project Description

“Re:Drop” is an interactive turn-based RPG game. It follows the story of a 2nd year BSCS student, trying to drop Math 54 in CAS, then got thrown into another world after slipping on the stairs. The main character has a talking encyclopedia that shows the traits or the ‘inner code’ of a monster. The main character can either choose to attack monsters normally or modify their ‘code’ so they can battle the monster effectively. But putting in the wrong code can make monsters bugged which makes them overpowered and ends the battle with a failure. Through this, the game helps players understand OOP concepts like inheritance and interfaces by actually using them in battle instead of just memorizing them.

## Key Features

- **Isekai Storyline**: four acts: CAS, Dungeon, Forest, and City
- **Turn-based Combat**: edit the monster, then attack in the same turn
- **Encyclopedia**: contains the Book of Monsters and the Book of Items
- **Code Editing**: change a monster’s variant and abilities
- **Glitched Entities**: invalid edits make the monster overpowered
- **Mana System**: edits cost mana
- **Linear Maps and Cutscenes**
- **2D Pixel Art**

## Program Structure

| Class | Role |
| --- | --- |
| `Entity` | base class for all characters |
| `Player` | the main character |
| `Monster` | an enemy made of a variant, abilities, and an attack |
| `NPC` | non-combat characters |
| `Variant` | a monster type’s element, stats, and sprite |
| `Ability` | interface for monster abilities |
| `AttackStrategy` | defines how a monster attacks |
| `Item` | base class for items |
| `Encyclopedia` | holds both books and checks edits |
| `MonsterEntry` | a monster’s entry in the Book of Monsters |
| `ItemEntry` | an item’s entry in the Book of Items |
| `CodeParser` | reads and checks the player’s code |
| `GlitchDecorator` | turns a monster into its glitched form |
| `MonsterFactory` | creates monsters by type |
| `Battle` | handles turns, mana, and restarts |
| `GameMap` | handles explorable areas |
| `GameState` | tracks the current screen |
| `GameManager` | runs the main game loop |

## Planned Design Patterns

### 1. Factory

The Factory method is a creational design pattern that provides an interface for creating objects in a superclass, while also allowing subclasses to alter the type of objects created. Thus, also allowing object creation to be done in one place.

In this case, the Factory method is ideal for generating the enemies in order for creation to be centralized. The game requests an enemy type and receives a fully configured object without the client knowing how the enemy’s stats and traits are assigned. With this type of design pattern, new enemies can also be added without having to modify the client’s existing code.

### 2. Strategy

The Strategy design pattern is a behavioral design pattern that defines a group of similar algorithms, separates them in different classes with a common interface, and allows interchangeability of those classes at runtime.

In this case, the Strategy pattern is ideal for executing enemy actions wherein each enemy can have different attack behavior. Each attack is encapsulated in its own class, and so enemies can be assigned different attacks at run time without modifying the enemy class itself.

### 3. Singleton

The Singleton design pattern is a creational design pattern that ensures a class has only one instance and provides a global point of access to it.

In this case, the Singleton design pattern is applied to the game manager and encyclopedia feature to ensure the whole game shares and has access to the same game state and information.

### 4. Decorator

The Decorator design pattern is a structural design pattern that lets you attach new behavior or state to an object by wrapping it in another object that shares the same interface, without altering the original class.

In this case, the Decorator pattern is applied to the trait editing feature. Each trait is wrapped around an enemy as a decorator, allowing the player to add or change the opponent’s state and abilities without modifying the base class.

### 5. State

The State design pattern is a behavioral design pattern that lets an object change its behavior when its internal state changes, appearing as if it changed its class.

In this case, the State pattern is applied to the game flow. Each condition, such as alive or dead, online or offline, active or inactive, and which battle window is open, is represented as its own state object. The game switches between these states at runtime, and each state defines what actions are allowed and how the game responds.
