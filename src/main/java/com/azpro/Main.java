package com.azpro;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class Main {

    public static void main(String[] args) {
            RESTInvoker ri = new RESTInvoker("https://api.hitbtc.com/api/2","f7cfb200a9961916313017abc31ba869","c3ad30f3b900c2f214ff8b059f9fc111");
            String res = ri.getDataFromServer("/trading/balance");
            System.out.println(res);

            List<Balance> balanceList = new Gson().fromJson(res, new TypeToken<List<Balance>>(){}.getType());
            for(Balance b : balanceList){
                if (b.getAvailable()>0){System.out.println(b);}
            }
    }
}

