package sg.edu.nus.cs2020;
class MyNegativeList extends MoveToFrontList{
    public MyNegativeList(int length){
        super(length);
    }
    
    // make the list longer to accomodate more elements
    protected void increament(int length){
        int[] newList = new int[m_length + length];
        for (int i = 0; i < m_length ; i++ ){
            newList[i] = m_list[i];
        }
        m_length += length;
        m_list = newList;
    }
    
    public boolean add(int key){		
		m_max++;
		if (m_max >= m_length){
            increament((int)(0.1 * m_length));
		}
		m_list[m_max] = key;
		return true;
	}
	
	public boolean search(int key){
        for (int i=0; i<=m_max; i++){
			if (m_list[i] == key){
			    MoveToFront(i);
				return true;
			}else if(m_list[i] == -key){
			    MoveToFront(-i);
				return false;
			}
		}
		add(-key);
		MoveToFront(m_max);
		return false;
    }
}