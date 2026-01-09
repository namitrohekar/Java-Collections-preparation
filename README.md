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
Note :- including Real world scenarios 
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

#### LinkedHashMap
- Maintains **insertion order** by default
- Can maintain **access order** when `accessOrder = true`
- Internally uses **HashMap + doubly linked list**
- Recently accessed entries move to the end
- Slightly slower than HashMap due to ordering overhead
- Commonly used when predictable iteration order is required

#### LRU Cache (using LinkedHashMap)
- LRU = Least Recently Used cache eviction strategy
- Removes the **least recently accessed entry** when capacity is exceeded
- Implemented by:
  - Using `LinkedHashMap` with `accessOrder = true`
  - Overriding `removeEldestEntry()`
- Frequently used in caching scenarios
- Demonstrates real-world usage of LinkedHashMap

#### Garbage Collection & Weak References (awareness)
- Strong references prevent garbage collection
- Weak references do **not** prevent garbage collection
- Objects referenced only by `WeakReference` are eligible for GC
- `WeakHashMap` uses weak references for keys
- Entries are automatically removed when keys are no longer strongly referenced
- Useful for memory-sensitive applications and cache-like structures

#### Comparable
- Used to define the **natural ordering** of objects
- Implemented by a class
- Defines ordering using the `compareTo()` method
- A class can have **only one natural ordering**
- Used by sorting methods and sorted collections like `TreeMap` and `TreeSet`

#### SortedMap
- Maintains keys in **sorted order**
- Sorting based on **natural ordering** or a provided **Comparator**
- Implemented by `TreeMap`
- Provides range-view methods:
  - `firstKey()`, `lastKey()`
  - `headMap()`, `tailMap()`, `subMap()`

#### NavigableMap
- Extends `SortedMap`
- Provides **navigation methods** for relative key lookup
- Key methods:
  - `lowerKey`, `floorKey`
  - `higherKey`, `ceilingKey`
- Supports **descending (reverse order) views**
- Implemented by `TreeMap`

#### IdentityHashMap (awareness)
- Uses **reference equality (`==`)** instead of `equals()`
- Treats two equal objects as different keys if references differ
- Mainly used in framework-level or JVM-internal scenarios
- Rarely used in application-level code




## Structure
- One concept or problem per class
- Each class has its own `main` method
- Minimal abstractions
- Code-first learning approach
- Internal workings of Collections 

