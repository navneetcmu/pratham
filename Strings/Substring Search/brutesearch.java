public class brutesearch {

public static boolean search(String text, String pattern){
        boolean rslt =false;
        rslt = search(text, pattern, 0, 0, rslt);
        return rslt;
}

private static boolean search(String text, String pattern, int len, int plen, boolean rslt){

        if( len == text.length()+1) {
                return rslt;
        }

        else if( plen == pattern.length()) {
                rslt = true;
                return rslt;
        }

        else if(text.charAt(len) == pattern.charAt(plen)) {
                rslt = search(text, pattern, len+1, plen+1, rslt);
        }

        else {
                rslt = search(text, pattern, len+1, 0, rslt);
        }

        return rslt;
}


public static void main(String[] args){

        String text = "inahaystacknedleneedleahjkhkjhfowyfhw";
        String pattern = "needle";
        System.out.println(search(text, pattern));

}

}
