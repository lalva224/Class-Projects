package assignment4;

public class SymbolTable {
	private LinkedList[] table;
	private final int TABLESIZE = 13;
	private final int HASHCONSTANT = 37;
	
	private int hash(String key) {
		int hashVal = 0;
		for(int i = 0; i<key.length(); i++) {
			hashVal= HASHCONSTANT*hashVal + key.charAt(i);
		}
		
		hashVal%=TABLESIZE;
		if(hashVal<0) {
			hashVal+= TABLESIZE;
		}
		
		return hashVal;
	}
	 public SymbolTable() {
	        table = new LinkedList[TABLESIZE];
	        for (int i = 0; i < TABLESIZE; i++) {
	            table[i] = new LinkedList();
	        }
	    }
	
	public void add(ElementType e) {
			int hashValue = hash(e.Identifier);
			table[hashValue].add(e);
			
		}
	
	public void remove(String e) {
		int hashValue = hash(e);
		table[hashValue].remove(e);
	}
	
	public boolean search(String key) {
		int hashVal = hash(key);
		return table[hashVal].search(key);
	}
	public String toString()
    {
        String str = "";

        for(int i=0; i<table.length; i++)
        {
            str = String.format(str + "%2d: ", i);

            LinkedList bucket = table[i];
            if (!bucket.isEmpty())
                str += bucket.toString() + "\n";
            else
                str += "->\n";
        }

        return str;
    }
	
	
	}
	
	

