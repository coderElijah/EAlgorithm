# 数组、栈、队列
- 有效括号（栈）：
	- 要点：利用栈后进先出的特性
    - 实现代码：https://github.com/coderElijah/EAlgorithm/blob/master/src/stack/LeetCode20.java

- 用栈实现队列：
	- 要点：两个栈，一个负责入队列一个负责出队列，出队列的时候需要考虑是不是为空，如果为空则需要把入队列的栈中的元素pop，并且压入出队列的栈中，这样能保证实现队列的先入先出的特性。
    - 实现代码：https://github.com/coderElijah/EAlgorithm/blob/master/src/stack/LeetCode232.java

- 用队列实现栈：
	- 要点：两个队列，其实刚开始做的时候有点儿想当然了，其实原理是两个队列q1，q2其实入栈操作的时候直接q1.offer就可以，但是出栈操作的时候，需要先把q1.poll不停，然后只剩下一个元素，这个元素就是所谓的栈顶元素，把这个元素返回就行，然后还需要把q1和q2互换，这样才能继续下一次pop，这样可以做到就算换了个队列，代码还是一样的。
    - 实现代码：https://github.com/coderElijah/EAlgorithm/blob/master/src/queue/LeetCode225.java
    

# 链表

- 反转链表：
   - 要点：主要掌握前后指针的设置，用来实现记录 
    - 实现代码：https://github.com/coderElijah/EAlgorithm/blob/master/src/list/ReverseLinkedList.java

- 判断链表是否有环:
	- 要点：有两种实现方式一种可以借助set的接口，来遍历进行判重，另一种就是借助两个指针，一个指针每次走一步另一个每次走两步，这样快指针总会追上慢指针也就是两个指针指向相同。（第二种方式比较反思维）
    - 实现代码：https://github.com/coderElijah/EAlgorithm/blob/master/src/list/LInkedListCycle.java
    
# 递归
# 排序、二分查找
# 跳表
# 散列表
# 二叉树

- 验证平衡二叉树：
	- 要点：利用平衡二叉树中序遍历的序列是有序的特性，有两种方法，（1）遍历整个树，记录下来中序遍历顺序，然后验证顺序是不是递增的。（2）其实可以只对比中序遍历过程中，前一个遍历节点是不是大于后一个，所以只需要记录前一个节点就行，不需要记录所有节点。
    - 代码实现：https://github.com/coderElijah/EAlgorithm/blob/master/src/tree/LeetCode98.java

# 红黑树
# B+树
# 堆与堆排序
- 数据流中第K大元素：
	- 要点：可以利用堆排序，最小堆，来实现输入的时候只保留k个元素，堆中k满了之后，新进入的元素都和堆顶元素比较，比堆顶大的则删除堆顶，并将新元素加入堆进行排序调整，这样返回的堆顶元素就一直是第k大的。
    - 代码实现：https://github.com/coderElijah/EAlgorithm/blob/master/src/heap/LeetCode703.java
    
- 滑动窗口最大值：
	- 要点：有两种方法，（1）利用堆排序最大堆，堆大小就是滑动窗口的大小，priorityQueue不停的调整堆顶元素，当窗口滑动过去之后，移除i-k的元素。（2）就是利用双端队列，队列左端存放最大值，当元素划出窗口就在队列左端弹出，队列中存储的是元素下标，这样就能根据窗口大小判断，如果队列左端元素小于等于i-k的时候，就可以把下表弹出。新元素进入的时候会对比右端的大小，如果右端元素的大小小于新入元素，那么就会弹出，直到遇到比他大的元素，或者队列为空，让然后从右端把元素入队，这样就能保证最大的元素永远都是队列左端元素。
    - 代码实现：https://github.com/coderElijah/EAlgorithm/blob/master/src/heap/LeetCode239.java
# 深度、广度优先算法
# 字符串匹配（BF、RK、BM、KMP、AC自动机）
# Trie树
# 动态规划

#拓展
