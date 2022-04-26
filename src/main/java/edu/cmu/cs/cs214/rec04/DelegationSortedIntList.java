package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

// HINT: Take a look at the UML diagram to see what DelegationSortedIntList
//       should implement.
public class DelegationSortedIntList {
    // the number of attempted element insertions
    private int totalAdded;
    private final SortedIntList sl;
    public DelegationSortedIntList(){
        sl=new SortedIntList();
    }
    /**
     * Gets the total number of attempted int insertions to the list since it.
     * was created.
     *
     * @return total number of integers added to the list.
     */
    public int getTotalAdded()
    {
        return totalAdded;
    }
    public void add(int num){
        totalAdded++;
        sl.add(num);
    }
    public void addAll(DelegationSortedIntList dl){
        totalAdded+=dl.getSL().size();
        sl.addAll(dl.getSL());
    }
    public int get(int index){
        return sl.get(index);
    }
    public SortedIntList getSL(){
        return sl;
    }
    public int size(){
        return sl.size();
    }

}