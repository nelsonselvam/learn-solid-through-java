# SOLID DESIGN PRINCIPLES

# SOLID Principles – Understanding the Problems They Solve

The SOLID principles are fundamental guidelines for writing maintainable, scalable, and robust object-oriented software. This document explains each principle with the **problem it tries to solve** and **how it solves it**, along with brief Java examples.

## 1. Single Responsibility Principle (SRP)

### Problem:

- A class does **too many things**, making it **hard to change, test, and understand**.

### Solution:

- **Each class should have only one reason to change.**
- **Separate responsibilities into different classes.**

#### Example:

```java
class Invoice {
    void calculateTotal() { /* calculation logic */ }
}

class InvoicePrinter {
    void print(Invoice invoice) { /* printing logic */ }
}

class InvoiceRepository {
    void save(Invoice invoice) { /* DB logic */ }
}
```

---

## 2. Open/Closed Principle (OCP)

### Problem:

- **Modifying existing code every time a new feature is added** leads to **bugs and tight coupling**.

### Solution:

- **Open for extension, closed for modification.**
- **Extend behavior with new classes instead of modifying existing ones.**

#### Example:

```java
interface PaymentMethod { void pay(); }

class CreditCardPayment implements PaymentMethod { public void pay() { /* Credit Card logic */ } }

class PayPalPayment implements PaymentMethod { public void pay() { /* PayPal logic */ } }

class PaymentProcessor {
    void processPayment(PaymentMethod method) { method.pay(); }
}
```

---

## 3. Liskov Substitution Principle (LSP)

### Problem:

- **Subclasses break the behavior of their base class**, leading to **unexpected issues**.

### Solution:

- **Subtypes must be replaceable by their base type without altering the behavior.**

#### Example:

```java
interface FlyableBird { void fly(); }

class Sparrow implements FlyableBird { public void fly() { /* flying logic */ } }

class Penguin { /* Penguins don't fly */ }
```

---

## 4. Interface Segregation Principle (ISP)

### Problem:

- **Clients are forced to implement methods they don’t use**, leading to **unnecessary complexity**.

### Solution:

- **Create smaller, more specific interfaces** instead of a large, general-purpose one.

#### Example:

```java
interface Workable { void work(); }

interface Eatable { void eat(); }

class Human implements Workable, Eatable { public void work() { /* work logic */ } public void eat() { /* eating logic */ } }

class Robot implements Workable { public void work() { /* work logic */ } }
```

---

## 5. Dependency Inversion Principle (DIP)

### Problem:

- **High coupling to low-level classes**, making the code **hard to extend, replace, or test**.

### Solution:

- **Depend on abstractions, not concrete implementations.**
- **Use interfaces and inject dependencies.**

#### Example:

```java
interface Database { void connect(); }

class MySQLDatabase implements Database { public void connect() { /* MySQL logic */ } }

class DataAccess {
    private final Database db;
    DataAccess(Database db) { this.db = db; }
    void connectToDB() { db.connect(); }
}
```

---

## Summary Table

| Principle                     | Problem It Solves                        | How It Solves It                             |
| ----------------------------- | ---------------------------------------- | -------------------------------------------- |
| **S - Single Responsibility** | Class does too many things               | Split responsibilities into separate classes |
| **O - Open/Closed**           | Modifying existing code for every change | Extend behavior using new classes            |
| **L - Liskov Substitution**   | Subclass breaks base class behavior      | Subtypes must respect base type behavior     |
| **I - Interface Segregation** | Forced to implement unnecessary methods  | Split large interfaces into smaller ones     |
| **D - Dependency Inversion**  | High coupling to low-level classes       | Depend on abstractions (interfaces)          |

---

## Final Thoughts

Understanding **why** SOLID principles matter is key to applying them. Always **focus on the problem each principle addresses**. This mindset will help you **write clean, extensible, and testable Java code**.


## References:

- [Post on SOLID by JavaTechOnline.com](https://javatechonline.com/solid-principles-the-dependency-inversion-principle/#How_is_DIP_related_to_Dependency_Injection_of_Spring_Framework)
- [Post on SOLID by FreeCodeCamp.org](https://www.freecodecamp.org/news/solid-design-principles-in-software-development/)
- [YT Video on SOLID by JavaTechie Channel](https://www.youtube.com/watch?v=BM_lSZPMClo)


