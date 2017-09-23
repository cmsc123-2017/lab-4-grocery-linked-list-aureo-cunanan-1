class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  int size = 0;
  
  GroceryListLinked() {}
  
  /*TEMPLATE
   * Fields:
   * ...this.head...          --GroceryNode
   * ...this.size...          --int
   * 
   * Methods:
   * ...this.addFirst()...          --boolean
   * ...this.remove()...            --boolean
   * ...this.markAsBought()...      --boolean
   * ...this.display()...           --
  */
  
  // -> boolean
  // returns true if this item is successfully added to the list
  public boolean addFirst(GroceryItem item) {
    GroceryNode newNode = new GroceryNode(item, head);
      head = newNode;
      this.size++;
      return true;
  } 
  
  // -> boolean
  //returns true if this item is successfully removed from the list
  public boolean remove(String name) {
    if(this.size == 0){
      return false;
    }
    
    GroceryItem item = new GroceryItem(name, 0);
    GroceryNode currentNode = this.head;
    GroceryNode lastNode = currentNode;
    
    while(currentNode != null){
      if(item.equals(currentNode.data)){
        lastNode.next = currentNode.next;
        currentNode.next = null;
      
        this.size--;
        return true;
      }
      
      lastNode = currentNode;
      currentNode = currentNode.next;
    }
    
     return false;
    
  }
  
  //String --> boolean
  //returns true if this item has been marked as bought, false otherwise
  public boolean markAsBought(String name) {
    GroceryItem item = new GroceryItem(name, 0);
    GroceryNode currentNode = this.head;
    
    while(currentNode != null){
      if(item.equals(currentNode.data)){
        currentNode.data.isBought = true;
      
        return true;
      }
      currentNode = currentNode.next;      
    }
        
      return false;
  }
  
  //-> void
  //displays this Linked List
  public void display() {
    GroceryNode currentNode = head;
    while(currentNode != null) {
      System.out.println(currentNode.data);
      currentNode = currentNode.next;
    }
  }
}

class GroceryNode {
  GroceryItem data;
  GroceryNode next;
  
  GroceryNode(GroceryItem data, GroceryNode next) {
    this.data = data;
    this.next = next;
  }
}
