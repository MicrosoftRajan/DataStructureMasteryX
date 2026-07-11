# Heap Notes (Java + Interview)

## Heap

A **Heap** is a **Complete Binary Tree (CBT)** that maintains the **parent-child ordering property**, so the **minimum** (Min Heap) or **maximum** (Max Heap) element is always at the **root** and can be accessed in **O(1)** time.

---

# Complete Binary Tree (CBT)

A Complete Binary Tree is a Binary Tree in which:

1. Every level is completely filled except the last level.
2. The last level is filled from **left to right**.

Example:

```text
        10
      /    \
     20     30
    /  \   /
   40  50 60
```

---

# Heap Property

## Min Heap

Parent ≤ Children

```text
        5
      /   \
     8     10
    / \    /
   20 30 25
```

Root = Smallest Element

---

## Max Heap

Parent ≥ Children

```text
        100
       /   \
      70    80
     / \    /
    20 50 40
```

Root = Largest Element

---

# Time Complexity

| Operation | Complexity |
|-----------|------------|
| Peek / Access Root | O(1) |
| Insert | O(log n) |
| Delete Root | O(log n) |
| Search | O(n) |
| Build Heap | O(n) |

---

# Why Search is O(n)?

Heap maintains only the **parent-child relationship**.

It is **not globally sorted** like a BST.

---

# Heap Implementation

Heap is implemented using an **Array** because a Heap is a **Complete Binary Tree**.

For a node at index `i`:

```text
Parent      = (i - 1) / 2
Left Child  = 2 * i + 1
Right Child = 2 * i + 2
```

Example:

```text
        10
      /    \
     20     30
    /  \   /
   40  50 60
```

Array Representation

```text
Index : 0   1   2   3   4   5
Value :10  20  30  40  50  60
```

---

# Java PriorityQueue

## Min Heap (Default)

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
```

---

## Max Heap

```java
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
```

---

# Priority Queue

Java's **PriorityQueue** is internally implemented using a **Binary Heap**.

- Default → Min Heap
- `Collections.reverseOrder()` → Max Heap

---

# Comparable (Natural Ordering)

Use **Comparable** when the class has **one default sorting order**.

```java
class Student implements Comparable<Student> {

    int marks;

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.marks, s.marks);
    }
}
```

Usage

```java
Arrays.sort(arr);

PriorityQueue<Student> pq = new PriorityQueue<>();
```

---

# Comparator (Custom Ordering)

Use **Comparator** when multiple sorting orders are required.

Sort by CGPA

```java
PriorityQueue<Student> pq =
    new PriorityQueue<>(
        (a, b) -> Double.compare(b.cgpa, a.cgpa)
    );
```

Sort by Name

```java
Arrays.sort(arr, (a, b) -> a.name.compareTo(b.name));
```

Sort by Marks

```java
Arrays.sort(arr, (a, b) -> Integer.compare(a.marks, b.marks));
```

---

# Comparable vs Comparator

| Comparable | Comparator |
|------------|------------|
| Inside the class | Outside the class / Lambda |
| One default ordering | Multiple custom orderings |
| Method: `compareTo()` | Method: `compare()` |
| Natural ordering | Custom ordering |
| Used by `Arrays.sort(arr)` | Used by `Arrays.sort(arr, comparator)` |
| Used by `PriorityQueue<>()` | Used by `PriorityQueue<>(comparator)` |

---

# Common Heap Patterns

| Problem | Heap Used |
|---------|-----------|
| Kth Smallest Element | Max Heap (size k) |
| Kth Largest Element | Min Heap (size k) |
| K Closest Points to Origin | Max Heap (size k) |
| K Sorted Array | Min Heap |
| Merge K Sorted Lists | Min Heap |
| Minimum Cost Rope | Min Heap |
| Median in Data Stream | Min Heap + Max Heap |

---

# Interview One-Liners

- Heap is a **Complete Binary Tree**.
- Heap maintains **only parent-child ordering**, not complete sorting.
- Root always contains the **minimum** (Min Heap) or **maximum** (Max Heap) element.
- Heap is implemented using an **Array** because it is a Complete Binary Tree.
- Java's `PriorityQueue` is implemented using a **Binary Heap**.
- `Comparable` defines the **natural/default ordering**.
- `Comparator` defines **custom ordering**.
- Search in a Heap is **O(n)** because Heap is **not globally sorted**.
- Build Heap takes **O(n)** time.
- Insert and Delete operations take **O(log n)** time.

---

# Heap Problems Pattern

## Kth Smallest Element

- Max Heap of size `k`

## Kth Largest Element

- Min Heap of size `k`

## K Closest Points

- Max Heap of size `k`
- Compare using distance:
  `x² + y²`

## Minimum Cost Rope

- Always connect the two smallest ropes.
- Use Min Heap.

## K Sorted Array

- Use Min Heap of size `k + 1`.

## Merge K Sorted Lists

- Store the smallest node of each list in a Min Heap.

---

# Formula Summary

```text
Parent(i) = (i - 1) / 2
Left(i)   = 2 * i + 1
Right(i)  = 2 * i + 2
```

---

# Java Heap Templates

## Min Heap

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
```

## Max Heap

```java
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
```

## Custom Max Heap

```java
PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> Integer.compare(b[0], a[0])
);
```

## Custom Min Heap

```java
PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> Integer.compare(a[0], b[0])
);
```
