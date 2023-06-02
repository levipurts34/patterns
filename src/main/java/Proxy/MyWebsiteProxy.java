package Proxy;

public class MyWebsiteProxy implements Website{
    private MyWebsite myWebsite;
    @Override
    public void downloadVideo(String URL) {
        if(URL.length()<=2){
            System.out.println("Invalid URL");
        }else{
            this.myWebsite=new MyWebsite();
            if(myWebsite.isContent(URL)){
                myWebsite.downloadVideo(URL);
            }else{
                System.out.println("error");
            }
        }

    }
}
