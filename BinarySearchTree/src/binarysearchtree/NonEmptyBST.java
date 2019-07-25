
package binarysearchtree;


class NonEmptyBST<D extends Comparable> implements Tree <D> {
    D data;
    Tree <D> left;
    Tree <D> right;
    
    public NonEmptyBST(D elt){
        data =elt;
        left= new EmptyBST<D>();
        right= new EmptyBST<D>();
    }
    
    public boolean isEmpty(){
        return false;
    }
    
    public int cardinality(){
        return 1+ left.cardinality()+right.cardinality();
    }
    
    public boolean memeber(D elt) {
        if (data == elt){
            return true;
        }
        else{
            if (elt.compareTo(data)<0){
                return left.member(elt);
            }else{
                return right.member(elt);
            }
        }
    }
    
    
}
