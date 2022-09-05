package com.company.design.decorator;

public class Past {
    //past main codes
    /*
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("동일?");
        System.out.println(aClient.equals(bClient));
         */

        /*
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
         */

        /*
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();

        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
         */
        /*
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now =System.currentTimeMillis();
                    end.set(now-start.get());
                }
        );

        aopBrowser.show();
        System.out.println("loading time : "+end.get());

        aopBrowser.show();
        System.out.println("loading time : "+end.get());
         */

    /*
    ICar audi = new Audi(1000);
        audi.showPrice();

    ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

    ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

    ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();
     */
}
