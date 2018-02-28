package testList;

public class Alist {
	int[] a;
    int lastItem;
    
    public Alist() {;
    	a = new int[10];
        lastItem = -1;
    }
    
    public void insertItem(int newItem, int location) {
        int i;
        lastItem = a.length -1; 
        
        if (lastItem + 1 == a.length) {
            int b[] = new int [2 * a.length];
            for ( i = 0; i <= lastItem; i++) {
                b[i] = a [i];
            }
            a = b;
        }
        
        for (i = lastItem; i >= location; i--) {
            a [i+1] = a[i];
        }
        
        a[location] = newItem;
        lastItem++;
    }
    
    public void display() {
    	for (int j = 0; j < a.length; j++){
    		System.out.print(" " + a[j]);
    	}
    }
    
    public static void main(String[] args){
        Alist newList =new Alist(); 
        newList.a = new int[]{1,2,3,4,5,6,7,8,9,10};
        newList.display();
        System.out.println("  ");
        newList.insertItem(2, 3);
        newList.display();
    }
}
