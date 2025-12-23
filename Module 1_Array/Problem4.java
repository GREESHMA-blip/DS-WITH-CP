class Main {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        int[] n=new int[10];
        int cz=0;
        
        for(int i=0;i<5;i++){
            n[i]=i+1;
        }
        cz=5;
        System.out.println(n.length);
        
     System.out.println(" currect size "+ cz);
     
     for(int i=0;i<n.length;i++){
            
            System.out.println(i+" index "+n[i]);
        }
        
        
    // oparation -1 Append 
    int apVal=50;
    
    n[cz]=apVal;
    cz++;
    
    System.out.println(" ____ after append oparation ________");
    
    System.out.println(" currect size "+ cz);
     
     for(int i=0;i<n.length;i++){
            
            System.out.println(i+" index "+n[i]);
        }
        
    // pop oparation
        if(cz>0){
            n[cz-1]=0;
            cz--;
            
        }
        
         System.out.println(" ____ after POP oparation ________");
    
    System.out.println(" currect size "+ cz);
     
     for(int i=0;i<n.length;i++){
            
            System.out.println(i+" index "+n[i]);
        }
    // insertion index position which are you giing insert 
    int insertElement=100;
    int positionOfIndex=2;
    
    if ((cz<n.length) && (positionOfIndex < cz) && (positionOfIndex >= 0) ){
    
    for(int i=cz; i>positionOfIndex; i--){
        n[i]=n[i-1];
    }
    n[positionOfIndex]=insertElement;
    cz++;
    
    }
    else{
        System.out.println("array is full");
        System.out.println(" invalid index to insert");
    }
    
    
    System.out.println(" ____ after Insertion oparation ________");
    
    System.out.println(" currect size "+ cz);
     
     for(int i=0;i<n.length;i++){
            
            System.out.println(i+" index "+n[i]);
        }
}

} 
