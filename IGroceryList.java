interface IGroceryList {
  boolean addFirst(GroceryItem item);
  
  boolean remove(String name);
  
  boolean markAsBought(String name);
  
  void display();
}
