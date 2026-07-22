class MyCircularQueue {

    List<Integer> Queue;
    int capacity;

    public MyCircularQueue(int k) {

        Queue= new ArrayList<>();
        capacity=k;
        
    }
    
    public boolean enQueue(int value) {

        if(Queue.size()==capacity)return false;

        Queue.add(value);
        return true;
        
    }
    
    public boolean deQueue() {

        if(Queue.isEmpty())return false;

        Queue.remove(0);

        return true;

    }
    
    public int Front() {

        return Queue.isEmpty()?-1:Queue.get(0);
        
    }
    
    public int Rear() {

        return Queue.isEmpty()?-1:Queue.get(Queue.size()-1);
        
    }
    
    public boolean isEmpty() {

        return Queue.isEmpty();
        
    }
    
    public boolean isFull() {

        return Queue.size()==capacity;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */