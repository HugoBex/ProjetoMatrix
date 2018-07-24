function SomarInteirosImpares(n){
  var somaImpar=0;
  var cont=1;
  if(VerificarNum(n) && n>0){
      for(var i=1;i<=n;i++){
          somaImpar+=cont;
          cont+=2;
      }
      return somaImpar;
  }
}
console.log(SomarInteirosImpares(n));
