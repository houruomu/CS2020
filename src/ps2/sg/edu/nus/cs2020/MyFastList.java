package sg.edu.nus.cs2020;

public class MyFastList extends MoveToFrontList {
    // I will let the MoveToFront function move the item by 1/2 the original position + 5 
    protected void MoveToFront(int pos){
        int newPos = pos / 2 - 5;
        if(newPos < 0){
            newPos = 0;
        }
        int elementToFront = m_list[pos];
        for (int i = pos; i > newPos ; i--){
            m_list[i] = m_list[i - 1];
        } 
        m_list[newPos] = elementToFront;
    }
    
    public MyFastList(int l){
        super(l);
    }
    
}
