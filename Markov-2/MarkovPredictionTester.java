public class MarkovPredictionTester {
    public static void main(String[] args) {
        MarkovPrediction weatherPredictor = new MarkovPrediction("weather.csv");
        MarkovPrediction activitesPredictor = new MarkovPrediction("activites.csv");
        System.out.println("Weather:");
        for (int i = 0; i < 20; i++) {
            System.out.println(weatherPredictor.predictNextState("Sunny"));
        }
        System.out.println("Activites: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println(activitesPredictor.predictNextState("Sleeping"));
        }
    }
}
