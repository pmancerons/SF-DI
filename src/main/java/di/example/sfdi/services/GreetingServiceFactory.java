package di.example.sfdi.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {

        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang){
        switch(lang){
            case "en":
                return new I18nEnglishGreetingService();
            case "es":
                return  new I18nSpanishGreetingService();
            default:
                return new PrimaryGreetingService();
        }
    }
}
