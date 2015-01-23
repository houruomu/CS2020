package sg.edu.nus.cs2020;

/**
 * MoveToFrontList
 * Description: 
 * CS2020 2012
 * 
 * You need to create a constructor and implement search.
 */


/**
 * 
 */
public class MoveToFrontList extends FixedLengthList {
    // constructor
    public MoveToFrontList(int length){
        super(length);
    }
    
    // moving to front method
    protected void MoveToFront(int pos){
        int elementToFront = m_list[pos];
        for (int i = pos; i > 0 ; i--){
            m_list[i] = m_list[i - 1];
        } 
        m_list[0] = elementToFront;
    }
    
    // Override the search method to have the target item moved to front
    public boolean search(int key){
        for (int i=0; i<=m_max; i++){
			if (m_list[i] == key){
			    MoveToFront(i);
				return true;
			}
		}
		return false;
    }
}
