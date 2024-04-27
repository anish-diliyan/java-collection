Collection(I):
1. List(I): ArrayList, LinkedList, Vector, Stack
2. Queue(I): ArrayDeque, LinkedList, PriorityQueue
3. Set(I): HashSet, LinkedHashSet, TreeSet

Collection(I) extends Iterable(I): That means every collection is iterable

Collection Interface methods:
1. boolean add()
2. boolean remove()
3. int size()
4. boolean isEmpty()
5. boolean contains()
6. Iterator iterator()
7. clear()

It also contains a method that can operate on entire collection:
1. addAll()
2. removeAll()
3. containsAll()
4. retainAll()

Map(I): HashMap, LinkedHashMap, TreeMap
Map interface is not a child interface of Collection.