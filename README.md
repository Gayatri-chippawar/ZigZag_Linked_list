# 🔁 ZigZag Linked List in Java
## 📌 Overview

This project implements a ZigZag transformation on a singly linked list using Java.

The ZigZag pattern rearranges the linked list in the following order:

L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → ...

## ✅ Example

Input:

1 → 2 → 3 → 4 → 5 → 6


Output (ZigZag):

1 → 6 → 2 → 5 → 3 → 4

## 🧠 Concept Used

The ZigZag operation is implemented using three main steps:

Find Middle of Linked List

Using Fast & Slow Pointer technique.

Reverse Second Half

Reverse the second half of the linked list.

Merge Alternately

Merge first half and reversed second half alternately.

Time Complexity: O(n)
Space Complexity: O(1) (In-place modification)

## 🛠️ Features

Create Linked List

Add Nodes

Print Linked List

ZigZag Transformation

Efficient In-place Modification

## 📂 Project Structure
ZigZagLinkedList.java

## ▶️ How to Run

Clone the repository

Compile the file:

javac ZigZagLinkedList.java


Run:

java ZigZagLinkedList

## 📚 Learning Purpose

This project helps in understanding:

Fast & Slow Pointer technique

Linked List Reversal

In-place Merging

Pointer manipulation

Important DSA interview problem
