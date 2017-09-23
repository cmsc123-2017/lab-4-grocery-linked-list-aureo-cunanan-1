import junit.framework.TestCase;

public class GroceryListTest extends TestCase {
  GroceryListLinked list = new GroceryListLinked();
    GroceryItem a = new GroceryItem("Onions", 1);
    GroceryItem b = new GroceryItem("Salt", 2);
    GroceryItem c = new GroceryItem("Sugar", 3);
    GroceryItem d = new GroceryItem("Butter", 4);
    GroceryItem e = new GroceryItem("Cheese", 5);
    GroceryItem f = new GroceryItem("Ice Cream", 6);
    GroceryItem g = new GroceryItem("Cereals", 7);
    GroceryItem h = new GroceryItem("Noodles", 8);
    GroceryItem j = new GroceryItem("Ramyeon", 9);
    GroceryItem k = new GroceryItem("Chocolate", 10);
    GroceryItem l = new GroceryItem("Tomatoes", 11);
    GroceryItem i = new GroceryItem("Mayo", 12);
   
 
  
  public void testAddFirst(){
    assertTrue(list.addFirst(a));
    assertTrue(list.addFirst(b));
    assertTrue(list.addFirst(c));
    assertTrue(list.addFirst(d));
    assertTrue(list.addFirst(e));
  } 
  public void testOnlyOneNode(){
    list.addFirst(a);
    
    assertTrue(list.remove(a.name));
  }

  public void testRemoveFirstItem(){
    list.addFirst(a);
    list.addFirst(b);
    list.addFirst(c);
    list.addFirst(d);
    list.addFirst(e);
    
    assertTrue(list.remove(a.name));
    assertTrue(list.remove(c.name));
    assertTrue(list.remove(e.name));
  } 
  
   public void testMArkAsBought(){
    list.addFirst(a);
    list.addFirst(b);
    list.addFirst(c);
    list.addFirst(d);
    list.addFirst(e);
  
    assertTrue(list.markAsBought("Onions"));
    assertTrue(list.markAsBought("Cheese"));
    assertFalse(list.markAsBought("Chocobutternut"));
  }
}