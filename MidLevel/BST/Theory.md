````md
# Binary Tree vs Binary Search Tree (BST)

## 1. Binary Tree

### Definition
A **Binary Tree** is a tree data structure in which each node can have **at most two children**:
- Left Child
- Right Child

There is **no specific ordering** between the left and right child.

### Structure

```text
        10
       /  \
      5    20
     / \     \
    8   2     15
````

This is a Binary Tree because every node has at most two children.

---

### Properties

* Maximum two children per node.
* No ordering rule.
* Nodes can be arranged in any order.
* Search may require visiting every node.

---

### Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| Search    | O(n)       |
| Insertion | O(n)       |
| Deletion  | O(n)       |

---

### Applications

* Expression Trees
* Syntax Trees
* Decision Trees
* Huffman Coding

---

# 2. Binary Search Tree (BST)

### Definition

A **Binary Search Tree (BST)** is a Binary Tree that follows the property:

> **Left Subtree < Root < Right Subtree**

This property must hold for every node.

---

### Structure

```text
        10
       /  \
      5    20
     / \   / \
    2   8 15 30
```

Here,

* 2 < 5 < 8
* 5 < 10 < 20
* 15 < 20 < 30

Hence, it is a BST.

---

### BST Property

```text
Left Subtree < Node < Right Subtree
```

This rule is recursively true for every subtree.

---

### Example of an Invalid BST

```text
       10
      /  \
     5    20
    / \
   2  12
```

Since **12 > 10** but lies in the left subtree of **10**, this is **not a BST**.

---

# Binary Tree vs BST

| Feature           | Binary Tree | BST                   |
| ----------------- | ----------- | --------------------- |
| Maximum Children  | 2           | 2                     |
| Ordering Rule     | No        | Left < Root < Right |
| Search            | O(n)        | O(log n) Average      |
| Inorder Traversal | Not Sorted  | Sorted                |
| Insertion         | Anywhere    | According to BST Rule |

---

# Inorder Traversal

Traversal Order:

```text
Left → Root → Right
```

### Binary Tree

```text
       10
      / \
     5  20
    / \
   8   2
```

Inorder:

```text
8 5 2 10 20
```

Not Sorted.

---

### BST

```text
       10
      /  \
     5   20
    / \  / \
   2  8 15 30
```

Inorder:

```text
2 5 8 10 15 20 30
```

Always Sorted.

---

# Search Example

Search **8**

```text
        10
       /  \
      5    20
     / \
    2   8
```

Steps:

```text
8 < 10 → Go Left
8 > 5  → Go Right
Found
```

Average Time Complexity:

```text
O(log n)
```

---

# Insertion Example

Insert **12**

Before

```text
      10
     /  \
    5    20
```

Steps

```text
12 > 10 → Go Right
12 < 20 → Go Left
```

After

```text
       10
      /  \
     5    20
         /
        12
```

---

# Java Node Structure

```java
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
```

The node structure is the same for both Binary Tree and BST.

---

# Time Complexity Comparison

| Operation | Binary Tree | BST (Average) | BST (Worst) |
| --------- | ----------- | ------------- | ----------- |
| Search    | O(n)        | O(log n)      | O(n)        |
| Insert    | O(n)        | O(log n)      | O(n)        |
| Delete    | O(n)        | O(log n)      | O(n)        |

---

# Advantages of Binary Tree

* Flexible structure
* Used for hierarchical data
* No ordering restrictions
* Useful in expression trees and syntax trees

---

# Advantages of BST

* Faster searching
* Faster insertion and deletion
* Inorder traversal gives sorted output
* Used in dictionaries, sets, and databases

---

# Interview Questions

### Q1. Is every BST a Binary Tree?

Yes.

---

### Q2. Is every Binary Tree a BST?

No.

---

### Q3. Why is searching faster in BST?

Because each comparison eliminates half of the remaining search space.

---

### Q4. Which traversal of BST gives sorted output?

Inorder Traversal.

---

# Key Points

* Every BST is a Binary Tree.
* Every Binary Tree is not a BST.
* Binary Tree has no ordering rule.
* BST follows **Left < Root < Right**.
* Inorder traversal of BST is always sorted.
* BST provides **O(log n)** average search time.

```
```
