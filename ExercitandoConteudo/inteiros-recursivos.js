//QUESTÃO 1
function SomarInteirosRecursivo(n){
    function Somar(n){
        if(n==1)
            return 1;
        else
            return (n+SomarInteirosRecursivo(n-1));
    }
    if(VerificarNum(n) && n>0){
       return Somar(n);  
    }
}               
console.log(SomarInteirosRecursivo(n));

//QUESTÃO 2
function SomarImparesRecursivo(n){
    function Somar(n){
        if(n==1)
            return 1;
        else
            return (2*n-1+SomarImparesRecursivo(n-1));
    }
    if(VerificarNum(n) && n>0){
        return Somar(n);
    }
}               
console.log(SomarImparesRecursivo(n)); 

//QUESTÃO 4
function MultiplicarRecursivo(n){
    function Multiplicar(n){
        if(n==1)
            return 1;
        else
            return (n*MultiplicarRecursivo(n-1)); 
    }
    if(VerificarNum(n) && n>0){
        return Multiplicar(n);
    }
}
console.log(MultiplicarRecursivo(n));   

