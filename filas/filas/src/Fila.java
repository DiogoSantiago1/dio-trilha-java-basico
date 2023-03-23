public class Fila {
    private No refNoEntradafila;

    public Fila(){
        this.refNoEntradafila = null;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradafila);
        refNoEntradafila = novoNo;
    }

    public No first(){
        if(!this.isEmpaty()){
            No primeiroNo = refNoEntradafila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{ 
                    break;}
                    return primeiroNo;
            }
        } return null;
    }

    public No dequeue(){
        if(!this.isEmpaty()){
            No primeiroNo = refNoEntradafila;
            No noAuxiliar = refNoEntradafila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                    }
                }
            return primeiroNo;
        } 
        return null;
    }

    public boolean isEmpaty(){
        return refNoEntradafila == null? true : false;
    }

    @Override
    public String toString() {
       String stringRetorno = "";
       No noAuxiliar = refNoEntradafila;

       if( refNoEntradafila != null ){
        
        
                while(true){
            stringRetorno += "[no{objeto" + noAuxiliar.getObject() + "]}----->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                    }else{
                        break;
                    }
                         }
        
        }else{
         stringRetorno = "";
        }
       
       return stringRetorno;
    }




}
