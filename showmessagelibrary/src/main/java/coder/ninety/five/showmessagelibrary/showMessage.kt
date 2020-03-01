package coder.ninety.five.showmessagelibrary

import android.content.Context
import android.util.Log
import android.widget.Toast

class showMessage {

    companion object{

        fun t(context: Context,msg : String){
            Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
        }
        fun l(msg : String){
            Log.d("my_message",msg)
        }
        fun add(num1 : Int,num2 : Int) : Int{
            return num1+num2
        }
        fun subtract(num1 : Int,num2 : Int) : Int{
            return num1-num2
        }
        fun cross(num1 : Int,num2 : Int) : Int{
            return num1*num2
        }
        fun divide(num1 : Int,num2 : Int) : Int{
            return num1/num2
        }
    }
}