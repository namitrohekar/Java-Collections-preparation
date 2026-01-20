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

#### Hashtable (awareness)
- Legacy synchronized Map implementation
- Thread-safe by synchronizing the **entire map**
- Does **not allow null keys or null values**
- Slower due to coarse-grained synchronization
- Largely replaced by `ConcurrentHashMap` in modern Java

#### ConcurrentHashMap (awareness)
- Thread-safe Map designed for **high concurrency**
- Allows concurrent read and write operations
- Better performance than Hashtable
- Does **not allow null keys or null values**
- Commonly used in multi-threaded applications




### Set Interface

#### HashSet
- Does not allow duplicate elements
- No guarantee of insertion order
- Allows **one null element**
- Internally backed by a `HashMap`
- Average time complexity for basic operations: **O(1)**
- Used when uniqueness matters and order does not

#### LinkedHashSet
- Maintains **insertion order**
- Does not allow duplicates
- Slight overhead compared to HashSet
- Useful when order of insertion must be preserved

#### TreeSet
- Stores elements in **sorted order**
- Sorting based on **natural ordering** or a provided **Comparator**
- Does **not allow null elements**
- Time complexity for add/remove/search: **O(log n)**
- Used when sorted data is required

#### EnumSet (awareness)
- Used exclusively with **enum types**
- Extremely fast and memory efficient
- Does not allow null elements
- Preferred choice when working with enum constants

(Not deep dive as map theory applies to this as well)

### Queue 

- Follows **FIFO (First-In-First-Out)** order
- Elements are added at the tail and removed from the head
- Common operations:
  - `add / offer` → insert element
  - `remove / poll` → remove element
  - `element / peek` → view head element
- Difference between methods:
  - `add`, `remove`, `element` → throw exception on failure
  - `offer`, `poll`, `peek` → return `false` or `null` on failure
- Common implementations:
  - `LinkedList`
  - `ArrayDeque`
- Used when order of processing matters

---

### PriorityQueue

- Part of the Queue interface
- **Does NOT follow FIFO**
- Elements are ordered based on **priority**
- Priority defined by:
  - Natural ordering, or
  - Custom `Comparator`
- `peek()` always returns the **highest-priority element**
- Does **not allow null elements**
- Internally implemented using a **heap**
- Commonly used in scheduling and priority-based processing


### Java 8 — Lambda Expressions & Functional Interfaces

#### Lambda Expressions
- Provide a **concise way to implement functional interfaces**
- Reduce boilerplate code (no class, method name, or modifiers)
- Syntax: `(parameters) -> expression / block`
- Commonly used with:
  - Threads
  - Collections
  - Streams

---

### Core Functional Interfaces (`java.util.function`)

#### Predicate<T>
- Represents a **boolean-valued condition**
- Abstract method: `boolean test(T t)`
- Common methods:
  - `and()`
  - `or()`
  - `negate()`
- Used for conditional checks and filtering

---

#### Function<T, R>
- Represents a **transformation**
- Abstract method: `R apply(T t)`
- Supports composition:
  - `andThen()`
  - `compose()`

##### Specializations
- `UnaryOperator<T>` → input and output type same
- `BinaryOperator<T>` → two inputs, same output type

---

#### Consumer<T>
- Represents an **operation with side effects**
- Abstract method: `void accept(T t)`
- Does **not return a result**
- Supports chaining using `andThen()`
- Commonly used for printing, logging, modifying state

---

#### Supplier<T>
- Supplies a value **without taking any input**
- Abstract method: `T get()`
- Used for lazy value generation or default values

---

### Bi-Functional Interfaces (awareness)
- `BiPredicate<T, U>` → boolean condition on two inputs
- `BiFunction<T, U, R>` → transformation with two inputs
- `BiConsumer<T, U>` → consumes two inputs

---

### Method References
- Shorthand for lambdas that call existing methods
- Improve readability
- Common forms:
  - `ClassName::staticMethod`
  - `object::instanceMethod`
  - `ClassName::instanceMethod`

---

### Constructor References
- Reference to a constructor instead of a lambda
- Used when creating objects in a functional style
- Example use case: mapping values to objects

---

### Mental Model 
- **Predicate** → test condition  
- **Function** → transform data  
- **Consumer** → perform action  
- **Supplier** → provide data  

---
## Java 8 — Streams API (Practice)

Hands-on practice of **Java Streams** focusing on
**functional data processing, lazy evaluation, and interview-oriented usage**.

Covered through small, self-contained classes.

---

### Stream Fundamentals
- Streams process **data from a source** (collections, arrays, generators)
- Do **not store data**
- Are **lazy** and **single-use**
- Execution happens only via **terminal operations**

---

### Stream Creation
- From collections: `collection.stream()`
- From arrays: `Arrays.stream(array)`
- Using `Stream.of()`
- Infinite streams:
  - `Stream.generate()`
  - `Stream.iterate()`

---

### Intermediate Operations (Lazy)
- `filter()` → conditional selection  
- `map()` → data transformation  
- `sorted()` → ordering (natural / comparator)  
- `distinct()` → remove duplicates  
- `skip()` → skip first N elements  
- `limit()` → restrict stream size  

#### Stateless vs Stateful
- **Stateless**: `filter`, `map`
- **Stateful**: `sorted`, `distinct`, `limit`

---

### Terminal Operations (Eager)
- `forEach()` → consume elements
- `toList()` / `collect()` → materialize results
- `reduce()` → combine elements into one result
- `count()` → count elements
- Short-circuiting operations:
  - `anyMatch`, `allMatch`, `noneMatch`
  - `findFirst`, `findAny`

---
### Parallel Streams
- Enable **concurrent processing** of stream elements using multiple threads
- Created using `parallelStream()` or `stream.parallel()`
- Best suited for **CPU-intensive**, **large**, and **independent** tasks
- May perform worse for **small datasets** due to thread-management overhead
- Require **stateless operations** and **no shared mutable state**
- Order of execution is **not guaranteed**
- Can produce incorrect results for **stateful or order-dependent logic**


### Additional Concepts
- **Short-circuiting** improves performance by stopping early
- **Primitive streams** (`IntStream`, etc.) avoid boxing
- `reduce()` returns `Optional` when no identity is provided

---

### Collectors
- Utility class providing **common reduction and aggregation strategies**
- Used with `collect()` terminal operation
- Common collectors:
  - `toList()`, `toSet()`, `toCollection()` → materialize results
  - `joining()` → concatenate stream elements
  - `groupingBy()` → group elements by a classifier
  - `partitioningBy()` → split elements into true/false groups
  - `counting()`, `summingInt()`, `averagingDouble()` → numeric aggregation
- Supports **downstream collectors** and **custom map implementations**
- Commonly used for frequency maps, summaries, and transformations

---

### Primitive Streams
- Specialized streams for primitives: `IntStream`, `LongStream`, `DoubleStream`
- Avoid **boxing and unboxing overhead**
- Provide numeric operations:
  - `sum()`, `average()`, `min()`, `max()`
  - `summaryStatistics()`
- Range utilities:
  - `range()` → exclusive end
  - `rangeClosed()` → inclusive end
- Can be boxed back to object streams when needed

---


## Structure
- One concept or problem per class
- Each class has its own `main` method
- Minimal abstractions
- Code-first learning approach
- Internal workings of Collections 

