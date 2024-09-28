class MyCircularDeque {

    int[] arr;
    int K;
    int front;
    int rear;
    int countSize;

    public MyCircularDeque(int k) {
        arr = new int[k];
        K = k;
        front = 0;
        rear = k - 1;
        countSize = 0;    
    }
    
    public boolean insertFront(int value) {
        if(countSize == K){
            return false;
        }

        front = (front - 1 + K) % K;
        arr[front] = value;
        countSize++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(countSize == K){
            return false;
        }

        rear = (rear + 1) % K;
        arr[rear] = value;
        countSize++;
        return true;
    }
    
    public boolean deleteFront() {
        if(countSize == 0){
            return false;
        }

        front = (front + 1 ) % K;
        countSize--;
        return true;
    }
    
    public boolean deleteLast() {
        if(countSize == 0){
            return false;
        }

        rear = (rear - 1 + K) % K;
        countSize--;
        return true;
    }
    
    public int getFront() {
        if(countSize == 0){
            return -1;
        }

        return arr[front];
    }
    
    public int getRear() {
        if(countSize == 0){
            return -1;
        }

        return arr[rear];
    }
    
    public boolean isEmpty() {
        return countSize == 0;
    }
    
    public boolean isFull() {
        return countSize == K;
    }
}
