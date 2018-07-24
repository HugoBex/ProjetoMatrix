function SomarInteiros(n){
    var soma=0;
    if(VerificarNum(n) && n>0){
        for(var i=0;i<=n;i++)
            soma+=i;
        return soma;
    }
}
console.log(SomarInteiros(n));