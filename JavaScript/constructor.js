/**
 * java script
 * object
 */

function Obj(varStr,varInt)
{
    this.varStr=varStr
    this.varInt=varInt
    this.printFunc = () => {console.log(this.varInt,this.varStr)}
}

let ob=new Obj("hello",10)
ob.printFunc()