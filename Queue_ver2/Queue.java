package Shildt.Glava6;

 class Queue {
    private char q[];
    private int putloc, getloc;

     int L(){
        return q.length;
    }
    Queue(int size) {
        q = new char[size+1];
        putloc = getloc = 0;
    }
    Queue(Queue ob){
        putloc=ob.putloc;
        getloc=ob.getloc;
        q=new char[ob.q.length];

        for(int i=getloc; i<=putloc; i++)
            q[i]=ob.q[i];
    }
    Queue(char a[]){
        putloc=0;
        getloc=0;
        q=new char[a.length];

        for(int i=0;i<a.length; i++) put(a[i]);
    }

        void put(char ch){
            if(putloc==q.length){
                System.out.println(" - Очередь заполнена");
                return;
            }
            q[putloc++]=ch;
        }
        char get() {
            if (getloc == putloc) {
                System.out.println(" - Очередь пуста");
                return (char) 0;
            }
        return q[getloc++];
    }
    }

