# Java Collections Practice

Hands-on practice of the **Java Collections Framework** with a focus on
**core fundamentals, data-structure intuition, and interview readiness**.

This repository contains small, self-contained Java programs.
Each class demonstrates **how and when a specific collection is used**.

---

## What’s covered so far

### List

#### ArrayList
- Creation and initialization
- CRUD operations
- Different iteration techniques
- Removing duplicates without extra collections
- Understanding index vs value-based operations

#### LinkedList
- Node-based structure (conceptual understanding)
- Insertion and removal at ends
- Traversal behavior
- Comparison with ArrayList (use-case driven)

#### Vector (awareness)
- Legacy synchronized list
- Why it exists and why it’s avoided today

---



### Map Interface

#### HashMap
- Key-value based data structure
- Uses hashing to store and retrieve entries
- Allows **one null key** and **multiple null values**
- No guarantee of insertion order
- `put()` inserts or updates entries
- `putIfAbsent()` inserts only if the key is absent
- Average time complexity for `put` / `get` / `remove`: **O(1)**
- Iteration using:
  - `keySet()` (keys only)
  - `entrySet()` (preferred for key-value access)



## Structure
- One concept or problem per class
- Each class has its own `main` method
- Minimal abstractions
- Code-first learning approach
- Internal workings of Collections 

