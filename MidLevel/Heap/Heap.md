Heap - it is a complete Binary Tree to maintain parent-child order so, that min and max elements always available at root taht can be access at O(1).


References:

CBT - it is a BT
1. Every level fills completely except the last
2. Lat level node fills from Left -> Right


Access- O(1)
Delete - O(log n)
Priority Queue is Heap


MinHeap - PriorityQueue<Integer> pq = new PriorityQueue<>();
MaxHeap - PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

Heap is implemented by Arrays