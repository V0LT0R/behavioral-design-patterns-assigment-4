# Design Patterns Implementation in Java

This repository contains implementations of various design patterns in Java, specifically focusing on behavioral design patterns. Each pattern is implemented in a separate folder with its own set of classes and a demonstration of its usage.

## Table of Contents

1. [Strategy Pattern: Payment Processing System](#strategy-pattern-payment-processing-system)
2. [Observer Pattern: Weather Monitoring System](#observer-pattern-weather-monitoring-system)
3. [Command Pattern: Remote Control for Smart Home Devices](#command-pattern-remote-control-for-smart-home-devices)
4. [State Pattern: Order Processing System](#state-pattern-order-processing-system)
5. [Chain of Responsibility: Expense Approval System](#chain-of-responsibility-expense-approval-system)
6. [Mediator Pattern: Chat Room Application](#mediator-pattern-chat-room-application)
7. [Memento Pattern: Document Version Control System](#memento-pattern-document-version-control-system)
8. [Visitor Pattern: Shape Area Calculator](#visitor-pattern-shape-area-calculator)
9. [Template Method Pattern: Report Generation System](#template-method-pattern-report-generation-system)
10. [Iterator Pattern: Playlist Management System](#iterator-pattern-playlist-management-system)

## Strategy Pattern: Payment Processing System

**Description**: This pattern allows an e-commerce platform to handle multiple payment methods, such as credit cards, PayPal, and cryptocurrencies, by encapsulating each payment method as a strategy.

### Classes

- `PaymentStrategy`: Interface for payment methods.
- `CreditCardPayment`, `PayPalPayment`, `CryptoPayment`: Concrete payment strategies.
- `ShoppingCart`: Class that uses payment strategies.
- `Main`: Demonstrates the system.

### Usage

```java
ShoppingCart cart = new ShoppingCart();
cart.setPaymentStrategy(new CreditCardPayment());
cart.processPayment(100.0);
```

---

## Observer Pattern: Weather Monitoring System

**Description**: This pattern implements a weather monitoring system where multiple display devices update their information based on data from a weather station.

### Classes

- `WeatherStation`: Subject that notifies observers.
- `WeatherDisplay`: Observer interface.
- `CurrentConditionsDisplay`, `StatisticsDisplay`, `ForecastDisplay`: Concrete display implementations.
- `WeatherData`: Manages the weather station and displays.
- `Main`: Demonstrates the system.

### Usage

```java
WeatherStation station = new WeatherStation();
station.registerObserver(new CurrentConditionsDisplay());
station.setWeatherData(25.0, 60.0, 1013.0);
```

---

## Command Pattern: Remote Control for Smart Home Devices

**Description**: This pattern allows a universal remote control system to operate various smart home devices through command classes.

### Classes

- `Command`: Interface for commands.
- `TurnTVOn`, `SetVolume`, `DimLights`: Concrete command classes.
- `TV`, `Stereo`, `Light`: Receiver classes.
- `RemoteControl`: Manages commands and provides undo functionality.
- `Main`: Demonstrates the remote's functionality.

### Usage

```java
RemoteControl remote = new RemoteControl();
remote.setCommand(0, new TurnTVOn(tv));
remote.pressButton(0);
```

---

## State Pattern: Order Processing System

**Description**: This pattern allows an online store's order processing system to change its behavior based on the order's current state.

### Classes

- `State`: Interface for order states.
- `New`, `Paid`, `Shipped`, `Delivered`, `Cancelled`: Concrete state classes.
- `Order`: Class that maintains the current state and delegates actions.
- `Main`: Demonstrates the order processing system.

### Usage

```java
Order order = new Order();
order.payOrder();
order.shipOrder();
```

---

## Chain of Responsibility: Expense Approval System

**Description**: This pattern allows an expense approval system to pass requests through a chain of approvers based on the amount.

### Classes

- `Approver`: Base class for approvers.
- `TeamLead`, `Manager`, `Director`, `CEO`: Concrete approvers.
- `ExpenseRequest`: Class representing an expense request.
- `ApprovalChain`: Manages the chain of approval.
- `Main`: Demonstrates the system.

### Usage

```java
ApprovalChain chain = new ApprovalChain();
chain.addApprover(new TeamLead());
chain.addApprover(new Manager());
chain.processRequest(new ExpenseRequest(500, "Team lunch"));
```

---

## Mediator Pattern: Chat Room Application

**Description**: This pattern facilitates communication between users in a chat room through a central mediator.

### Classes

- `ChatMediator`: Interface for chat functionalities.
- `ChatRoom`: Concrete mediator class.
- `User`: Abstract class for chat users.
- `ChatUser`: Concrete user classes.
- `Main`: Demonstrates the chat room's functionality.

### Usage

```java
ChatMediator chatRoom = new ChatRoom();
User user1 = new ChatUser(chatRoom, "Alice");
User user2 = new ChatUser(chatRoom, "Bob");
user1.send("Hello, Bob!");
```

---

## Memento Pattern: Document Version Control System

**Description**: This pattern allows users to save and restore different versions of a text document.

### Classes

- `Document`: Originator class for editing content and managing versions.
- `DocumentVersion`: Memento class to store document state.
- `VersionControl`: Caretaker class to manage versions.
- `Main`: Demonstrates version control system.

### Usage

```java
Document doc = new Document();
doc.edit("Version 1");
doc.saveVersion();
doc.edit("Version 2");
doc.restoreVersion(1);
```

---

## Visitor Pattern: Shape Area Calculator

**Description**: This pattern calculates the area of different shapes using the Visitor pattern.

### Classes

- `Shape`: Interface for shapes.
- `Circle`, `Rectangle`, `Triangle`: Concrete shape classes.
- `Visitor`: Interface for visiting shapes.
- `AreaCalculator`: Concrete visitor that calculates area.
- `Drawing`: Holds a collection of shapes.
- `Main`: Demonstrates the area calculation process.

### Usage

```java
Drawing drawing = new Drawing();
drawing.addShape(new Circle(5));
drawing.addShape(new Rectangle(4, 6));
AreaCalculator calculator = new AreaCalculator();
drawing.accept(calculator);
```

---

## Template Method Pattern: Report Generation System

**Description**: This pattern creates different types of reports while keeping the overall process consistent.

### Classes

- `ReportGenerator`: Abstract class defining the template method.
- `PDFReportGenerator`, `HTMLReportGenerator`, `PlainTextReportGenerator`: Concrete report classes.
- `ReportingSystem`: Uses report generators.
- `Main`: Demonstrates report generation.

### Usage

```java
ReportingSystem system = new ReportingSystem();
system.generateReport(new PDFReportGenerator());
```

---

## Iterator Pattern: Playlist Management System

**Description**: This pattern allows traversal of songs in different orders (sequential, shuffle, filtered by genre).

### Classes

- `Song`: Class representing a song.
- `Playlist`: Manages a collection of songs and provides iterators.
- `Iterator`: Interface for iterators.
- `SequentialIterator`, `ShuffleIterator`, `GenreFilterIterator`: Concrete iterator classes.
- `Main`: Demonstrates playlist usage and traversals.

### Usage

```java
Playlist playlist = new Playlist();
playlist.addSong(new Song("Song 1", "Artist 1", "Pop"));
playlist.addSong(new Song("Song 2", "Artist 2", "Rock"));
Iterator<Song> iterator = playlist.getShuffleIterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

---

## Conclusion

This repository serves as a practical implementation of various design patterns in Java. Each implementation showcases the principles and benefits of the respective patterns, allowing for greater flexibility and maintainability in software design.

Feel free to explore and modify the code as needed!

---

Made by Biloshchytskyi Yevhenii
