public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        String urlOk =  url.replace("bots","odds");
          String urlOkk= urlOk.replace("https" ,"https"+':');
        System.out.println(urlOk);

        String url2 = url.substring(0, 5);
        String h = "https:";




        if (url2.equals("https:")){
            System.out.println(url);
        }
        else {
            String url3 = url.substring(5);
            String good;
            good = h.concat(url3);

            String odds = "odds";

            String url4 = good.substring(0, good.length()-4);

            String rest = good.substring (good.length() -4);

            if (rest.equals("odds")) {
                System.out.println(good);
            } else {
                String best = url4.concat(odds);
                System.out.println(best);
            }
        }






    }

}
