package sg.edu.nus.cs2020;

public class MyFastList extends MoveToFrontList {
    // the MoveToFront function moves the item by 1/2 the original position + 5
    // if the element is in front of the list, else it will be swopped with
    // the element at pos / 2
    protected void MoveToFront(int pos){
        if(pos < m_length / 3){
            int newPos = pos / 2 - 5;
            if(newPos < 0){
                newPos = 0;
            }
            int elementToFront = m_list[pos];
            for (int i = pos; i > newPos ; i--){
                m_list[i] = m_list[i - 1];
            } 
            m_list[newPos] = elementToFront;
        }else{
            int temp = m_list[pos / 2];
            m_list[pos / 2] = m_list[pos];
            m_list[pos] = temp;
        }
    }
    
    public MyFastList(int l){
        super(l);
    }
    
}
