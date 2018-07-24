function MultiplicarInteiros(n){
    var multiplicacao = 1;
    if(VerificarNum(n) && n>0){
      for(var i=1;i<=n;i++){
        multiplicacao *=i;
      }
      return multiplicacao;
    }
}
console.log(MultiplicarInteiros(n));
